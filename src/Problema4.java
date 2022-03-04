public class Problema4 {



    static String sucesion(int inicio,int fin ){
        String res = "";
        for (int i = inicio;i <= fin;i++){
            boolean comp3 = isComp(i,3);
            boolean comp5 = isComp(i,5);
            boolean comp7 = isComp(i,7);
            boolean comp11 = isComp(i,11);
            res = Fizz(res, comp3);
            res = Buzz(res, comp5);
            res = Foo(res, comp7);
            res = Boo(res, comp11);
            res = sinLetras(res, i, comp3, comp5, comp7, comp11);

        }
        return res;
    }
    private static boolean isComp(int i,int n) {
        return i % n == 0;
    }
    private static String sinLetras(String res, int i, boolean comp3, boolean comp5, boolean comp7, boolean comp11) {
        if (!comp3 && !comp5 && !comp7 && !comp11){
            res += "" + i;
      }
        return res;
    }

    private static String Boo(String res, boolean comp11) {
        if (comp11){
            res +="Boo";
        }
        return res;
    }

    private static String Foo(String res, boolean comp7) {
        if (comp7){
            res +="Foo";
        }
        return res;
    }

    private static String Buzz(String res, boolean comp5) {
        if (comp5){
            res +="Buzz";
        }
        return res;
    }

    private static String Fizz(String res, boolean comp3) {
        if (comp3){
            res += "Fizz";
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
