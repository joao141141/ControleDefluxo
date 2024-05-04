
public class F {

    public static void main(String[] args) {
        //For
        //While
        //Do While

        //For

        /*Uma variavel contadora será testada
         * e incrementada a cada interação
         */
        //estrutura

        /*
          * for (bloco de inicialização; expressão booleana de validação, bloco de atualização){
            
            Comando que será executado até que a
            expressão torne-se  falsa
          }


         */
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        System.out.println("Carolina dormiu");
        /*
         * int carneirinhos = 1; -> O programa entende que a variável carneirinhos, começa com o valor igual a 1 e isso acontece somente uma vez;

        carneirinhos < = 20; -> O programa verifica se a variável carneirinhos, ainda é menor que 20;

        O programa começa a executar o algoritmo, no nosso caso, imprimir a quantidade de carneirinhos em contagem;

        carneirinhos ++ -> O programa aumenta em mais 1, o valor da variável carneirinhos;

        O fluxo é finalizado, quando a variável carneirinhos for igual a 20.
         */
    }

}
