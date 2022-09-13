package net.zerotoil.dev.cyberworldreset.api.region.worldedit;

import net.zerotoil.dev.cyberworldreset.api.region.setting.RegionCopyData;
import net.zerotoil.dev.cyberworldreset.api.world.CWRWorldReset;

/**
 * This class allows for the relocation of
 * regions from an old version of a world
 * to a newly reset version.
 *
 * Operations will be performed synchronously
 * if standard WorldEdit is used and async if
 * FAWE is used.
 *
 * @author Kihsomray
 */
public interface CWRWorldEdit {

    void addCopyToQueue(RegionCopyData data);

    /**
     * Checks if regions are being copied from a world.
     *
     * @since 2.0.0
     * @param worldReset WorldReset instance
     * @return True if copying
     */
    boolean isCopying(CWRWorldReset worldReset);

    /**
     * Checks if regions are being pasted into a world.
     *
     * @since 2.0.0
     * @param worldReset WorldReset instance
     * @return True if pasting
     */
    boolean isPasting(CWRWorldReset worldReset);

    /**
     * Gets the number of copied regions so far.
     *
     * @since 2.0.0
     * @param worldReset World reset instance
     * @return number of copied regions
     */
    int copiedRegions(CWRWorldReset worldReset);

    /**
     * Gets the number of regions left to paste.
     *
     * @since 2.0.0
     * @param worldReset World reset instance
     * @return number of remaining regions to paste
     */
    int remainingToPaste(CWRWorldReset worldReset);

    /**
     * Gets the number of pasted regions so far.
     *
     * @since 2.0.0
     * @param worldReset World reset instance
     * @return number of pasted regions
     */
    int pastedRegions(CWRWorldReset worldReset);

    /**
     * Gets the number of total regions in queue.
     *
     * @since 2.0.0
     * @param worldReset World reset instance
     * @return number of total regions in queue
     */
    int size(CWRWorldReset worldReset);

}
