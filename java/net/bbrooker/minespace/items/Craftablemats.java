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

public class Craftablemats extends Item {
	
	public Craftablemats(String unlocalizedName){
		
		setCreativeTab(CreativeTabs.tabAllSearch);
		setMaxStackSize(1);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "craftablemats" + "/" + unlocalizedName);

	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
		
		if(i.getItem() == Minespace.QuarkMaterials){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "คว๊ากเป็นส่วนประกอบในการ");
	        list.add(EnumChatFormatting.DARK_RED + "ทำชุดเกราะและหมวกเกราะ");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if(i.getItem() == Minespace.TitaniumMaterials){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "เป็นการเอาแร่ไทเทเนี่ยมสกัด");
	        list.add(EnumChatFormatting.DARK_RED + "มาสร้างเป็นชุดเกราะทนทาน");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
		if(i.getItem() == Minespace.IradiumMaterials){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "เป็นการเอาแร่ไอเรเดี่ยมสกัด");
	        list.add(EnumChatFormatting.DARK_RED + "มาสร้างเป็นชุดเกราะชนิดพิเศษ");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if(i.getItem() == Minespace.IVArmour){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "เป็นการเอาแร่เหล็กและแร่ผสม");
	        list.add(EnumChatFormatting.DARK_RED + "มาสร้างเป็นชุดเกราะพิเศษระดับ 4");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
		if(i.getItem() == Minespace.IXTiberiumArmour){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "ชุดเกราะที่มีส่วนผสมของ");
	        list.add(EnumChatFormatting.DARK_RED + "ไทเบอร์เรียมมาสร้างเป็นเกราะพิเศษ");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if(i.getItem() == Minespace.IIXNanoFiberArmour){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "วัตถุดิบที่มีส่วนผสมไฟเบอร์นาโน");
	        list.add(EnumChatFormatting.DARK_RED + "นำมาสร้างเป็นชุดเกราะได้");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
	}
}