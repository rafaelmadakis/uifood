package br.com.uifoodapi.jpa;

import br.com.uifoodapi.UifoodApiApplication;
import br.com.uifoodapi.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * @Author: Rafael Madakis
 */
public class ConsultaCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(UifoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);


         CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

          List<Cozinha> cozinhas = cadastroCozinha.listar();
          for (Cozinha cozinha : cozinhas) {
              System.out.println(cozinha.getNome());
          }

    }
}
