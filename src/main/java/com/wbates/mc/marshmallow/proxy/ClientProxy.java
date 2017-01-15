package com.wbates.mc.marshmallow.proxy;

import com.wbates.mc.marshmallow.init.ModBlocks;
import com.wbates.mc.marshmallow.init.ModItems;

/**
 * Created by bbates on 1/14/17.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

}
