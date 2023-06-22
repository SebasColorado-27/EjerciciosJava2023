public class Principal{
	public static void main(String[] args) {
		
		Persona listaClientes [] = new Persona [100];
		Persona listaVendedores [] = new Persona [10];
		
		listaClientes[0] = new Persona("108800", "Oscar Loaiza", "Calle 20");
		listaClientes[1] = new Persona("108801", "Sebastian Colorado", "Calle 19");
		listaClientes[2] = new Persona("108802", "Juan Pechene", "Calle 18");
		listaClientes[3] = new Persona("108803", "Carl Johnson", "Calle 17");
		listaClientes[4] = new Persona("108804", "Cristiano Ronaldo ", "Calle 16");

		listaVendedores[0] = new Persona("107700", "Don Chucho","");
		listaVendedores[1] = new Persona("107701", "Don Jose","");
		listaVendedores[2] = new Persona("107702", "Don Jacinto","");
		listaVendedores[3] = new Persona("107703", "Don Jaime","");
		listaVendedores[4] = new Persona("107704", "Vete del Ciber","");

		Interfaz inicio = new Interfaz(listaClientes, listaVendedores);

	}
}