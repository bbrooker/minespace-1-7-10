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
import net.minecraft.world.World;

public class Itemmaterials extends Item {

	
	ItemStack item;
	
	public Itemmaterials(String unlocalizedName) {

		setCreativeTab(CreativeTabs.tabAllSearch);
		setMaxStackSize(1);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "materials" + "/" + unlocalizedName);

	}

	  
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
		
		if (i.getItem() == Minespace.Screw){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== MAT ===]" ));
	        list.add(EnumChatFormatting.GRAY + "เป็นส่วนประกอบในการสร้างสิ่งของ");
	        list.add(EnumChatFormatting.GRAY + "หรือคราฟบางสิ่งบางอย่าง");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
		if (i.getItem() == Minespace.Wrench){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== MAT ===]" ));
	        list.add(EnumChatFormatting.GRAY + "เป็นส่วนประกอบในการสร้างสิ่งของ");
	        list.add(EnumChatFormatting.GRAY + "หรือคราฟบางสิ่งบางอย่าง");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
		if (i.getItem() == Minespace.Hammer){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== MAT ===]" ));
	        list.add(EnumChatFormatting.GRAY + "เป็นส่วนประกอบในการสร้างสิ่งของ");
	        list.add(EnumChatFormatting.GRAY + "หรือคราฟบางสิ่งบางอย่าง");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
		if (i.getItem() == Minespace.Nails){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== MAT ===]" ));
	        list.add(EnumChatFormatting.GRAY + "เป็นส่วนประกอบในการสร้างสิ่งของ");
	        list.add(EnumChatFormatting.GRAY + "หรือคราฟบางสิ่งบางอย่าง");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
	}
	
}
