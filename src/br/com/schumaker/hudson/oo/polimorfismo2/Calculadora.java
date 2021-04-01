package br.com.schumaker.hudson.oo.polimorfismo2;

import java.math.BigDecimal;

/**
 *
 * @author Hudson Schumaker
 */
public class Calculadora {
    BigDecimal n1 = new BigDecimal(10);
    BigDecimal n2 = new BigDecimal(2);
    
    public void main(){
        print(n1, n2, new Soma());
        print(n1, n2, new Subtracao());
    }
    
    private void print(BigDecimal n1, BigDecimal n2, Operacao o){
        System.out.println(o.calcula(n1, n2));
    }
}
