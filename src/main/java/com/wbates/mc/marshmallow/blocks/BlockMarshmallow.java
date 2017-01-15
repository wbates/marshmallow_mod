package com.wbates.mc.marshmallow.blocks;

import com.wbates.mc.marshmallow.Reference;
import com.wbates.mc.marshmallow.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by bbates on 1/14/17.
 */
public class BlockMarshmallow extends Block {

    public BlockMarshmallow(String unlocalizedName) {
        super(Material.WOOD);
        init(unlocalizedName);
    }

    private void init(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
        this.setHardness(0.0F);
        this.setResistance(0.0F);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    @Override
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.marshmallow;
    }

    @Override
    public int quantityDropped(Random random) {
        return 4;
    }

    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return true;
    }

    @Override
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return 300;
    }
}
