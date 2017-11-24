/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @Erick Alejandro Campos Rivero  -  1506449
 */
public class ComentariosDAO {
    private Connection conexion;
    private void abrirConexion() throws SQLException{
        String dbURI = "jdbc:derby://localhost:1527/COMENTARIOS";
        String username = "fcfm";
        String password = "lsti01";
        conexion = DriverManager.getConnection(dbURI, username, password);
    }
    private void cerrarConexion() throws SQLException{
        conexion.close();
    }
    public void insertar(ComentariosPOJO cop){
       try{
           abrirConexion();
           String sqlInsert = "insert into COMENTARIOS values ('"+cop.getNombre()+"','"+cop.getComentario()+"')";
           Statement st = conexion.createStatement();
           st.executeUpdate(sqlInsert);
           cerrarConexion();
       }catch(Exception ex){
       
       }
    }
    public ArrayList buscar(ComentariosPOJO po){
        ArrayList<ComentariosPOJO> comentarios = new ArrayList();
        try{
            abrirConexion();
            String sqlBuscar = "select * from COMENTARIOS where NOMBRE = '" + po.getNombre()+"' and COMENTARIO like '%"+po.getComentario()+ "%'";            
            Statement sta = conexion.createStatement();
            ResultSet mensajes = sta.executeQuery(sqlBuscar);
            while(mensajes.next()){
                String nombre = mensajes.getString("Nombre");
                String comentario = mensajes.getString("Comentario");
                ComentariosPOJO compo = new ComentariosPOJO();
                compo.setNombre(nombre);
                compo.setComentario(comentario);
                comentarios.add(compo);
            }
            cerrarConexion();
        }catch(Exception ex){
           
        }
        return comentarios;
    }
    
}
