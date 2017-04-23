package com.sdi.client;

import java.util.List;
import java.util.Map;










import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import uo.sdi.business.AdminService;
import uo.sdi.business.LoginService;
import uo.sdi.business.exception.BusinessException;
import uo.sdi.dto.UserData;
import alb.util.console.Console;
import alb.util.menu.Action;

/**
 * Clase para listar mecanicos en la capa de interfaz
 *
 * @author Ramon Sobrino Llorca
 *
 */
public class ListUsersAction implements Action {

	private static final String ADMIN_SERVICE_JNDI_KEY =
			"sdi2-16/"
			+ "sdi2-16EJB/"
			+ "EjbAdminService!"
			+ "uo.sdi.business.impl.admin.RemoteAdminService";
	
    @Override
    public void execute() throws BusinessException, NamingException {

    	
	Console.println("\nListado de usuarios\n");

	Context ctx = new InitialContext();

	AdminService service = (AdminService) ctx.lookup(ADMIN_SERVICE_JNDI_KEY);

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
