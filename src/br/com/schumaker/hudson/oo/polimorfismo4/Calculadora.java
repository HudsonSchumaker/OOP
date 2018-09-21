package br.com.schumaker.hudson.oo.polimorfismo4;

import java.math.BigDecimal;

/**
 *
 * @author hudson.schumaker
 */
public class Calculadora {
    BigDecimal n1 = new BigDecimal(10);
    BigDecimal n2 = new BigDecimal(2);
    
    public void main(){
        print(n1, n2, BigDecimal::add);
        print(n1, n2, BigDecimal::subtract);
        print(n1, n2, (a,b) -> a.multiply(b));
        print(n1, n2, (a,b) -> a.divide(b));
        print(Operacao.restoDivisao(n1, n2));
    }
    
    private void print(BigDecimal n){
        System.out.println(n);
    }
    private void print(BigDecimal n1, BigDecimal n2, Operacao o){
        System.out.println(o.calcula(n1, n2));
    }
}