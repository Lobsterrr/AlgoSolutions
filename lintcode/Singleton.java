/*
 *
 */
public class Singleton {
    
    public Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new singleton();
        }
        return singleton;
    }

}
