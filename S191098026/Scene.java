package S191098026;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.URL;

import S191098026.classloader.SteganographyClassLoader;

public class Scene {

    public static void main(String[] args) throws Exception {

        Line line = new Line(7);
        line.put(Gourd.ONE, 6);
        line.put(Gourd.TWO, 3);
        line.put(Gourd.THREE, 1);
        line.put(Gourd.FOUR, 5);
        line.put(Gourd.FIVE, 2);
        line.put(Gourd.SIX, 4);
        line.put(Gourd.SEVEN, 0);

        Geezer theGeezer = Geezer.getTheGeezer();

        SteganographyClassLoader loader = new SteganographyClassLoader(
                new URL("https://raw.githubusercontent.com/jwork-2021/jw03-Direction-cy/main/S191098026.BubbleSorter.png"));

        Class c = loader.loadClass("S191098026.BubbleSorter");

        Sorter sorter = (Sorter) c.newInstance();

        //Sorter sorter = new MergeSorter();

        theGeezer.setSorter(sorter);

        String log = theGeezer.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
