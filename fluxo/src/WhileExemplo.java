
import java.util.concurrent.ThreadLocalRandom;

public class WhileExemplo {

    /*
 * O laço 
while
 (na tradução literal para a língua portuguesa “enquanto”) determina que, enquanto uma condição for válida, o bloco de código será executado. O laço 
while
, testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

A estrutura de sintaxe, do controle de repetição 
while
 é exibida abaixo:
     */
//estrutura do controle de fluxo while
//while (expressão booleana de validação){
    // comando que será executado até que a 
    // expressão de validação torne-se falsa 
//}

    /*
 * Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo,
 * enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.
     */
    public static void main(String[] args) {
        double mesada = 50;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho.");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Acabou a mesada, Joãozinho!");

        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
         */
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
