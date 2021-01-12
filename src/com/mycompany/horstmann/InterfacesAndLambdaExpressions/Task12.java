package com.mycompany.horstmann.InterfacesAndLambdaExpressions;

import java.io.File;

public class Task12 {
    String[] lsFilesOfExtension(String pathName, String ext) {
        File file = new File(pathName);

        return file.list((File directory, String name) -> {
            String[] nameArr = name.split("\\.");
            if (nameArr.length == 0) {
                return false;
            }

            return nameArr[nameArr.length - 1].equals(ext);
        });
    }
}
