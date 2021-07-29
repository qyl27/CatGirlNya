package cx.rain.mc.catgirlnya;

import net.minecraftforge.fml.common.Mod;
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
    }

    public static Nya getInstance() {
        return INSTANCE;
    }

    public Logger getLogger() {
        return logger;
    }
}
