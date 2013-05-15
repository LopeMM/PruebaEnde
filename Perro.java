/** 	Proyecto navidad
 * 		Clase del objeto perro, con sus atributos y sus metodos para interactuar con el
 * 
 * 		@author Lope
 *		@version 1.0
 */
 //probando comentario
 //tercer comentario
public class Perro {
		/**
		*	Campos de la clase Perro: peso,nombre,raza, patas, collar, contador
		**/
			// estado del objeto (campos o atributos)
		private int peso;
		private String nombre;
		private String raza;
		private static int patas=4;
		private CollarPerro collar;
		private static int cont;
		/**
		*	Constructor de la clase perro
		*	@param	Peso
		*	@param	Nombre
		*	@param	Raza
		*	@param	Collar
		**/
		// Constructor del objeto.  Inicializan el estado del objeto
		Perro(int peso, String nombre, String raza,CollarPerro Collar) {
			this.peso = peso;
			this.nombre = nombre;
			collar = new CollarPerro();
			this.raza = raza;
			setCont(getCont()+1);
		}
		// Set and Get para accerder a los atributos
		/**	Metodo para acceder al valor del contador
		*	@return devuelve el valor de la variable cont
		**/
		public static int getCont() {
			return cont;
		}
		/**	Metodo para asignarle un valor a la variable cont
		*	@param valor que queremos asignar 
		**/
		public static void setCont(int cont) {
			Perro.cont = cont;
		}
		/**	Metodo para acceder al valor de la variable peso
		*	@return devuelve el valor de la variable peso
		**/
		public int getPeso() {
			return peso;
		}
		/**	Metodo para asignarle un valor a la variable peso
		*	@param valor que queremos asignar 
		**/
		public void setPeso(int peso) {
			this.peso = peso;
		}
		/**	Metodo para acceder al valor del Nombre
		*	@return devuelve el valor de la variable nombre
		**/
		public String getNombre() {
			return nombre;
		}
		/**	Metodo para asignarle un valor a la variable nombre
		*	@param valor que queremos asignar 
		**/
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**	Metodo para acceder al valor de la variable raza
		*	@return devuelve el valor de la variable raza
		**/
		public String getRaza() {
			return raza;
		}
		/**	Metodo para asignarle un valor a la variable raza
		*	@param valor que queremos asignar 
		**/
		public void setRaza(String raza) {
			this.raza = raza;
		}
		/**	Metodo para acceder al valor de la variable patas
		*	@return devuelve el valor de la variable patas
		**/
		public static int getPatas() {
			return patas;
		}
		/**	Metodo para asignarle un valor a la variable patas
		*	@param valor que queremos asignar 
		**/
		public static void setPatas(int patas) {
			Perro.patas = patas;
		}
		/**	Metodo para acceder al valor de la variable collar
		*	@return devuelve el valor de la variable collar
		**/
		public CollarPerro getCollar() {
			return collar;
		}
		/**	Metodo para asignarle un valor a la variable collar
		*	@param valor que queremos asignar 
		**/
		public void setCollar(CollarPerro collar) {
			this.collar = collar;
		}

		// Comportamiento del objeto (m�todos o mensajes que se le env�an al objeto)
		
		/** Metodo en el que se incremeta el atributo peso del objeto perro
		 * 
		 * @return bandera
		 * Devuelve un valor para comprobar si el perro sigue vivo o no
		 */
		public int comer() {
			peso+=300;
			if (peso>9000 && peso <10000)
				System.out.println("Cuidado " + nombre + " esta muy gordo");
			if (peso>=10000){
				System.out.println("Tu perro ha muerto de sobrepeso");
				return 1;
			}
				else {
				System.out.println("�am�am�am!");
				return 0;
				}
			
		}
		/** Metodo en el que se decrementa el atributo peso del objeto perro
		 * 
		 * @return bandera
		 * Devuelve un valor para comprobar si el perro sigue vivo o no
		 */
		public int jugar() {
			peso-=300;
			if (peso<1500 && peso >500){
				System.out.println("Cuidado " + nombre + " esta en los huesos!");
			}
			if (peso<=500){
				System.out.println("Tu perro ha muerto de hambre");
				return 1;
			}
			else{
			System.out.println("Guau!... Guau!!");
			return 0;
			}
		} 
		/**	Metodo para dormir
		*
		**/
		void dormir() {
			System.out.println("grrrrr. Zzz");
		}
		/**	Metodo para cambiar el color del collar
		*
		**/
		void cambiarCollar(){
			System.out.println("Introduce el color del collar para tu perro");
			collar.setColor(Teclado.leerCadena());
			
		}
		/** Metodo que indica el color del collar del perro
		 * 
		 * @return Cadena
		 * Devuelve una cadena con el color del collar si ha sido creado.
		 */
		String mostrarCollar(){
			collar.getColor();
			if (collar.color==null)
				return "El perro no tiene collar";
			else
				return "El perro tiene el collar de color :" + collar.color;
		}
		void mostrar() {
			System.out.println("Hola, soy " + nombre + " de raza " + raza
					+ ". Peso " + peso / 1000d + " kilos y tengo " +patas+ "patas y" + mostrarCollar());

		}
	}
