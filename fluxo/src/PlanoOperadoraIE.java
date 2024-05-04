
public class PlanoOperadoraIE {

    public static void main(String[] args) {
        String plano = "T";

        if (plano.equals("B")) {
            System.out.println("100 minutos de ligações.");
        } else if (plano.equals("M")) {
            System.out.println("100 minutos de ligações.");
            System.out.println("Whatsapp e Instagram ilimitados");
        } else if (plano.equals("T")) {
            System.out.println("100 minutos de ligações.");
            System.out.println("Whatsapp e Instagram ilimitados");
            System.out.println("5GB para o Youtube");
        }
    }
}
