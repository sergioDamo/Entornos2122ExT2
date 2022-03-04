public class Problema2 {



    static String sucesion(int inicio,int fin ){
        String res = "";

        for (int i = inicio;i <= fin;i++){
        boolean comp3 = i % 3 == 0;
            boolean comp5 = i % 5 == 0;
            if (comp3){
                res += "Fizz";
            }
            if (comp5){
                res +="Buzz";
            }
            if (!comp3 && !comp5){
                res += "" + i;
          }
        }
        return res;
    }

    public static void main(String[] args) {
        int inicio = 10;
        int fin = 15;
        String res = sucesion(inicio,fin);
        System.out.println(res);
    }
}
