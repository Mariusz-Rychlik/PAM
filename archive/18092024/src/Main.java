//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.lang.Math;

import static java.lang.Math.floor;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\Mariusz\\Downloads\\Dane_2205\\liczby.txt");
            Scanner myReader = new Scanner(myObj);
            Scanner lineReader = new Scanner(myObj);
            int firstPal = 0;
            int palNum = 0;
            int NumCopy = 0;
            int NumCopy2 = 0;
            int rozkladNumCopy = 0;
            int rozkladDiffNumCopy = 0;
            int[] nums = new int[200];
            int k = 0;
            int threes = 0;
            int fives = 0;
            PrintWriter myWriter = new PrintWriter("trojki.txt","UTF-8");
            while(lineReader.hasNextLine()){
                nums[k] = Integer.parseInt(lineReader.nextLine());
                k++;
            }
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                char[] dataChar = data.toCharArray();
                int number = Integer.parseInt(data);

                int number1 = number;
                int number2 = number;
                int rozklad = 2;
                int rozkladNum = 0;
                int rozkladDiff = 2;
                int rozkladDiffNum = 0;
                // zadanie 41
                if (dataChar[0]==dataChar[dataChar.length-1]) {
                    if (palNum==0){
                        firstPal=number;
                    }
                    palNum = palNum+1;
                }
                // zadanie 42
                while(number1>1){
                    if (number1%rozklad==0){
                        number1/=rozklad;
                        rozkladNum++;
                    }
                    else{
                        rozklad++;
                    }
                }
                while (number2>1){
                    if (number2%rozkladDiff==0){
                        number2/=rozkladDiff;
                        rozkladDiffNum++;
                        rozkladDiff++;
                    }
                    else{
                        rozkladDiff++;
                    }
                    if(number2%rozkladDiff==number2){
                        break;
                    }
                }
                if (rozkladNum>rozkladNumCopy){
                    NumCopy=number;
                    rozkladNumCopy=rozkladNum;
                }
                if (rozkladDiffNum>rozkladDiffNumCopy){
                    NumCopy2=number;
                    rozkladDiffNumCopy=rozkladDiffNum;
                }

            }
            // zadanie 43
            for (int i = 0; i < 200; i++) {
                int a = nums[i];
                for (int j = 0; j < 200; j++) {
                    int b = nums[j];
                    for (int l = 0; l < 200; l++) {
                        int c = nums[l];
                        if (b%a==0 && c%b==0 && a!=b && a!=c && b!=c){
                            threes++;
                            myWriter.println(a+" "+b+" "+c);
                            for (int m=0; m<200; m++){
                                int d = nums[m];
                                for (int n=0; n<200; n++){
                                    int e = nums[n];
                                    if (d%c==0 && e%d==0 && c!=d && e!=c && d!=e && a!=d && b!=d && b!=e && a!=e){
                                        fives++;
                                    }
                                }
                            }
                        }

                    }
                }
            }
            System.out.println("Zadanie 4.1");
            System.out.println(firstPal);
            System.out.println(palNum);
            System.out.println();
            System.out.println();
            System.out.println("Zadanie 4.2");
            System.out.println(NumCopy);
            System.out.println(rozkladNumCopy);
            System.out.println(NumCopy2);
            System.out.println(rozkladDiffNumCopy);
            System.out.println();
            System.out.println("Zadanie 4.3");
            System.out.println(threes);
            System.out.println(fives);
            myWriter.close();
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}