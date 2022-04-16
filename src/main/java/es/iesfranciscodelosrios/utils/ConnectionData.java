package es.iesfranciscodelosrios.utils;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ConnectionData {
    private String database;
    private String user;
    private String password;
    private String server;

    public ConnectionData() {
    }

    public ConnectionData(String url) {
        this.load(url);
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void load(String url){
        ConnectionData aux;
        try {
            JAXBContext context = JAXBContext.newInstance(ConnectionData.class);
            Unmarshaller um = context.createUnmarshaller();
            aux = (ConnectionData) um.unmarshal(new File(url));
            this.database = aux.database;
            this.server = aux.server;
            this.user = aux.user;
            this.password = aux.password;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
