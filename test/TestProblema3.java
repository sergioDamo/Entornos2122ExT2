import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema3 {
    @Test
    public void cualquier_rango_10_al_21() {
        Problema3 problema = new Problema3();
        int principio = 10;
        int fin = 21;
        String expected = "BuzzBooFizz13FooFizzBuzz1617Fizz19BuzzFizzFoo";
        String actual = problema.sucesion(principio, fin);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void rango_77() {
        Problema3 problema = new Problema3();
        int principio = 77;
        int fin = 77;
        String expected = "FooBoo";
        String actual = problema.sucesion(principio, fin);
        Assertions.assertEquals(expected, actual);
    }
}
