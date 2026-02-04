package singleton;

public class UserMain {
    public static void main(String[] args){
        User user=User.getUser();
        User.setUserId(10001);
        User.setUserName("Pavan kumar");
        User user1=User.getUser();
        System.out.println(user);
        System.out.println(user1);
    }
}
