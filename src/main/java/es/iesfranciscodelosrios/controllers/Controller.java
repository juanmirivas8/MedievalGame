package es.iesfranciscodelosrios.controllers;


import es.iesfranciscodelosrios.model.*;
import es.iesfranciscodelosrios.utils.Utils;

import java.util.logging.Logger;

public class Controller {
    protected static Usuario activeUser;
    protected static Partida activePartida;
    protected static PartidaFX activePartidaFX;
    protected static UsuarioDAO users = UsuarioDAO.getInstance();

    protected static PartidaDAO partidas = PartidaDAO.getInstance();
    protected static final Logger Log = Utils.getLogger();
    protected Controller(){}
}
