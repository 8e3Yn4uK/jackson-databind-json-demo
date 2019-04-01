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

            Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);

            System.out.println(theStudent.getFirstName());
            System.out.println(theStudent.getLastName());

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
