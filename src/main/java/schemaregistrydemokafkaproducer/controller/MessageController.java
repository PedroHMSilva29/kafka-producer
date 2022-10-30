package schemaregistrydemokafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import schemaregistrydemokafkaproducer.model.PessoaModel;
import schemaregistrydemokafkaproducer.schema.PessoaSchema;
import schemaregistrydemokafkaproducer.service.PessoaService;

import java.util.Random;


@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity<String> send(@RequestBody PessoaModel pessoa){
        PessoaSchema pessoaSchema = PessoaSchema.newBuilder().build();
        pessoaSchema.setAmount(pessoa.getAmount());
        pessoaSchema.setPrice(pessoa.getPrice());
        pessoaSchema.setStockName(pessoa.getStockName());
        pessoaSchema.setTradeId(200);
        pessoaSchema.setTradeMarket(pessoa.getTradeMarket());
        pessoaSchema.setTradeQuantity(pessoa.getTradeQuantity());
        pessoaSchema.setTradeType(pessoa.getTradeType());
        service.sendMessages(pessoaSchema);
        return ResponseEntity.ok().body("Message send sucefully: "+ pessoaSchema);
    }
}
