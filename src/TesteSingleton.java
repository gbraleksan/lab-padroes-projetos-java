import one.digitalinovation.gof.SingletonLazyHolder;

public class TesteSingleton {
    public static void main(String[] args) throws Exception {
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.print(String.format("Valor singleton na memória: %s", lazyHolder));

    }
}
