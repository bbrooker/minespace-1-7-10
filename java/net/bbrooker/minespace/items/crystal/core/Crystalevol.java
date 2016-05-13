package net.bbrooker.minespace.items.crystal.core;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bbrooker.minespace.Minespace;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class Crystalevol extends Item {
	
	public Crystalevol(String unlocalizedName){
		
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "crystalevol" + "/" + unlocalizedName);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
		
		if(i.getItem() == Minespace.CrystalEvol){
			list.add(EnumChatFormatting.DARK_PURPLE +(EnumChatFormatting.BOLD + "[=== EVOL ===]" ));
	        list.add(EnumChatFormatting.GOLD + "คือไอเทมใช้สำหรับอัพเกรด");
	        list.add(EnumChatFormatting.GOLD + "คริสคัลให้เป็นระดับ 2");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.DARK_PURPLE + "RARE")));
		
		}
		if(i.getItem() == Minespace.AdvancedCrystalCore){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== EVOL ===]" ));
	        list.add(EnumChatFormatting.GOLD + "คือไอเทมใช้สำหรับอัพเกรด");
	        list.add(EnumChatFormatting.GOLD + "คริสคัลให้เป็นระดับ 3");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.DARK_PURPLE + "LEGACY")));	
		}
	}
}
