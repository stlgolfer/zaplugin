package xyz.amtstl.za.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class CommandOps implements CommandExecutor {
	Plugin plugin;
	private String[] help;

	public CommandOps(Plugin p) {
		this.plugin = p;
		this.help = new String[] { "breakroom - tp to world breakroom", "fix - tp to lobby basement",
				"name - changes name", "c - creative" };
	}

	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if (sender.isOp()) {
			Player op = Bukkit.getServer().getPlayer(args[0]);
			String str1;
			switch ((str1 = args[1]).hashCode()) {
			case -1897053606:
				if (str1.equals("breakroom"))
					break;
				break;
			case 99:
				if (str1.equals("c")) {
				}
				break;
			case 101397:
				if (str1.equals("fix")) {
				}
				break;
			case 3198785:
				if (str1.equals("help")) {
				}
				break;
			case 3373707:
				if (!str1.equals("name")) {
					break label447;
					op.teleport(new Location(Bukkit.getWorld("world"), 1396.0D, 131.0D, 643.0D));
					sender.sendMessage(ChatColor.AQUA + "[OPS] You have been teleported to the breakroom");
					return true;

					op.teleport(new Location(Bukkit.getWorld("start"), -388.0D, 64.0D, 280.0D));
					sender.sendMessage(ChatColor.AQUA + "[OPS] You have been teleported to the lobby basement");
					return true;
				} else {
					op.setCustomName(ChatColor.AQUA + "[Admin] " + op.getDisplayName());
					op.setCustomNameVisible(Boolean.parseBoolean(args[2]));
					return true;

					op.setGameMode(org.bukkit.GameMode.CREATIVE);
					return true;

					sender.sendMessage(ChatColor.RED + "OPS Command Module Help");
					sender.sendMessage(ChatColor.AQUA + "-------------------------");
					String[] arrayOfString;
					int j = (arrayOfString = this.help).length;
					for (int i = 0; i < j; i++) {
						String s = arrayOfString[i];
						sender.sendMessage(ChatColor.GREEN + s);
					}
					return true;
				}
				break;
			}
		}
		label447: return false;
	}
}