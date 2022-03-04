public class Problema1 {



    static String sucesion(){
        String res = "";
        for (int i = 1;i<=20;i++){
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
        String res = sucesion();
        System.out.println(res);
    }
}
