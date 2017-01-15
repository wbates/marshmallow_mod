package com.wbates.mc.marshmallow.init;

import com.wbates.mc.marshmallow.Reference;
import com.wbates.mc.marshmallow.items.ItemMarshmallow;
import com.wbates.mc.marshmallow.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by bbates on 1/14/17.
 */
public class ModItems {

    public static Item marshmallow;

    public static void init() {
        //marshmallow = new ItemMarshmallow("marshmallow", "marshmallow");
        marshmallow = new ItemMarshmallow("marshmallow", 100, 10, false,
                new PotionEffect(Potion.getPotionById(3), 300, 5),
                new PotionEffect(Potion.getPotionById(1), 300, 5));
    }

    public static void register() {
        registerItem(marshmallow);
    }

    public static void registerRenders() {
        registerRender(marshmallow);
    }

    public static void registerItem(Item item) {
        GameRegistry.register(item);
        Utils.getLogger().info("Register item " + item.getUnlocalizedName().substring(5));
    }
    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item,
                0,
                new ModelResourceLocation(new ResourceLocation(Reference.MODID,
                        item.getUnlocalizedName().substring(5)),
                        "inventory"));
        Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
    }
}
