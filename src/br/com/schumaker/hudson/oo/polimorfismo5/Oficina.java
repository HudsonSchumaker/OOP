package br.com.schumaker.hudson.oo.polimorfismo5;

import java.util.Random;

/**
 *
 * @author hudson.schumaker
 */
public class Oficina {

    private final Random r;

    public Oficina() {
        this.r = new Random();
    }

    public Veiculo proximo() {
        int code = r.nextInt();
        return (code % 2 == 0) ? new Carro() : new Bicicleta();
    }

    public void manutencao(Veiculo vo) {
        vo.listarVerificacoes();
        vo.ajustar();
        if (vo instanceof Carro) {
            ((Carro) vo).tocarOleo();
        }
        vo.limpar();   
    }    
}