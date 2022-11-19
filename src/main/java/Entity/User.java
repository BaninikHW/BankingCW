package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class User  {
    Long id;
    String name;
    String nationalId;
    String cellPhone;
    String address;
    String userName;
    String Password;

}
