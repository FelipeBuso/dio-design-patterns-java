package edu.felipebuso.gof.singleton;

/**
 * Singleton "pregioçoso",
 * @author FelipeBuso
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia==null) {
            instancia=new SingletonLazy();
        }
        return instancia;
    }
}
