import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<String>> grupos = new HashMap<>();

        grupos.put("Masculino", new ArrayList<>());
        grupos.put("Feminino", new ArrayList<>());

        while (true) {
            System.out.println("Digite um nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo (Masculino/Feminino): ");
            String sexo = scanner.nextLine();

            if (grupos.containsKey(sexo)) {
                grupos.get(sexo).add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, digite 'Masculino' ou 'Feminino'.");
            }
        }

        Collections.sort(grupos.get("Masculino"));
        Collections.sort(grupos.get("Feminino"));

        System.out.println("Grupo Masculino: " + grupos.get("Masculino"));
        System.out.println("Grupo Feminino: " + grupos.get("Feminino"));
    }
}