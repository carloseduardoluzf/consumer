package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

@ApplicationScoped
public class OrderConsumer {

    private static final Logger LOG = Logger.getLogger(OrderConsumer.class);

    @Incoming("orders-in")
    public void process(String message) {
        LOG.infof("[CONSUMER] Mensagem recebida do Kafka: %s", message);
        // processar, auditar, notificar...
    }
}
