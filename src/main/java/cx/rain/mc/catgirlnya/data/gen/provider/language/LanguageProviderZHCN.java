package cx.rain.mc.catgirlnya.data.gen.provider.language;

import cx.rain.mc.catgirlnya.Nya;
import cx.rain.mc.catgirlnya.data.gen.provider.base.LanguageProviderBase;
import cx.rain.mc.catgirlnya.item.ModItems;
import cx.rain.mc.catgirlnya.item.tab.ModTabs;
import net.minecraft.data.PackOutput;

public class LanguageProviderZHCN extends LanguageProviderBase {
    public LanguageProviderZHCN(PackOutput output) {
        super(output, Nya.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.PROXYNEVA, "补佳洛（国产）");
        addTooltip(ModItems.PROXYNEVA, 1, "6", "右键拆开。");
        addTooltip(ModItems.PROXYNEVA, 2, "r", "");
        addTooltip(ModItems.PROXYNEVA, 3, "7", "请勿食用包装！");

        addItemGroup(ModTabs.CAT_GIRL, "猫娘Nya~");
    }
}
