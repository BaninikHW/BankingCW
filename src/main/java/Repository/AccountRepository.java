package Repository;

import Entity.Enum.AccountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountRepository {
    Long id;
    String accountNo;
    AccountType accountType;
    BankRepository bank;
    long balance;

}
