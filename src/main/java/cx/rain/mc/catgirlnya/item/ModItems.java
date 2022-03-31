package cx.rain.mc.catgirlnya.item;

import cx.rain.mc.catgirlnya.Nya;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Nya.MODID);

    public ModItems(IEventBus bus) {
        ITEMS.register(bus);
        Nya.getInstance().getLogger().info("Registered items.");
    }

    // Items below.
    public static final RegistryObject<Item> PROXYNEVA = ITEMS.register("proxyneva", () -> new ItemProxynevaBase());
}
