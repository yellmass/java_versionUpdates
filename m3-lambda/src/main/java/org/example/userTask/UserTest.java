package org.example.userTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Yilmaz", "Ebinc", 34));
        users.add(new User("Bailey", "Anderson", 28));
        users.add(new User("Jimmy", "Joyce", 34));

        methodA(users, user-> System.out.println(user));

        System.out.println("----------------");

        methodA(users, user->{
            if (user.getLastName().toLowerCase().startsWith("e")){
                System.out.println(user);
            }
        });

        System.out.println("-----------second method--------------");

        methodB(users, user-> user!=null);

        System.out.println("----------------");

        methodB(users, user->user.getLastName().toLowerCase().startsWith("e"));





    }

    private static void methodA(List<User> list, Consumer<User> cons ){
        list.forEach(user-> cons.accept(user));
    }

    private static void methodB(List<User> list, Predicate<User> cons ){
        list.forEach(user->{
            if (cons.test(user)){
                System.out.println(user.toString());
            }
        });
    }

}

/*
List<User> users = new ArrayList<>();

        users.add(new User("Yilmaz", "Ebinc", 34));
        users.add(new User("Bailey", "Anderson", 28));
        users.add(new User("Jimmy", "Joyce", 34));

        methodA(users, user-> user!=null);

        System.out.println("----------------");

        methodA(users, user->user.getLastName().toLowerCase().startsWith("e"));
    }

    private static void methodA(List<User> list, Predicate<User> cons ){
        list.forEach(user->{
            if (cons.test(user)){
                System.out.println(user);
            }
        });
    }
 */
