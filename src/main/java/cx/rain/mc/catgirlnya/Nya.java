package cx.rain.mc.catgirlnya;

import cx.rain.mc.catgirlnya.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Nya.MODID)
public class Nya {
    public static final String MODID = "catgirlnya";
    public static final String NAME = "CatGirlNya";
    public static Nya INSTANCE = null;

    private Logger logger = LogManager.getLogger(Nya.NAME);

    public Nya() {
        INSTANCE = this;

        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        new ModItems(bus);

        logger.info("Cat nya nya~");
    }

    public static Nya getInstance() {
        return INSTANCE;
    }

    public Logger getLogger() {
        return logger;
    }
}
