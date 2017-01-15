package com.wbates.mc.marshmallow.util;

import com.wbates.mc.marshmallow.Reference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by bbates on 1/14/17.
 */
public class Utils {

    private static Logger logger;

    public static Logger getLogger() {
        if(logger == null) {
            logger= LogManager.getFormatterLogger(Reference.MODID);
        }
        return logger;
    }
}
