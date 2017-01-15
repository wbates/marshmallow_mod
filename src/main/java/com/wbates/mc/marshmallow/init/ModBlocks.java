package com.wbates.mc.marshmallow.init;

import com.wbates.mc.marshmallow.Reference;
import com.wbates.mc.marshmallow.blocks.BlockMarshmallow;
import com.wbates.mc.marshmallow.items.ItemMarshmallow;
import com.wbates.mc.marshmallow.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by bbates on 1/14/17.
 */
public class ModBlocks {

    public static Block marshmallow_block;

    public static void init() {
        marshmallow_block = new BlockMarshmallow("marshmallow_block");
    }

    public static void register() {
        registerBlock(marshmallow_block);
    }

    public static void registerRenders() {
        registerRender(marshmallow_block);
    }

    public static void registerBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        Utils.getLogger().info("Register item " + block.getUnlocalizedName().substring(5));
    }
    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                0,
                new ModelResourceLocation(new ResourceLocation(Reference.MODID,
                        block.getUnlocalizedName().substring(5)),
                        "inventory"));
        Utils.getLogger().info("Register render for " + block.getUnlocalizedName().substring(5));
    }
}
