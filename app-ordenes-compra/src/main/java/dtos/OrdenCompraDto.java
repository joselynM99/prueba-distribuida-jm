package dtos;


import db.OrdenCompra;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class OrdenCompraDto {

    private Integer id;
    private BigDecimal precio;
    private String cliente;
    private String producto;

    public static  OrdenCompraDto from(OrdenCompra obj){
        OrdenCompraDto ret = new OrdenCompraDto();
        ret.setId(obj.getId());
        ret.setPrecio(obj.getPrecio());

        return ret;
    }


}
