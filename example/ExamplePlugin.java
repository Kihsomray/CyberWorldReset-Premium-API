package net.zerotoil.dev.testplugin;

import net.zerotoil.dev.cyberworldreset.api.CWRMain;
import net.zerotoil.dev.cyberworldreset.api.CyberWorldResetAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        // Get an instance from the CyberWorldResetAPI class:
        CWRMain cwrMain = CyberWorldResetAPI.getInstance();

        // Access loaded information in cache:
        CWRCache cache = cwrMain.cache();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}