package les_2.enums;



public class Main {
    public static void main(String[] args){
        User user = new User(1,"olya", Gender.FEMALE);
        Gender gender=user.getGender();
        gender.isPipka();

        if (gender.equals(Gender.FEMALE)){
            System.out.println("fghjklkjhgfdsasdfghj");
        }

    }





}
