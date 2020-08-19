package com.api.TestClasses;
import com.api.Utilities.Setup;
import com.api.Config.ConfigFile;
import org.testng.annotations.Test;
public class Test1 extends Setup
{
    @Test
    public void a1()
    {
        ConfigFile confObject = Setup.getConfigObject();
        System.out.println(confObject.URL);
    }
}