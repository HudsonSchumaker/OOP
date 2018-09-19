package br.com.schumaker.hudson.oo.polimorfismo2;

import java.math.BigDecimal;

/**
 *
 * @author hudson.schumaker
 */
public class Soma implements Operacao{

    @Override
    public BigDecimal calcula(BigDecimal n1, BigDecimal n2) {
        return n1.add(n2);
    }
}