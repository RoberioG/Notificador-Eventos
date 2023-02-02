package br.com.atividade2.notificadoreventos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> notificacao;
        List<String> listaNomes = new ArrayList<>();

        System.out.println("######### NOTIFICADOR DE EVENTOS #########");

        Boolean continuar = true;
        do {

            notificacao = new HashMap<String,String>();

            System.out.print("Digite o numero de pessoas que irá receber a notificação: ");
            Integer num = Integer.parseInt(scanner.nextLine());

            if (num == 0)
                return;

            for (int i = 0; i < num; i++){
                System.out.print("Digite os nomes: ");
                listaNomes.add(scanner.nextLine());
            }

            System.out.println("\nDigite a mensagem da notificação:");
            String mensagem = scanner.nextLine();
            System.out.println();

            for (String nome : listaNomes) {
                System.out.println(nome + " received a message: -> " + mensagem);
                notificacao.put(nome, mensagem);

            }

            System.out.println();

            for (String key : notificacao.keySet()) {
                String value = notificacao.get(key);
                System.out.println('{' + key + "=received a message: -> " + value +'}');
            }
        }while(continuar);
    }
}
