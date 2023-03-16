import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Senor usuario, ingrese una constrasena");
        String cadena = entrada.nextLine();

        int contspa=0;
        int caracteres=0;
        int mayus=0;
        int minus=0;
        int num=0;

        for (int i=0; i<cadena.length(); i++){
            int pos = (int) cadena.charAt(i);

            if (cadena.charAt(i)==32){
                contspa = contspa + 1;
            }
            if (cadena.charAt(i)>32 && cadena.charAt(i)<47){
                caracteres = caracteres + 1;
            }
            if (cadena.charAt(i)>47 && cadena.charAt(i)<58){
                num = num + 1;
            }
            if (cadena.charAt(i)>64 && cadena.charAt(i)<91){
               minus = minus + 1;
            }
            if (cadena.charAt(i)>96 && cadena.charAt(i)<123){
               mayus = mayus + 1;
            }
        }
        
        if(contspa >= 1){
            System.out.println("CONTRASEÑA INVALIDA !");
        }else if(contspa==0 && minus>=1 && mayus >=1 && num>=1 && caracteres>=1 ){
            System.out.println("La Constraseña es VALIDA");
        }   
    }
}