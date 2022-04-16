package es.iesfranciscodelosrios.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionDataTest {

    @Test
    public void testLoad(){
        assertDoesNotThrow(()->{
            ConnectionData aux = new ConnectionData("src/main/resources/es/iesfranciscodelosrios/xml/sql.xml");
        });
    }
    @Test
    public void testAttributesSql(){
        ConnectionData aux = new ConnectionData("src/main/resources/es/iesfranciscodelosrios/xml/sql.xml");
        assertNotEquals(null,aux.getDatabase());
        assertNotEquals(null,aux.getServer());
        assertNotEquals(null,aux.getPassword());
        assertNotEquals(null,aux.getUser());
        assertNotEquals("",aux.getDatabase());
        assertNotEquals("",aux.getServer());
        assertNotEquals("",aux.getPassword());
        assertNotEquals("",aux.getUser());
    }
}