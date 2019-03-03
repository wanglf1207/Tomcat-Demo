package com.tomcat.demo;

import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.buf.ByteChunk;

import java.io.File;

public class TomcatTest {
    public static void main(String [] args) {
       /* Tomcat tomcat = getTomcatInstance();
        File appDir = new File(getBuildDirectory(), "webapps/examples");
        tomcat.addWebapp(null, "/examples", appDir.getAbsolutePath());
        tomcat.start();
        ByteChunk res = getUrl("http://localhost:" + getPort() +
                "/examples/servlets/servlet/HelloWorldExample");
        assertTrue(res.toString().indexOf("<h1>Hello World!</h1>") > 0);*/
    }
}
