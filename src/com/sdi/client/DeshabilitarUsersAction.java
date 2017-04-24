package com.sdi.client;

import javax.naming.NamingException;
import uo.sdi.ws.AdminService;
import uo.sdi.ws.BusinessException_Exception;
import uo.sdi.ws.EjbAdminServiceService;
import alb.util.console.Console;
import alb.util.menu.Action;

/**
 * Clase para listar mecanicos en la capa de interfaz
 *
 * @author Ramon Sobrino Llorca
 *
 */
public class DeshabilitarUsersAction implements Action {

	
	
    @Override
    public void execute() throws NamingException, BusinessException_Exception {

		Long idUser = Console.readLong("Id de user a deshabilitar:");
	
	 	AdminService service = new EjbAdminServiceService().getAdminServicePort();
	
		service.disableUser(idUser);
    }
}
