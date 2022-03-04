import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema2 {
    @Test
    public void cualquier_rango_10_al_15(){
        Problema2 problema = new Problema2();
        int principio = 10;
        int fin = 15;
        String expected = "Buzz11Fizz1314FizzBuzz";
        String actual = problema.sucesion(principio,fin);
        Assertions.assertEquals(expected,actual);
    }
}
