package io.github.addonmod;

public class Reference {
    public static final String MOD_NAME    = "AddonMod";
    public static final String MOD_ID      = "addonmod";
    public static final String MOD_VERSION = "1.0.0";
    
    public static final String TEXTURE_PATH_GUI            = "textures/gui/";
    public static final String TEXTURE_PATH_ENTITIES       = "textures/entities/";
    public static final String TEXTURE_PATH_ITEMS          = "textures/items/";
    
    public static final String MOD_FORGE             = "forge";
    public static final String MOD_FORGE_VERSION_MIN = "14.23.5.2860";
    public static final String MOD_GALACTICRAFT = "galacticraftcore";
    public static final String MOD_GALACTICRAFT_VERSION_MIN = "4.0.7";

    public static final String FORGE_DEPENDENCY = "required-after:" + MOD_FORGE + "@[" + MOD_FORGE_VERSION_MIN + ",); ";
    public static final String GC_DEPENDENCY    = "required-after:" + MOD_GALACTICRAFT + "@[" + MOD_GALACTICRAFT_VERSION_MIN + ",); ";
    public static final String MOD_DEPENDENCIES = FORGE_DEPENDENCY + GC_DEPENDENCY;
}