package net.bbrooker.minespace;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.bbrooker.minespace.items.Craftablemats;
import net.bbrooker.minespace.items.Craftableweapons;
import net.bbrooker.minespace.items.ItemOre;
import net.bbrooker.minespace.items.Itemmaterials;
import net.bbrooker.minespace.items.crystal.AdvancedCrystal;
import net.bbrooker.minespace.items.crystal.Crystal;
import net.bbrooker.minespace.items.crystal.WarheroesCrystal;
import net.bbrooker.minespace.items.crystal.core.Crystalevol;
import net.bbrooker.minespace.items.droid.Droidpart;
import net.bbrooker.minespace.items.license.Id;
import net.bbrooker.minespace.items.license.License;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;


/** @author Tanawat */
@Mod(modid = Minespace.id, name = Minespace.name, version = Minespace.ver, modLanguage = Minespace.lang)

public class Minespace {
	
	
    /** server and client && instance mod */
    @SidedProxy(serverSide="net.bbrooker.minesapce.Commproxy", clientSide="net.bbrooker.minespace.Clientproxy")
    public static Commproxy proxy;
    
    public static SimpleNetworkWrapper netw; 
    
    @Instance("Minespace")
    public static Minespace intance;
    
    
    /** instance in main class */
    public static final String id = "minespace";
    public static final String name = "MineSpace";
    public static final String ver = "0.2";
    public static final String lang = "th_TH";
     
    
    /** more if need to instance */
    public static String author = "Tanawat Boonmak, Henry Foster, Diana Lyons";
    public static String url = "www.facebook.com/MineSpaceRP";
    public static String comm_proxy = "net.bbrooker.minespace.Commproxy";
    public static String client_proxy = "net.bbrooker.minespace.clientproxy";


    
    
    /****** Mats ******/
    //items materials
    public static Item Screw;
    public static Item Wrench;
    public static Item Hammer;
    public static Item Nails;
	//fiber materials
	public static Item Fiber;
  	public static Item Nanometerial;
    //items ore
	public static Item Metal;
	public static Item Titanium;
	public static Item Aluminium;
	public static Item Tiberium;
	public static Item Iradium;
	public static Item Silver;
	public static Item Voxadium; 	
  	//crystal evol
  	public static Item CrystalEvol;
  	public static Item AdvancedCrystalCore;

  	/****** Droidpart ******/
	public static Item RoboticCore;
	public static Item RoboticBattery;	 /** << @Food_for_droid */
	public static Item Droidcaller; 	 /** << @Droid_Caller */
	//droidnormal
  	public static Item Droidparthead;
  	public static Item Droidpartbody;
  	public static Item Droidpartleg;
  	//small droid
  	public static Item SmallDroidhead;
  	public static Item SmallDroidbody;
  	public static Item SmallDroidleg;
  	//protocal droid
  	public static Item ProtocalDroidhead;
  	public static Item ProtocalDroidbody;
  	public static Item ProtocalDroidleg;
  	//probe
  	public static Item Droidprobehead;
  	public static Item Droidprobebody;
  	//droid weapons
  	public static Item Droidweapon1;
  	public static Item Droidweapon2;
  	public static Item Droidweapon3;

  	/****** Craftable materials ******/
  	//armour
	public static Item QuarkMaterials;
 	public static Item TitaniumMaterials;
 	public static Item IradiumMaterials;
 	public static Item IVArmour;
 	public static Item IXTiberiumArmour;
 	public static Item IIXNanoFiberArmour;
 	//weapons
 	public static Item Pistolhandgrip;
 	public static Item Riflehandgrip;
 	public static Item Assaultriflehandgrip;
 	public static Item Rpghandgrip;
 	public static Item Pistolbody;
 	public static Item Riflebody;
 	public static Item Assaultriflebody;
 	public static Item Rpgbody;
 	
  	/****** Crystal ******/
 	//common
  	public static Item BlueCrystal;
  	public static Item RedCrystal;
  	public static Item GreenCrystal;
  	public static Item YellowCrystal;
  	//common~rare crystal
  	public static Item OrangeCrystal;
  	public static Item PurpleCrystal;
  	public static Item PinkCrystal;
  	public static Item BlackCrystal;
  	public static Item WhiteCrystal;
  	//advanced
  	public static Item AdvancedBlueCrystal;
  	public static Item AdvancedRedCrystal;
  	public static Item AdvancedGreenCrystal;
  	public static Item AdvancedPurpleCrystal;
  	public static Item AdvancedPinkCrystal;
  	//warheroes
  	public static Item BlueWarHeroesCrystal;
  	public static Item RedWarHeroesCrystal;
  	public static Item GreenWarHeroesCrystal;
  	public static Item PurpleWarHeroesCrystal;
  	public static Item OrangeWarHeroesCrystal;
  	
