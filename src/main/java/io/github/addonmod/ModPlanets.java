package io.github.addonmod;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.dimension.TeleportTypeOrbit;
import net.minecraft.util.ResourceLocation;
import io.github.addonmod.world.WorldProviderMeuPlaneta;

public class ModPlanets {
    
    public static Planet meuPlaneta;

    public static void init() {
        meuPlaneta = new Planet("meu_planeta_customizado");
        meuPlaneta.setParentSolarSystem(GalacticraftCore.solarSystemSol);
        meuPlaneta.setTierRequired(1); 
        meuPlaneta.setRelativeSize(1.0F);
        meuPlaneta.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(15.0F, 15.0F));
        meuPlaneta.setRelativeOrbitTime(2.0F);
        meuPlaneta.setBodyIcon(new ResourceLocation("galacticraftevo:textures/gui/celestialbodies/meu_planeta.png"));
        
        // Registra a dimensão (ID 2500)
        meuPlaneta.setDimensionInfo(2500, WorldProviderMeuPlaneta.class, true);
        
        // Registra o planeta e o teleporte
        GalaxyRegistry.registerPlanet(meuPlaneta);
        GalacticraftRegistry.registerTeleportType(WorldProviderMeuPlaneta.class, new TeleportTypeOrbit());
    }
}