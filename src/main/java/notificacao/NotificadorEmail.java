package notificacao;

import modelo.Cliente;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@NivelDeUrgencia(value = NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificador(Cliente cliente, String menssagem) {
        System.out.printf("Notificando %s atraves do email %s: %s\n",
                cliente.getNome(),
                cliente.getEmail(),
                menssagem);

    }
}
