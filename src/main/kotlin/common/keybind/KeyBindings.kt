package com.pleahmacaka.examplemod.common.keybind

import com.mojang.blaze3d.platform.InputConstants
import net.minecraft.client.KeyMapping
import net.minecraftforge.client.settings.KeyConflictContext
import org.lwjgl.glfw.GLFW

object KeyBindings {

    private const val CATEGORY = "PleahMaCaka's MagicTool"

    val KB_EXAMPLE_KEYBIND_ONE = KeyMapping(
        "ONE",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_INSERT,
        CATEGORY
    )

    val KB_EXAMPLE_KEYBIND_TWO = KeyMapping(
        "TWO",
        KeyConflictContext.IN_GAME,
        InputConstants.Type.KEYSYM,
        GLFW.GLFW_KEY_C,
        CATEGORY
    )

    val KEYBINDINGS = hashSetOf(KB_EXAMPLE_KEYBIND_ONE, KB_EXAMPLE_KEYBIND_TWO)
}