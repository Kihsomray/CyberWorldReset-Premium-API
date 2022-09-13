package net.zerotoil.dev.cyberworldreset.api.region.setting;

import com.sk89q.worldedit.extent.clipboard.BlockArrayClipboard;
import com.sk89q.worldedit.math.BlockVector3;

/**
 * This class contains data for region paste
 * data necessary for the WorldEdit paste queue.
 *
 * @author Kihsomray
 */
public class RegionPasteData {

    private final BlockArrayClipboard clipboard;
    private final Integer[] origin;

    /**
     * Constructor for region paste data.
     *
     * @since 2.0.0
     * @param clipboard BlockArrayClipboard of the region
     * @param copyData RegionCopyData for required data
     */
    public RegionPasteData(BlockArrayClipboard clipboard, RegionCopyData copyData) {
        this.clipboard = clipboard;
        origin = new Integer[]{
                copyData.getLowerX(),
                copyData.getLowerY(),
                copyData.getLowerZ()
        };
    }

    /**
     * Gets BlockArrayClipboard of the region.
     *
     * @since 2.0.0
     * @return BlockArrayClipboard of region
     */
    public BlockArrayClipboard getClipboard() {
        return clipboard;
    }

    /**
     * Gets the origin of the region as an
     * integer array.
     *
     * @since 2.0.0
     * @return Integer array of the origin
     */
    public Integer[] getOrigin() {
        return origin;
    }

    /**
     * Gets origin BlockVector3 (WorldEdit) of the region.
     *
     * @since 2.0.0
     * @return Origin BlockVector3
     */
    public BlockVector3 getOriginVector() {
        return BlockVector3.at(origin[0], origin[1], origin[2]);
    }

}
