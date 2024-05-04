
public class SistemamedidaIE {

    public static void main(String[] args) {
        String sigla = "G";

        switch (sigla) {
            case "P" ->
                System.out.println("Pequeno");
            case "M" ->
                System.out.println("Médio");
            case "G" ->
                System.out.println("Grande");
            default ->
                System.out.println("INDEFINIDO");
        }
    }
}
