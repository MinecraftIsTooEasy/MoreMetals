package com.moddedmite.mitemod.MoreMetals;


import com.google.common.eventbus.Subscribe;
import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import com.moddedmite.mitemod.MoreMetals.items.register.FurnaceRecipesExtend;
import com.moddedmite.mitemod.MoreMetals.items.register.ItemTextureRegister;
import com.moddedmite.mitemod.MoreMetals.items.register.RecipeRegister;
import net.xiaoyu233.fml.reload.event.*;


public class EventListen {
    //物品注册
    @Subscribe
    public void onItemRegister(ItemRegistryEvent event) {
        ItemTextureRegister.registerItems(event);
        MMBlocks.registerItemBlocks(event);
    }

    //合成方式注册
    @Subscribe
    public void onRecipeRegister(RecipeRegistryEvent event) {
        RecipeRegister.registerRecipes(event);
        FurnaceRecipesExtend.registerFurnaceRecipes();
        MMBlocks.registerRecipes(event);
    }

    //玩家登录事件
    @Subscribe
    public void onPlayerLoggedIn(PlayerLoggedInEvent event) {
    }

    //方块实体注册
    @Subscribe
    public void onTileEntityRegister(TileEntityRegisterEvent event) {
    }

    //方块实体渲染注册
    @Subscribe
    public void onTileEntityRendererRegister(TileEntityRendererRegisterEvent event) {
    }

    //声音注册
    @Subscribe
    public void onSoundsRegister(SoundsRegisterEvent event) {
    }

}