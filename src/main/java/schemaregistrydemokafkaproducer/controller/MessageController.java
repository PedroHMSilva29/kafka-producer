package schemaregistrydemokafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import schemaregistrydemokafkaproducer.service.MesssageService;


@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MesssageService service;


    @PostMapping
    public ResponseEntity<String> send(@RequestBody String message){
        service.sendMessages(message);
        return ResponseEntity.ok().body("Message send sucefully: "+ message);
    }
}
