package co.com.puj.aes.pagos.entity;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class Categoria {

    @DynamoDBAttribute
    private String categorianame;
    @DynamoDBAttribute
    private String subcategoria;



}
