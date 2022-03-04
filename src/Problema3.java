public class Problema3 {



    static String sucesion(int inicio,int fin ){
        String res = "";

        for (int i = inicio;i <= fin;i++){
        boolean comp3 = i % 3 == 0;
        boolean comp5 = i % 5 == 0;
        boolean comp7 = i % 7 == 0;
        boolean comp11 = i % 11 == 0;
            if (comp3){
                res += "Fizz";
            }
            if (comp5){
                res +="Buzz";
            }
            if (comp7){
                res +="Foo";
            }
            if (comp11){
                res +="Boo";
            }
            if (!comp3 && !comp5 && !comp7 && !comp11){
                res += "" + i;
          }
        }
        return res;
    }

    public static void main(String[] args) {
        int inicio = 10;
        int fin = 21;
        String res = sucesion(inicio,fin);
        System.out.println(res);
    }
}
