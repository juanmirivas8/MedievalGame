package es.iesfranciscodelosrios.model;

import es.iesfranciscodelosrios.utils.SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartidaDAO extends DAOConnection{

    private static PartidaDAO instance;

    public static PartidaDAO getInstance(){
        if(instance == null){
            instance = new PartidaDAO();
        }

        return instance;
    }

    private PartidaDAO(){super();}

    public void eliminar(Integer id){
        List<Object> l = new ArrayList<>();
        l.add(id);
        SQL.execUpdate("DELETE FROM Partida WHERE id = ?",l,false);

    }
    public void insert(Partida p){
        List<Object> l = new ArrayList<>();
        l.add(p.getTurnos());
        l.add(p.getTabernas());
        l.add(p.getCuarteles());
        l.add(p.getHospitales());
        l.add(p.getEscuelas());
        l.add(p.getIglesias());
        l.add(p.getBancos());
        l.add(p.getUserid());
        l.add(p.getPoblacion());
        l.add(p.getPoblacionCambio());
        l.add(p.getCorrupcion());
        l.add(p.getCorrupcionCambio());
        l.add(p.getEstabilidad());
        l.add(p.getEstabilidadCambio());
        l.add(p.getDinero());
        l.add(p.getImpuestos());
        l.add(p.getInflacion());
        l.add(p.getInflacionCambio());
        l.add(p.getSoldados());
        l.add(p.getSoldadosCambio());
        l.add(p.getNombre());
        SQL.execUpdate("INSERT INTO Partida (turnos,tabernas,cuarteles,hospitales,escuelas,iglesias,bancos,userid," +
                "poblacion,poblacionCambio,corrupcion,corrupcionCambio,estabilidad,estabilidadCambio,dinero," +
                "impuestos, inflacion,inflacionCambio,soldados,soldadosCambio,nombre) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",l,true);
    }
    public List<Partida> getPartidas(Integer user){
        List<Object> l = new ArrayList<>();
        l.add(user);
        List<Partida> p = new ArrayList<>();
        ResultSet res = SQL.execQuery("SELECT turnos,tabernas,cuarteles,hospitales,escuelas,iglesias,bancos,id,userid," +
                "poblacion,poblacionCambio,corrupcion,corrupcionCambio,estabilidad,estabilidadCambio,dinero," +
                "impuestos, inflacion,inflacionCambio,soldados,soldadosCambio,nombre from Partida where userid = ?",l);

        try {
            while (res.next()){
                Partida partida = new Partida();
                partida.setId(res.getInt("id"));
                partida.setUserid(res.getInt("userid"));
                partida.setBancos(res.getInt("bancos"));
                partida.setIglesias(res.getInt("iglesias"));
                partida.setEscuelas(res.getInt("escuelas"));
                partida.setHospitales(res.getInt("hospitales"));
                partida.setCuarteles(res.getInt("cuarteles"));
                partida.setTabernas(res.getInt("tabernas"));
                partida.setTurnos(res.getInt("turnos"));
                partida.setPoblacion(res.getDouble("poblacion"));
                partida.setPoblacionCambio(res.getDouble("poblacionCambio"));
                partida.setCorrupcion(res.getDouble("corrupcion"));
                partida.setCorrupcionCambio(res.getDouble("corrupcionCambio"));
                partida.setEstabilidad(res.getDouble("estabilidad"));
                partida.setEstabilidadCambio(res.getDouble("estabilidadCambio"));
                partida.setDinero(res.getDouble("dinero"));
                partida.setImpuestos(res.getDouble("impuestos"));
                partida.setInflacion(res.getDouble("inflacion"));
                partida.setInflacionCambio(res.getDouble("inflacionCambio"));
                partida.setSoldados(res.getDouble("soldados"));
                partida.setSoldadosCambio(res.getDouble("soldadosCambio"));
                partida.setNombre(res.getString("nombre"));
                p.add(partida);
            }
        }catch (SQLException e){

        }
        return p;
    }
}
