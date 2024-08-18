public class Table extends ITable {
    public ITable table;

    @Override
    public void create(String User) {
         System.out.println("Creating table");
    }

    @Override
    public void remove(String User) {
        System.out.println("Removing table");
    }

    @Override
    public void update(String User) {
        System.out.println("updating table");
    }
}
