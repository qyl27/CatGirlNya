package cx.rain.mc.catgirlnya;

import cx.rain.mc.catgirlnya.item.ModItems;
import cx.rain.mc.catgirlnya.item.ModTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatGirlNya {
    public static final String MODID = "catgirlnya";
    public static final String NAME = "Cat Girl Nya~";
    public static final String VERSION = "1.20.1-1.0.0";

    private static CatGirlNya INSTANCE;

    private final Logger logger = LoggerFactory.getLogger(NAME);

    public CatGirlNya() {
        INSTANCE = this;

        logger.info("Loading CatGirlNya~ Ver: " + VERSION);
    }

    public static CatGirlNya getInstance() {
        return INSTANCE;
    }

    public Logger getLogger() {
        return logger;
    }

    public void init() {
        ModItems.register();
        ModTabs.register();
    }
}
