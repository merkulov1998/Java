package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        File[] files = new File[10];

        File dir = new File("src/output"); //path указывает на директорию
        List<File> lst = new ArrayList<>();
        for ( File file : dir.listFiles() ){
            if ( file.isFile() )
                lst.add(file);
        }
        */
        File dir = new File("src/input");
        List<File> lst = new ArrayList<>();
        for ( File file : dir.listFiles() ){
            if ( file.isFile() )
                lst.add(new File(file.getName()));
            System.out.println(file.getName());
        }

        int count = 0;
        String s= null;
        List<String> list = new ArrayList<>();
        int c;
        for(File name:lst){
            FileReader in = new FileReader("src/input/"+name);
            BufferedReader br = new BufferedReader(in);
            while ((s=br.readLine())!=null) {
                list.add(s+"\n");
                count++;
            }

            br.close();
            if(count<=10){
                System.out.println("Error");
            }else{
                FileWriter out = new FileWriter("src/output/"+name);
                for (String value : list) {
                    out.write(value);
                }
                out.flush();
                out.close();
            }
        }
    }
}
