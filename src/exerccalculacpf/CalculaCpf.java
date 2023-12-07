/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerccalculacpf;

/**
 *
 * @author 180701103
 */
public class CalculaCpf {
    
    public static String CalculaCpf(String num){
        
            int somaDig1, somaDig2, digito10 = 0, digito11 = 0, cpf;
            
            int cont = 1;
        for(int i=0 ; i<9 ; i++){
            char digitChar = num.charAt(i);
                int digito = Character.getNumericValue(digitChar);
                digito10 += digito * cont;
                cont ++;
        }
        digito10 = ((digito10 % 11)%10);
            
            
            
        cont = 9;

        for(int i=0 ; i<9 ; i++){
            char digitChar = num.charAt(i);
            int digito = Character.getNumericValue(digitChar);
            digito11 += digito * cont;
            cont --;
        }
        
        digito11 = ((digito11 % 11)%10);
        
         
        String result = digito10 + "" + digito11;
        return result;
    }
    
}
