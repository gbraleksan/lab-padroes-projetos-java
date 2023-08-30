package one.digitalinovation.gof;

public class SingletonLazyHolder {
    
    private static class instanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
    }

    public static SingletonLazyHolder getInstancia(){
        return instanceHolder.instancia;
    }
}
