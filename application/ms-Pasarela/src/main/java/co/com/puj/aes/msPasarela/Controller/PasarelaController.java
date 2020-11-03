package co.com.puj.aes.msPasarela.Controller;

import co.com.puj.aes.msPasarela.Entity.Pasarela;
import co.com.puj.aes.msPasarela.Service.PasarelaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/pasarela")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE}, allowedHeaders = "*")
public class PasarelaController {
    @Autowired
    private KafkaTemplate<String, Pasarela> kafkaTemplate;
    private static final String TOPIC = "pagos";
    @Autowired
    PasarelaService pasarelaService;
    public PasarelaController(PasarelaService pasarelaService) {this.pasarelaService = pasarelaService;}

    @PostMapping("")
    public void servicioPagos(@Valid @RequestBody Pasarela pasarela){
        kafkaTemplate.send("pagos", pasarela);
    }
}
