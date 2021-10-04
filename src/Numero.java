
public class Numero{
    public static void main(String[] args){
        int leitor = -40;
//declare suas variaveis corretamente
        int neg = 0;
        int pos = 0;
        int par = 0;
        int  imp = 0;

//continue a solução
        
          if(leitor < 0){
            neg++;
          }else if(leitor > 0){
            pos++;
          }else if(leitor % 2 == 0){
            par++;
          }else if(leitor % 2 == 1){
            imp++;
          }
        
//insira suas variaveis corretamente
        System.out.println( par+ " par(es)");
        System.out.println( imp+ " impar(es)");
        System.out.println( pos+ " positivo(s)");
        System.out.println( neg+ " negativo(s)");
    }
}
