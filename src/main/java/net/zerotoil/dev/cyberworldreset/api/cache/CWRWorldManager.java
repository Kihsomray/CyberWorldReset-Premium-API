package net.zerotoil.dev.cyberworldreset.api.cache;

import net.zerotoil.dev.cyberworldreset.api.world.CWRRTPWorld;
import net.zerotoil.dev.cyberworldreset.api.world.CWRWorldReset;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class contains all world setups including
 * RTPWorld and WorldReset setups. Data loaded
 * from the file worlds.yml.
 *
 * @author Kihsomray
 */
public interface CWRWorldManager {

    /**
     * Reload all world setups from worlds.yml.
     *
     * @since 2.0.0
     */
    void reload();

    /**
     * Gets RTPWorld setup based on world name.
     * If the given world is a WorldReset, it will
     * return in an instance of RTPWorld.
     *
     * Will return null if no setup exists for
     * that world or the world is null.
     *
     * @since 2.0.0
     * @param world Name of world
     * @return RTPWorld setup if it exists
     */
    @Nullable CWRRTPWorld getRTPWorld(String world);

    /**
     * Gets WorldReset setup based on world name.
     *
     * Will return null if no setup exists for
     * that world or the world is null.
     *
     * @since 2.0.0
     * @param world Name of world
     * @return WorldReset setup if it exists
     */
    @Nullable CWRWorldReset getWorldReset(String world);

    /**
     * Searches through WorldReset setups and
     * returns if it is in the process of resetting.
     *
     * Returns null if no setup is resetting.
     *
     * @since 2.0.0
     * @return WorldReset setup that is resetting
     */
    @Nullable CWRWorldReset getResetting();

    /**
     * Gets the next WorldReset setup to reset
     * based on running timers.
     *
     * Returns null if no running timers.
     *
     * @since 2.0.0
     * @return WorldReset setup that will reset next
     */
    @Nullable CWRWorldReset getNextResetting();

    /**
     * Gets the reset status of the next WorldReset
     * setup to reset based on running timers.
     *
     * Returns no running timers message if
     * there are no running timers.
     *
     * @since 2.0.0
     * @param player Player for placeholder parsing
     * @return Status message of next resetting world
     */
    @NotNull String getNextResettingStatus(@Nullable Player player);

    /**
     * Checks if there are any resetting worlds.
     *
     * @since 2.0.0
     * @return True if a world is resetting
     */
    boolean isResetting();

}
