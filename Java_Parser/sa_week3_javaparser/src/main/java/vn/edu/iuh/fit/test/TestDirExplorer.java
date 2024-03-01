package vn.edu.iuh.fit.test;

import vn.edu.iuh.fit.parser.DirExplorer;

import java.io.File;
public class TestDirExplorer {
    /*
        test DirExplorer
     */
    public static void main(String[] args) {
        File projectDir = new File("../");

        new DirExplorer(
                (level, path, file) -> path.endsWith(".java"),
                (level, path,file) -> System.out.println(path)
        ).explore(projectDir);

    }
}
