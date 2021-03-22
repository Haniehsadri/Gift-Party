package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" input the number of participants :");
        int numberofparticipants= input.nextInt();
        String[] array = new String[numberofparticipants];
        int[] money  = new int[numberofparticipants];
        System.out.println(" input the name of participants : ");
        for (int i = 0; i <numberofparticipants ; i++) {

            String names = input.next();
            array[i] = names;}

        for (int i = 0; i < numberofparticipants ; i++){
            System.out.println(" input the name of the giftgiver :");
            String giftgiver = input.next();

            System.out.println(" enter the value of gift and number of gift receivers  :");
            int valueofgift=input.nextInt();
            int numberofgiftreceivers=input.nextInt();
            int numberofaray=Main.Search(array,giftgiver);
            money[numberofaray]-=valueofgift;
            System.out.println(" enter the name of giftreceivers :");
            for(int j = 0; j<numberofgiftreceivers;j++){
                //   System.out.println(" asami hedye girandeha ra vared konid ");
                String hedyegirande=input.next();
                money[Main.Search(array,hedyegirande)]+=(int)valueofgift/numberofgiftreceivers;
            }


        }

        Main.print(array,money);
    }






    public static int Search(String[] array, String name){
        for(int i=0 ;i<array.length;i++){
            if(array[i].equals(name)){
                return i;
            }
        }

        return -1;
    }
    public static void print (String[] array, int [] pol){
        for (int i=0 ;i<array.length;i++){
            System.out.printf("moneyof  %s=%d  ", array[i],pol[i]);
        }
    }
}
