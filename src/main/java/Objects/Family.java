package Objects;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Family {
    List<Person> familyList;

    public Family() {
        this.familyList = new ArrayList<Person>();
    }

    public Family(String pathToJson) {
        this.familyList = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        Path path = Paths.get(pathToJson);
        try {
            String familyListString = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
            this.familyList = mapper.readValue(familyListString, new TypeReference<List<Person>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addPerson(Person person) {
        this.familyList.add(person);
    }

    public void printAsIs() {
        System.out.println("List of family's members: ");
        System.out.println(familyList);
    }

    public void printSorted() {
        Collections.sort(familyList);
        System.out.println("Sorted list of family's members: ");
        for (Person person : familyList)
            System.out.println(person);
    }
}

