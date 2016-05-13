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
	        list.add(EnumChatFormatting.DARK_RED + "���ҡ����ǹ��Сͺ㹡��");
	        list.add(EnumChatFormatting.DARK_RED + "�Ӫش���������ǡ����");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if(i.getItem() == Minespace.TitaniumMaterials){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "�繡���������������ʡѴ");
	        list.add(EnumChatFormatting.DARK_RED + "�����ҧ�繪ش���з��ҹ");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
		if(i.getItem() == Minespace.IradiumMaterials){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "�繡�����������������ʡѴ");
	        list.add(EnumChatFormatting.DARK_RED + "�����ҧ�繪ش���Ъ�Դ�����");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if(i.getItem() == Minespace.IVArmour){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "�繡��������������������");
	        list.add(EnumChatFormatting.DARK_RED + "�����ҧ�繪ش���о�����дѺ 4");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
		if(i.getItem() == Minespace.IXTiberiumArmour){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "�ش���з������ǹ����ͧ");
	        list.add(EnumChatFormatting.DARK_RED + "���������������ҧ�����о����");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if(i.getItem() == Minespace.IIXNanoFiberArmour){
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== CRAFTABLE ===]" ));
	        list.add(EnumChatFormatting.DARK_RED + "�ѵ�شԺ�������ǹ����������");
	        list.add(EnumChatFormatting.DARK_RED + "�������ҧ�繪ش������");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
	}
}