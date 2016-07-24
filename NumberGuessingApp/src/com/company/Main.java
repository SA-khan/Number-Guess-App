
        package com.company;
        import java.util.Random;
        import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                // write your code here
                int count = 0;

                do{

                    Random com_guess = new Random();
                    int com = 1+com_guess.nextInt(9);
                    Scanner text = new Scanner(System.in);
                    System.out.println(" Enter any number between 1 to 10");
                    int user = text.nextInt();
                    if(user == com){
                        System.out.println("You won..");
                        break;
                    }
                    else {
                        String tryAgain=null;
                        System.out.println(com + " choose the computer.");
                        if(count!=2){
                            System.out.println("Do you want to try again? y/n");
                            tryAgain = text.next();

                            if(tryAgain.equalsIgnoreCase("y")){
                                System.out.println(" Enter any number between 1 to 10");
                                user = text.nextInt();
                                if(user == com){
                                    System.out.println("You won..");
                                    count++;
                                    break;
                                }
                                else {

                                    System.out.println(com + " choose the computer.");
                                    count++;
                                }

                            }
                            else {
                                count=2;
                            }
                        }
                        else {
                            count=2;
                        }

                        count++;

                    }
                }while (count!=3);




            }
        }

