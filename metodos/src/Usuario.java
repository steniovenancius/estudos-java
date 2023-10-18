public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();   

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Volume: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);


        smartTv.ligar();
        System.out.println("Novo Status => Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status => Tv ligada? " + smartTv.ligada);
    }
}
