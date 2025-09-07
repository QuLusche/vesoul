package fr.molequle.qulusche;

import com.tcoded.folialib.FoliaLib;
import lombok.Getter;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vesoul extends JavaPlugin {

	public static Plugin plugin;

	@Getter
	private FoliaLib foliaLib;

	@Override
	public void onEnable() {
		plugin = this;
		foliaLib = new FoliaLib(this);

		getLogger().info("Vesoul plugin enabled");
	}

	@Override
	public void onDisable() {
		plugin = null;
		this.foliaLib.getScheduler().cancelAllTasks();

		getLogger().info("Vesoul plugin disabled");
	}
}