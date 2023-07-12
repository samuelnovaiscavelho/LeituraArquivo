package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static void main(String[] args) {
        //Caminho do diretorio do arquivo
        String filePath = "C:/arquivo/string.txt";

        // Ocorre a leitura de um arquivo de texto linha por linha com laço de repetição e armazena na váriavel content
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            StringBuilder content = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
            }

            bufferedReader.close();
            System.out.println("Frase Original: " + content);

            // Inverter o conteúdo letra por letra
            String invertedContent = content.reverse().toString();

            // Imprimir o conteúdo invertido
            for (char c : invertedContent.toCharArray()) {

                System.out.println("Saída padrão: " + c);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

