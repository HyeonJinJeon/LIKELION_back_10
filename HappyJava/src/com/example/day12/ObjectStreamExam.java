package com.example.day12;

import java.io.*;

public class ObjectStreamExam {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 26);

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/com/example/day12/text/person.txt"))) {
            out.writeObject(person);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Person readPerson = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/com/example/day12/text/person.txt"))) {
            readPerson = (Person) in.readObject();
            System.out.println(readPerson);
            System.out.println(readPerson.getName());
            System.out.println(readPerson.getAge());
            readPerson.setName("Jeon");
            System.out.println(readPerson.getName());
            System.out.println(readPerson.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
