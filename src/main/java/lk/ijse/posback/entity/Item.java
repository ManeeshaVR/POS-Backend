package lk.ijse.posback.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Item {
    private String itemId;
    private String description;
    private Double unitPrice;
    private Integer qty;
}

