package lk.ijse.posback.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Customer {
    private String customerId;
    private String name;
    private String address;
    private Integer contact;
}

