package cx.rain.mc.catgirlnya.data.gen.provider.language;

import cx.rain.mc.catgirlnya.Nya;
import cx.rain.mc.catgirlnya.data.gen.provider.base.LanguageProviderBase;
import cx.rain.mc.catgirlnya.item.ModGroups;
import cx.rain.mc.catgirlnya.item.ModItems;
import net.minecraft.data.DataGenerator;

public class LanguageProviderZHCN extends LanguageProviderBase {
    public LanguageProviderZHCN(DataGenerator gen) {
        super(gen, Nya.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.PROXYNEVA, "补佳洛（国产）");
        addTooltip(ModItems.PROXYNEVA, 1, "6", "右键拆开。");
        addTooltip(ModItems.PROXYNEVA, 2, "", "");
        addTooltip(ModItems.PROXYNEVA, 3, "7", "请勿食用包装！");

        addItemGroup(ModGroups.CAT_GIRL, "猫娘Nya~");
    }
}
