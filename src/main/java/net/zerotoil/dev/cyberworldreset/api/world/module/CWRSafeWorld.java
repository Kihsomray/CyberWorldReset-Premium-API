package net.zerotoil.dev.cyberworldreset.api.world.module;

import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.Set;

/**
 * This class contains safe world settings from
 * a specific WorldReset.
 *
 * @author Kihsomray
 */
public interface CWRSafeWorld {

    /**
     * Reloads all safe world settings.
     */
    void reload();

    /**
     * Checks if the safe world is resetting. Will
     * attempt to obtain a WorldReset from the name
     * of the safeworld and check it.
     *
     * @return True if safe world is currently resetting
     */
    boolean isCurrentlyResetting();


    /**
     * Checks if players are currently being teleported
     * away from the resetting world.
     *
     * @return True if still teleporting away
     */
    boolean isTeleportingAway();


    /**
     * Gets the placeholders applicable to
     * the safe world.
     *
     * @param allPlaceholders Should WorldReset placeholder be combined
     * @return Array of placeholders
     */
    String[] getPlaceholders(boolean allPlaceholders);

    /**
     * Gets the replacements for the placeholder
     * applicable to the safe world.
     *
     * @param allReplacements Should WorldReset placeholders be combined
     * @return Array of placeholder replacements
     */
    String[] getReplacements(boolean allReplacements);

    /**
     * Gets an instance of the safe world.
     *
     * @return World instance of safe world
     */
    World getWorld();

    /**
     * Gets the players currently teleported away
     * from the resetting world.
     *
     * @return Players teleported away from resetting world
     */
    Set<Player> getPlayers();

}
