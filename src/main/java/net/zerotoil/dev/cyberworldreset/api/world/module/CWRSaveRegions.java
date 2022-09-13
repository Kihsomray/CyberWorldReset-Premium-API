package net.zerotoil.dev.cyberworldreset.api.world.module;

/**
 * This class contains save region settings from
 * a specific WorldReset.
 *
 * @author Kihsomray
 */
public interface CWRSaveRegions {

    /**
     * Reloads all save region data.
     */
    void reload();

    /**
     * Checks if region copying has been completed.
     *
     * @return True if completed
     */
    boolean isCopyingComplete();

    /**
     * This class contains safe world settings from
     * a specific WorldReset.
     *
     * @author Kihsomray
     */
    boolean isPastingComplete();

}
