package lk.riyapola.riyapola.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class AdminDto {
    private  int admin_id;
    private String firstName;
    private String lastName;
    private String userName;
    private  String password;
    private  String role;


}
