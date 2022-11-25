package com.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
class CalculadoraApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Test
	void somaValores(){
		Calculadora cal = new Calculadora(); //criando um objeto
		float soma = cal.somar(100,200); //informando o que desejo testar em parametro
		Assertions.assertEquals(300,soma);
	}

	@Test
	void multiplicarValores(){
		Calculadora calc = new Calculadora(); //criando um objeto
		double multiplicar = calc.multiplicar(100,100); //informando o que desejo testar em parametro
		Assertions.assertEquals(10000,multiplicar);
	}

	@Test
	void subtrairValores(){
		Calculadora calc = new Calculadora(); //criando um objeto
		double subtrair = calc.subtrair(100,100); //informando o que desejo testar em parametro
		Assertions.assertEquals(0, subtrair);
	}

	@Test
	void dividirValores(){
		Calculadora calc = new Calculadora(); //criando um objeto
		double dividir = calc.dividir(0,10); //informando o que desejo testar em parametro
		Assertions.assertEquals(0.4, dividir);
	}


	@Test
	void bonificacaoFuncionario(){
		BonificacaoFuncionario bonifica = new BonificacaoFuncionario(); //estou criando o objeto da classe Bonificacao

		//com o objeto criado acima, consigo puxar a função que calcula o bonus do funcionario na linha abaixo
		//e preciso criar um objeto Funcionario criando esse funcionario com nome, data de admissão e salario
		BigDecimal bonus = bonifica.bonusFuncionario(new Funcionario("Pedro", LocalDate.now(),new BigDecimal(25000)));

		Assertions.assertEquals(BigDecimal.ZERO, bonus); //aqui estou considerando que nao recebe, o bonus sobre o salario da mais que 1000
	}

	@Test
	void bonificacaoFuncionarioDez(){
		BonificacaoFuncionario bonifica = new BonificacaoFuncionario(); //estou criando o objeto da classe Bonificacao

		BigDecimal bonus = bonifica.bonusFuncionarioDez(new Funcionario("Pedro", LocalDate.now(),new BigDecimal(7000.0)));

		Assertions.assertEquals(new BigDecimal(900.0), bonus); //aqui estou considerando bonus maior que 1000, retorna sempre 1000 de bonus
	}


}
