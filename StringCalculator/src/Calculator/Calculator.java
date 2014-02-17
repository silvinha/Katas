package Calculator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Calculator {

    private int add(String numbers) {
        if (numbers.isEmpty())
            return 0;
        if (numbers.length() == 1)
            return Integer.parseInt(numbers);
        int num1 = Integer.parseInt(numbers.substring(0,1));
        int num2 = Integer.parseInt(numbers.substring(1,2));
        return num1 + num2;
    }

    @Test
    public void add_devuelve_0_si_recibe_cadena_vacia() {
        int result = add("");

        assertThat(result, is(0));
    }

    @Test
    public void add_devuelve_1_si_recibe_1() {
        int result = add("1");

        assertThat(result, is(1));
    }

    @Test
    public void add_devuelve_2_si_recibe_2() {
        int result = add("2");

        assertThat(result, is(2));
    }

    @Test
    public void add_devuelve_la_suma_de_dos_numeros_si_recibe_una_cadena_con_dos_numeros() {
        int result = add("12");

        assertThat(result, is(3));
    }

}
