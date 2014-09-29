package com.trax.JaxBSample.main;

import com.trax.JaxBSample.domain.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by SG0220142 on 7/19/2014.
 */
public class ConvertJavaToXml {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(101);
        customer.setName("mkyvikashong");
        customer.setAge(29);

        File file = new File("C:\\Obake\\my_workspace\\myfiles\\jaxb_generated\\customer_simple.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            jaxbMarshaller.marshal(customer,file);
            jaxbMarshaller.marshal(customer,System.out);
        } catch (JAXBException e) {
            System.out.println("Error in creating JAXB context");
            e.printStackTrace();
        }


    }

}
