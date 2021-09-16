package restaurant;
import java.util.List;
/**
 * @author Francisco Lopez
 * */
public class ItemMenu {
static int nextID;/*Identificador del proximo ItemMenu*/
int id;/*Identificador del ItemMenu*/
String nombre;/*Nombre del ItemMenu*/
float precio;/*Precio del ItemMenu*/
Receta receta;/*Objeto del tipo Receta, que tendra los detalles de la receta del ItemMenu*/
String tipo;/*Tipo del ItemMenu*/
/**
 * Indica el nombre del ItemMenu.
 * 
 * @return String con el valor del nombre.
 */
public String getNombre() {
	return nombre;
}
/**
 * Modifica el nombre del ItemMenu.
 * 
 * @param String nombre nuevo.
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * Indica el precio del ItemMenu.
 * 
 * @return float con el valor del precio.
 */
public float getPrecio() {
	return precio;
}
/**
 * Modifica el precio del ItemMenu.
 * 
 * @param float precio nuevo.
 */
public void setPrecio(float precio) {
	this.precio = precio;
}
/**
 * Indica la receta del ItemMenu.
 * 
 * @return Receta.
 */
public Receta getReceta() {
	return receta;
}
/**
 * Modifica la receta del ItemMenu.
 * 
 * @param Receta receta nueva.
 */
public void setReceta(Receta receta) {
	this.receta = receta;
}
/**
 * Indica el tipo del ItemMenu.
 * 
 * @return String con el valor del tipo.
 */
public String getTipo() {
	return tipo;
}
/**
 * Modifica el tipo del ItemMenu.
 * 
 * @param String tipo nuevo.
 */
public void setTipo(String tipo) {
	this.tipo = tipo;
}
/**
 * Crea un objeto del tipo ItemMenu.
 * 
 * @param String nombre que tendra.
 * @param float precio que tendra.
 * @param Receta receta que tendra.
 * @param String tipo que sera.
 */
public ItemMenu(String nombre, float precio, Receta receta, String tipo) {
	super();
	this.id=nextID;
	nextID++;
	this.nombre = nombre;
	this.precio = precio;
	this.receta = receta;
	this.tipo = tipo;
}

}
