package br.com.schumaker.hudson.oo.polimorfismo5;

/**
 *
 * @author Hudson.schumaker
 */
public class Carro extends Veiculo{
    
    public Carro(){
        System.out.println("Carro.");
    }
    
    @Override
    public void listarVerificacoes() {
        System.out.println("Lista de verificação do veiculo.");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustar defeitos veiculo.");
    }

    @Override
    public void limpar() {
        System.out.println("Limpar veiculo.");
    }
    
    public void tocarOleo(){
        System.out.println("Troca de oleo.");
    }
}
