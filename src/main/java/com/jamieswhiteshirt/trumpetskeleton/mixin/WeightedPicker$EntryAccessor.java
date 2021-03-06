package com.jamieswhiteshirt.trumpetskeleton.mixin;

import net.minecraft.util.collection.WeightedPicker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(WeightedPicker.Entry.class)
public interface WeightedPicker$EntryAccessor {
    @Accessor
    int getWeight();
}
