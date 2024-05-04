
public class BreakEContinueExemplo {

    public static void main(String[] args) {
        //continue = continua para a próxima iteração
        //break = sai do loop

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue;
            }

            System.out.println(numero);
        }
    }
}
//basicamente, usado para interromper ou desconsiderar algo em uma interação.
//pode ser aprimorado da forma que quiser, mas o basico é isto.
