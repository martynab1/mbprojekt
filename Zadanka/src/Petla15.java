import java.io.*;

public class Petla15 {
    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Podaj nazwę pliku do odczytu: ");
            String inputFile = reader.readLine();
            System.out.print("Podaj nazwę pliku do zapisu: ");
            String outputFile = reader.readLine();


            BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
            String line;
            StringBuilder content = new StringBuilder();


            while ((line = fileReader.readLine()) != null) {
                content.append(line.toUpperCase()).append("\n");
            }
            fileReader.close();


            FileWriter fileWriter = new FileWriter(outputFile);
            fileWriter.write(content.toString());
            fileWriter.close();

            System.out.println("Zawartość pliku " + inputFile + " została zapisana w pliku " + outputFile + " w wersji wielkich liter.");
        } catch (IOException e) {
            System.err.println("Błąd odczytu/zapisu plików: " + e.getMessage());
        }
    }
    }

