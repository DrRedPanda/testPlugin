package com.replantedtech.plugins;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKit implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			if (args[0].equals("op")) {
				Player player = (Player) sender;
			
				ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
				sword.addEnchantment(Enchantment.KNOCKBACK, 2);
				sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
				sword.addEnchantment(Enchantment.DURABILITY, 2);
			
				ItemStack bow = new ItemStack(Material.BOW);
				bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
				bow.addEnchantment(Enchantment.ARROW_FIRE, 1);
				bow.addEnchantment(Enchantment.DURABILITY, 2);
		
				player.getInventory().addItem(sword);
				player.getInventory().addItem(bow);
				}
			}
		return true;
	}
}
