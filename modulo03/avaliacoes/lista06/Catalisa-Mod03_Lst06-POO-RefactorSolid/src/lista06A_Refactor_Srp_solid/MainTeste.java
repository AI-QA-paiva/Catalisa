package lista06A_Refactor_Srp_solid;

import java.util.Scanner;

public class MainTeste {

    public static void main(String[] args) {

        Scanner criandoObjetos = new Scanner(System.in);

        CalculadorReembolso calculadorReembolso = new CalculadorReembolso();
        CalculadorReajusteSalarial calculadorReajusteSalarial = new CalculadorReajusteSalarial();
        Turma turma = new Turma();

        Professor professor1 = new Professor("Felipe Silveira","12345","54321","Depto Biologia",3000,"Mestre","Patologia");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Lista Professor --------------------------------");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+professor1.getNome());
        System.out.println("Número CPF: "+professor1.getCpf());
        System.out.println("Número RG: "+professor1.getRg());
        System.out.println("Salário: R$ "+professor1.getSalario());
        System.out.println("Formação Acadêmica: "+professor1.getNivelGraduacao());
        System.out.println("Setor de Lotação: "+professor1.getOrgaoLotacao());
        System.out.println("Disciplina ministrada: "+professor1.getDisciplinaEnsina());
        System.out.println();
        professor1.adicionaTurma(turma);
        System.out.println("A turma adicionada foi: "+professor1.getTurmasEscolhidas());
        calculadorReembolso.calcular(professor1);
        calculadorReajusteSalarial.reajustar(professor1); // aqui apliquei Solid com principio OCP
        System.out.println("O novo salário é de R$ "+professor1.getSalario());


        Professor professor2 = new Professor("Pedro Paiva","3412345","5454321","Depto Matematica",3500,"Mestre","Geometria");
        System.out.println("...............................................................................");
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+professor2.getNome());
        System.out.println("Número CPF: "+professor2.getCpf());
        System.out.println("Número RG: "+professor2.getRg());
        System.out.println("Salário: R$ "+professor2.getSalario());
        System.out.println("Formação Acadêmica: "+professor2.getNivelGraduacao());
        System.out.println("Setor de Lotação: "+professor2.getOrgaoLotacao());
        System.out.println("Disciplina ministrada: "+professor2.getDisciplinaEnsina());
        System.out.println();
        professor2.adicionaTurma(turma);
        System.out.println("A turma adicionada foi: "+professor2.getTurmasEscolhidas());
        calculadorReembolso.calcular(professor2);
        calculadorReajusteSalarial.reajustar(professor2);
        System.out.println("O novo salário é de R$ "+professor2.getSalario());


