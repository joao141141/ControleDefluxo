
public class ExemploFor {

    public static void main(String[] args) {
        //Em arrays o indice dos elementos inicia-se no 0;
        //Por isto, a variavel i iniciara no 0;
        String alunos[] = {"Felipe", "Jonas", "Julia", "marcos"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no indice x= " + i + " é " + alunos[i]);

            //lenght = tamanho
            /*
             * aqui ele ira contar e mostrar qual o valor no indice.
             */
        }
    }
}
