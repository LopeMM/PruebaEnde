/** 	Proyecto navidad
 * 		Clase del objeto collar de perro, con su atributo
 * 
 * 		@author Lope
 *		@version 1.0
 */
public class CollarPerro {

	String color;
	/** Constructor de la clase perro
	*	@param Indica que color queremos para el collar
	**/
	public CollarPerro(String color) {
		this.color = color;
	}
	/**
	*	Constructor vacio para perros sin collar
	**/
	public CollarPerro() {
		}
	/** 
	*	Get del atributo color
	*	@return devuelve el valor del atributo color
	**/
	public String getColor() {
		return color;
	}
	/** 
	*	Set del atributo color
	*	@param recibe el valor del atributo color
	**/
	public void setColor(String color) {
		this.color = color;
	}
	
	
	

	}


