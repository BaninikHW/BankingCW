package Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class DebitCard {
    Long debitCardId;
    Account account;
    String debitCardNo;
    ZonedDateTime expDate;
    int CVV2;
    int password;
    Boolean status;

}
