package com.api.Utilities;
import com.api.Config.ConfigFile;
import org.testng.annotations.*;
public class Setup
{
    public static ConfigFile confObject = null;
    public  static ConfigFile getConfigObject(){
        return confObject;
    }
    public  static  int getNum(){
        return 2;
    }
    @BeforeSuite
    public  void  setupconfig()
    {
        confObject = new ConfigFile();
    }
}