public class ForArrays {
    public static void main(String [] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        // for (int x = 0; x <alunos.length; x++) {
        //     System.out.println("O aluno no índice " + x + " é " + alunos[x]);
        // }

        //Forma Abreviada
        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
