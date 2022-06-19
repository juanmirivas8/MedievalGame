package es.iesfranciscodelosrios.model;

import es.iesfranciscodelosrios.utils.SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO extends DAOConnection{

    private static UsuarioDAO instance;
    public static UsuarioDAO getInstance(){
        if(instance == null){
            instance = new UsuarioDAO();
            users = instance;
        }
        return instance;
    }
    private UsuarioDAO(){
        super();
    }



    public Boolean insert(Usuario user){

        if(!find(user.getNombre())){
            List<Object> l = new ArrayList<>();
            l.add(user.getNombre());
            l.add(user.getPassword());
            SQL.execUpdate("INSERT INTO Usuario (nickname, password) VALUES ( ? , ? )",l,true);
            return true;
        }
        return false;
    }

    public Usuario identify(String usuario, String password){
        if(cn != null){
            List<Object> l = new ArrayList<>();
            l.add(usuario);
            l.add(password);
            ResultSet res = SQL.execQuery("SELECT id,nickname,password from Usuario where nickname = ? and password = ?",l);

            try {
                while(res.next()){
                    Integer id = res.getInt(1);
                    String nickname = res.getString(2);
                    String ps = res.getString(3);
                    PartidaDAO pdao = PartidaDAO.getInstance();
                    List<Partida> p = new ArrayList<>();
                    Usuario user = new Usuario(nickname,ps,id,p);
                    p = pdao.getPartidas(user.getId());
                    user.setPartidas(p);
                    p.forEach(x->x.setUsuario(user));
                    return user;
                }
            } catch (SQLException e) {

            }
        }
        return null;
    }

    public Boolean find(String user){
        if(cn != null){
            List<Object> l = new ArrayList<>();
            l.add(user);
            ResultSet res = SQL.execQuery("SELECT id,nickname,password from Usuario where nickname = ?",l);

            try {
                while(res.next()){
                    return true;
                }
            } catch (SQLException e) {

            }
        }
        return false;
    }
}
