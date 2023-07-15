package cx.rain.mc.catgirlnya.forge;

import cx.rain.mc.catgirlnya.CatGirlNya;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CatGirlNya.MODID)
public class CatGirlNyaForge {
    public CatGirlNyaForge() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(CatGirlNya.MODID, bus);
        new CatGirlNya().init();
    }
}
