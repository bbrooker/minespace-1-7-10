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

public class ItemOre extends Item {
	

	public ItemOre(String unlocalizedName) {
		
		setCreativeTab(CreativeTabs.tabAllSearch);
		setMaxStackSize(1);
		setUnlocalizedName(unlocalizedName);
		setTextureName(Minespace.id + ":" + "itemore" + "/" + unlocalizedName);
		
	}
	
	
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack i, EntityPlayer player,  List list, boolean b){
		
		if(i.getItem() == Minespace.Titanium){
			list.add(EnumChatFormatting.GOLD +(EnumChatFormatting.BOLD + "[=== ORE ===]" ));
	        list.add(EnumChatFormatting.AQUA + "����������������Ѻ������ҧ���ظ");
	        list.add(EnumChatFormatting.AQUA + "�����ػ�ó������ç���ҹ");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GOLD + "PROTOTYPE")));
		}
		if(i.getItem() == Minespace.Aluminium){
			list.add(EnumChatFormatting.GREEN +(EnumChatFormatting.BOLD + "[=== ORE ===]" ));
	        list.add(EnumChatFormatting.AQUA + "����������������Ѻ���ҧ���ظ");
	        list.add(EnumChatFormatting.AQUA + "�����ػ�ó���ǹ��Сͺ�ҹ");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.GREEN + "PREMIUM")));
		}
		if(i.getItem() == Minespace.Tiberium){
			list.add(EnumChatFormatting.DARK_PURPLE +(EnumChatFormatting.BOLD + "[=== ORE ===]" ));
	        list.add(EnumChatFormatting.AQUA + "������������������ѧ��");
	        list.add(EnumChatFormatting.AQUA + "������Ѻ������ҧ���ظ");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.DARK_PURPLE + "RARE")));
		}
		if(i.getItem() == Minespace.Iradium){
			list.add(EnumChatFormatting.RED +(EnumChatFormatting.BOLD + "[=== ORE ===]" ));
	        list.add(EnumChatFormatting.AQUA + "���������������ѧ��");
	        list.add(EnumChatFormatting.AQUA + "������Ѻ������ҧ���ظ����������");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGACY")));
		}
		if(i.getItem() == Minespace.Voxadium){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ORE ===]" ));
	        list.add(EnumChatFormatting.AQUA + "�ǫ�������繡ҫ�ѧ��");
	        list.add(EnumChatFormatting.AQUA + "��ӡ���ع�������Դ");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}	
		else {
			
			list.add(EnumChatFormatting.BLUE +(EnumChatFormatting.BOLD + "[=== ORE ===]" ));
	        list.add(EnumChatFormatting.AQUA + "����ǹ��Сͺ㹡�����ҧ��觢ͧ");
	        list.add(EnumChatFormatting.AQUA + "���ͤ�ҿ�ҧ��觺ҧ���ҧ");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.BLUE + "STANDARD")));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack i){
		
		if (i.getItem() == Minespace.Tiberium){
			
		return true;
		}
		if (i.getItem() == Minespace.Iradium){
			
		return true;
		}
		if (i.getItem() == Minespace.Voxadium){
			
		return true;
		}
		else{
			return false;
		}
	}
}
