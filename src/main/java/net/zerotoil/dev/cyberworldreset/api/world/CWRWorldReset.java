package net.zerotoil.dev.cyberworldreset.api.world;

import net.zerotoil.dev.cyberworldreset.api.world.data.CWRChunkLoader;
import net.zerotoil.dev.cyberworldreset.api.world.data.CWRResetStatus;
import net.zerotoil.dev.cyberworldreset.api.world.module.*;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public interface CWRWorldReset extends CWRRTPWorld {

    boolean isRollbackEnabled();
    boolean isRollbackRandom();

    boolean isResetting();
    boolean isInitializing();
    boolean isBackingUp();
    boolean isDeletingWorld();
    boolean isRollingBack();
    boolean isCreatingWorld();
    boolean isFinalizing();

    CWRChunkLoader getChunkLoader();
    CWRResetStatus getWorldResetStatus();

    CWRChunkSettings getChunkSettings();
    CWRSafeWorld getSafeWorld();
    CWRSaveRegions getSaveRegions();
    CWRWorldCommands getCommands();
    CWRWorldSchedulers getSchedulers();
    CWRWorldSettings getSettings();
    CWRWorldWarning getWarning();

    /**
     * Reset a world with loaded settings.
     *
     * @param player Player to parse placeholders
     */
    void reset(@Nullable Player player);

    /**
     * Create a backup of this world in the folder.
     *
     * @param player Player to parse placeholders
     * @param folder Folder to back up to
     * @param duringReset Is this being done during a reset
     */
    void backupWorld(Player player, String folder, boolean duringReset);

}