        Professor professor3 = new Professor("Carlos Silva","13412345","15454321","Depto Biologia",3500,"Mestre","Geometria");
        System.out.println("...............................................................................");
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+professor3.getNome());
        System.out.println("Número CPF: "+professor3.getCpf());
        System.out.println("Número RG: "+professor3.getRg());
        System.out.println("Salário: R$ "+professor3.getSalario());
        System.out.println("Formação Acadêmica: "+professor3.getNivelGraduacao());
        System.out.println("Setor de Lotação: "+professor3.getOrgaoLotacao());
        System.out.println("Disciplina ministrada: "+professor3.getDisciplinaEnsina());
        System.out.println();
        professor3.adicionaTurma(turma);
        System.out.println("A turma adicionada foi: "+professor3.getTurmasEscolhidas());
        calculadorReembolso.calcular(professor3);
        calculadorReajusteSalarial.reajustar(professor3);
        System.out.println("O novo salário é de R$ "+professor2.getSalario());




        Coordenador coordenador1 = new Coordenador("Carlos","9876","6789","Departamento de Matematica",4500,2);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Lista Coordenador --------------------------------");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+coordenador1.getNome());
        System.out.println("Número CPF: "+coordenador1.getCpf());
        System.out.println("Número RG: "+coordenador1.getRg());
        System.out.println("Setor de Lotação: "+coordenador1.getOrgaoLotacao());
        System.out.println("Salário: R$ "+coordenador1.getSalario());
        System.out.println("Número de Professores supervisionados: "+coordenador1.getQuantidadeProfessores());
        System.out.println();
        calculadorReembolso.calcular(coordenador1);
        calculadorReajusteSalarial.reajustar(coordenador1);
        System.out.println("O novo salário é de R$ "+coordenador1.getSalario());
        coordenador1.adicionarProfessor(professor2);
        System.out.println("O(s) professor(es) subordinado(s): \n"+professor2.getNome());

        Coordenador coordenador2 = new Coordenador("João Gilberto","239876","236789","Departamento de Biologia",4500,3);
        System.out.println("...............................................................................");
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+coordenador2.getNome());
        System.out.println("Número CPF: "+coordenador2.getCpf());
        System.out.println("Número RG: "+coordenador2.getRg());
        System.out.println("Setor de Lotação: "+coordenador2.getOrgaoLotacao());
        System.out.println("Salário: R$ "+coordenador2.getSalario());
        System.out.println("Número de Professores supervisionados: "+coordenador2.getQuantidadeProfessores());
        System.out.println();
        calculadorReembolso.calcular(coordenador2);
        calculadorReajusteSalarial.reajustar(coordenador2);
        System.out.println("O novo salário é de R$ "+coordenador2.getSalario());
        coordenador2.adicionarProfessor(professor1);
        coordenador2.adicionarProfessor(professor3);
        coordenador2.adicionarProfessor(professor2);
        System.out.println();
        System.out.println("O(s) professor(es) subordinado(s): \n"+professor1.getNome()+"\n"+professor3.getNome()+"\n"+professor2.getNome());


        Administrativo administrativo1 = new Administrativo("Fabio Melo","43534","345445","Dpto Biologia",2500,"Atendente","Junior");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Lista Administrativos --------------------------------");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+administrativo1.getNome());
        System.out.println("Número CPF: "+administrativo1.getCpf());
        System.out.println("Número RG: "+administrativo1.getRg());
        System.out.println("Setor de Lotação: "+administrativo1.getOrgaoLotacao());
        System.out.println("Salário: "+administrativo1.getSalario());
        System.out.println("Função: "+administrativo1.getFuncaoAdm()+" / Senioridade função: "+administrativo1.getSenioridade());
        System.out.println();
        calculadorReembolso.calcular(administrativo1);
        calculadorReajusteSalarial.reajustar(administrativo1);
        System.out.println("O novo salário é de R$ "+administrativo1.getSalario());


        Administrativo administrativo2 = new Administrativo("Renata Liskov","1243534","24345445","Dpto Matematica",3500,"Atendente","Senior");
        System.out.println("...............................................................................");
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: "+administrativo2.getNome());
        System.out.println("Número CPF: "+administrativo2.getCpf());
        System.out.println("Número RG: "+administrativo2.getRg());
        System.out.println("Setor de Lotação: "+administrativo2.getOrgaoLotacao());
        System.out.println("Salário: "+administrativo2.getSalario());
        System.out.println("Função: "+administrativo2.getFuncaoAdm()+" / Senioridade função: "+administrativo2.getSenioridade());
        System.out.println();
        calculadorReembolso.calcular(administrativo2);
        calculadorReajusteSalarial.reajustar(administrativo2);
        System.out.println("O novo salário é de R$ "+administrativo2.getSalario());



        Estagiario estagiario1 = new Estagiario("Amanda Matias","12345600-45","1122334455","Depto de Biologia",650);
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Lista Estagiários --------------------------------");
        System.out.println();
        System.out.println("Estagiario 1: "+estagiario1.getNome());
        System.out.println("Número CPF: "+estagiario1.getCpf());
        System.out.println("Número RG: "+estagiario1.getRg());
        System.out.println("Setor de Lotação: "+estagiario1.getOrgaoLotacao());
        System.out.println();
        System.out.println("Valor da Bolsa Estágio é de; R$ "+estagiario1.getBolsaEstagio());
        calculadorReembolso.calcular(estagiario1);

        Estagiario estagiario2 = new Estagiario("Julio Verner","98765432-19","5544332211","Depto Matemática",650);
        System.out.println("...............................................................................");
        System.out.println("Estagiario 2: "+estagiario2.getNome());
        System.out.println("Número CPF: "+estagiario2.getCpf());
        System.out.println("Número RG: "+estagiario2.getRg());
        System.out.println("Setor de Lotação: "+estagiario2.getOrgaoLotacao());
        System.out.println();
        System.out.println("Valor da Bolsa Estágio é de; R$ "+estagiario2.getBolsaEstagio());
        calculadorReembolso.calcular(estagiario2);


        Estagiario estagiario3 = new Estagiario("Silvanir Viana","1198765432-19","115544332211","Depto Matemática",650);
        System.out.println("...............................................................................");
        System.out.println("Estagiario 3: "+estagiario3.getNome());
        System.out.println("Número CPF: "+estagiario3.getCpf());
        System.out.println("Número RG: "+estagiario3.getRg());
        System.out.println("Setor de Lotação: "+estagiario3.getOrgaoLotacao());
        System.out.println();
        System.out.println("Valor da Bolsa Estágio é de; R$ "+estagiario3.getBolsaEstagio());
        calculadorReembolso.calcular(estagiario3);




        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Lista de professores e seus Estagiários:");
        System.out.println();
        professor1.adicionaEstagiario(estagiario1);
        System.out.println("O professor, "+professor1.getNome()+" tem o(s) seguinte(s) estagiário(s): \n"+estagiario1.getNome());

        System.out.println();
        professor2.adicionaEstagiario(estagiario2);
        professor2.adicionaEstagiario(estagiario1);
        professor2.adicionaEstagiario(estagiario3);

        System.out.println("O professor, "+professor2.getNome()+" tem o(s) seguinte(s) estagiário(s): \n"+estagiario2.getNome()+"\n"+estagiario1.getNome()+"\n"+estagiario3.getNome());

    }
}
