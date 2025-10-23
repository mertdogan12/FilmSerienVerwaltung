package de.dogan.filmSerienVerwaltung.util;

import java.io.*;

public final class SaveUtil {
    private SaveUtil() {}

    public static void writeObject(Object object, String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(object);
        }
    }

    public static Object readObject(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return ois.readObject();
        }
    }
}
