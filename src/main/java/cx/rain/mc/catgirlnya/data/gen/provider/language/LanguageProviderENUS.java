package cx.rain.mc.catgirlnya.data.gen.provider.language;

import cx.rain.mc.catgirlnya.Nya;
import cx.rain.mc.catgirlnya.data.gen.provider.base.LanguageProviderBase;
import cx.rain.mc.catgirlnya.group.ModItemGroups;
import cx.rain.mc.catgirlnya.item.ModItems;
import net.minecraft.data.DataGenerator;

public class LanguageProviderENUS extends LanguageProviderBase {
    public LanguageProviderENUS(DataGenerator gen) {
        super(gen, Nya.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.PROXYNEVA, "Proxyneva");
        addTooltip(ModItems.PROXYNEVA, 1, "6", "Right click it.");
        addTooltip(ModItems.PROXYNEVA, 2, "", "");
        addTooltip(ModItems.PROXYNEVA, 3, "7", "Do not eat the box!");

        addItemGroup(ModItemGroups.CAT_GIRL, "Cat girl Nya~");
    }
}
