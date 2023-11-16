import java.util.Scanner;

public class LeituraNomeSexo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os nomes separados por traço e sexo: ");
        String nomes = scanner.nextLine();

        // Separando os nomes e o sexo
        String[] nomesSeparados = nomes.split("-");

        // Ordenando os nomes por grupo e gênero
        Arrays.sort(nomesSeparados, (nome1, nome2) -> {
            // Ordenando por grupo
            int grupo1 = nome1.split(" ")[0].compareTo(nome2.split(" ")[0]);
            if (grupo1 != 0) {
                return grupo1;
            }

            // Ordenando por gênero
            String sexo1 = nome1.split(" ")[1];
            String sexo2 = nome2.split(" ")[1];
            return sexo1.compareTo(sexo2);
        });

        // Imprimindo os nomes ordenados
        for (String nome : nomesSeparados) {
            System.out.println(nome);
        }
    }
}
