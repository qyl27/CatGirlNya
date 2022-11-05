package cx.rain.mc.catgirlnya.data.gen;

import cx.rain.mc.catgirlnya.Nya;
import cx.rain.mc.catgirlnya.data.gen.provider.ModItemModelProvider;
import cx.rain.mc.catgirlnya.data.gen.provider.language.LanguageProviderENUS;
import cx.rain.mc.catgirlnya.data.gen.provider.language.LanguageProviderZHCN;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Nya.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper exHelper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(true, new ModItemModelProvider(generator, exHelper));
        }

        if (event.includeServer()) {
            generator.addProvider(true, new LanguageProviderZHCN(generator));
            generator.addProvider(true, new LanguageProviderENUS(generator));
        }
    }
}
