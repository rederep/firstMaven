import model.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello 1100");


        User user = User.builder()      //через Lombok, нужно ставить плагин
                .email("adm@mail.ru")
                .userName("Admin")
                .password("parol")
                .build();

        System.out.println(user);           //чтобы менять данные в обьекте через билдер (toBuilder = true)
        user = user.toBuilder()
                .email("newAdm@mail.ru")
                .build();
        System.out.println(user);

    }
}
