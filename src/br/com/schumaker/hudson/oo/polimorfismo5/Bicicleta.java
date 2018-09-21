package br.com.schumaker.hudson.oo.polimorfismo5;

/**
 *
 * @author hudson.schumaker
 */
public class Bicicleta extends Veiculo{

    public Bicicleta(){
        System.out.println("Bicicleta");
    }
    
    @Override
    public void listarVerificacoes() {
        System.out.println("Lista de verificação da bicicleta.");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustar defeitos bicicleta.");
    }

    @Override
    public void limpar() {
        System.out.println("Limpar bicicleta.");
    }
}
