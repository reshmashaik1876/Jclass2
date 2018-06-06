package com.raven.jclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jclass {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
        int sentenceCount = 0;
        String sentenceLength;
        int wordCount = 0;
        int position = 0;
        

        System.out.print("Please type the file you want to read in: ");
        String fileName = sc.nextLine();
        // reads the file through the path or else we can provide the file name. Defaultly it checks the root folder for the file
        File textFile = new File("C:\\Users\\S528761\\Documents\\NetBeansProjects\\Shaik_Readability\\src\\readability\\" + fileName);
        sc.close();

        //To Count how many lines in the text file we are using the while loop to iterate and scanner class to read the input file
        Scanner sentenceScan = new Scanner(textFile);
        while (sentenceScan.hasNextLine())
        {
        sentenceLength=sentenceScan.nextLine();
            for(int i=0;i<sentenceLength.length();i++)
            {
                if(sentenceLength.charAt(i)=='.'||sentenceLength.charAt(i)=='?'||sentenceLength.charAt(i)=='!')
                {
                sentenceCount++;
                }
            }
        } //end of while loop
        sentenceScan.close(); //Close the linescan Scanner

        //To Count how many words in the sentences for that we are using the while loop and scanner class to read the input file
        Scanner wordScan = new Scanner(textFile);
        while(wordScan.hasNext()) //It iterates until the another token is not found.
        {
        wordCount++;//Incrementing the word count
        wordScan.next();
        }//end of while loop
        wordScan.close(); //close the wordscan Scanner
        //System.out.println("Lines " +lineCount + "/n "+ "Words " +  wordCount);
        
        //Number of palindrome words
        int palindromeCount = 0;
        Scanner palindrome = new Scanner(textFile);
        while(palindrome.hasNext()) //It iterates until the another token is not found.
        {
        	String s = palindrome.next();
    		String r[] = s.split("");
    		String x[] = null ;
    			for(int i=r.length-1;i>=0;i--) {
    				x[i] = r[i];
    			}
    		
        palindrome.next();
        }//end of while loop
        palindrome.close();

        
	}
}
