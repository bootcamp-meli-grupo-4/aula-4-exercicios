package luiz.aula3.ex2;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class MyFactory {

    private static MyFactory myFactory;

    private static Map<String, Object> objects;

    private MyFactory() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        objects = new HashMap<>();

        String path = new File("").getAbsolutePath() +
                "/src/resources/MyFactory.properties";
        FileReader fileReader = new FileReader(path);
        BufferedReader lineReader = new BufferedReader(fileReader);

        String line = null;
        while ((line = lineReader.readLine()) != null) {
            String[] lineSplitted = line.split("=");
            String key = lineSplitted[0];
            String classPackage = lineSplitted[1];
            Sorter sorter = (Sorter) Class.forName(classPackage).getDeclaredConstructor().newInstance();
            objects.put(key, sorter);
        }

        lineReader.close();
        fileReader.close();
    }

    public static MyFactory createInstance() {
        if(myFactory == null) {
            try {
                myFactory = new MyFactory();
            } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                System.out.printf("Falha ao carregar instancias %s \n.", e.getMessage());
            }
        }
        return myFactory;
    }

    public static Object getInstance(String objName) {
        if(objects == null) return null;

        return objects.getOrDefault(objName, null);
    }
}
