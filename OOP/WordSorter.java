import java.util.Arrays;

import java.util.Scanner;

 

 

public class WordSorter {

     

  public static void main(String[] args) {

    String sentence = new Scanner(System.in).nextLine();

    String[] arr /*arr like a pirate*/ = new String[sentence.length() + 1];

    Arrays.fill(arr, "");

    for(String word : sentence.split("[^a-zA-Z'\\-]+")) {arr[word.length()] += word + " ";}

    for(String s : arr) {System.out.print(s);}

    System.out.println();

  }


}
