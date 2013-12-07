package com.blogspot.coocoo617;

import org.bukkit.Bukkit;
import org.bukkit.Material;
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
	private String moreArgs = "Too many arguments!";
	private String lessArgs = "Not enough arguments!";
	private String console = "Players can only execute this command!";
	
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
			if (cmd.getName().equalsIgnoreCase("aguamenti"))
			{
				Player player = (Player) sender;
					if(player.hasPermission("hpspells.aguamenti"))
					{
						player.getWorld().spawnFallingBlock(player.getLocation(), Material.WATER, (byte) 1);
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("avis"))
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
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("confringo"))
			{
				Player player = (Player) sender;
					if(player.hasPermission("hpspells.confringo"))
					{
						player.launchProjectile(Fireball.class);
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("confundo"))
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
					            sender.sendMessage(args[0] + " is not online!");
					            return false;
					         }
			    		target.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 1));
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("conjunctivitus"))
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
					            sender.sendMessage(args[0] + " is not online!");
					            return false;
					         }
			    		target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 1));
						return true;
					} else {
						return false;
					}
			}
			if (cmd.getName().equalsIgnoreCase("freezing"))
			{
				Player player = (Player) sender;
				Player target = Bukkit.getServer().getPlayer(args[0]);
					if(player.hasPermission("hpspells.freezing"))
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
					            sender.sendMessage(args[0] + " is not online!");
					            return false;
					         }
			    		target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 10));
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
