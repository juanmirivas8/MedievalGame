package es.iesfranciscodelosrios.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class SQLTest {

    @Test
    public void testConnection(){
        Connection cn = SQL.getConnection("src/main/resources/es/iesfranciscodelosrios/xml/sql.xml");
        assertNotNull(cn);
        SQL.disconnect();
    }
}