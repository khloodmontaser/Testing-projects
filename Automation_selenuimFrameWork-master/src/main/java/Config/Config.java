package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class Config {
    private static final Properties properties = new Properties();
    private static final String FILE_PATH;
    static {
        FILE_PATH = Paths.get(System.getProperty("user.dir"), "src", "resources",  "config.properties")
                .toAbsolutePath()
                .toString();


        try (FileInputStream inputStream = new FileInputStream(FILE_PATH)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties file: " + FILE_PATH);
        }
    }


    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
