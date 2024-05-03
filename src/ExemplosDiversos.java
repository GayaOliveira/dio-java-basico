public class ExemplosDiversos {

    public static void main(String[] args) {

//        int numero = 5;
//
//        System.out.println(numero++);
//        System.out.println(numero);
//
        int a = 6;
        int b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
        String resultado2 = a>b ? "a > b" : a<b ? "a < b" : "a = b";
        System.out.println(resultado2);

        System.out.println();

        String tamanho = "M";
        switch (tamanho){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }

//        System.out.println(resultado == "Verdadeiro");
//        System.out.println(resultado.equals("Verdadeiro"));

//        SmartTV smartTV = new SmartTV();
//        System.out.println("Ligada? " + (smartTV.ligada ? "Sim" : "Não"));
//        System.out.println("Volume Atual: " + smartTV.volume);
//        System.out.println("Canal Atual: " + smartTV.canal);
//
//        smartTV.ligar();
//        System.out.println("Ligada? " + (smartTV.ligada ? "Sim" : "Não"));
//        smartTV.desligar();
//        System.out.println("Ligada? " + (smartTV.ligada ? "Sim" : "Não"));
//
//        smartTV.aumentarVolume();
//        smartTV.aumentarVolume();
//        System.out.println("Volume Atual: " + smartTV.volume);
//        smartTV.diminuirVolume();
//        System.out.println("Volume Atual: " + smartTV.volume);
//
//        smartTV.aumentarCanal();
//        smartTV.aumentarCanal();
//        smartTV.aumentarCanal();
//        smartTV.diminuirCanal();
//        System.out.println("Canal Atual: " + smartTV.canal);
//        smartTV.mudarCanal(40);
//        System.out.println("Canal Atual: " + smartTV.canal);

        // Java possui 52 palavras reservadas!

        // Como usar os parâmetros @... no Intellij?

        // Como usar o Javadoc no Intellij?
        // comando sugerido no terminal do VSCode:
        // javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

//        System.out.println("Oi, fui executado pelo Terminal!");
//
//        System.out.println("(Mesmo sendo uma nova versão!)");


    }

}
