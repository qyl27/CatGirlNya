package cx.rain.mc.catgirlnya.data.gen.provider.language;

import cx.rain.mc.catgirlnya.Nya;
import cx.rain.mc.catgirlnya.data.gen.provider.base.LanguageProviderBase;
import cx.rain.mc.catgirlnya.item.ModItems;
import cx.rain.mc.catgirlnya.item.tab.ModTabs;
import net.minecraft.data.PackOutput;

public class LanguageProviderENUS extends LanguageProviderBase {
    public LanguageProviderENUS(PackOutput output) {
        super(output, Nya.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.PROXYNEVA, "Proxyneva");
        addTooltip(ModItems.PROXYNEVA, 1, "6", "Right click it.");
        addTooltip(ModItems.PROXYNEVA, 2, "r", "");
        addTooltip(ModItems.PROXYNEVA, 3, "7", "Do not eat the box!");

        addItemGroup(ModTabs.CAT_GIRL, "Cat girl Nya~");
    }
}
