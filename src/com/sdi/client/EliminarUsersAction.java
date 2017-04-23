package com.sdi.client;

import java.util.List;
import java.util.Map;











import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import uo.sdi.business.AdminService;
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
public class EliminarUsersAction implements Action {

	private static final String ADMIN_SERVICE_JNDI_KEY =
			"sdi2-16/"
			+ "sdi2-16EJB/"
			+ "EjbAdminService!"
			+ "uo.sdi.business.impl.admin.RemoteAdminService";
	
    @Override
    public void execute() throws BusinessException, NamingException {

   	 Long idUser = Console.readLong("Id de user a eliminar:");

	Context ctx = new InitialContext();

	AdminService service = (AdminService) ctx.lookup(ADMIN_SERVICE_JNDI_KEY);

	service.deepDeleteUser(idUser);
	
    }
}
