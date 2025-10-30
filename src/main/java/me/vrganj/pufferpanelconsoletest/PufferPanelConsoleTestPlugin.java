package me.vrganj.pufferpanelconsoletest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class PufferPanelConsoleTestPlugin extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        // Register the command executor for the "pufferpanelconsoletest" command
        this.getCommand("pufferpanelconsoletest").setExecutor(this);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String @NotNull [] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("TEST " + i);
            } else {
                System.err.println("TEST " + i);
            }
        }

        return true;
    }
}
