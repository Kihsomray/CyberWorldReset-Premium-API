package net.zerotoil.dev.cyberworldreset.api.cache;

/**
 * This class manages config, lang, and world data.
 *
 * @author Kihsomray
 */
public interface CWRCacheManager {

    /**
     * Reload config, lang, and world cache.
     *
     * @since 2.0.0
     */
    void reload();

    /**
     * Gets cached config values.
     *
     * @since 2.0.0
     * @return Config container
     */
    CWRConfigManager config();

    /**
     * Gets cached world setups. Includes RTPWorld
     * and WorldReset setups.
     *
     * @since 2.0.0
     * @return World Manager
     */
    CWRWorldManager worlds();


}
