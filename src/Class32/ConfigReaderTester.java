package Class32;

import Util.ConfigReader;

import java.io.IOException;

public class ConfigReaderTester {

    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("URL"));
        System.out.println(ConfigReader.getProperty("password"));
        System.out.println(ConfigReader.getProperty("username"));
    }
}
