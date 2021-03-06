package co.com.yourcompany.certification.nameproject.util.properties;

import co.com.yourcompany.certification.nameproject.exceptions.EndavaPropertiesDoesNotLoadException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Endavaproperties {

    private static Properties prop = null;

    private Endavaproperties() {
        throw new IllegalStateException();

    }

    public static String getUrlFront() {
        loadProperties();
        return prop.getProperty("UrlFront");

    }

    public static void loadProperties() {
        if (prop == null) {
            prop = new Properties();
            File objclasspathRoot = new File(System.getProperty("user.dir"));
            String strFilePath = objclasspathRoot.getAbsolutePath();

            try {
                prop.load(new FileReader(strFilePath + "/endava.properties"));
            } catch (IOException e) {
                throw new EndavaPropertiesDoesNotLoadException(e);
            }
        }
    }



}
