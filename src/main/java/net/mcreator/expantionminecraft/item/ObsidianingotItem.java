
package net.mcreator.expantionminecraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.expantionminecraft.ExpantionMinecraftModElements;

@ExpantionMinecraftModElements.ModElement.Tag
public class ObsidianingotItem extends ExpantionMinecraftModElements.ModElement {
	@ObjectHolder("expantion_minecraft:obsidianingot")
	public static final Item block = null;
	public ObsidianingotItem(ExpantionMinecraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("obsidianingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
