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

public class Id extends Item{

	public Id(String unlocalizedName){
		
		setCreativeTab(CreativeTabs.tabAllSearch);
		setMaxStackSize(1);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "crystal" + "/" + unlocalizedName);	
		
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
		if (i.getItem() == Minespace.AdvancedBlueCrystal){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.AQUA + "���ʵ�Ź���Թ������Ѻ���");
	        list.add(EnumChatFormatting.AQUA + "���ҧ�Һ�ŷ������ (�дѺ 2)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
	
	}
}
