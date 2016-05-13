package net.bbrooker.minespace.items.droid;

import java.util.List;

import net.bbrooker.minespace.Minespace;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class Droidpart extends Item {
	
	


	public Droidpart(String unlocalizedName){

		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "droidpart" + "/" + unlocalizedName);
		
	}

	
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
		
		if (i.getItem() == Minespace.Droidparthead){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์คล้ายมนุษย์(ส่วนหัว)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.Droidpartbody){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์คล้ายมนุษย์(ส่วนลำตัว)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.Droidpartleg){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์คล้ายมนุษย์(ส่วนขา)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.SmallDroidhead){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์เล็ก(ส่วนหัว)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.SmallDroidbody){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์เล็ก(ส่วนลำตัว)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.SmallDroidleg){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์เล็ก(ส่วนขา)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.ProtocalDroidhead){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์โปรโตคอล(ส่วนหัว)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.ProtocalDroidbody){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์โปรโตคอล(ส่วนหัว)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.ProtocalDroidleg){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์โปรโตคอล(ส่วนล้อ)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.Droidprobehead){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์โปรโตคอล(ส่วนล้อ)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "LEGACY")));
		}
		//weapons
		if (i.getItem() == Minespace.Droidweapon1){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบอาวุธปืนของดรอยด์");
	        list.add(EnumChatFormatting.BLUE + "ใช้ในการสร้างอาวุธปืนให้กับดรอยด์");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.Droidweapon2){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์คล้ายมนุษย์(ส่วนลำตัว)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.Droidweapon3){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "ส่วนประกอบหลักในการสร้าง");
	        list.add(EnumChatFormatting.BLUE + "หุ่นยนต์คล้ายมนุษย์(ส่วนลำตัว)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
	}
}
