public class AccountInformation {
    private String name;
    private int age;
    public AccountInformation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeName(String name) {
        this.name = name;
        System.out.printf("Ваше новое имя: %s\n", name);
    }

    public void changeAge(int age) {
        this.age = age;
        System.out.printf("Ваш новый возраст: %d\n", age);
    }

    public void getInformation() {
        System.out.printf("Ваше имя и возраст: %s, %d\n", name, age);
    }

    public void welcome() {
        System.out.printf("Здравствуй %s, добро пожаловать!\n", name);
    }
}
