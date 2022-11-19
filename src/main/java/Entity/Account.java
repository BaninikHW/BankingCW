package Entity;

import Entity.Enum.AccountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Account {
    Long id;
    String accountNo;
    AccountType accountType;
    Bank bank;
    long balance;

}
