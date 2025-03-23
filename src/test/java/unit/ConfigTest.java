package unit;

import constants.BStack;
import constants.IResource;
import org.testng.annotations.Test;
import utils.Configuration;

public class ConfigTest
{
    @Test
    public void remoteConfigTest(){
        Configuration configuration = new Configuration(IResource.REMOTE_CONFIG);

//        Configuration configuration = new Configuration();
//        configuration.setDefaultConfig(IResource.REMOTE_CONFIG);
//        configuration.loadProperty();

        String name = configuration.getProperties(BStack.DEVICE_NAME.name());
        System.out.println(name);
    }
}
