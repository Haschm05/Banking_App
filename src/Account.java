public class Account {
    private static int lastId = 0;

    private final int id;

    public Account() {
        id = ++lastId;
    }
     public int getId() {
        return id;
     }
}
