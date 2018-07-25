package xyz.amtstl.za;

import org.bukkit.command.PluginCommand;
import xyz.amtstl.za.commands.CommandAlertAdmin;
import xyz.amtstl.za.commands.CommandFireworks;
import xyz.amtstl.za.commands.CommandOps;
 
public class ZAPlugin extends org.bukkit.plugin.java.JavaPlugin {
	public void onEnable() {
		getCommand("alertadmin").setExecutor(new CommandAlertAdmin(this));
		getCommand("fireworks").setExecutor(new CommandFireworks());
		getCommand("ops").setExecutor(new CommandOps(this));
	}
	
	public void onDisable() {}
}