package fr.molequle.qulusche.database;

import org.bukkit.plugin.Plugin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

	private final Plugin plugin;

    private String host;
    private int port;
    private String database;
    private String user;
    private String password;

    public DatabaseManager(Plugin plugin) {
		this.plugin = plugin;

		loadConfig();
    }

	public void loadConfig() {
		plugin.saveDefaultConfig();

		this.host = plugin.getConfig().getString("database.host");
		this.port = plugin.getConfig().getInt("database.port");
		this.database = plugin.getConfig().getString("database.name");
		this.user = plugin.getConfig().getString("database.user");
		this.password = plugin.getConfig().getString("database.password");
	}

    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false&serverTimezone=UTC";
        return DriverManager.getConnection(url, user, password);
    }
}