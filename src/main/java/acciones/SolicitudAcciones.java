/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import clases.SolicitudClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jagum
 */
public class SolicitudAcciones {
    
    public void guardarSolicitud(SolicitudClass solicitudClass) throws SQLException {
        long id = insertarSolicitud(solicitudClass);
        solicitudClass.setID(id);
    }
    
    private long insertarSolicitud (SolicitudClass solicitudClass) throws SQLException {
        String sql = "insert into solicitud (matricula, programa, materia, grupo, movimiento, observaciones, fecha) "
                + "values (?,?,?,?,?,?,?);";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ps.setString(1, solicitudClass.matricula);
        ps.setString(2, solicitudClass.programa);
        ps.setString(3, solicitudClass.materia);
        ps.setString(4, solicitudClass.grupo);
        ps.setString(5, solicitudClass.movimiento);
        ps.setString(6, solicitudClass.observaciones);
        ps.setLong (7, solicitudClass.fecha);
        int id = 0;
        ps.execute();
        sql = "select last_insert_rowid();";
        ps = Conexion.PrepareStatement(sql, true);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            id = rs.getInt(1);
        }
        return id;
    }
    
}
