/**
 * Created by fabalcu97 on 05/04/17.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Calculator.Calculator;

/**
 * Created by fabalcu on 3/27/17.
 */

public class Main {

    private static Calculator calc = new Calculator();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a;
        a = br.readLine();
        String b;
        b = br.readLine();
        float aux = calc.add(Float.parseFloat(a), Float.parseFloat(b));
        System.out.println(aux);
    }
}