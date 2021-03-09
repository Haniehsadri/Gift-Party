package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" tedad afrad mored nazar ra vared konid :");
        int tedad = input.nextInt();
        String[] array = new String[tedad];
        int[] pol = new int[tedad];
        System.out.println(" asami sherkatkonandegan ra vared konid : ");
        for (int i = 0; i <tedad ; i++) {

            String asami = input.next();
            array[i] = asami;}

        for (int i = 0; i < tedad ; i++){
            System.out.println(" esm hedye dahande ra vared konid :");
            String hedyedahande = input.next();

            System.out.println(" meghdar pol hedeye va tedad afrad ra vared konid  :");
            int meghdarpol=input.nextInt();
            int tedadafradhedyedahnde=input.nextInt();
            int shomarearraye=Main.Search(array,hedyedahande);
            pol[shomarearraye]-=meghdarpol;
            System.out.println(" asami hedye girandeha ra vared konid :");
            for(int j = 0; j<tedadafradhedyedahnde;j++){
                //   System.out.println(" asami hedye girandeha ra vared konid ");
                String hedyegirande=input.next();
                pol[Main.Search(array,hedyegirande)]+=(int)meghdarpol/tedadafradhedyedahnde;
            }


        }

        Main.print(array,pol);
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
            System.out.printf("meghdar pol %s=%d  ", array[i],pol[i]);
        }
    }
}
