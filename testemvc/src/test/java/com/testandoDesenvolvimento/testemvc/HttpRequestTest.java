package com.testandoDesenvolvimento.testemvc;

//import org.junit.jupiter.api.Test;
//import org.assertj.core.api.Assertions;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;//estava faltando
//import org.springframework.boot.test.web.client.TestRestTemplate;
////// anotação correta mais esta desativada, substituida pela linha abaixo
//import org.springframework.boot.test.web.server.LocalServerPort;//anotação incorreta
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//
//// verificando a sanidade, testar o comportamento da aplicação
//// indica-se aqui a conexão enviando uma solicitaçao HTTP e verificando a resposta
//
////@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // estava errado
//
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//public class HttpRequestTest {
//
//    //@LocalServerPort // estava ligada a importação import org.springframework.boot.test.web.server.LocalServerPort;
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void greetingShouldReturnDefaultMessage() throws Exception{
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
//                String.class)).contains("Hello, World");
//    }
//}
