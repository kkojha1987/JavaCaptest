

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RollofDice {

	public static void main(String[] args) {
        try {
            
            BufferedReader br=new BufferedReader(new FileReader("d:\\dice.txt"));
            String line;
            String sline[];
            int doubles=0;
              try {
                while((line=br.readLine())!=null){
                    //System.out.println(line);
                    sline=line.split(" ");
                        if(sline[0].equals(sline[1])){
                       // System.out.println("the roll of die matches");
                        doubles++;
                    }
                }
                System.out.println("Total doubles rolled:- "+doubles);
            } catch (IOException ex) {
                Logger.getLogger(RollofDice.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RollofDice.class.getName()).log(Level.SEVERE, null, ex);
        }


	}

}
