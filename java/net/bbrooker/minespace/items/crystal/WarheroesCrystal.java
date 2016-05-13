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
	        list.add(EnumChatFormatting.RED + "���ʵ��������������Ѻ�ѡú���Ť���");
	        list.add(EnumChatFormatting.RED + "����������ҡ���� 300 �� !!");
	        list.add(EnumChatFormatting.RED + "�׺�ʹ�Ҩҡ �ѡú���������� ");
	        list.add(EnumChatFormatting.RED + "Guardian ��ؤ���ͧ�״");
	        list.add(EnumChatFormatting.GREEN + "�س��������ش�٧�ش�ͧ����Ҫվ�������");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if (i.getItem() == Minespace.RedWarHeroesCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.RED + "���ʵ��������������Ѻ�ѡú���Ť���");
	        list.add(EnumChatFormatting.RED + "����������ҡ���� 600 �� !!");
	        list.add(EnumChatFormatting.RED + "�׺�ʹ�Ҩҡ �����鹢ͧ ");
	        list.add(EnumChatFormatting.RED + "Sins ��ؤ���ͧ�ӹҨ");
	        list.add(EnumChatFormatting.GREEN + "�س��������ش�٧�ش�ͧ����Ҫվ�������");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if (i.getItem() == Minespace.GreenWarHeroesCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.RED + "���ʵ��������������Ѻ�ѡú���Ť���");
	        list.add(EnumChatFormatting.RED + "����������ҡ���� 1000 �� !!");
	        list.add(EnumChatFormatting.RED + "�׺�ʹ�Ҩҡ �����鹢ͧ ");
	        list.add(EnumChatFormatting.RED + "Guardian ��ؤ���ͧ�״");
	        list.add(EnumChatFormatting.GREEN + "�س��������ش�٧�ش�ͧ����Ҫվ�������");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if (i.getItem() == Minespace.PurpleWarHeroesCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.RED + "���ʵ��������������Ѻ�ѡú���Ť���");
	        list.add(EnumChatFormatting.RED + "����������ҡ���� 1500 �� !!");
	        list.add(EnumChatFormatting.RED + "���Ҩҡ���ʡѴ������Զ���� ");
	        list.add(EnumChatFormatting.RED + "��ѧ�Ե�������Ŵ��ͤ���ʵ�Ź����");
	        list.add(EnumChatFormatting.GREEN + "�س��������ش�٧�ش�ͧ����Ҫվ�������");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
		if (i.getItem() == Minespace.OrangeWarHeroesCrystal){
			list.add(EnumChatFormatting.YELLOW +(EnumChatFormatting.BOLD + "[=== ADVCRYSTAL ===]" ));
	        list.add(EnumChatFormatting.RED + "���ʵ��������������Ѻ�ѡú���Ť���");
	        list.add(EnumChatFormatting.RED + "����������ҡ���� 2000 �� !!");
	        list.add(EnumChatFormatting.GOLD + "�ش�ʹ���ʵ�ŷ����ӡ�������� ");
	        list.add(EnumChatFormatting.GOLD + "�������෾����ʹ�Թ��������");
	        list.add(EnumChatFormatting.GOLD + "(�ҡ������͢������Ť���)");
	        list.add(EnumChatFormatting.GREEN + "�س��������ش�٧�ش�ͧ����Ҫվ�������");
	        list.add(EnumChatFormatting.LIGHT_PURPLE + (EnumChatFormatting.BOLD + "��������" + EnumChatFormatting.WHITE + ":" + (EnumChatFormatting.YELLOW + "LEGENDARY")));
		}
	}
	
	public boolean hasEffect(){
	
			return true;
		}
	}

