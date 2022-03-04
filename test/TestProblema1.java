import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {
    @Test
    public void serie_del_1_al_2o(){
        Problema1 problema = new Problema1();
        String expected = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz";
        String actual = problema.sucesion();
        Assertions.assertEquals(expected,actual);

    }
}
