package net.zerotoil.dev.cyberworldreset.api.world;

import net.zerotoil.dev.cyberworldreset.api.world.module.CWRWorldTeleport;
import org.bukkit.World;

public interface CWRRTPWorld {

    String getWorldName();

    boolean isEnabled();

    CWRWorldTeleport getTeleport();

    /**
     * Reloads the RTP world data. Should be called
     * after creating this object.
     *
     * Will throw IllegalArgumentException if the
     * section inside of worlds.yml is incomplete.
     *
     * @return RTPWorld instance
     */
    CWRRTPWorld reload();

    /**
     * Gets the world of the RTP world.
     *
     * @return world object
     */
    World getWorld();

    /**
     * Gets the placeholders of this RTP
     * world setup.
     *
     * @return Placeholders
     */
    String[] getPlaceholders();

    /**
     * Gets the placeholder replacements of
     * this RTP world setup.
     *
     * @return Placeholder replacements
     */
    String[] getReplacements();

}
