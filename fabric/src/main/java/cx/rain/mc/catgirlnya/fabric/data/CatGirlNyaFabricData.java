package cx.rain.mc.catgirlnya.fabric.data;

import cx.rain.mc.catgirlnya.fabric.data.lang.LanguageZHCN;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CatGirlNyaFabricData implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator gen) {
        var pack = gen.createPack();

        pack.addProvider(LanguageZHCN::new);
        pack.addProvider(RecipeProvider::new);
    }
}
