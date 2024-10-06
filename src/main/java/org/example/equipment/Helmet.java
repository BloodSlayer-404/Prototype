package org.example.equipment;

import lombok.*;
import org.example.Prototype;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Helmet implements Prototype<Helmet> {
    private String helmetName;
    private double protectionPoints;
    private int durability;

    /**
     * Returns the memory number of the object that calls the method
     * @return The memory number of the object
     */
    public String getMemoryDirection(){
        return  Integer.toHexString(System.identityHashCode(this));
    }

    /**
     * Returns a new object with the same attributes values of the object that calls the method
     * @return A new object with the same attributes values of the object that calls the method
     */
    @Override
    public Helmet clone() {
        return new Helmet(this.helmetName, this.protectionPoints, this.durability);
    }
}
