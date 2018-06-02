package lk.icoder.consumer;

import lk.icoder.consumer.model.Company;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Project consumer
 * @Author DILAN on 6/2/2018
 */
@Component
public class Consumer {

    @RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void recievedMessage(Company company) {
        System.out.println("Recieved Message: " + company);
    }
}
