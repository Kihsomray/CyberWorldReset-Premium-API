package net.zerotoil.dev.cyberworldreset.api.world.module;

/**
 * This class contains data for chunk settings
 * of a specific world reset.
 *
 * @author Kihsomray
 */
public interface CWRChunkSettings {

    /**
     * Gets the loading radius.
     *
     * @return loading radius
     */
    int getLoadingRadius();

    /**
     * Gets the ticks per iteration.
     *
     * @return ticks per iteration
     */
    long getTicksPerIteration();

    /**
     * Gets the chunks per iteration.
     *
     * @return chunks per iteration
     */
    long getChunksPerIteration();

    /**
     * Gets the initial chunk loading ticks.
     *
     * @return initial chunk ticks
     */
    long getInitialChunkTicks();

}
