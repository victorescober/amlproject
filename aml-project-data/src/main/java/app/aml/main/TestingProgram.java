package app.aml.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import app.aml.configuration.AppConfig;
import app.aml.dao.ArchivosAmlDao;
import app.aml.model.ArchivosAml;


public class TestingProgram {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		ArchivosAmlDao archivoService = (ArchivosAmlDao) context.getBean("archivosAmlDao");
		
		
		ArchivosAml aml=new ArchivosAml();
		aml.setNombreArchivo("Prueba");
		aml.setDescripcionArchivo("Archivo de prueba");
		aml.setNombreCarpeta("Prueba carpeta");
		aml.setUrlArchivo("TestUrl");
		aml.setIdTipoArchivo(1);
		
		archivoService.save(aml);
		
		context.close();
		

	}

}
