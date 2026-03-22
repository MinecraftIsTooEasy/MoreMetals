package com.moddedmite.mitemod.MoreMetals.blocks;

import com.moddedmite.mitemod.MoreMetals.mixin.interfaces.MMEntityPlayer;
import com.moddedmite.mitemod.MoreMetals.tileentity.SmithingTableTileEntity;
import net.minecraft.*;
import net.xiaoyu233.fml.reload.utils.IdUtil;

public class SmithingTableBlock extends Block implements ITileEntityProvider {
    private Icon side_icon;
    private Icon top_icon;
    private Icon bottom_icon;
    private Icon front_icon;

    public SmithingTableBlock() {
        super(IdUtil.getNextBlockID(), Material.anvil, new BlockConstants());
        this.setMaxStackSize(1);
        this.setHardness(BlockHardness.planks);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundWoodFootstep);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new SmithingTableTileEntity();
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, int block_id, int metadata) {
        SmithingTableTileEntity tileEntity = (SmithingTableTileEntity) world.getBlockTileEntity(x, y, z);
        if (tileEntity != null) {
            for (int j = 0; j < tileEntity.getSizeInventory(); ++j) {
                ItemStack stackInSlot = tileEntity.getStackInSlot(j);
                if (stackInSlot == null) {
                    continue;
                }

                float offsetX = world.rand.nextFloat() * 0.8F + 0.1F;
                float offsetY = world.rand.nextFloat() * 0.8F + 0.1F;
                float offsetZ = world.rand.nextFloat() * 0.8F + 0.1F;

                while (stackInSlot.stackSize > 0) {
                    int dropCount = world.rand.nextInt(21) + 10;
                    if (dropCount > stackInSlot.stackSize) {
                        dropCount = stackInSlot.stackSize;
                    }

                    stackInSlot.stackSize -= dropCount;
                    EntityItem entityItem = new EntityItem(world, x + offsetX, y + offsetY, z + offsetZ,
                            new ItemStack(stackInSlot.itemID, dropCount, stackInSlot.getItemSubtype()));

                    if (stackInSlot.isItemDamaged()) {
                        entityItem.getEntityItem().setItemDamage(stackInSlot.getItemDamage());
                    }
                    if (stackInSlot.getItem().hasQuality()) {
                        entityItem.getEntityItem().setQuality(stackInSlot.getQuality());
                    }
                    if (stackInSlot.hasTagCompound()) {
                        entityItem.getEntityItem().setTagCompound((NBTTagCompound) stackInSlot.getTagCompound().copy());
                    }

                    float motionScale = 0.05F;
                    entityItem.motionX = world.rand.nextGaussian() * motionScale;
                    entityItem.motionY = world.rand.nextGaussian() * motionScale + 0.2F;
                    entityItem.motionZ = world.rand.nextGaussian() * motionScale;
                    world.spawnEntityInWorld(entityItem);
                }
            }

            world.func_96440_m(x, y, z, metadata);
        }

        super.breakBlock(world, x, y, z, block_id, metadata);
        world.removeBlockTileEntity(x, y, z);
    }

    @Override
    public Icon getIcon(int side, int metadata) {
        return switch (side) {
            case 1 -> this.top_icon;
            case 0 -> this.bottom_icon;
            case 2 -> this.front_icon;
            case 3, 4, 5 -> this.side_icon;
            default -> super.getIcon(side, metadata);
        };
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        this.side_icon = par1IconRegister.registerIcon("moremetals:smithing_table_side");
        this.top_icon = par1IconRegister.registerIcon("moremetals:smithing_table_top");
        this.bottom_icon = par1IconRegister.registerIcon("moremetals:smithing_table_bottom");
        this.front_icon = par1IconRegister.registerIcon("moremetals:smithing_table_front");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, EnumFace face, float offset_x, float offset_y, float offset_z) {
        if (!world.isAirOrPassableBlock(x, y + 1, z, false)) {
            return false;
        }

        if (player.onServer()) {
            SmithingTableTileEntity tileEntity = (SmithingTableTileEntity) world.getBlockTileEntity(x, y, z);
            if (tileEntity != null) {
                MMEntityPlayer.cast(player).moremetals$displayGUISmithing(tileEntity);
            }
        }
        return true;
    }
}
