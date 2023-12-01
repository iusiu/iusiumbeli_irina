package homework_nr_16;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File firstFile = new File("src/main/java/homework_nr_16/fileDirectory/input.txt");

        Person p1 = new Person("John", 25, 85.5f);
        Person p2 = new Person("Alice", 28, 92.0f);
        Person p3 = new Person("Bob", 22, 75.5f);
        Person p4 = new Person("Eve", 30, 88.5f);
        Person p5 = new Person("Charlie", 27, 80.0f);

        FileWriter fw1 = new FileWriter(firstFile);

        fw1.write(p1 + " \n");
        fw1.write(p2 + " \n");
        fw1.write(p3 + " \n");
        fw1.write(p4 + " \n");
        fw1.write(p5 + " \n");

        fw1.close();

        //Buffered reading the firstFile
        System.out.println("---------Buffered reading from the firstFile-----------");

        FileReader fr1 = new FileReader(firstFile);
        BufferedReader br1 = new BufferedReader(fr1);
        String[] splittedString;
        String bufferString;
        float sum = 0f;
        float minimum = 10000f;
        float maximum = 0f;
        String nameMin = null;
        String nameMax = null;

        while (true) {
            bufferString = br1.readLine();
            if (bufferString == null) {
                break;
            } else {
                splittedString = bufferString.split(",");
                sum += Float.parseFloat(splittedString[2]);
                System.out.println(bufferString);
            }
            if (minimum > Float.parseFloat(splittedString[1])) {
                minimum = Float.parseFloat(splittedString[1]);
                nameMin = splittedString[0];
            }

            if (maximum < Float.parseFloat(splittedString[1])) {
                maximum = Float.parseFloat(splittedString[1]);
                nameMax = splittedString[0];
            }

        }

        fr1.close();
        br1.close();

        File secondFile = new File("src/main/java/homework_nr_16/fileDirectory/output.txt");
        FileWriter fw2 = new FileWriter(secondFile);

        fw2.write("Cредний балл: " + sum/5 + " \n");
        fw2.write("Самый молодой человек:" + nameMin + " (Возраст: " + minimum + ")" + " \n");
        fw2.write("Самый старший человек:" + nameMax + " (Возраст: " + maximum + ")" + " \n");

        fw2.close();

    }
    }

