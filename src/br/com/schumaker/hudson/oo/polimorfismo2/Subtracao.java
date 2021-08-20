package br.com.schumaker.hudson.oo.polimorfismo2;

import java.math.BigDecimal;

/**
 *
 * @author Hudson Schumaker
 */
public class Subtracao implements Operacao {

    @Override
    public BigDecimal calcula(BigDecimal n1, BigDecimal n2) {
        return n1.subtract(n2);
    }
}
