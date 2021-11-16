package processCommand;
import operations.*;

public class processCommand {
    public static void readCommand(String line){
        String [] splitLine = line.split(" ");
        if (splitLine[0].compareTo("sum") == 0){
            System.out.println(operations.sum(Float.parseFloat(splitLine[1]), Float.parseFloat(splitLine[2])));
        }
        else if (splitLine[0].compareTo("minus") == 0){
            System.out.println(operations.minus(Float.parseFloat(splitLine[1]), Float.parseFloat(splitLine[2])));
        }
        else if (splitLine[0].compareTo("multiply") == 0){
            System.out.println(operations.multiply(Float.parseFloat(splitLine[1]), Float.parseFloat(splitLine[2])));
        }
        else if (splitLine[0].compareTo("div") == 0){
            System.out.println(operations.div(Float.parseFloat(splitLine[1]), Float.parseFloat(splitLine[2])));
        }
        else if (splitLine[0].compareTo("root") == 0){
            System.out.println(operations.root(Float.parseFloat(splitLine[1]), Float.parseFloat(splitLine[2])));
        }
        else if (splitLine[0].compareTo("raise") == 0){
            System.out.println(operations.raise(Float.parseFloat(splitLine[1]), Float.parseFloat(splitLine[2])));
        }
    }
}
