package com.pruebaCSV;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.CSVReader;
import java.nio.file.FileSystemNotFoundException;

public class LectorCSV {
    public static void main(String[] args){
        try{
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila = null;
            while((fila = csvReader.readNext() != next)){
                System.out.println(fila[0] + "|" +fila[1] + "|" + fila[2]);

            }
            csvReader.close();
        }
    }
}
