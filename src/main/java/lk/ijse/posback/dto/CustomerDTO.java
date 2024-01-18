package lk.ijse.posback.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class CustomerDTO {
    private String customerId;
    private String name;
    private String address;
    private Integer contact;
}

