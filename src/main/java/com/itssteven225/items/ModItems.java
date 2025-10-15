package com.itssteven225.items;


import com.itssteven225.CodexOfTheVoid;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item VOID_DUST = registerItem("void_dust", new Item(new Item.Settings()));

    public static final Item FEMBOY_SOCKS =registerItem("femboy_socks", new ArmorItem(ModArmorMaterials.FEMBOY_SOCKS_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(5))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CodexOfTheVoid.MOD_ID, name), item);
    }

    public static void registerModItems() {
    }
}
