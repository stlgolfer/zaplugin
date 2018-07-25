package xyz.amtstl.za.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandFireworks implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("fireworks")) {
			World start = Bukkit.getWorld("start");

			Location redstone = new Location(start, -407.0D, 65.0D, 290.0D);
			redstone.getBlock().setType(Material.REDSTONE_BLOCK);
			redstone.getBlock().setType(Material.IRON_BLOCK);

			sender.sendMessage(ChatColor.RED + "Fireworks!");
			return true;
		}

		return false;
	}
}