package app;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAddress(new Address("456 Main St"));
        System.out.println(user.getAddress());
    }
}