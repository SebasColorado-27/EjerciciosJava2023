
public class Principal{
    public static void main (String[]args){

        //Instancia de la clase persona
        Persona lista [] = new Persona[10];

        lista[0] = new Persona();
        lista[1] = new Persona(108800, "Jhon Alberth", "Aricapa Pinto", "Masculino", 17, 50000, 160);
        lista[2] = new Persona(108801, "Juan David", "Monsalve");

        lista[0].imprimirCartaPresentacion();
        lista[1].imprimirCartaPresentacion();
        lista[2].imprimirCartaPresentacion();
        // Persona mauricio = new Persona();
        // Persona Alberth = new Persona(108800, "Jhon Alberth", "Aricapa Pinto", "Masculino", 17, 50000, 160);
        // Persona Monsalve = new Persona(108801, "Juan David", "Monsalve");

        // Alberth.imprimirCartaPresentacion(); 
        // Monsalve.imprimirCartaPresentacion();
        // mauricio.imprimirCartaPresentacion();
        // // System.out.println(" => Cedula Mauricio: "+ mauricio.cedula);    

        // Alberth.comer(850);
        // Alberth.imprimirCartaPresentacion();

        // Alberth.comer(2000);
        // Alberth.imprimirCartaPresentacion();

    }
}