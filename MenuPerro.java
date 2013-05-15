/** 	Proyecto navidad
 * 		Menu para interactuar con el perro eligiendo opciones numericas
 * 
 * 		@author Lope Monedero Moreno
 *		@version 1.0
 */
public class MenuPerro {
public static void main(String[] args) {
		
		int opcion=0, bandera=0;
		Perro perrito =null;
		
		System.out.println("Perros!");
		/**
		*	Gestion del Menu
		**/
		do {
			System.out.println("___...---===***Menu***===---...___");
			System.out.println("¿Que quieres hacer con tu perro?");
			System.out.println("1 . Comprar un Perro");
			System.out.println("2 . Darle de comer");
			System.out.println("3 . Jugar con el");
			System.out.println("4 . Dejarle dormir");
			System.out.println("5 . Cambiar el color del collar");
			System.out.println("6 . Ver estado");
			System.out.println("7 . Cuantos perros has comprado?");
			System.out.println("8 . Salir");
			opcion=Teclado.leerEntero();
			
			while (opcion > 8 || opcion < 0){
				System.out.println("Opcion Incorrecta, vuelva a introducir una opcion");
				opcion=Teclado.leerEntero();
			}
			
			switch (opcion){
			case 1:
				System.out.println("Introduce el nombre de tu nuevo perro");
				perrito = new Perro(5000,"Bulldog",(Teclado.leerCadena()),null);
				break;
			case 2:
				if(perrito==null){
					System.out.println("No se ha comprado ningun perro");
					break;
				}
				else
				bandera=perrito.comer();				
				break;
			case 3:
				if(perrito==null){
					System.out.println("No se ha comprado ningun perro");
					break;
				}
				else
				bandera=perrito.jugar();
				break;
			case 4:
				if(perrito==null){
					System.out.println("No se ha comprado ningun perro");
					break;
				}
				else
				perrito.dormir();
				break;
			case 5:
				if(perrito==null){
					System.out.println("No se ha comprado ningun perro");
					break;
				}
				else
				perrito.cambiarCollar();
				break;
			case 6:
				if(perrito==null){
					System.out.println("No se ha comprado ningun perro");
					break;
				}
				else
				perrito.mostrar();
				break;
			case 7:
				if(perrito==null){
					System.out.println("No se ha comprado ningun perro ");
					break;
				}
				else
				System.out.println("El numero de perros comprados es "+Perro.getCont());
				break;
			default:
				System.out.println("Adios!");
			}	
		}while(opcion!=8 && bandera!=1);
	}

}

