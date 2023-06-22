public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("GENERADOR DE FECHA AUTOMATICA");

        int dia=0;
        int mes=0;
        int anos=0;

        for (int i=1; i<=2; i++){
            int nAleatorio = (int) (Math.random()*10);
            dia=dia*10+nAleatorio;

            int nAleatorio2 = (int) (Math.random()*10);
            mes=mes*10+nAleatorio2;
        }
        for (int i=1; i<=4; i++){
            int nAleatorio3 = (int) (Math.random()*10);
            anos=anos*10+nAleatorio3;
        }
        System.out.println("LA FECHA CONSTRUIDA ES: "+dia+"/"+mes+"/"+anos);
    }
}