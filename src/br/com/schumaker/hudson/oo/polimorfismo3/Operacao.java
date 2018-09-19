package br.com.schumaker.hudson.oo.polimorfismo3;

import java.math.BigDecimal;

/**
 *
 * @author hudson.schumaker
 */
@FunctionalInterface
public interface Operacao {
    BigDecimal calcula(BigDecimal n1,  BigDecimal n2);
}
