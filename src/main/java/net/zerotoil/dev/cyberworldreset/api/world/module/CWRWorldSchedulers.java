package net.zerotoil.dev.cyberworldreset.api.world.module;

/**
 * This class contains scheduler settings from
 * a specific WorldReset.
 *
 * @author Kihsomray
 */
public interface CWRWorldSchedulers {

    /**
     * Reloads reset and backup schedulers.
     */
    void reload();

    /**
     * Milliseconds of time until the next scheduler
     * will execute a reset.
     *
     * @return Milliseconds of time until reset occurs
     */
    long getMSUntilReset();

}
