package lk.riyapola.riyapola.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class CustomerDto {

    private  int customer_id;
    private String firstName;
    private  String lastname;
    private  String nic;
    private  String address;
    private   String contact;
    private  String email;
    private  String userName;
    private  String password;
}
