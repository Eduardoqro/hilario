package org.generation.service;

import org.generation.respository.ConexionMySQL;
import org.generation.respository.IConexionDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RegistroService implements IRegistroService{
	//Esta parte ya no es necesario por la conexion del Spring ->private IConexionDB conexionDB = new ConexionMySQL();
	// SpringBoot buscara una instancia definida por algun estereotipo (@Service, @Repository)
	@Autowired
	@Qualifier("Mongo") //Aqui le indicamos que conexion va utilizar
	private IConexionDB conexionDB;
	@Override
	public String usoDB(String nombre) {
		// TODO Auto-generated method stub
		return conexionDB.registrar(nombre);
	}

}
