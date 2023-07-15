package cx.rain.mc.catgirlnya.fabric;

import cx.rain.mc.catgirlnya.CatGirlNya;
import net.fabricmc.api.ModInitializer;

public class CatGirlNyaFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        new CatGirlNya().init();
    }
}
