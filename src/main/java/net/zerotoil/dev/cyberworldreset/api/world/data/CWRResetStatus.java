package net.zerotoil.dev.cyberworldreset.api.world.data;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

/**
 * This class provides the current reset status
 * of a specific WorldReset.
 *
 * @author Kihsomray
 */
public interface CWRResetStatus {

    /**
     * Gets the current status of the world reset
     * as a string. Formats the strings set in
     * lang.yml (near the bottom).
     *
     * @param player Player to parse placeholders for
     * @return String containing current status
     */
    String getStatus(@Nullable Player player);

    /**
     * Gets percentage of completion for the world reset.
     *
     * @return Percentage completion
     */
    int getPercentage();

    /**
     * Total number of processes including loading chunks
     * and copying regions.
     *
     * @return number of total processes
     */
    int totalProcesses();

    /**
     * Number of completed processes including loading chunks
     * and copying regions.
     *
     * @return number of completed processes
     */
    int completedProcesses();

}
