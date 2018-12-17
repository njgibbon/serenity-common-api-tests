package njgibbon.test.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.Properties;

public class PropertyConfig
{

    private static Properties props = new Properties();

    static
    {
        init();
    }

    public static String get(String string)
    {
        return props.getProperty(string);
    }

    public static void init()
    {
        System.out.println("HelloHELLLEOEO");

        String rootPath = "src/test/resources/";
        System.out.println(rootPath);
        String appConfigPath = rootPath + "application.properties";

        //Properties newProperties = new Properties();
        String value = System.getenv("ENVIRONMENT");
        System.out.println(value);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        //InputStream inputStream = loader.getResourceAsStream("application.properties");
       // ClassLoader classLoader = getClass().getClassLoader();
       // File file = new File(classLoader.getResource("application.properties").getFile());
        //newProperties.load(inputStream);
        String filePath = "";
        //newProperties.load(new FileInputStream(appConfigPath));
        //newProperties.load(new FileInputStream(appConfigPath));
        //InputStream inputStream = PropertyConfig.class.getClassLoader().getResourceAsStream("application.properties");
        //newProperties.load(inputStream);
        try
        {
            //newProperties.load(inputStream);
            //newProperties.load(new FileInputStream(appConfigPath));
            InputStream inputStream =
                    PropertyConfig.class.getClassLoader().getResourceAsStream("application.properties");

            props.load(inputStream);
            filePath = props.getProperty("netflixUrl");
            System.out.println(filePath);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //props = newProperties;
        System.out.println(props.getProperty("googleUrl"));
        System.out.println(get("googleURl"));
        System.out.println(get("netflixRl"));
        System.out.println(get("mediumURl"));
    }
}
