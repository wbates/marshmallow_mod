package com.wbates.mc.marshmallow;

import com.wbates.mc.marshmallow.handlers.RecipeHandler;
import com.wbates.mc.marshmallow.init.ModBlocks;
import com.wbates.mc.marshmallow.init.ModItems;
import com.wbates.mc.marshmallow.proxy.CommonProxy;
import com.wbates.mc.marshmallow.util.Utils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MarshmallowMod
{

    @Mod.Instance(Reference.MODID)
    public static MarshmallowMod instance;

    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();
        ModBlocks.init();

        ModItems.register();
        ModBlocks.register();

        proxy.registerRenders();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        Utils.getLogger().info("Initialize");
        RecipeHandler.registerCraftingRecipes();
        RecipeHandler.registerSmeltingRecipes();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        Utils.getLogger().info("PostInitialize");

    }


}
