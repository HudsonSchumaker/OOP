package br.com.schumaker.hudson.oo.polimorfismo4;

import java.math.BigDecimal;

/**
 *
 * @author hudson.schumaker
 */
@FunctionalInterface
public interface Operacao {
    BigDecimal calcula(BigDecimal n1,  BigDecimal n2);
    
    public static BigDecimal restoDivisao(BigDecimal n1,  BigDecimal n2){
        return n1.remainder(n2);
    }
}