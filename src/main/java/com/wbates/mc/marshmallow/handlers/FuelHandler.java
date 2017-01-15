package com.wbates.mc.marshmallow.handlers;

import com.wbates.mc.marshmallow.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

/**
 * Created by bbates on 1/14/17.
 */
public class FuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {

        if(fuel.getItem() == ModItems.marshmallow)
            return 100;
        return 0;
    }
}
