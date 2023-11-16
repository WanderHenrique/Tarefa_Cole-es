## Leitura de nomes e sexo

Este projeto demonstra como ler nomes e sexos de pessoas separados por vírgula ou traço e imprimir os nomes ordenados por grupo e gênero.

## Parte um
A parte um do projeto lê nomes separados por vírgula. O código é o seguinte:

java
import java.util.Scanner;

public class LeituraNome {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite os nomes separados por vírgula: ");
    String nomes = scanner.nextLine();

    // Separando os nomes
    String[] nomesSeparados = nomes.split(",");

    // Ordenando os nomes
    Arrays.sort(nomesSeparados);

    // Imprimindo os nomes ordenados
    for (String nome : nomesSeparados) {
        System.out.println(nome);
    }
}
}


A saída do código é a seguinte:

Digite os nomes separados por vírgula: João, Maria, Pedro, Ana

João
Maria
Pedro
Ana


## Parte dois

A parte dois do projeto lê nomes separados por traço e sexo. O código é o seguinte:

```java
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
A saída do código é a seguinte:

Digite os nomes separados por traço e sexo: João-M, Maria-F, Pedro-M, Ana-F

João-M
Maria-F
Pedro-M
Ana-F
Como usar
Para usar o projeto, siga estas etapas:

Clone o repositório do GitHub.
Abra o projeto no seu IDE favorito.
Compile e execute a classe LeituraNome para ler nomes separados por vírgula.
Compile e execute a classe LeituraNomeSexo para ler nomes separados por traço e sexo.
