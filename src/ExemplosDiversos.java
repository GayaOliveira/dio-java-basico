public class ExemplosDiversos {

    public static void main(String[] args) {

//        int numero = 5;
//
//        System.out.println(numero++);
//        System.out.println(numero);
//
//        int a = 6;
//        int b = 6;
//
//        String resultado = a==b ? "Verdadeiro" : "Falso";
//        System.out.println(resultado);
//
//        System.out.println(resultado == "Verdadeiro");
//        System.out.println(resultado.equals("Verdadeiro"));

        SmartTV smartTV = new SmartTV();
        System.out.println("Ligada? " + (smartTV.ligada ? "Sim" : "Não"));
        System.out.println("Volume Atual: " + smartTV.volume);
        System.out.println("Canal Atual: " + smartTV.canal);

        smartTV.ligar();
        System.out.println("Ligada? " + (smartTV.ligada ? "Sim" : "Não"));
        smartTV.desligar();
        System.out.println("Ligada? " + (smartTV.ligada ? "Sim" : "Não"));

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume Atual: " + smartTV.volume);
        smartTV.diminuirVolume();
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        System.out.println("Canal Atual: " + smartTV.canal);
        smartTV.mudarCanal(40);
        System.out.println("Canal Atual: " + smartTV.canal);

    }

}
