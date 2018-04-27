package singleton;

public class singletonClass {
    private static singletonClass istanza = null;

    private singletonClass() {}

    public static synchronized singletonClass getInstance() {
        if (istanza == null) {
            istanza = new singletonClass();
        }
        return istanza;
    }
}