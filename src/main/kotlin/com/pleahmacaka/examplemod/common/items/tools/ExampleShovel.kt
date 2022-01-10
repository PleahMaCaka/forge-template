package com.pleahmacaka.examplemod.common.items.tools

import com.pleahmacaka.examplemod.common.init.ExampleCreativeModTab
import net.minecraft.world.item.AxeItem
import net.minecraft.world.item.PickaxeItem
import net.minecraft.world.item.ShovelItem
import net.minecraft.world.item.Tiers

object ExampleShovel : ShovelItem(
    Tiers.NETHERITE, 5f, 3.0f,
    Properties()
        .tab(ExampleCreativeModTab)
) {
}