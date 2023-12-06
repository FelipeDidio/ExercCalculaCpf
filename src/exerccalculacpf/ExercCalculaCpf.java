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
public class ExercCalculaCpf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
            String cpfSubstring = "111222333";
            int somaDig1, somaDig2, digito10, digito11;
            
            int digito1 = cpfSubstring.charAt(0) - '0';
            int digito2 = cpfSubstring.charAt(1) - '0';
            int digito3 = cpfSubstring.charAt(2) - '0';
            int digito4 = cpfSubstring.charAt(3) - '0';
            int digito5 = cpfSubstring.charAt(4) - '0';
            int digito6 = cpfSubstring.charAt(5) - '0';
            int digito7 = cpfSubstring.charAt(6) - '0';
            int digito8 = cpfSubstring.charAt(7) - '0';
            int digito9 = cpfSubstring.charAt(8) - '0';


            somaDig1 = digito1*1 + digito2*2 + digito3*3 + digito4*4 + digito5*5 + digito6*6 + digito7*7 + digito8*8 + digito9*9;
            somaDig2 = digito1*9 + digito2*8 + digito3*7 + digito4*6 + digito5*5 + digito6*4 + digito7*3 + digito8*2 + digito9*1;
            digito10 = somaDig1 % 11;
            digito11 = somaDig2 % 11;
        
        

            System.out.println("O dígito 10 é: " + digito10);
            System.out.println("O dígito 11 é: " + digito11);
            String result = "Seu cpf completo é: " + cpfSubstring + digito10 + " " + digito11;
        
        System.out.println("Seu CPF completo é:" + cpfSubstring + "-" + digito10 + digito11);
        // return result;
    } 
    
}
