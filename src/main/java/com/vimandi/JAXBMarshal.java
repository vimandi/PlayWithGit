package com.vimandi;

import jakarta.xml.bind.*;

import java.io.File;

public class JAXBMarshal {
    public static void main(String[] args) throws JAXBException {
       /*
        Employee emp = new Employee();
        emp.setId(6126);
        emp.setName("Divya imande");

        JAXBContext context = JAXBContext.newInstance(Employee.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

// Convert Java object to XML
        marshaller.marshal(emp, new File("emp.xml"));

*/
        JAXBContext context = JAXBContext.newInstance(Employee.class);

// Convert XML back to Java
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Employee emp2 = (Employee) unmarshaller.unmarshal(new File("emp.xml"));
System.out.println(emp2.getId() + " , "+emp2.getName());



    }
}

//feature f6


//hotfix 1

//hotfix 2


//hotfix 3



//squash1


//squash2




