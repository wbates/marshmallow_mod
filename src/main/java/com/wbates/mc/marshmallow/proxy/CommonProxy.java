package com.wbates.mc.marshmallow.proxy;

import com.wbates.mc.marshmallow.handlers.FuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by bbates on 1/14/17.
 */
public class CommonProxy {

    public void init() {
        GameRegistry.registerFuelHandler(new FuelHandler());
    }

    public void registerRenders() {

    }
}
