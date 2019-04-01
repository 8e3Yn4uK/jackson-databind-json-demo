package com.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

/**
 * Created by 8e3Yn4uK on 01.04.2019
 */

public class Driver {

    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            System.out.println(theStudent.getFirstName());
            System.out.println(theStudent.getLastName());
            Address tempAdress = theStudent.getAddress();
            System.out.println("Street: " + tempAdress.getStreet());
            System.out.println("City: " + tempAdress.getCity());
            for (String tempLang : theStudent.getLanguages()) System.out.println(tempLang);

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
