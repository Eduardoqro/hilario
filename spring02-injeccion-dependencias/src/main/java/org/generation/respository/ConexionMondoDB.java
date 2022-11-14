package org.generation.respository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Este es la otra conexin al mondoDB
 * @author eduar
 *
 */
@Repository
@Qualifier("Mongo") // agreagamos esto para darla la opcion a que conexion conectarse
public class ConexionMondoDB implements IConexionDB{

	@Override
	public String registrar(String nombre) {
		// TODO Auto-generated method stub
		return "Mongo DB resgistra a "+ nombre;
	}

}
