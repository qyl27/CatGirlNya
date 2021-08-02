package cx.rain.mc.catgirlnya.data.gen.provider.base;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public abstract class ItemModelProviderBase extends ItemModelProvider {
    public ItemModelProviderBase(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    private ModelFile getModel(String loc) {
        return new ModelFile.UncheckedModelFile(new ResourceLocation(modid, loc));
    }

    protected void simpleItem(Item item, ResourceLocation texture) {
        singleTexture(item.getRegistryName().getPath(), mcLoc("generated"), "layer0", texture);
    }

    protected void simpleItem(Item item) {
        simpleItem(item, modLoc("item/" + item.getRegistryName().getPath()));
    }

    protected void simpleBlockItem(BlockItem blockItem) {
        getBuilder(blockItem.getRegistryName().getPath())
                .parent(getModel("block/" + blockItem.getRegistryName().getPath()));
    }
}
