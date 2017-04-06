/**
 * Created by fabalcu97 on 05/04/17.
 */

package Calculator;

public class Calculator {

    //Methods
    public Calculator(){}

    public float add(float a, float b){
        return a + b;
    }

    public float div(float a, float b){
        return b!=0?a / b: 0;
    }

    public float sub(float a, float b){
        return a - b;
    }

    public double mult(double a, double b){
        return a * b;
    }

}