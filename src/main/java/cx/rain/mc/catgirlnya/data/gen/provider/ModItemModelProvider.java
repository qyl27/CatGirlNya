package cx.rain.mc.catgirlnya.data.gen.provider;

import cx.rain.mc.catgirlnya.Nya;
import cx.rain.mc.catgirlnya.item.ModItems;
import cx.rain.mc.catgirlnya.data.gen.provider.base.ItemModelProviderBase;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProviderBase {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Nya.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.PROGYNOVA.get());
    }
}
