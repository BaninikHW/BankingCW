package Entity.Enum;

public enum AccountType {
    VIP(100),
    NORMAL_USER(500);

    private final int value;

    private AccountType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public enum UserType {
        ADMIN,
        EMPLOYEE;
    }
}