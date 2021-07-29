package cx.rain.mc.catgirlnya.item;

import cx.rain.mc.catgirlnya.Nya;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> REGISTRY =
            DeferredRegister.create(ForgeRegistries.ITEMS, Nya.MODID);

    public ModItems(IEventBus bus) {
        REGISTRY.register(bus);
        Nya.getInstance().getLogger().info("Registered items.");
    }

    // Items below.
    
}
