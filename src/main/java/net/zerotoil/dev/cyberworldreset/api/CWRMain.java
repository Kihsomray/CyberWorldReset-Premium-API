package net.zerotoil.dev.cyberworldreset.api;

import net.zerotoil.dev.cybercore.CyberCore;
import net.zerotoil.dev.cyberworldreset.api.cache.CWRCacheManager;

/**
 * This class is the main instance of the plugin
 * CyberWorldReset.
 *
 * @author Kihsomray
 */
public interface CWRMain {

    /**
     * Reload the plugin and all cache.
     */
    void reloadPlugin();

    /**
     * Gets the author(s) of the plugin.
     *
     * @return Author(s) of CyberWorldReset
     */
    String getAuthors();

    /**
     * Gets the core (CyberCore) of the plugin.
     *
     * @return CyberCore instance
     */
    CyberCore core();

    /**
     * Gets loaded cache of the plugin.
     *
     * @return Cache manager
     */
    CWRCacheManager cache();

}
