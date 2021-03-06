package com.henryfbp.hfbpOrbMod.lib;

import com.henryfbp.hfbpOrbMod.blocks.ModBlocks;
import com.henryfbp.hfbpOrbMod.items.ModItem;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
	public static void initShapedRecipes()
	{
		
		if(!ModConfiguration.cheapRecipe){
			GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[]{ //2x2 tut item gives tut block
				"DDD",
				"DPD",
				"DDD", 'D', ModItem.tutorialItem,
					   'P', Items.apple});}
		else{
			GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[]{
				"DD",
				"DD", 'D', ModItem.tutorialItem});}
		
		
		
		
		
	}
	
	public static void initShapelessRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 4), ModItem.tutorialItem); //tut item gives 3 lapis
	}
	
	public static void initSmeltingRecipes()
	{
		GameRegistry.addSmelting(ModBlocks.tutorialBlock, new ItemStack(Blocks.lapis_block), 1F);//smelt tut block gives lapis block
	}
}
