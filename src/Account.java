public class Account {
    private static int lastId = 0;

    private final int id;
    private String firstName;
    private String lastName;
    private double balance;

    public Account() {
        id = ++lastId;
    }
    public int getId() {

        return id;
    }
}
