package org.generation.respository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
/**
 * Los estereotipos indican a SprintBoot que se va crear un beam
 * @Repostory indica que esta clase es un acceso de datos
 *
 */
@Repository
@Qualifier("MySQL") // agreagamos esto para darla la opcion a que conexion conectarse // EN CASO DE TENER UNA INSTANCIA QUE HAGA LO MISMO

public class ConexionMySQL implements IConexionDB{

	@Override
	public String registrar(String nombre) {
		// TODO Auto-generated method stub
		return "My SQL registra " + nombre;
	}

}
