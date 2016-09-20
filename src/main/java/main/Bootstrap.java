package main;

import http.XmlParserServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.ServletContextEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

/**
 * Created by К on 20.09.2016.
 */
public class Bootstrap {
    public static void main(String[] args) {

//        File settings = new File("config.properties");
//        BufferedReader buffReader = new BufferedReader(new FileReader(new File(new ServletContextEvent())));
//        String buff = null;
        Properties properties = new Properties();
        try {
            FileInputStream fileIS = new FileInputStream("config.properties");
            properties.load(fileIS);
            Server server = new Server(Integer.parseInt(properties.getProperty("http.port")));
            ServletContextHandler context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
            context.addServlet(new ServletHolder(new XmlParserServlet()), "/index.html");
            server.start();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
