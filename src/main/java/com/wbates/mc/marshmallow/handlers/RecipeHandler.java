package com.wbates.mc.marshmallow.handlers;

import com.wbates.mc.marshmallow.init.ModBlocks;
import com.wbates.mc.marshmallow.init.ModItems;
import com.wbates.mc.marshmallow.util.Utils;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by bbates on 1/14/17.
 */
public class RecipeHandler {
    public static void registerCraftingRecipes() {
        GameRegistry.addRecipe(new ItemStack(ModItems.marshmallow), new Object[] {"SSS","S S","SSS",'S', Items.SUGAR});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.marshmallow_block), new Object[] {"SSS","S S","SSS",'S', ModItems.marshmallow});
        Utils.getLogger().info("Registering Crafting Recipes.");
    }

    public static void registerSmeltingRecipes() {
        GameRegistry.addSmelting(ModBlocks.marshmallow_block, new ItemStack(Item.getItemFromBlock(Blocks.OBSIDIAN)), 0.7F);
        Utils.getLogger().info("Registering Furnace Recipes.");

    }
}
