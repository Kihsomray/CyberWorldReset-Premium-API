package net.zerotoil.dev.cyberworldreset.api.cache;

import net.zerotoil.dev.cyberworldreset.api.world.module.CWRChunkSettings;
import org.bukkit.Material;

import java.util.List;
import java.util.Set;

/**
 * This class contains config settings from
 * the file config.yml.
 *
 * Please check the config.yml for more
 * details regarding specific options.
 *
 * @author Kihsomray
 */
public interface CWRConfigManager {

    boolean isAutoUpdateConfig();
    boolean isAutoUpdateLang();
    boolean isConfirmationEnabled();
    long getConfirmationSeconds();
    boolean isConfirmationBypassOp();
    boolean isRequireResetConfirmation();
    boolean isRequireSaveConfirmation();
    boolean isRequireTeleportConfirmation();
    boolean isRequireEditConfirmation();
    boolean isTpCountdownEnabled();
    long getTpCountdownSeconds();
    boolean isTpCooldownEnabled();
    boolean isTpCooldownGlobal();
    long getTpCooldownSeconds();
    Set<Material> getTpBlacklistBlocks();
    long getRtpSearchTicks();
    int getRtpSearchAttempts();
    long getRtpSearchIntervalTicks();
    boolean isRtpSavedLocationsEnabled();
    long getRtpSavedLocationsSeconds();
    long getRtpSavedLocationsTolerance();
    long getRtpSavedLocationsMaxLocations();
    boolean isTpPlatformEnabled();
    Material getTpPlatformMaterialOverworld();
    Material getTpPlatformMaterialNether();
    Material getTpPlatformMaterialEnd();
    Material getTpPlatformMaterialOther();
    boolean isTpPlatformClearHeadSpace();
    long getTpPlatformRemoveRange();
    boolean isTpPlatformWhenDefault();
    boolean isTpPlatformWhenRandom();
    CWRChunkSettings getDefaultChunkSettings();
    boolean isSavePaperWorldYML();
    boolean isStoreCurrentSchedulers();
    boolean isSaveWorldBeforeReset();
    boolean isSafeReset();
    List<String> getNetherPortalLinking();
    List<String> getEndPortalLinking();
    boolean isDetailedMessages();
    boolean isFixIncorrectWorldBug();
    boolean isSearchChunkForSafety();
    boolean isDontDuplicateWarning();
    long getCopyRegionStallTicks();
    long getPasteRegionStallTicks();
    String getSavedWorldsFolder();
    String getSavedSchematicsFolder();
    boolean isSaveCmiWarps();
    boolean isSaveCopiedRegions();


}
