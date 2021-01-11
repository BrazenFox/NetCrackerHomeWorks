package com.mycompany.horstmann.InterfacesAndLambdaExpressions;

import java.io.File;
import java.io.FileFilter;

public class Task11 {

    public File[] ls(String pathname) {
        File file = new File(pathname);
        return file.listFiles(f -> f.isDirectory());
    }

    public File[] lsMethodExpression(String pathname) {
        File file = new File(pathname);
        return file.listFiles(File::isDirectory);
    }

    public File[] lsAnonymousClass(String pathname) {
        File file = new File(pathname);
        return file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
    }
}
