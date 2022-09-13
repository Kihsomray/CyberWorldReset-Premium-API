package net.zerotoil.dev.cyberworldreset.api.world.module;

/**
 * This class contains world warning settings from
 * a specific WorldReset.
 *
 * @author Kihsomray
 */
public interface CWRWorldWarning {

    /**
     * Reloads all world warning data.
     */
    void reload();

    /**
     * Sends a warning that the world is resetting soon.
     */
    void sendWarning();


}
