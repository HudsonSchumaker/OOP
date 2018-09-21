package br.com.schumaker.hudson.oo.polimorfismo5;

/**
 *
 * @author hudson.schumaker
 */
public class TesteOficina {

    public static void main(String... args) {
        Oficina o = new Oficina();
        Veiculo v;
        for (int i = 0; i < 4; ++i) {
            v = o.proximo();
            o.manutencao(v);
        }
    }
}