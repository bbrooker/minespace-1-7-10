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

public class WarheroesCrystal extends Item {
	
	ItemStack i;
	
	public WarheroesCrystal(String unlocalizedName){
		
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "crystal" + "/" + unlocalizedName);
	}


	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
	
		if (i.getItem() == Minespace.BlueWarHeroesCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.RED + "ครืสตัลแรร์พิเศษสำหรับนักรบกาแลคซี่");
	        list.add(EnumChatFormatting.RED + "ที่มีอายุมากกว่า 300 ปี !!");
	        list.add(EnumChatFormatting.RED + "สืบทอดมาจาก นักรบผู้เสียสละ ");
	        list.add(EnumChatFormatting.RED + "Guardian ในยุคเรืองมืด");
	        list.add(EnumChatFormatting.GREEN + "คุณได้มาอยู่จุดสูงสุดของสายอาชีพนี้แล้ว");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if (i.getItem() == Minespace.RedWarHeroesCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.RED + "ครืสตัลแรร์พิเศษสำหรับนักรบกาแลคซี่");
	        list.add(EnumChatFormatting.RED + "ที่มีอายุมากกว่า 600 ปี !!");
	        list.add(EnumChatFormatting.RED + "สืบทอดมาจาก วอร์เด้นของ ");
	        list.add(EnumChatFormatting.RED + "Sins ในยุคเรืองอำนาจ");
	        list.add(EnumChatFormatting.GREEN + "คุณได้มาอยู่จุดสูงสุดของสายอาชีพนี้แล้ว");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if (i.getItem() == Minespace.GreenWarHeroesCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.RED + "ครืสตัลแรร์พิเศษสำหรับนักรบกาแลคซี่");
	        list.add(EnumChatFormatting.RED + "ที่มีอายุมากกว่า 1000 ปี !!");
	        list.add(EnumChatFormatting.RED + "สืบทอดมาจาก วอร์เด้นของ ");
	        list.add(EnumChatFormatting.RED + "Guardian ในยุคเรืองมืด");
	        list.add(EnumChatFormatting.GREEN + "คุณได้มาอยู่จุดสูงสุดของสายอาชีพนี้แล้ว");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if (i.getItem() == Minespace.PurpleWarHeroesCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.RED + "ครืสตัลแรร์พิเศษสำหรับนักรบกาแลคซี่");
	        list.add(EnumChatFormatting.RED + "ที่มีอายุมากกว่า 1500 ปี !!");
	        list.add(EnumChatFormatting.RED + "ได้มาจากการสกัดและโดยวิถีแห่ง ");
	        list.add(EnumChatFormatting.RED + "พลังจิตที่ทำให้ปลดล๊อคคริสตัลนี้ได้");
	        list.add(EnumChatFormatting.GREEN + "คุณได้มาอยู่จุดสูงสุดของสายอาชีพนี้แล้ว");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if (i.getItem() == Minespace.OrangeWarHeroesCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.RED + "ครืสตัลแรร์พิเศษสำหรับนักรบกาแลคซี่");
	        list.add(EnumChatFormatting.RED + "ที่มีอายุมากกว่า 2000 ปี !!");
	        list.add(EnumChatFormatting.GOLD + "สุดยอดคริสตัลที่ได้ทำการเจียระไน ");
	        list.add(EnumChatFormatting.GOLD + "โดยเหล่าเทพเจ้าแอดมินสู่ผู้เล่น");
	        list.add(EnumChatFormatting.GOLD + "(จากข่าวลือข้ามกาแลคซี่)");
	        list.add(EnumChatFormatting.GREEN + "คุณได้มาอยู่จุดสูงสุดของสายอาชีพนี้แล้ว");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "ความแรร์" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
	}
	
	public boolean hasEffect(){
	
			return true;
		}
	}

