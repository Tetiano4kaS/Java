package les_3.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args){
        List<User> users = Arrays.asList(
                new User("name","surname"),
                new User("name1","surname1"),
                new User("name2","surname2"),
                new User("name3","surname3")
        );
        converter(users,user -> new Customer((int) Math.random(), user.getName() + " "+ user.getSurname()));
    }


    public static List<Customer> converter(List<User>userList, Function<User,Customer>userCustomerFunction){

        List<Customer> customers= new ArrayList<>();

        for (User user : userList){
            Customer cust = userCustomerFunction.apply(user);
            customers.add(cust);
        }
        return customers;
    }
}
