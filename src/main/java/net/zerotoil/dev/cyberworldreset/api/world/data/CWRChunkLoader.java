package net.zerotoil.dev.cyberworldreset.api.world.data;

/**
 * This class functions as a spawn chunk loader
 * for a specific WorldReset. Chunks are loaded
 * asynchronously if paper fork.
 *
 * @author Kihsomray
 */
public interface CWRChunkLoader {

    /**
     * Checks if loader is still loading chunks.
     *
     * @return true if still loading
     */
    boolean isLoadingChunks();

    /**
     * Gets the total loaded chunk amount.
     *
     * @return Loaded chunk amount
     */
    int loadedChunksAmount();

    /**
     * Gets the total chunk amount.
     *
     * @return Total chunk amount
     */
    int totalChunksAmount();

    /**
     * Gets the remaining chunks to load.
     *
     * @return Remaining chunks to load
     */
    int remainingChunksAmount();

    /**
     * Gets the progress percentage.
     *
     * @return 0-100 Percentage of completion
     */
    int progressPercentage();


}
