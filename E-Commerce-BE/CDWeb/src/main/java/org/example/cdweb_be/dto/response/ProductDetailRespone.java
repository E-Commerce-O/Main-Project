package org.example.cdweb_be.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.cdweb_be.entity.ProductSize;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class ProductDetailRespone {
    long id;
    ProductColorResponse color;
    ProductSizeResponse size;
    int discount;
    double price;
    int quantity;
}