  	/****** Vehicle License ******/
	public static Item AirLicense;
	public static Item WeaponLicense;
	public static Item LargeWeaponLicense;
	public static Item SpeederLicense;
	public static Item LargeShipLicense;
	public static Item WingsLicense;
	public static Item RoboticLicense;
  	//ID
	public static Item CitizenID;
	public static Item OutlawID;
	public static Item PoliceID;
	public static Item GIAID;
	public static Item RebelID;
  	
  	/****** Economic Coins ******/
	public static Item GalacticGold;
	public static Item BlackCoin;
	//race & class coin
	public static Item CitizenCoin;
	public static Item OutlawCoin;
	//class
	public static Item GuardianCoin;
	public static Item SinsCoin;

	
	
  	/** block list*/
    public static Block ests;
    public static Block sdsd;
   
   
   

   
   
      @Mod.EventHandler
      public void preInit(FMLPreInitializationEvent preinit)
      {
 
          //pre in it code go here
 
      }
      
      @Mod.EventHandler
      public void init(FMLInitializationEvent event) {
               
    	
    	  /** MAT */
    	  /*
    	  Screw = new Itemmaterials(0).setUnlocalizedName("Screw").setTextureName(Minespace.id).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabAllSearch);
    	  GameRegistry.registerItem(Screw, "Screw");
    	  LanguageRegistry.addName(Screw, EnumChatFormatting.BLUE + "สกรู"); */
    	  
    	  Screw = new Itemmaterials("Screw");GameRegistry.registerItem(Screw, "Screw");
    	  Wrench = new Itemmaterials("Wrench");GameRegistry.registerItem(Wrench, "Wrench");
    	  Hammer = new Itemmaterials("Hammer");GameRegistry.registerItem(Hammer, "Hammer");
    	  Nails = new Itemmaterials("Nails");GameRegistry.registerItem(Nails, "Nails");
    	  /*ore */
    	  Metal = new ItemOre("Metal");GameRegistry.registerItem(Metal, "Metal");
    	  Titanium = new ItemOre("Titanium");GameRegistry.registerItem(Titanium, "Titanium");
    	  Aluminium = new ItemOre("Aluminium");GameRegistry.registerItem(Aluminium, "Aluminium");
    	  Tiberium = new ItemOre("Tiberium");GameRegistry.registerItem(Tiberium, "Tiberium");
    	  Iradium = new ItemOre("Iradium");GameRegistry.registerItem(Iradium, "Iradium");
    	  Voxadium = new ItemOre("Voxadium");GameRegistry.registerItem(Voxadium, "Voxadium");
    	  /*crytal evol */
    	  CrystalEvol = new Crystalevol("CrystalEvol");GameRegistry.registerItem(CrystalEvol, "CrystalEvol");
    	  AdvancedCrystalCore = new Crystalevol("AdvancedCrystalCore");GameRegistry.registerItem(AdvancedCrystalCore, "AdvancedCrystalCore");
    	  
    	  /** droid part registry */
    	  RoboticCore = new Droidpart("RoboticCore");GameRegistry.registerItem(RoboticCore, "RoboticCore");
    	  RoboticBattery = new Droidpart("RoboticBattery");GameRegistry.registerItem(RoboticBattery, "RoboticBattery");
    	  Droidcaller = new Droidpart("Droidcaller");GameRegistry.registerItem(Droidcaller, "Droidcaller");
    	  //human droid part
    	  Droidparthead = new Droidpart("Droidparthead");GameRegistry.registerItem(Droidparthead, "Droidparthead");
    	  Droidpartbody = new Droidpart("Droidpartbody");GameRegistry.registerItem(Droidpartbody, "Droidpartbody");
    	  Droidpartleg = new Droidpart("Droidpartleg");GameRegistry.registerItem(Droidpartleg, "Droidpartleg");
    	  //small droid part
    	  SmallDroidhead = new Droidpart("SmallDroidhead");GameRegistry.registerItem(SmallDroidhead, "SmallDroidhead");
    	  SmallDroidbody = new Droidpart("SmallDroidbody");GameRegistry.registerItem(SmallDroidbody, "SmallDroidbody");
    	  SmallDroidleg = new Droidpart("SmallDroidleg");GameRegistry.registerItem(SmallDroidleg, "SmallDroidleg");
    	  //protocal droid
    	  ProtocalDroidhead = new Droidpart("ProtocalDroidhead");GameRegistry.registerItem(ProtocalDroidhead, "ProtocalDroidhead");
    	  ProtocalDroidbody = new Droidpart("ProtocalDroidbody");GameRegistry.registerItem(ProtocalDroidbody, "ProtocalDroidbody");
    	  ProtocalDroidleg = new Droidpart("ProtocalDroidleg");GameRegistry.registerItem(ProtocalDroidleg, "ProtocalDroidleg");
    	  //probe part
    	  Droidprobehead = new Droidpart("Droidprobehead");GameRegistry.registerItem(Droidprobehead, "Droidprobehead");
    	  Droidprobebody = new Droidpart("Droidprobebody");GameRegistry.registerItem(Droidprobebody, "Droidprobebody");
    	  //weapon part
    	  Droidweapon1 = new Droidpart("Droidweapon1");GameRegistry.registerItem(Droidweapon1, "Droidweapon1");
    	  Droidweapon2 = new Droidpart("Droidweapon2");GameRegistry.registerItem(Droidweapon2, "Droidweapon2");
    	  Droidweapon3 = new Droidpart("Droidweapon3");GameRegistry.registerItem(Droidweapon3, "Droidweapon3");
    	  //weapon part  

    	  /** craftable registry  */
    	  QuarkMaterials = new Craftablemats("QuarkMaterials");GameRegistry.registerItem(QuarkMaterials, "QuarkMaterials");
    	  TitaniumMaterials = new Craftablemats("TitaniumMaterials");GameRegistry.registerItem(TitaniumMaterials, "TitaniumMaterials");
    	  IradiumMaterials = new Craftablemats("IradiumMaterials");GameRegistry.registerItem(IradiumMaterials, "IradiumMaterials");
    	  IVArmour = new Craftablemats("IVArmour");GameRegistry.registerItem(IVArmour, "IVArmour");
    	  IXTiberiumArmour = new Craftablemats("IXTiberiumArmour");GameRegistry.registerItem(IXTiberiumArmour, "IXTiberiumArmour");
    	  IIXNanoFiberArmour = new Craftablemats("IIXNanoFiberArmour");GameRegistry.registerItem(IIXNanoFiberArmour, "IIXNanoFiberArmour");
    	  //weapons
    	  Pistolhandgrip = new Craftableweapons("Pistolhandgrip");GameRegistry.registerItem(Pistolhandgrip, "Pistolhandgrip");
    	  Riflehandgrip = new Craftableweapons("Riflehandgrip");GameRegistry.registerItem(Riflehandgrip, "Riflehandgrip");
    	  Assaultriflehandgrip = new Craftableweapons("Assaultriflehandgrip");GameRegistry.registerItem(Assaultriflehandgrip, "Assaultriflehandgrip");
    	  Rpghandgrip = new Craftableweapons("Rpghandgrip");GameRegistry.registerItem(Rpghandgrip, "Rpghandgrip");
    	  Pistolbody = new Craftableweapons("Pistolbody");GameRegistry.registerItem(Pistolbody, "Pistolbody");
    	  Riflebody = new Craftableweapons("Riflebody");GameRegistry.registerItem(Riflebody, "Riflebody");
    	  Assaultriflebody = new Craftableweapons("Assaultriflebody");GameRegistry.registerItem(Assaultriflebody, "Assaultriflebody");
    	  Rpgbody = new Craftableweapons("Rpgbody");GameRegistry.registerItem(Rpgbody, "Rpgbody");

    	  /** crystal */
    	  BlueCrystal = new Crystal("BlueCrystal");GameRegistry.registerItem(BlueCrystal, "BlueCrystal");
    	  RedCrystal = new Crystal("RedCrystal");GameRegistry.registerItem(RedCrystal, "RedCrystal");
    	  GreenCrystal = new Crystal("GreenCrystal");GameRegistry.registerItem(GreenCrystal, "GreenCrystal");
    	  YellowCrystal = new Crystal("YellowCrystal");GameRegistry.registerItem(YellowCrystal, "YellowCrystal");
  	  	  //common~rare crystal
    	  OrangeCrystal = new Crystal("OrangeCrystal");GameRegistry.registerItem(OrangeCrystal, "OrangeCrystal");
    	  PurpleCrystal = new Crystal("PurpleCrystal");GameRegistry.registerItem(PurpleCrystal, "PurpleCrystal");
    	  PinkCrystal = new Crystal("PinkCrystal");GameRegistry.registerItem(PinkCrystal, "PinkCrystal");
    	  BlackCrystal = new Crystal("BlackCrystal");GameRegistry.registerItem(BlackCrystal, "BlackCrystal");
    	  WhiteCrystal = new Crystal("WhiteCrystal");GameRegistry.registerItem(WhiteCrystal, "WhiteCrystal");
    	  /* advanced */
    	  AdvancedBlueCrystal = new AdvancedCrystal("AdvancedBlueCrystal");GameRegistry.registerItem(AdvancedBlueCrystal, "AdvancedBlueCrystal");
    	  AdvancedRedCrystal = new AdvancedCrystal("AdvancedRedCrystal");GameRegistry.registerItem(AdvancedRedCrystal, "AdvancedRedCrystal");
    	  AdvancedGreenCrystal = new AdvancedCrystal("AdvancedGreenCrystal");GameRegistry.registerItem(AdvancedGreenCrystal, "AdvancedGreenCrystal");
    	  AdvancedPurpleCrystal = new AdvancedCrystal("AdvancedPurpleCrystal");GameRegistry.registerItem(AdvancedPurpleCrystal, "AdvancedPurpleCrystal");
    	  AdvancedPinkCrystal = new AdvancedCrystal("AdvancedPinkCrystal");GameRegistry.registerItem(AdvancedPinkCrystal, "AdvancedPinkCrystal");
    	  /* war heroes */
    	  BlueWarHeroesCrystal = new WarheroesCrystal("BlueWarHeroesCrystal");GameRegistry.registerItem(BlueWarHeroesCrystal, "BlueWarHeroesCrystal");
    	  RedWarHeroesCrystal = new WarheroesCrystal("RedWarHeroesCrystal");GameRegistry.registerItem(RedWarHeroesCrystal, "RedWarHeroesCrystal");
    	  GreenWarHeroesCrystal = new WarheroesCrystal("GreenWarHeroesCrystal");GameRegistry.registerItem(GreenWarHeroesCrystal, "GreenWarHeroesCrystal");
    	  PurpleWarHeroesCrystal = new WarheroesCrystal("PurpleWarHeroesCrystal");GameRegistry.registerItem(PurpleWarHeroesCrystal, "PurpleWarHeroesCrystal");
    	  OrangeWarHeroesCrystal = new WarheroesCrystal("OrangeWarHeroesCrystal");GameRegistry.registerItem(OrangeWarHeroesCrystal, "OrangeWarHeroesCrystal");
    	  
    	  /** license */
    	  AirLicense = new License("AirLicense");GameRegistry.registerItem(AirLicense, "AirLicense");
    	  WeaponLicense = new License("WeaponLicense");GameRegistry.registerItem(WeaponLicense, "WeaponLicense");
    	  LargeWeaponLicense = new License("LargeWeaponLicense");GameRegistry.registerItem(LargeWeaponLicense, "LargeWeaponLicense");
    	  SpeederLicense = new License("SpeederLicense");GameRegistry.registerItem(SpeederLicense, "SpeederLicense");
    	  LargeShipLicense = new License("LargeShipLicense");GameRegistry.registerItem(LargeShipLicense, "LargeShipLicense");
    	  RoboticLicense = new License("RoboticLicense");GameRegistry.registerItem(RoboticLicense, "RoboticLicense");
    	  /* Identification (ID) */
    	  	//ID
    	  CitizenID = new Id("CitizenID");GameRegistry.registerItem(CitizenID, "CitizenID");
    	  OutlawID = new Id("OutlawID");GameRegistry.registerItem(OutlawID, "OutlawID");
    	  PoliceID = new Id("PoliceID");GameRegistry.registerItem(PoliceID, "PoliceID");
    	  GIAID = new Id("GIAID");GameRegistry.registerItem(GIAID, "GIAID");
    	  RebelID = new Id("RebelID");GameRegistry.registerItem(RebelID, "RebelID");
    	 
    	   	
      }
   
      @Mod.EventHandler
      public void postInit(FMLPostInitializationEvent event){
         
    	  proxy.registerInformation();
      }
 
}


