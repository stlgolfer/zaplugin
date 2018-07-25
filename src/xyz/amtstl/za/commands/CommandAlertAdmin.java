package xyz.amtstl.za.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandAlertAdmin implements CommandExecutor {
	private JavaPlugin plugin;

	public CommandAlertAdmin(JavaPlugin p) {
		this.plugin = p;
	}

	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] arg3) {
		if ((command.getName().equalsIgnoreCase("alertadmin")) && (arg3.length > 0)) {
			String out = "";
			String[] arrayOfString;
			int j = (arrayOfString = arg3).length;
			for (int i = 0; i < j; i++) {
				String word = arrayOfString[i];
				out = out + word + " ";
			}

			sender.sendMessage(ChatColor.GREEN + "Alerting admins with message of: " + ChatColor.AQUA + out.toString());
			xyz.amtstl.za.io.HTTP.sendGET("Player: " + sender.getName() + " says: " + out.toString(), this.plugin);
			return true;
		}

		return false;
	}
}