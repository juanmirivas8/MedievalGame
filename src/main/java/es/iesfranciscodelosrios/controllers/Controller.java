package es.iesfranciscodelosrios.controllers;


import es.iesfranciscodelosrios.model.Usuario;
import es.iesfranciscodelosrios.model.UsuarioDAO;
import es.iesfranciscodelosrios.utils.Utils;

import java.util.logging.Logger;

public class Controller {
    protected static Usuario activeUser;
    protected static UsuarioDAO users = UsuarioDAO.getInstance();
    protected static final Logger Log = Utils.getLogger();
    protected Controller(){}
}
