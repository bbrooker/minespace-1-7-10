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

public class Crystal extends Item {
	
	ItemStack i;
	
	public Crystal(String unlocalizedName){
		
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabAllSearch);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "crystal" + "/" + unlocalizedName);
	}


	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
	
		if (i.getItem() == Minespace.BlueCrystal){
			list.add(EnumChatFormatting.GREEN +(EnumChatFormatting.BOLD + "[=== CRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "���ʵ�Ź���Թ������Ѻ���");
	        list.add(EnumChatFormatting.AQUA + "���ҧ�Һ�ŷ������ (�дѺ 1)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GREEN + "PREMIUM")));
		}
		if (i.getItem() == Minespace.RedCrystal){
			list.add(EnumChatFormatting.GREEN +(EnumChatFormatting.BOLD + "[=== CRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "���ʵ��ᴧ������Ѻ���");
	        list.add(EnumChatFormatting.AQUA + "���ҧ�Һ�ŷ������ (�дѺ 1)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GREEN + "PREMIUM")));
		}
		if (i.getItem() == Minespace.GreenCrystal){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== CRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "���ʵ������������Ѻ���");
	        list.add(EnumChatFormatting.AQUA + "���ҧ�Һ�ŷ������ (�дѺ 1)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.YellowCrystal){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== CRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "���ʵ������ͧ������Ѻ���");
	        list.add(EnumChatFormatting.AQUA + "���ҧ�Һ�ŷ������ (�дѺ 1)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		
	}
	
	public boolean hasEffect(){
		if (i.getItem() == Minespace.YellowCrystal){
			
			return true;
		}
		else {
			return false;
		}
	}
}
