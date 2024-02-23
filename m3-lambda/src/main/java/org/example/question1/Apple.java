package org.example.question1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Apple {
    private Weight weight;
    private Color color;

    private int numericWeight;

    public Apple(Weight weight, Color color, int numericWeight) {
        this.weight = weight;
        this.color = color;
        if ((weight.equals(Weight.HEAVY) && numericWeight > 200 ) || (weight.equals(Weight.LIGHT) && numericWeight <=200) ){
                this.numericWeight = numericWeight;
        }else{
            System.err.println("Please enter corresponding weight description and numeric value => description: " + weight + ", numeric value: " + numericWeight);
            System.exit(1);
        }

    }
}
