package org.example;

import lombok.*;
import org.example.equipment.*;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Zombie {
    private String name;
    private double healthPoints;
    private Weapon weapon;
    private Helmet helmet;
    private Chesplate chesplate;
    private Leggings leggings;
    private Boots boots;

    /**
     * Returns the memory direction of the object that calls the method
     * @return The memory direction of the object
     */
    public String getMemoryDirection(){
        return  Integer.toHexString(System.identityHashCode(this));
    }

    /**
     * Returns a new object with the same attributes values of the object that calls the method.
     * <p>
     * If it has objects as attributes, those attributes values will be clones of the objects.
     * @return A new object with the same attributes values of the object that calls the method
     */
    @Override
    public Zombie clone() {
        return new Zombie(this.name, this.healthPoints, this.weapon.clone(), this.helmet.clone(), this.chesplate.clone(), this.leggings.clone(), this.boots.clone());
    }
}
