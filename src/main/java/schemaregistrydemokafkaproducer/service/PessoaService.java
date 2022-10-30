package schemaregistrydemokafkaproducer.service;

import avro.shaded.com.google.common.util.concurrent.FutureCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFutureCallback;
import schemaregistrydemokafkaproducer.schema.PessoaSchema;

@Service
public class PessoaService {

    private static final Logger logger = LoggerFactory.getLogger(PessoaService.class);

    @Value("${avro.topic.name}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, PessoaSchema> kafkaTemplate;

    public void sendMessages(PessoaSchema message){
        logger.info("Message -> {}", message);
        var future = this.kafkaTemplate.send(topicName, String.valueOf(message.getTradeId()), message);
        future.addCallback(new ListenableFutureCallback<SendResult<String, PessoaSchema>>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Message failed to produce");
            }

            @Override
            public void onSuccess(SendResult<String, PessoaSchema> result) {
                System.out.println("Avro message successfully produced");
            }
        });
    }
}
