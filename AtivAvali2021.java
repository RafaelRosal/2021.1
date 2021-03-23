
package ativavali2021;

import java.util.Scanner;

public class AtivAvali2021 {

    public static void main(String[] args) {
        
        int n = 3;//tamanho dos vetores. Tamanho original = 100
        
        String [] desc = new String [n];
        double [] precCompra = new double [n];
        double [] precVenda = new double [n];
        double [] lucro = new double[n];
        
        preencheDados(desc, precCompra, precVenda);
        System.out.println();
        luc(desc, precCompra, precVenda, lucro);
        System.out.println();
        
    }
    
    public static void preencheDados (String [] desc, double [] precCompra, double [] precVenda){
        Scanner in = new Scanner(System.in);
        
        int i;
        for(i = 0; i <= desc.length - 1; i++){
            System.out.println("Informe a descrição do produto " + (i + 1));
            desc[i] = in.nextLine();
            System.out.println();
        }
        for(i = 0; i <= desc.length - 1; i++){
            System.out.println("Informe o preço de compra do produto " + desc[i]);
            precCompra[i] = in.nextDouble();
            System.out.println();
        }
        for(i = 0; i <= desc.length - 1; i++){
            System.out.println("Informe o preço de venda do produto " + desc[i]);
            precVenda[i] = in.nextDouble();
            System.out.println();
        }
    }
    
    public static void luc (String [] desc, double [] precCompra, double [] precVenda, double [] lucro){
        int i, j = 0, k = 0, l = 0, j10 = 0, k1020 = 0, l20 = 0;
        for( i = 0; i <= precCompra.length - 1; i++){
            lucro[i] = ( precVenda[i] - precCompra[i] ) / precCompra[i];
            lucro[i] = lucro[i] * 100;
            if(lucro[i] < 10){
                j = j + 1;
            }
            else if(lucro[i] >= 10 && lucro[i] <= 20){
                k = k + 1;
            }
            else if(lucro[i] > 20){
                l = l + 1;
            }
        }
        System.out.println("Número de mercadorias que proporcionam lucro < 10%");
        System.out.println(j);
        System.out.println();
        System.out.println("Número de mercadorias que proporcionam 10% <= lucro <= 20%");
        System.out.println(k);
        System.out.println();
        System.out.println("Número de mercadorias que proporcionam lucro > 20%");
        System.out.println(l);
        System.out.println();
        verif(desc, lucro, j, k, l);
    }
    
    public static void verifQuant1(String [] desc, double [] lucro, int num){
        int i;
        System.out.println("As mercadorias que deram lucro < 10% foram: ");
        System.out.println();
        for(i = 0; i <= desc.length - 1; i++){
            if(lucro[i] < 10){
                System.out.println(desc[i]);
                System.out.println();
            }
        }
            
    }
    
    public static void verifQuant2(String [] desc, double [] lucro, int num){
        int i;
        System.out.println("As mercadorias que deram 10% <= lucro <= 20% foram: ");
        System.out.println();
        for(i = 0; i <= desc.length - 1; i++){
            if(lucro[i] >= 10 && lucro[i] <= 20){
                System.out.println(desc[i]);
                System.out.println();
            }
        }
            
    }
    
    public static void verifQuant3(String [] desc, double [] lucro, int num){
        int i;
        System.out.println("As mercadorias que deram lucro > 20% foram: ");
        System.out.println();
        for(i = 0; i <= desc.length - 1; i++){
            if(lucro[i] > 20){
                System.out.println(desc[i]);
                System.out.println();
            }
        }
           
    }
    
    public static void verif(String [] desc, double [] lucro, int j, int k, int l){
        if(j > 0){
            verifQuant1(desc, lucro, j);
        }
        if(k > 0){
            verifQuant2(desc, lucro, k);
        }
        if(l > 0){
            verifQuant3(desc, lucro, l);
        }
    }
}