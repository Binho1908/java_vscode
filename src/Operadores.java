

public class Operadores {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Prepos");
        System.out.println("");
        prePos();
        System.out.println("Aritmetico");
        System.out.println("");
        aritmetico();
        System.out.println("Atribuição");
        System.out.println("");
        atribuicao();
        System.out.println("Precedencia");
        System.out.println("");
        precedencia();

    }

    private static void prePos(){
        int k = 10;
        int i = ++k;
        int s = k++;
        int x = k;

        System.out.println(k);
        System.out.println(i);
        System.out.println(s);
        System.out.println(x);
        System.out.println("---------------------");

    }

    private static void aritmetico(){
        int a = 20;
        int b = 5;

        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        int resto = a % b;

        System.out.println("a + b = "+sum);
        System.out.println("a - b = "+sub);
        System.out.println("a * b = "+mult);
        System.out.println("a / b = "+div);
        System.out.println("a % b = "+resto);
        System.out.println("---------------------");
        
    }

    private static void atribuicao(){
        int  i = 1500;
        short s = 15;
        long l = 500L;
        int k = 10;
        float f = 3.5f;
        double d = f;

        System.out.println("d: " +d);

        i += 5;
        s -= 3;
        d /= 2.7d;
        l += 3;
        k %= 2;

        System.out.println("i: "+i);
        System.out.println("s: "+s);
        System.out.println("d: "+d);
        System.out.println("l: "+l);
        System.out.println("k: "+k);
        

        i = k = s;

        System.out.println("k: "+ k);
        System.out.println("i: "+ i);



        System.out.println("---------------------");
    }

    private static void precedencia(){

        int i = 10;
        int j = 20;
        int k = 30;

        int a  = i++ + --j + k;

        System.out.println("i++ + --j + k = "+a);
        System.out.println("i = "+i);

        int b  = k / --i % 3 + 1;

        System.out.println("k / --i % 3 + 1 = "+b);
        System.out.println("i = "+i);

        int c = 2;
        int res = c +=  i += 5;

        System.out.println("c +=  i += 5"+res);
        System.out.println("i = "+i);

        System.out.println("---------------------");
    }
}
