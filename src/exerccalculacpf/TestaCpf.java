/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerccalculacpf;

import static exerccalculacpf.CalculaCpf.CalculaCpf;

/**
 *
 * @author 180701103
 */
public class TestaCpf {
    private CalculaCpf calcula;
    
    public static void testaCpf(){
        String resultadoEsperado = "96";
        String result = CalculaCpf("111.222.333");
        
        if(resultadoEsperado.equals(result)){
            System.out.println("Teste Ok");
        }else{
            System.out.println("Teste falhou");
        }
    }
    
}
