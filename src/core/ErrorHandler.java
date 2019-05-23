package core;

import generated.CATALOG;
import generated.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ErrorHandler {

    public static void run() {
        try {
            File file = new File("location//product-master.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            CATALOG productMaster = (CATALOG) unmarshaller.unmarshal(file);
            productMaster.getPLANT();

        } catch (Throwable t) {
            t.printStackTrace();
        }

    }


}