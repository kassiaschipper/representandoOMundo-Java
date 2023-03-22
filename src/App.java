public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Exercicio ex = new Exercicio();

        System.out.println(ex.getFoiResolvido());
        ex.resolverExercidio();
        System.out.println(ex.getFoiResolvido());
        
        
    }
}
