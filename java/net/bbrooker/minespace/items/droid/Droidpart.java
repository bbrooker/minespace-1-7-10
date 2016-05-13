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
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹������������(��ǹ���)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.Droidpartbody){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹������������(��ǹ�ӵ��)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.Droidpartleg){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹������������(��ǹ��)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.SmallDroidhead){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹�����(��ǹ���)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.SmallDroidbody){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹�����(��ǹ�ӵ��)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.SmallDroidleg){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹�����(��ǹ��)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.ProtocalDroidhead){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹����ⵤ��(��ǹ���)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.ProtocalDroidbody){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹����ⵤ��(��ǹ���)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.ProtocalDroidleg){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹����ⵤ��(��ǹ���)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.Droidprobehead){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹����ⵤ��(��ǹ���)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "LEGACY")));
		}
		//weapons
		if (i.getItem() == Minespace.Droidweapon1){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ���ظ�׹�ͧ���´�");
	        list.add(EnumChatFormatting.BLUE + "��㹡�����ҧ���ظ�׹���Ѻ���´�");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if (i.getItem() == Minespace.Droidweapon2){
			list.add(EnumChatFormatting.LIGHT_PURPLE +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹������������(��ǹ�ӵ��)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.LIGHT_PURPLE + "RARE")));
		}
		if (i.getItem() == Minespace.Droidweapon3){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== DROID ===]" ));
	        list.add(EnumChatFormatting.BLUE + "��ǹ��Сͺ��ѡ㹡�����ҧ");
	        list.add(EnumChatFormatting.BLUE + "���¹������������(��ǹ�ӵ��)");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.RED + "LEGACY")));
		}
	}
}
