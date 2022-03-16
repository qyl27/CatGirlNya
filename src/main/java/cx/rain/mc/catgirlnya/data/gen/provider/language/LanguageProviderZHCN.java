package cx.rain.mc.catgirlnya.data.gen.provider.language;

import cx.rain.mc.catgirlnya.Nya;
import cx.rain.mc.catgirlnya.data.gen.provider.base.LanguageProviderBase;
import cx.rain.mc.catgirlnya.group.ModItemGroups;
import cx.rain.mc.catgirlnya.item.ModItems;
import net.minecraft.data.DataGenerator;

public class LanguageProviderZHCN extends LanguageProviderBase {
    public LanguageProviderZHCN(DataGenerator gen) {
        super(gen, Nya.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.PROGYNOVA, "戊酸雌二醇片（国产）");
        addTooltip(ModItems.PROGYNOVA, 1, "又名补佳乐，");
        addTooltip(ModItems.PROGYNOVA, 2, "右键吃下。");

        // todo 这是个啥图案？
        addItem(ModItems.PRIDE_BANNER_PATTERN, "某种旗子图案");

        addItemGroup(ModItemGroups.CAT_GIRL, "猫娘Nya~");
    }
}
