package lista06A_Refactor_Srp_solid;

public class CalculadorReajusteSalarial {

    public void reajustar(Funcionario funcionario){

        double salarioFuncionario = funcionario.getSalario() + (funcionario.getSalario() * funcionario.getPercentualReajuste());
        funcionario.setSalario(salarioFuncionario);

    }


}
