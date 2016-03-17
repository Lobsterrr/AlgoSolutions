/*
 *
 */
public class Singleton {
    
    public static Singleton singleton = null;

    /**
     * @return: The same instance of this class every time
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new singleton();
        }
        return singleton;
    }

}
