public class Convercoes_casting {
    public static void main(String[] args){
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;
        
        int l2;
        long l3 = 100000000L;
        l2 = (int) l3;

        double d1; 
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 100000.58d;
        f2 = (float) d2;
        double d3 = 1000.10000000000000000000000000000000000000000000000000000000000000000000000d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.015564f;
        i4 = (int) f4;

        System.out.println("b1: "+b1);
        System.out.println("s1: "+s1);
        System.out.println("l2: "+l2);
        System.out.println("l3 "+l3);
        System.out.println("d1 "+d1);
        System.out.println("f1 "+f1);
        System.out.println("f2 "+f2);
        System.out.println("f3 "+f3);
        System.out.println("d2 "+d2);
        System.out.println("d3 "+d3);
        System.out.println("i4 "+i4);
        System.out.println("f4 "+f4);
    }
}
