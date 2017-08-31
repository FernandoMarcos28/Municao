/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package municao;
import java.util.Scanner;
/**
 *
 * @author Fernando
 */
public class Municao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        M40 a = new M40(0);
        K47 b = new K47(0);
        
        a.carregarArma(300);
        b.carregarArma(500);
        System.out.print("Você tem " + a.getBala() + " Balas na M40 \n");
        System.out.print("Você tem " + b.getBala() + " Balas na K47 \n");        
        a.carregarArma(150);
        b.carregarArma(300);
        System.out.print("Você tem " + a.getBala() + " Balas na M40 \n");
        System.out.print("Você tem " + b.getBala() + " Balas na K47 \n");
    }
    
}
