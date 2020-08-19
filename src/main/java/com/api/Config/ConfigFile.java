package com.api.Config;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class ConfigFile {
    public String Name1;
    public String Name2;
    public  String URL;
    public  ConfigFile(){
        Properties prop = new Properties();
        try
        {
            File confFile = new File("./Api.properties");
            FileInputStream fis = new FileInputStream(confFile);
            prop.load(fis);
            this.Name1= prop.getProperty("Name1");
            this.Name2= prop.getProperty("Name2");
            this.URL= prop.getProperty("URL");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}