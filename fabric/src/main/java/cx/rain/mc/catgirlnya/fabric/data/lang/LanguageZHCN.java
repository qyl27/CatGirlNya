package cx.rain.mc.catgirlnya.fabric.data.lang;

import cx.rain.mc.catgirlnya.Constants;
import cx.rain.mc.catgirlnya.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class LanguageZHCN extends FabricLanguageProvider {
    public LanguageZHCN(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        builder.add(ModItems.BLAHAJ.get(), "布罗艾");
        builder.add(ModItems.PROXYNEVA.get(), "补佳洛");

        builder.add(Constants.TRANSLATE_TOOLTIP_CRAFTED_BY, "生产商：%1$s");
        builder.add(Constants.TRANSLATE_TOOLTIP_CRAFTED_AT, "生产日期：%1$s年%2$s月%3$s日 %4$s:%5$s:%6$s");
        builder.add(Constants.TRANSLATE_TOOLTIP_OWNER, "%1$s 的 %2$s");
        builder.add(Constants.TRANSLATE_TAB_CAT_GIRL, "猫娘Nya~");
    }
}
