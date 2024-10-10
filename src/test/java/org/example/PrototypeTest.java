package org.example;

import org.example.equipment.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {
    Boots boots;
    Chesplate chesplate;
    Leggings leggings;
    Helmet helmet;
    Weapon weapon;
    Zombie zombie;

    /**
     * Create before each test in this class an object of the class:<p>
     *      {@link Boots}: bootsName = "Iron Boots", protectionPoints = 2, durability = 195
     *      <p>
     *      {@link Chesplate}: chesplateName = "Gold Chestplate", protectionPoints = 5, durability = 112
     *      <p>
     *      {@link Leggings}: leggingsName = "Leather Leggings", protectionPoints = 2, durability = 75
     *      <p>
     *      {@link Helmet}: helmetName = "Diamond Helmet", protectionPoints = 3, durability = 363
     *      <p>
     *      {@link Weapon}: weaponName = "Trident", damage= 9, durability = 250
     *      <p>
     *      {@link Zombie}: name = "The Chosen One", healthPoints = 9999, weapon = weapon, helmet = helmet, chesplate = chesplate, leggings = leggings, boots = boots
     */
    @BeforeEach
    void setUp() {
        boots = new Boots("Iron Boots", 2,195);
        chesplate = new Chesplate("Gold Chestplate", 5,112);
        leggings = new Leggings("Leather Leggings", 2,75);
        helmet = new Helmet("Diamond Helmet", 3,363);
        weapon = new Weapon("Trident", 9,250);
        zombie = new Zombie("The Chosen One", 9999, weapon, helmet, chesplate, leggings, boots);
    }

    /**
     * Test if the clone method of {@link Helmet} class returns an object with a different memory
     * direction and the same attributes values
     */
    @Test
    void cloneBoots() {
        Boots anotherBoots = boots.clone();

        assertNotEquals(boots.getMemoryDirection(), anotherBoots.getMemoryDirection());
        assertEquals(boots.getBootsName(), anotherBoots.getBootsName());
        assertEquals(boots.getDurability(), anotherBoots.getDurability());
        assertEquals(boots.getProtectionPoints(), anotherBoots.getProtectionPoints());
    }

    /**
     * Test if the clone method of {@link Chesplate} class returns an object with a different memory
     * direction and the same attributes values
     */
    @Test
    void cloneChestplate() {
        Chesplate anotherChesplate = chesplate.clone();

        assertNotEquals(chesplate.getMemoryDirection(), anotherChesplate.getMemoryDirection());
        assertEquals(chesplate.getChesplateName(), anotherChesplate.getChesplateName());
        assertEquals(chesplate.getDurability(), anotherChesplate.getDurability());
        assertEquals(chesplate.getProtectionPoints(), anotherChesplate.getProtectionPoints());
    }

    /**
     * Test if the clone method of {@link Helmet} class returns an object with a different memory
     * direction and the same attributes values
     */
    @Test
    void cloneHelmet() {
        Helmet anotherHelmet = helmet.clone();

        assertNotEquals(helmet.getMemoryDirection(), anotherHelmet.getMemoryDirection());
        assertEquals(helmet.getHelmetName(), anotherHelmet.getHelmetName());
        assertEquals(helmet.getDurability(), anotherHelmet.getDurability());
        assertEquals(helmet.getProtectionPoints(), anotherHelmet.getProtectionPoints());
    }

    /**
     * Test if the clone method of {@link Leggings} class returns an object with a different memory
     * direction and the same attributes values
     */
    @Test
    void cloneLeggings() {
        Leggings anotherLeggings = leggings.clone();

        assertNotEquals(leggings.getMemoryDirection(), anotherLeggings.getMemoryDirection());
        assertEquals(leggings.getLeggingsName(), anotherLeggings.getLeggingsName());
        assertEquals(leggings.getDurability(), anotherLeggings.getDurability());
        assertEquals(leggings.getProtectionPoints(), anotherLeggings.getProtectionPoints());
    }

    /**
     * Test if the clone method of {@link Weapon} class returns an object with a different memory
     * direction and the same attributes values
     */
    @Test
    void cloneWeapon() {
        Weapon anotherWeapon = weapon.clone();

        assertNotEquals(weapon.getMemoryDirection(), anotherWeapon.getMemoryDirection());
        assertEquals(weapon.getWeaponName(), anotherWeapon.getWeaponName());
        assertEquals(weapon.getDurability(), anotherWeapon.getDurability());
        assertEquals(weapon.getDamage(), anotherWeapon.getDamage());
    }

    /**
     * Test if the clone method of {@link Zombie} class returns an object with a different memory
     * direction and the same attributes values.
     * <p>
     * If it has objects as attributes, test that those attributes are also clones.
     */
    @Test
    void cloneZombie() {
        Zombie anotherZombie = zombie.clone();

        assertNotEquals(zombie.getMemoryDirection(), anotherZombie.getMemoryDirection());
        assertNotEquals(zombie.getBoots().getMemoryDirection(), anotherZombie.getBoots().getMemoryDirection());
        assertNotEquals(zombie.getLeggings().getMemoryDirection(), anotherZombie.getLeggings().getMemoryDirection());
        assertNotEquals(zombie.getChesplate().getMemoryDirection(), anotherZombie.getChesplate().getMemoryDirection());
        assertNotEquals(zombie.getHelmet().getMemoryDirection(), anotherZombie.getHelmet().getMemoryDirection());
        assertNotEquals(zombie.getWeapon().getMemoryDirection(), anotherZombie.getWeapon().getMemoryDirection());
        assertEquals(zombie.toString(), anotherZombie.toString());
    }

}