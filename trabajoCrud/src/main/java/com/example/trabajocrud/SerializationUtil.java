package com.example.trabajocrud;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationUtil {

    public static void serialize(ObservableList<Person> personData, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new ArrayList<Person>(personData));
        oos.close();
    }

    public static ObservableList<Person> deserialize(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Person> people = (List<Person>) ois.readObject();
        ois.close();
        return FXCollections.observableArrayList(people);
    }
}
