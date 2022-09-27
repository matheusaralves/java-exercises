package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Fim :)");
    }

    // Exceção NÃO checada ou não verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #02!");
    }
}

