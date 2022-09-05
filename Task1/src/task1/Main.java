package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        File dir = new File("src/input");
        List<File> lst = Arrays.asList(dir.listFiles());


        List<String> list = new ArrayList<>();
        for(File file:lst){
            FileReader in = new FileReader(file);
            BufferedReader br = new BufferedReader(in);
            String s= null;
            while ((s=br.readLine())!=null) {
                list.add(s+"\n");
            }
            System.out.println(list);
            br.close();
            if(list.size()>10){
                FileWriter out = new FileWriter("src/output/"+file.getName());
                for (String value : list) {
                    out.write(value);
                }
                out.flush();
                out.close();
            }else{
                System.out.println("Error");
            }
            list.clear();
        }
    }
}
