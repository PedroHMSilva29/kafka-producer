package schemaregistrydemokafkaproducer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MesssageService {

    private static final Logger logger = LoggerFactory.getLogger(MesssageService.class);

    @Value("${topic.bora-praticar}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessages(String message){
        logger.info("Message -> {}", message);
        this.kafkaTemplate.send(topicName, message);
    }
}
