/**
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 * <p>
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package mood;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 */
@WebListener()
public class SimpleServletListener implements ServletContextListener,
        ServletContextAttributeListener {


    static final Logger log =
            Logger.getLogger("mood.web.SimpleServletListener");


    public void contextInitialized(ServletContextEvent sce) {
        log.info("Context initialized");
    }


    public void contextDestroyed(ServletContextEvent sce) {
        log.info("Context destroyed");
    }


    public void attributeAdded(ServletContextAttributeEvent event) {
        log.log(Level.INFO, "Attribute {0} has been added, with value: {1}",
                new Object[]{event.getName(), event.getValue()});
        System.out.println("Mood reported:" + event.getValue());
    }


    public void attributeRemoved(ServletContextAttributeEvent event) {
        log.log(Level.INFO, "Attribute {0} has been removed",
                event.getName());
    }


    public void attributeReplaced(ServletContextAttributeEvent event) {
        log.log(Level.INFO, "Attribute {0} has been replaced, with value: {1}",
                new Object[]{event.getName(), event.getValue()});
    }
}
