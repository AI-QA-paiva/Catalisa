package com.testandoDesenvolvimento.testemvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//anotação que engloba um pacote de anotações
//@Configuration (marca a classe Bean); @EnableAutoConfiguration (ordena SpringBoot a adicionar Beans da configuraçãp classpath e propriedades
//@EnableWebMvc (indica o aplicativo como sendo web ativando comportamento-chave;acrescenta DispatcherServlet e Spring-webmvc
//@@ComponentScan (indica a procurar outros componentes, configuracoes e servicos do pacote, identificando onde esta a classe
// alem de ja implementar codigo para tratamento XML, possibilitando main() SpringApplication.run() web.xml
public class TestemvcApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestemvcApplication.class, args);
	}

}
