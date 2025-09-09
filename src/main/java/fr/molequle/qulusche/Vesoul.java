package fr.molequle.qulusche;

import com.tcoded.folialib.FoliaLib;
import fr.molequle.qulusche.database.DatabaseManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vesoul extends JavaPlugin {

	public static Vesoul plugin;
	public static DatabaseManager databaseManager;

	@Getter
	private FoliaLib foliaLib;

	@Override
	public void onEnable() {
		plugin = this;
		foliaLib = new FoliaLib(this);

		databaseManager = new DatabaseManager(this);

		getLogger().info("Vesoul plugin enabled");
	}

	@Override
	public void onDisable() {
		plugin = null;
		this.foliaLib.getScheduler().cancelAllTasks();

		getLogger().info("Vesoul plugin disabled");
	}


}