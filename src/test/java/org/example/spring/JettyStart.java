package org.example.spring;

import org.eclipse.jetty.ajp.Ajp13SocketConnector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.util.Properties;


/**
 * @author zutherb
 */
public class JettyStart {

    public static void main(final String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("JettyStart <httpport>");
            return;
        }

        System.setProperty("spring.profiles.active", "development");

        Server server = new Server(Integer.parseInt(args[0]));
        WebAppContext context = new WebAppContext();
        context.setContextPath("/rest");
        context.setResourceBase("src/main/webapp/");
        context.setDescriptor("src/main/webapp/WEB-INF/web.xml");
        context.setParentLoaderPriority(true);
        server.setHandler(context);

        Ajp13SocketConnector ajpConnector = new Ajp13SocketConnector();
        int ajpport = 8009;
        ajpConnector.setPort(ajpport);
        server.addConnector(ajpConnector);

        try {
            System.out.println(">>> STARTING JETTY, PRESS ANY KEY TO STOP");
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(100);
        }
    }
}
