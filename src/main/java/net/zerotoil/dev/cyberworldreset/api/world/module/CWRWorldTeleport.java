package net.zerotoil.dev.cyberworldreset.api.world.module;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

/**
 * This class contains world teleport settings from
 * a specific WorldReset.
 *
 * @author Kihsomray
 */
public interface CWRWorldTeleport {

    /**
     * Reloads all world teleport data.
     */
    void reload();

    /**
     * Teleports a player to the world based on
     * settings from worlds.yml.
     *
     * A CompletableFuture object will be returned which
     * contains a boolean. The task will complete with
     * a 'true' result if the player was teleported or
     * with a 'false' result if the player was not
     * teleported. Will return null if world resetting.
     *
     * @param player Player to teleport
     * @param duringReset Is this occurring during a reset
     * @param chargePlayer Should balance be checked & withdrawn from
     * @return CompletableFuture with Boolean (successfully teleported or not)
     */
    CompletableFuture<Boolean> teleport(@NotNull Player player, boolean duringReset, boolean chargePlayer);

    /**
     * Clears all saved locations for RTP.
     */
    void clearSavedLocations();

}
