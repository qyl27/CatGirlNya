package cx.rain.mc.catgirlnya.mixins.mixin;

import cx.rain.mc.catgirlnya.item.BlahajItem;
import cx.rain.mc.catgirlnya.item.ModItems;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.ItemCombinerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Map;

@Mixin(AnvilMenu.class)
public abstract class AnvilMenuMixin extends ItemCombinerMenu {
    public AnvilMenuMixin(@Nullable MenuType<?> menuType, int i, Inventory inventory, ContainerLevelAccess containerLevelAccess) {
        super(menuType, i, inventory, containerLevelAccess);
    }

    @Inject(method = "createResult", at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;resetHoverName()V"),
            @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;setHoverName(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/item/ItemStack;")
    }, locals = LocalCapture.CAPTURE_FAILHARD, expect = 2, require = 2)
    private void catgirlnya$invokeSetHoverName(CallbackInfo ci, ItemStack itemStack, int i, int j, int k,
                                               ItemStack itemStack2, ItemStack itemStack3, Map map) {
        if (itemStack2.is(ModItems.BLAHAJ.get())) {
            BlahajItem.setOwner(itemStack2, player);
        }
    }
}
