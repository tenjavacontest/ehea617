package com.blogspot.coocoo617;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.plugin.java.JavaPlugin;

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
			return false;
		}
		sender.sendMessage(console);
		return false;
	}
}
