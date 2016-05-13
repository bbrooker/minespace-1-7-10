package net.bbrooker.minespace.items.crystal;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.bbrooker.minespace.Minespace;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class AdvancedCrystal extends Item {
	
	ItemStack i;
	
	public AdvancedCrystal(String unlocalizedName){
		
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "crystal" + "/" + unlocalizedName);
	}


	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
	
		if (i.getItem() == Minespace.AdvancedBlueCrystal){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "ครืสตัลน้ำเงินใช้สำหรับการ");
	        list.add(EnumChatFormatting.AQUA + "สร้างดาบไลท์เซเบอร์ (ระดับ 2)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.AdvancedRedCrystal){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "ครืสตัลแดงใช้สำหรับการ");
	        list.add(EnumChatFormatting.AQUA + "สร้างดาบไลท์เซเบอร์ (ระดับ 2)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.AdvancedGreenCrystal){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "ครืสตัลเขียวใช้สำหรับการ");
	        list.add(EnumChatFormatting.AQUA + "สร้างดาบไลท์เซเบอร์ (ระดับ 2)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
		if (i.getItem() == Minespace.AdvancedPurpleCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "ครืสตัลม่วงใช้สำหรับการ");
	        list.add(EnumChatFormatting.AQUA + "สร้างดาบไลท์เซเบอร์ (ระดับ 2)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "LEGENDARY")));
		}
		if (i.getItem() == Minespace.AdvancedPinkCrystal){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "ครืสตัลชมพูใช้สำหรับการ");
	        list.add(EnumChatFormatting.AQUA + "สร้างดาบไลท์เซเบอร์ (ระดับ 2)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "LEGACY")));
		}
	}
	
	public boolean hasEffect(){
		
		if (i.getItem() == Minespace.AdvancedPinkCrystal){
			
			return true;
		}

		if (i.getItem() == Minespace.AdvancedPurpleCrystal){
			
			return true;
		}
		else {
			return false;
		}
	}
}
