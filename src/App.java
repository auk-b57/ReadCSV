import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        // Path currentDir = Paths.get("./pyramids.csv");
        // System.out.println(currentDir.toAbsolutePath().toString());
        PyramidDao p_handler = new PyramidDaoImpl("./pyramids.csv");
        System.out.println(p_handler.getAllPyramids().size());
        int i = 0;
        for (Pyramid p : p_handler.getAllPyramids()) {
            System.out.println("#" + i++ + " " + p);
        }
        Collections.sort(p_handler.getAllPyramids(), new PyramidHeightComparator());
        for (Pyramid p : p_handler.getAllPyramids()) {
            System.out.println(p.getHeight() + " -> " + p.getModern_name());
        }

        System.out.println(p_handler.getNoPyramidsPerSite());
    }
}
