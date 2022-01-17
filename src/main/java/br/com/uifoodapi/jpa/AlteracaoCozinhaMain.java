package br.com.uifoodapi.jpa;

import br.com.uifoodapi.UifoodApiApplication;
import br.com.uifoodapi.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/**
 * @Author: Rafael Madakis
 */
public class AlteracaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(UifoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);


         CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

         Cozinha cozinha = new Cozinha();
         cozinha.setId(1L);
         cozinha.setNome("Brasileira");

        cadastroCozinha.salvar(cozinha);


        System.out.printf("%d - %s\n", cozinha.getId(), cozinha.getNome());



    }
}
