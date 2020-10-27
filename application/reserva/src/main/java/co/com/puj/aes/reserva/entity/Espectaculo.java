package co.com.puj.aes.reserva.entity;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedJson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class Espectaculo {

    @DynamoDBAttribute
    private String idProveedor;
    @DynamoDBAttribute
    private String nombreEspectaculo;
    @DynamoDBAttribute
    private Date fechaInicio;
    @DynamoDBAttribute
    private Date fechaFin;
    @DynamoDBAttribute
    @DynamoDBTypeConvertedJson
    private ArrayList<?> asistentes;

}
