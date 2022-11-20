package les_2.compose;

public class User {
    private int id;
    private CommonData commonData;

    public User() {

    }

    public User(int id, CommonData commonData) {
        this.id = id;
        this.commonData = commonData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", commonData=" + commonData +
                '}';
    }

    public User(int id, String name, String surname){
        this.id = id;
        this.commonData = new CommonData(name,surname);
    }
}
