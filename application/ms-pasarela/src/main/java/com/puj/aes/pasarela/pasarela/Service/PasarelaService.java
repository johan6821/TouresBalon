package com.puj.aes.pasarela.pasarela.Service;

import com.puj.aes.pasarela.pasarela.Entity.Pasarela;
import com.puj.aes.pasarela.pasarela.Interface.IPasarelaService;
import org.springframework.stereotype.Service;

@Service
public class PasarelaService implements IPasarelaService {
    @Override
    public Pasarela enviarRespuesta(Pasarela respuesta) {
        Double calificacion = 4.0;
        Double pesoConvenio = 2.0;
        //TODO Obtener la calificación y peso convenio de los servicios

        return respuesta;
    }
}
