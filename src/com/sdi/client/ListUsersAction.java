package com.sdi.client;

import java.util.List;

import javax.naming.NamingException;

import uo.sdi.ws.AdminService;
import uo.sdi.ws.BusinessException_Exception;
import uo.sdi.ws.UserData;
import uo.sdi.ws.EjbAdminServiceService;
import alb.util.console.Console;
import alb.util.menu.Action;

/**
 * Clase para listar mecanicos en la capa de interfaz
 *
 * @author Ramon Sobrino Llorca
 *
 */
public class ListUsersAction implements Action {

	
    @Override
    public void execute() throws NamingException, BusinessException_Exception {

    	
	Console.println("\nListado de usuarios\n");


	AdminService service = new EjbAdminServiceService().getAdminServicePort();

	List<UserData> lista = service.listData();
			
	for (UserData linea : lista) {

	    Console.println(linea.getId()+ " " +linea.getLogin() + " " 
	    + linea.getNumTareasCompletadas()+ " "
	    + linea.getNumTareasPlanificadas()+ " "
	    + linea.getNumTareasRetrasadas()+ " "
		    + linea.getNumTareasSinPlanificadas());

	}
    }
}
