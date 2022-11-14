package org.generation;

import org.generation.service.IRegistroService;
import org.generation.service.RegistroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Esto ejemplo es para el import de dependias 
 * @author eduar
 *
 */
@SpringBootApplication
public class Spring02InjeccionDependenciasApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(Spring02InjeccionDependenciasApplication.class);
	
	//Ya tiene el registro de dependias no es necesario poner esto->private IRegistroService service = new RegistroService();
	@Autowired // reutilizxasmos componentes y mejoramos el uso de la memoria
	private IRegistroService service;
	public static void main(String[] args) {
		SpringApplication.run(Spring02InjeccionDependenciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// NO UTILIZAMOS EL SPRING NORMAL PARA IMPRIMIR EN CONSOLA
		// UTILIZAR LOGGER PARA ENVIAR MENSAGES A LA CONSOLA Y PODER VERLO CON LAS PROPIEDAES DE NOS MUESTRA CON LA CLASE
		LOG.info("Holi con estilo");
		LOG.warn("Holis con warning=0");
		LOG.error("Holi enojado ~~");
		LOG.info(service.usoDB("Pandita Rockera"));
	}

}
