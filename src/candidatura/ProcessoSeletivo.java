package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

//        analisarCandidato(1900.0);
//        analisarCandidato( 2000.0);
//        analisarCandidato(2100.0);

//        selecaoCandidatos();

//        imprimirSelecionados();

        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);


        }


    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }
            else
                System.out.println("Contato realizado com sucesso!");
        } while (continuarTentando && tentativasRealizadas <= 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa.");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", após 3 tentativas.");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;  // retorna um valor aleatório entre 1 e 3,s egundo o prof.
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos selecionados informando o índice do elemento");

        for (int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de nº " + (i+1) + " é o(a) " + candidatos[i] + ".");
        }

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

        int numCandidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (numCandidatosSelecionados < 5 && candidatoAtual < candidatos.length){

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();


            System.out.println("O candidato " + candidato + " informou pretensão de R$ " + String.format("%.2f", salarioPretendido) + ".");
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi aprovado para a vaga.");
                numCandidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta");

        } else {
            System.out.println("Aguardando o resultado com demais candidatos");
        }

    }



}
