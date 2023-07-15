package cx.rain.mc.catgirlnya.mixins.mixin.client;

import cx.rain.mc.catgirlnya.item.ModItems;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.InteractionHand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerRenderer.class)
public abstract class PlayerRendererMixin {
    @Inject(method = "getArmPose", at = @At("TAIL"), cancellable = true)
    private static void catgirlnya$afterGetArmPose(AbstractClientPlayer player, InteractionHand hand,
                                                   CallbackInfoReturnable<HumanoidModel.ArmPose> cir) {
        var stack = player.getItemInHand(hand);
        if (stack.is(ModItems.BLAHAJ.get())) {
            cir.setReturnValue(HumanoidModel.ArmPose.CROSSBOW_HOLD);
        }
    }
}
