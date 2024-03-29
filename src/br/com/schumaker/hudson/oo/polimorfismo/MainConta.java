package br.com.schumaker.hudson.oo.polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Hudson Schumaker
 */
public class MainConta {

    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setAgencia("1234");
        contaCorrente.setNumero("1244");
        contaCorrente.deposito(3000);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setAgencia("3456");
        contaPoupanca.setNumero("1234");
        contaPoupanca.deposito(3000);
        contaPoupanca.depositoPoupanca(1000);

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setAgencia("3432");
        contaEspecial.setLimite(1000);
        contaEspecial.setNumero("1434");
        contaEspecial.deposito(3000);

        fazSaque(contaCorrente);
        fazSaque(contaPoupanca);
        fazSaque(contaEspecial);

    }

    public static void fazSaque(Conta conta) {

        float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saque"));
        conta.saque(valor);
        conta.saldo();
    }
}
