package com.wbates.mc.marshmallow.items;

import com.wbates.mc.marshmallow.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * Created by bbates on 1/14/17.
 */
public class ItemMarshmallow extends ItemFood {
    private PotionEffect[] effects;

    public ItemMarshmallow(String unlocalizedName, int amount, boolean isWolfFood, PotionEffect...potionEffects) {
        super(amount,isWolfFood);
        init(unlocalizedName);
        this.effects = potionEffects;
    }

    public ItemMarshmallow(String unlocalizedName, int amount, float saturation, boolean isWolfFood, PotionEffect...potionEffects) {
        super(amount,saturation,isWolfFood);
        init(unlocalizedName);
        this.effects = potionEffects;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        // super.onFoodEaten(stack,worldIn,player);
        for(PotionEffect effect : effects) {
            player.addPotionEffect(effect);
        }
    }

    private void init(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
        this.setCreativeTab(CreativeTabs.FOOD);
    }
}
