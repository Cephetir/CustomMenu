package wtf.cephetir.voidmenu.mixins;

import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(TextureManager.class)
public interface IMixinTextureManagerAccessor {

    @Accessor("mapTextureObjects")
    Map<ResourceLocation, ITextureObject> getMapTextureObjects();
}
