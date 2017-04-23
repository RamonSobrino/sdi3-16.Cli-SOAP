package com.sdi.client;


import alb.util.menu.BaseMenu;

/**
 * Clase menu principal para el administrador
 *
 * @author Ramon Sobrino Llorca
 *
 */
public class MainMenu extends BaseMenu {

    /**
     * Constructor
     */
    public MainMenu() {
	menuOptions = new Object[][] {
		{ "Administrador", null },
		{ "Lista de usuarios", ListUsersAction.class },
		{ "Desabilitar usuarios", DeshabilitarUsersAction.class },
		{ "Eliminar usuarios", EliminarUsersAction.class },
	};
    }

    public static void main(String[] args) {
	new MainMenu().execute();
    }

}
