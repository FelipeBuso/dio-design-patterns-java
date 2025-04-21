package edu.felipebuso.gof.singleton;

/**
 *  Singleton "apressado".
 * @author FelipeBuso
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
