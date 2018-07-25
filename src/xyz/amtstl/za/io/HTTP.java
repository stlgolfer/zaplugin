package xyz.amtstl.za.io;

import java.io.InputStream;
import java.net.URL;
import org.bukkit.plugin.java.JavaPlugin;

public class HTTP {
	public static void sendGET(String urlin, JavaPlugin p) {
		try {
			String formatIn = urlin.replaceAll(" ", "%20");

			URL url = new URL(
					"http://api.amtstl.xyz/email/send?to=business@amtstl.xyz&subject=[ZA]%20Message&html=" + formatIn);
			java.net.URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();

			is.close();

			p.getLogger().info(url.toString());
		} catch (java.io.IOException localIOException) {
		}
	}
}