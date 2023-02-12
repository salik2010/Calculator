import javax.naming.NameClassPair;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите пример: ");
        Scanner scanner=new Scanner(System.in);
        String in=scanner.nextLine();
        calc(in);
    }
     public static String calc(String input){
         //boolean proverkaRim=false;
         String a;
         String b;
         int a1;
         int b1;
         int c1;
         int aPerevod=-1;
         int bPerevod=-1;
         int index;
         String c="";
         boolean proA=true;
         boolean proB=true;
         if (input.contains("+")){
             String[] strings = input.split("\\+");
             a=strings[0].trim();
             b=strings[1].trim();
             if (strings.length>2){
                 try {
                     throw new Exception();
                 }
                 catch (Exception e){
                     System.out.println("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор");
                     return null;
                 }
             }
             System.out.println(c);
             for (RimChisla element: RimChisla.values()){

                 if (a.equalsIgnoreCase(element.getRim())){
                     aPerevod= element.getTranslate();
                     proA=false;

                 }
                 if (b.equalsIgnoreCase(element.getRim())){
                     bPerevod=element.getTranslate();
                     proB=false;
                 }
             }
             if (aPerevod>=0&&bPerevod>=0){
                if ((aPerevod>10||aPerevod<0)||(bPerevod>10||bPerevod<0)){
                    try {
                        throw new Exception();
                    }
                    catch (Exception e){
                        System.out.println("Не подходят числа по условию");
                    }
                    return null;
                }
                 index=aPerevod+bPerevod;
                 System.out.println(RimChisla.values()[index-1]);
             }
             if (proA==false&&proB==true||proA==true&&proB==false){
                 try {
                    throw new Exception();
                 }
                 catch (Exception e){
                     System.out.println("т.к. используются одновременно разные системы счисления");
                 }
             }
             if (proA&&proB){
                try {
                    a1=Integer.parseInt(a);
                    b1=Integer.parseInt(b);

                }
                 catch (NumberFormatException e){

                     System.out.println("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор");
                     return null;
                 }

                 if ((a1>10||a1<0)||(b1>10||b1<0)){
                     try {
                         throw new Exception();
                     }
                     catch (Exception e){
                         System.out.println("Не подходят числа по условию");
                     }
                     return null;
                 }
                 c1=a1+b1;
                 c=Integer.toString(c1);
             }
         }
         else if (input.contains("-")){
             String[] strings = input.split("-");
             a=strings[0].trim();
             b=strings[1].trim();
             if (strings.length>2){
                 try {
                     throw new Exception();
                 }
                 catch (Exception e){
                     System.out.println("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор");
                     return null;
                 }
             }
             for (RimChisla element: RimChisla.values()){
                 if (a.equalsIgnoreCase(element.getRim())){
                     aPerevod= element.getTranslate();
                     proA=false;

                 }
                 if (b.equalsIgnoreCase(element.getRim())){
                     bPerevod=element.getTranslate();
                     proB=false;
                 }
             }
             if (aPerevod>=0&&bPerevod>=0){
                 if ((aPerevod>10||aPerevod<0)||(bPerevod>10||bPerevod<0)){
                     try {
                         throw new Exception();
                     }
                     catch (Exception e){
                         System.out.println("Не подходят числа по условию");
                     }
                     return null;
                 }
                 index=aPerevod-bPerevod;
                 if (index<=0){
                     try {
                         throw new Exception();
                     }
                     catch (Exception e){
                         System.out.println("в римской системе нет отрицательных чисел или нуля");
                         return null;
                     }
                 }
                 System.out.println(RimChisla.values()[index-1]);
             }
             if (proA==false&&proB==true||proA==true&&proB==false){
                 try {
                     throw new Exception();
                 }
                 catch (Exception e){
                     System.out.println("т.к. используются одновременно разные системы счисления");
                 }
             }
             if (proA&&proB){
                 a1=Integer.parseInt(a);
                 b1=Integer.parseInt(b);
                 if ((a1>10||a1<0)||(b1>10||b1<0)){
                     try {
                         throw new Exception();
                     }
                     catch (Exception e){
                         System.out.println("Не подходят числа по условию");
                     }
                     return null;
                 }
                 c1=a1-b1;
                 c=Integer.toString(c1);
             }
         }
         else if (input.contains("*")){
             String[] strings = input.split("\\*");
             a=strings[0].trim();
             b=strings[1].trim();
             if (strings.length>2){
                 try {
                     throw new Exception();
                 }
                 catch (Exception e){
                     System.out.println("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор");
                     return null;
                 }
             }
             for (RimChisla element: RimChisla.values()){
                 if (a.equalsIgnoreCase(element.getRim())){
                     aPerevod= element.getTranslate();
                     proA=false;
                 }
                 if (b.equalsIgnoreCase(element.getRim())){
                     bPerevod=element.getTranslate();
                     proB=false;
                 }
             }
             if (aPerevod>=0&&bPerevod>=0){
                 if ((aPerevod>10||aPerevod<0)||(bPerevod>10||bPerevod<0)){
                     try {
                         throw new Exception();
                     }
                     catch (Exception e){
                         System.out.println("Не подходят числа по условию");
                     }
                     return null;
                 }
                 index=aPerevod*bPerevod;
                 System.out.println(RimChisla.values()[index-1]);
             }
             if (proA==false&&proB==true||proA==true&&proB==false){
                 try {
                     throw new Exception();
                 }
                 catch (Exception e){
                     System.out.println("т.к. используются одновременно разные системы счисления");
                 }
             }
             if (proA&&proB){
                 a1=Integer.parseInt(a);
                 b1=Integer.parseInt(b);
                 if ((a1>10||a1<0)||(b1>10||b1<0)){
                     try {
                         throw new Exception();
                     }
                     catch (Exception e){
                         System.out.println("Не подходят числа по условию");
                     }
                     return null;
                 }
                 c1=a1*b1;
                 c=Integer.toString(c1);
             }
         }
         else if (input.contains("/")){
             String[] strings = input.split("/");
             a=strings[0].trim();
             b=strings[1].trim();
             if (strings.length>2){
                 try {
                     throw new Exception();
                 }
                 catch (Exception e){
                     System.out.println("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор");
                     return null;
                 }
             }
             for (RimChisla element: RimChisla.values()){
                 if (a.equalsIgnoreCase(element.getRim())){
                     aPerevod= element.getTranslate();
                     proA=false;

                 }
                 if (b.equalsIgnoreCase(element.getRim())){
                     bPerevod=element.getTranslate();
                     proB=false;
                 }
             }
             if (aPerevod>=0&&bPerevod>=0){
                 if ((aPerevod>10||aPerevod<0)||(bPerevod>10||bPerevod<0)){
                     try {
                         throw new Exception();
                     }
                     catch (Exception e){
                         System.out.println("Не подходят числа по условию");
                     }
                     return null;
                 }
                 index=aPerevod/bPerevod;
                 System.out.println(RimChisla.values()[index-1]);
             }
             if (proA==false&&proB==true||proA==true&&proB==false){
                 try {
                     throw new Exception();
                 }
                 catch (Exception e){
                     System.out.println("т.к. используются одновременно разные системы счисления");
                 }
             }
             if (proA&&proB){
                 a1=Integer.parseInt(a);
                 b1=Integer.parseInt(b);
                 if ((a1>10||a1<0)||(b1>10||b1<0)){
                     try {
                         throw new Exception();
                     }
                     catch (Exception e){
                         System.out.println("Не подходят числа по условию");
                     }
                     return null;
                 }
                 c1=a1/b1;
                 c=Integer.toString(c1);
             }
         }
         else {
             try {
                 throw new Exception();
             }
             catch (Exception e){
                 System.out.println("формат математической операции не удовлетворяет заданию");
             }
         }
         System.out.println(c);
        return c;
     }
}
