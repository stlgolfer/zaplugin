package xyz.amtstl.za.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandOps implements CommandExecutor {
	private String[] help = new String[] { "breakroom - tp to world breakroom", "fix - tp to lobby basement",
			"name - changes name", "c - creative" };

	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if (sender.isOp()) {
			Player op = Bukkit.getServer().getPlayer(args[0]);
			switch (args[1]) {
			case "breakroom":
				op.teleport(new Location(Bukkit.getWorld("world"), 1396.0D, 131.0D, 643.0D));
				sender.sendMessage(ChatColor.AQUA + "[OPS] You have been teleported to the breakroom");
				return true;
			case "fix":
				op.teleport(new Location(Bukkit.getWorld("start"), -388.0D, 64.0D, 280.0D));
				sender.sendMessage(ChatColor.AQUA + "[OPS] You have been teleported to the lobby basement");
				return true;
			case "c":
				op.setGameMode(org.bukkit.GameMode.CREATIVE);
				return true;
			case "name":
				op.setCustomName(ChatColor.AQUA + "[Admin] " + op.getDisplayName());
				op.setCustomNameVisible(Boolean.parseBoolean(args[2]));
				return true;
			case "help":
				sender.sendMessage(ChatColor.RED + "OPS Command Module Help");
				sender.sendMessage(ChatColor.AQUA + "-------------------------");
				for (String a : this.help) {
					sender.sendMessage(ChatColor.GREEN + a);
				}
				return true;
			default:
				return false;
			}
		} else {
			return false;
		}
	}
}