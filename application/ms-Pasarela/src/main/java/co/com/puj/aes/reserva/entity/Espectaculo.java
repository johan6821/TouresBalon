package co.com.puj.aes.reserva.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Espectaculo implements Serializable {

    private String idProvider;
    private String idShow;
    private Date showDate;
    private String attendeeIdentification;
    private Long amountS;

    public Long getAmountS() { return amountS; }
}
