/** https://tproger.ru/translations/singleton-pitfalls/ */

public class MySingleton {

    private static final MySingleton singleton = new MySingleton();

    private MySingleton() {}

    public static void main(String[] args) {
    }

}
