package com.trax.JaxBSample.main;


import com.trax.JaxBSample.domain.Customer;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by SG0220142 on 7/19/2014.
 */
public class ConvertXmlToObject {

    public static void main(String[] args) {
        File file = new File("C:\\Obake\\my_workspace\\myfiles\\jaxb_generated\\customer_simple.xml");
        try {
            JAXBContext context = JAXBContext.newInstance(Customer.class);
            Unmarshaller unmar = context.createUnmarshaller();

            Customer c = (Customer) unmar.unmarshal(file);
            System.out.println("====>"+ ToStringBuilder.reflectionToString(c));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
