package com.example.plugin


import org.godotengine.godot.Godot
import org.godotengine.godot.plugin.GodotPlugin
import org.godotengine.godot.plugin.UsedByGodot

class Plugin(godot: Godot): GodotPlugin(godot) {

    override fun getPluginName() = "MyPlugin"

    /**
     * Example showing how to declare a method that's used by Godot.
     *
     * Shows a 'Hello World' toast.
     */
    @UsedByGodot
    private fun getHello() = "hello plugin"
}