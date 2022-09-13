package net.zerotoil.dev.cyberworldreset.api;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Access portal to CyberWorldReset API.
 */
public class CyberWorldResetAPI {

    /**
     * Gets the instance of CyberWorldReset.
     *
     * Will return a functional main class
     * if the plugin is enabled. Otherwise,
     * null will be returned.
     *
     * @return Main class if enabled.
     */
    public static CWRMain getInstance() {
        JavaPlugin main = JavaPlugin.getProvidingPlugin(CWRMain.class);
        if (main instanceof CWRMain) return (CWRMain) main;
        return null;
    }

}
