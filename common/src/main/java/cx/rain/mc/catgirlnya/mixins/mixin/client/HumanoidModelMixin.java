package cx.rain.mc.catgirlnya.mixins.mixin.client;

import cx.rain.mc.catgirlnya.item.ModItems;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HumanoidModel.class)
public abstract class HumanoidModelMixin<T extends LivingEntity> {
    @Shadow @Final public ModelPart rightArm;

    @Shadow @Final public ModelPart leftArm;

    @Inject(method = {"poseLeftArm", "poseRightArm"},
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/client/model/AnimationUtils;animateCrossbowHold(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;Z)V",
                    shift = At.Shift.AFTER),
            cancellable = true)
    private void catgirlnya$invokeAnimateCrossbowHold(T entity, CallbackInfo ci) {
        if (entity.getMainHandItem().is(ModItems.BLAHAJ.get()) || entity.getOffhandItem().is(ModItems.BLAHAJ.get())) {
            rightArm.xRot = -0.95F;
            rightArm.yRot = (float) (-Math.PI / 8);
            leftArm.xRot = -0.90F;
            leftArm.yRot = (float) (Math.PI / 8);
            ci.cancel();
        }
    }
}
