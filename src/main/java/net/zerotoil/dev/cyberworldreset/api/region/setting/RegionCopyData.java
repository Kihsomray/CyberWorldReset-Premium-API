package net.zerotoil.dev.cyberworldreset.api.region.setting;

import com.sk89q.worldedit.math.BlockVector3;
import net.zerotoil.dev.cyberworldreset.api.world.CWRWorldReset;
import org.bukkit.Location;

/**
 * This class contains data for region copy
 * data necessary for the WorldEdit copy queue.
 *
 * @author Kihsomray
 */
public class RegionCopyData {

    private final CWRWorldReset worldReset;
    private final String entry;
    private final Location upperCorner;
    private final Location lowerCorner;
    private final String id;


    /**
     * Constructor for region copy data.
     *
     * @since 2.0.0
     * @param worldReset WorldReset this data applies to
     * @param entry Name of region plugin
     * @param upperCorner Region upper corner
     * @param lowerCorner Region lower corner
     * @param id String ID of region
     */
    public RegionCopyData(
            CWRWorldReset worldReset,
            String entry,
            Location upperCorner,
            Location lowerCorner,
            String id
    ) {

        this.worldReset = worldReset;
        this.entry = entry;
        this.upperCorner = upperCorner;
        this.lowerCorner = lowerCorner;
        this.id = id;

    }


    /**
     * Gets world reset binded to this data.
     *
     * @since 2.0.0
     * @return Binded WorldReset instance
     */
    public CWRWorldReset getWorldReset() {
        return worldReset;
    }

    /**
     * Gets the name of the region plugin associated.
     *
     * @since 2.0.0
     * @return Name of region plugin
     */
    public String getEntry() {
        return entry;
    }

    /**
     * Gets the location for the upper corner.
     *
     * @since 2.0.0
     * @return Location of upper corner
     */
    public Location getUpperCorner() {
        return upperCorner;
    }

    /**
     * Gets the location for the lower corner.
     *
     * @since 2.0.0
     * @return Location of lower corner
     */
    public Location getLowerCorner() {
        return lowerCorner;
    }

    /**
     * Gets the id of the region.
     *
     * @since 2.0.0
     * @return ID of region
     */
    public String getId() {
        return id;
    }


    /**
     * Gets upper X coordinate of the region.
     *
     * @since 2.0.0
     * @return Upper X coordinate of region
     */
    public int getUpperX() {
        return upperCorner.getBlockX();
    }

    /**
     * Gets upper Y coordinate of the region.
     *
     * @since 2.0.0
     * @return Upper Y coordinate of region
     */
    public int getUpperY() {
        return Math.min(upperCorner.getWorld().getMaxHeight(), upperCorner.getBlockY());
    }

    /**
     * Gets upper Z coordinate of the region.
     *
     * @since 2.0.0
     * @return Upper Z coordinate of region
     */
    public int getUpperZ() {
        return upperCorner.getBlockZ();
    }


    /**
     * Gets lower X coordinate of the region.
     *
     * @since 2.0.0
     * @return Lower X coordinate of region
     */
    public int getLowerX() {
        return lowerCorner.getBlockX();
    }

    /**
     * Gets lower Y coordinate of the region.
     *
     * @since 2.0.0
     * @return Lower Y coordinate of region
     */
    public int getLowerY() {
        return Math.max(lowerCorner.getWorld().getMinHeight(), lowerCorner.getBlockY());
    }

    /**
     * Gets lower Z coordinate of the region.
     *
     * @since 2.0.0
     * @return Lower Z coordinate of region
     */
    public int getLowerZ() {
        return lowerCorner.getBlockZ();
    }


    /**
     * Gets upper BlockVector3 (WorldEdit) of the region.
     *
     * @since 2.0.0
     * @return Upper corner BlockVector3
     */
    public BlockVector3 getUpperVector() {
        return BlockVector3.at(getUpperX(), getUpperY(), getUpperZ());
    }

    /**
     * Gets lower BlockVector3 (WorldEdit) of the region.
     *
     * @since 2.0.0
     * @return Lower corner BlockVector3
     */
    public BlockVector3 getLowerVector() {
        return BlockVector3.at(getLowerX(), getLowerY(), getLowerZ());
    }

}
