package net.bbrooker.minespace.items.license;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bbrooker.minespace.Minespace;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class License extends Item {
	
	public License(String unlocalizedName){
		
		setCreativeTab(CreativeTabs.tabAllSearch);
		setMaxStackSize(1);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "crystal" + "/" + unlocalizedName);	
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){

		if (i.getItem() == Minespace.AirLicense){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== LICENSE ===]" ));
	        list.add(EnumChatFormatting.GREEN + "ใบอนุญาติขับขี่ยานบิน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
		if (i.getItem() == Minespace.WeaponLicense){
			list.add(EnumChatFormatting.GREEN +(EnumChatFormatting.BOLD + "[=== LICENSE ===]" ));
	        list.add(EnumChatFormatting.GREEN + "ใบอนุญาติพกอาวุธปืน");
	        list.add(EnumChatFormatting.GREEN + "ใช้ในที่สาธารณะไม่ได้");
	        list.add(EnumChatFormatting.GREEN + "ยกเว้นเหตุจำเป็น");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GREEN + "PREMIUM")));
		}
		if (i.getItem() == Minespace.LargeWeaponLicense){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== LICENSE ===]" ));
	        list.add(EnumChatFormatting.GREEN + "ใบอนุญาติพกอาวุธปืนขนาดใหญ่");
	        list.add(EnumChatFormatting.GREEN + "ใช้ในที่สาธารณะไม่ได้");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
		if (i.getItem() == Minespace.SpeederLicense){
			list.add(EnumChatFormatting.GREEN +(EnumChatFormatting.BOLD + "[=== LICENSE ===]" ));
	        list.add(EnumChatFormatting.GREEN + "ใบอนุญาติขับขี่สปีดเดอร์ ");
	        list.add(EnumChatFormatting.GREEN + "(มอไซค์)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GREEN + "PREMIUM")));
		}
		if (i.getItem() == Minespace.LargeShipLicense){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== LICENSE ===]" ));
	        list.add(EnumChatFormatting.AQUA + "ใบอนุญาติขับขี่ยานใหญ่");
	        list.add(EnumChatFormatting.AQUA + "สามารถมีลูกเรือไม่เกิน 5 คน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
		if (i.getItem() == Minespace.RoboticLicense){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== LICENSE ===]" ));
	        list.add(EnumChatFormatting.GREEN + "ใบอนุญาติประกอบดรอยด์");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
	}

}
