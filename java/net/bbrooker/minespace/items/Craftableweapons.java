package net.bbrooker.minespace.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bbrooker.minespace.Minespace;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class Craftableweapons extends Item {

	
	public Craftableweapons(String unlocalizedName){
		
		setCreativeTab(CreativeTabs.tabAllSearch);
		setMaxStackSize(1);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "craftableweapons" + "/" + unlocalizedName);

	}
	
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
		
		if(i.getItem() == Minespace.Pistolhandgrip){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "ส่วนประกอบของปืนสั้น");
	        list.add(EnumChatFormatting.DARK_RED + "ด้ามปืน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
		if(i.getItem() == Minespace.Riflehandgrip){
			list.add(EnumChatFormatting.GREEN +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "ส่วนประกอบของปืนไรเฟิ้ล");
	        list.add(EnumChatFormatting.DARK_RED + "ด้านปืน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GREEN + "PREMIUM")));
		}
		if(i.getItem() == Minespace.Assaultriflehandgrip){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "ส่วนประกอบของปืนจู่โจม");
	        list.add(EnumChatFormatting.DARK_RED + "ด้านปืน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if(i.getItem() == Minespace.Rpghandgrip){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "ส่วนประกอบของปืนจรวด");
	        list.add(EnumChatFormatting.DARK_RED + "ด้ามปืน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
		if(i.getItem() == Minespace.Pistolbody){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "ส่วนประกอบของปืนสั้น");
	        list.add(EnumChatFormatting.DARK_RED + "ตัวปืน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
		if(i.getItem() == Minespace.Riflebody){
			list.add(EnumChatFormatting.GREEN +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "ส่วนประกอบของปืนไรเฟิ้ล");
	        list.add(EnumChatFormatting.DARK_RED + "ตัวปืน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GREEN + "PREMIUM")));
		}
		if(i.getItem() == Minespace.Assaultriflebody){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "ส่วนประกอบของปืนจู่โจม");
	        list.add(EnumChatFormatting.DARK_RED + "ตัวปืน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if(i.getItem() == Minespace.Rpgbody){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "ส่วนประกอบของปืนจรวด");
	        list.add(EnumChatFormatting.DARK_RED + "ตัวปืน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
	}
}
