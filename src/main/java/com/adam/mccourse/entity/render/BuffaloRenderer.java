package com.adam.mccourse.entity.render;

import com.adam.mccourse.MCCourseMod;
import com.adam.mccourse.entity.BuffaloEntity;
import com.adam.mccourse.entity.model.BuffaloModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BuffaloRenderer extends MobRenderer<BuffaloEntity, BuffaloModel<BuffaloEntity>>
{
    public BuffaloRenderer(EntityRendererManager renderManagerIn)
    {
        super(renderManagerIn, new BuffaloModel<>(), 0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(BuffaloEntity entity)
    {
        return new ResourceLocation(MCCourseMod.MOD_ID, "textures/entity/buffalo.png");
    }
}
