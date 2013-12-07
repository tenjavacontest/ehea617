package com.blogspot.coocoo617;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin
{
	private String moreArgs = "§cToo many arguments!"; //Message when two many args are supplied
	private String lessArgs = "§cNot enough arguments!"; //Message when not enough args are supplied
	private String console = "§cPlayers can only execute this command!"; //Appears if a command is run in the console
	private int shootVolume = 1; //Wand shoot volume
	private int shootPitch = 3; //Wand shoot pitch
	
    @Override
    public void onEnable()
    {
    	
    }
 
    @Override
    public void onDisable()
    {
    	
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			if (cmd.getName().equalsIgnoreCase("aguamenti")) //Produces a splash of water from the caster's wand
			{
				Player player = (Player) sender;
					if(player.hasPermission("hpspells.aguamenti"))
					{
						player.getWorld().spawnFallingBlock(player.getLocation(), Material.WATER, (byte) 1);
						player.playSound(player.getLocation(), Sound.FIREWORK_LAUNCH, shootVolume, shootPitch);
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("avis")) //Creates a flock of birds from the caster's wand
			{
				Player player = (Player) sender;
					if(player.hasPermission("hpspells.avis"))
					{
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.getWorld().spawnEntity(player.getLocation().add(0, 10, 0), EntityType.BAT);
						player.playSound(player.getLocation(), Sound.FIREWORK_LAUNCH, shootVolume, shootPitch);
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("confringo")) //Causes anything that the spell meets to explode in flames
			{
				Player player = (Player) sender;
					if(player.hasPermission("hpspells.confringo"))
					{
						player.launchProjectile(Fireball.class);
						player.playSound(player.getLocation(), Sound.FIREWORK_LAUNCH, shootVolume, shootPitch);
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("confundo")) //Causes the victim to become confused
			{
				Player player = (Player) sender;
				Player target = Bukkit.getServer().getPlayer(args[0]);
					if(player.hasPermission("hpspells.confundo"))
					{
						if (args.length > 1)
						{
					           sender.sendMessage(moreArgs);
					           return false;
					        } 
					        if (args.length < 1)
					        {
					           sender.sendMessage(lessArgs);
					           return false;
					        }
					        if (target == null)
					        {
					            sender.sendMessage(args[0] + "§c is not online!");
					            return false;
					         }
			    		target.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 1));
			    		player.playSound(player.getLocation(), Sound.FIREWORK_LAUNCH, shootVolume, shootPitch);
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("conjunctivitus")) //A curse that causes great pain to the victim's eyes
			{
				Player player = (Player) sender;
				Player target = Bukkit.getServer().getPlayer(args[0]);
					if(player.hasPermission("hpspells.conjunctivitus"))
					{
						if (args.length > 1)
						{
					           sender.sendMessage(moreArgs);
					           return false;
					        } 
					        if (args.length < 1)
					        {
					           sender.sendMessage(lessArgs);
					           return false;
					        }
					        if (target == null)
					        {
					            sender.sendMessage(args[0] + "§c is not online!");
					            return false;
					         }
			    		target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 1));
			    		player.playSound(player.getLocation(), Sound.FIREWORK_LAUNCH, shootVolume, shootPitch);
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("locomotormortis")) //Locks the legs together, preventing the victim from moving the legs in any fashion
			{
				Player player = (Player) sender;
				Player target = Bukkit.getServer().getPlayer(args[0]);
					if(player.hasPermission("hpspells.locomotormortis"))
					{
						if (args.length > 1)
						{
					           sender.sendMessage(moreArgs);
					           return false;
					        } 
					        if (args.length < 1)
					        {
					           sender.sendMessage(lessArgs);
					           return false;
					        }
					        if (target == null)
					        {
					            sender.sendMessage(args[0] + "§c is not online!");
					            return false;
					         }
			    		target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 10));
			    		player.playSound(player.getLocation(), Sound.FIREWORK_LAUNCH, shootVolume, shootPitch);
						return true;
					} else {
						return false;
					}
			}
			return false;
		}
		sender.sendMessage(console);
		return false;
	}
}
