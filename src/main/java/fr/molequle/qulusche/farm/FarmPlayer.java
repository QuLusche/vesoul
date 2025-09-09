package fr.molequle.qulusche.farm;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class FarmPlayer {

	private final UUID playerUUID;

	@Getter @Setter
	private double moneyBalance;

	@Getter @Setter
	private int farmLevel;

	@Getter @Setter
	private double farmExperience;

	public FarmPlayer(UUID playerUUID) {
		this.playerUUID = playerUUID;
		this.moneyBalance = 0.0;
		this.farmLevel = 1;
		this.farmExperience = 0.0;
	}
}
