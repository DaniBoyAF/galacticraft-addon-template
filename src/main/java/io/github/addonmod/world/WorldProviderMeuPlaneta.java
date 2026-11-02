package io.github.addonmod.world;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

public class WorldProviderMeuPlaneta extends WorldProvider
{
    @Override
    public DimensionType getDimensionType()
    {
        return DimensionType.OVERWORLD;
    }
}
