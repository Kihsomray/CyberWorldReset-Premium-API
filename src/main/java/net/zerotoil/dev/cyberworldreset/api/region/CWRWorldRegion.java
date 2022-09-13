package net.zerotoil.dev.cyberworldreset.api.region;

public interface CWRWorldRegion {

    /**
     * Performs operation (SAVE or DELETE) with a hooked
     * plugin's regions.
     *
     * @since 2.0.0
     * @return true if operation was performed on 1 or more regions
     */
    boolean performOperation();

    /**
     * Copies all the regions contained within the plugin.
     *
     * @since 2.0.0
     * @return false if no regions copied
     */
    boolean copy();

    /**
     * Deletes all data within the corresponding plugin
     * for the specified regions.
     *
     * @since 2.0.0
     * @return false if no regions deleted
     */
    boolean delete();


    /**
     * Operation that should be performed on a region.
     *
     * @since 2.0.0
     * Options: SAVE, DELETE.
     */
    enum RegionOperation {
        SAVE, DELETE
    }

}
