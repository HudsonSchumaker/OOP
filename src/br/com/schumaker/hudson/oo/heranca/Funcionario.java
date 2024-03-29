package br.com.schumaker.hudson.oo.heranca;

/**
 * @author Hudson Schumaker
 */
public class Funcionario extends Pessoa {

    private float salario;
    private String matricula;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
