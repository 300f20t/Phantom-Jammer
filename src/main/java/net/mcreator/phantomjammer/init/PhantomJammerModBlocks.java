
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.phantomjammer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.phantomjammer.block.PhantomJammerBlock;
import net.mcreator.phantomjammer.PhantomJammerMod;

public class PhantomJammerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PhantomJammerMod.MODID);
	public static final RegistryObject<Block> PHANTOM_JAMMER = REGISTRY.register("phantom_jammer", () -> new PhantomJammerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
