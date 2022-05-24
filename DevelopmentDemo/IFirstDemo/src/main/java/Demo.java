import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("User");
        System.out.println(cls);

        Class userClass = User.class;
        System.out.println(userClass);

        User user = new User();
        Class c = user.getClass();
        System.out.println(c);




    }
}
