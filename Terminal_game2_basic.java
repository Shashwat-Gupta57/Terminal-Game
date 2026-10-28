import java.util.Scanner;

public class Terminal_game2_basic
{
    public static void main(String args[])
    {
        Scanner j = new Scanner(System.in);

        String spawn = "30";//variable used for taking input from the user about the above program

        String GamerTag = "";

        int spawn_int = 0;//variable used to store the value of spawn after converting to int if it iis only digits 

        System.out.print("\u000C");//command used to clear the terminal window

        int counter = 0;// counter used to temporarily check the distance from the left ending line

        int a = 0;//variable used to ensure that the animation is not shown in the first summon

        int b = 30;//variable used to store the value of the last spawn

        int stepsize = 3;//constant used to set the distance between two consecutive animation frames

        int turn = 1;//variable used to switch between animation leg movements

        int stepmul = 0;//variable used to multiply te value of stepsize when adding or subtracting it from the variable temp

        int temp = 0;//variable used to store the value of spawn for temporary arithmetic operations to be done on the spawn value using stepsize

        int percentage_complete = 0;

        long speed = 200;//variable used to check the timepass variable

        String title_opt = "";

        boolean title_comp = false;//variable used to check if the user has filled in correct keyword in the title screen

        boolean loading_agree = true;

        boolean resumed = false;//variable used to check if user wants to go back in the main game

        boolean action = false;

        String pause_input = "";

        //title screen beginning from here   

        do
        {
            System.out.print("\u000C");
            for(int l = 0;l < 140;l++)//design above the title screen
            {
                System.out.print("~");
            }
            for(int l = 0; l < 12;l++)
            {
                System.out.println("");
            }
            for(int i = 0;i < 50;i++)
            {
                System.out.print(" ");
            }

            System.out.println("TYPE \"play\" TO START THE GAME");
            System.out.println("");
            System.out.println("");
            for(int i = 0;i < 50;i++)
            {
                System.out.print(" ");
            }
            System.out.println("TYPE \"setings\" TO OPEN SETTINGS");
            System.out.println("");
            System.out.println("");
            for(int i = 0;i < 51;i++)
            {
                System.out.print(" ");
            }
            System.out.println("TYPE \"exit\" TO EXIT THE GAME");
            for(int l = 0;l < 15;l++)
            {
                System.out.println("");
            }
            for(int l = 0;l < 150;l++)//design below the title screen
            {
                System.out.print("~");
            }

            title_opt = j.next();
            if(title_opt.equals("settings"))//the code in this block is for the loading screen to be built
            {
                System.out.println("\u000C");
                for(int l = 0;l < 10;l++)
                {
                    System.out.println("");
                }
                for(int i = 0;i < 45;i++)
                {
                    System.out.print(" ");
                }
                System.out.println("TYPE \"speed\" FOR CUSTOMIZING THE ANIMATION SPEED\n\n");
                for(int i = 0;i < 45;i++)
                {
                    System.out.print(" ");
                }
                System.out.println("TYPE \"loading\" FOR CUSTOMIZING THE LOADING SCREEN\n\n");
                for(int i = 0;i < 42;i++)
                {
                    System.out.print(" ");
                }
                System.out.println("TYPE \"info\" FOR SEEING ALL THE INPUT-RELATED INFORMATION\n\n");
                for(int i = 0;i < 59;i++)
                {
                    System.out.print(" ");
                }
                System.out.println("TYPE \"back\" TO GO BACK");
                title_opt = j.next();

                if(title_opt.equals("speed"))//code for setting the anmation speed
                {
                    System.out.println("enter the speed of animation \n as slow for 0.5x \n normal for 1x and fast for 2x");
                    String speed_check = j.next();
                    if(speed_check.equals("slow"))
                    {
                        System.out.println("\u000C");
                        speed = speed*2;

                    }
                    else if(speed_check.equals("normal"))
                    {

                        System.out.println("\u000C");

                    }
                    else if(speed_check.equals("fast"))
                    {
                        speed = speed/2;
                        System.out.println("\u000C");

                    }
                    else
                    {
                        System.out.println("invalid speed entered , too fast");

                        try
                        {
                            Thread.sleep(7000);
                        }
                        catch (InterruptedException ie)
                        {
                            ie.printStackTrace();
                        }

                        System.exit(0);
                    }
                    break;

                }
                else if(title_opt.equals("loading"))
                {
                    System.out.println("\u000C");
                    for(int l = 0;l < 14;l++)
                    {
                        System.out.println("");
                    }
                    for(int l = 0;l < 45;l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println("do you want to turn off loading screen ?\n\n");
                    for(int l = 0;l < 59;l++)
                    {
                        System.out.print(" ");
                    }

                    System.out.println("TYPE \"back\" TO GO BACK");
                    title_opt = j.next();
                    if(title_opt.equals("back"))
                    {
                        continue;
                    }
                    else if(title_opt.equals("yes"))
                    {
                        loading_agree = false;
                        System.out.println("\u000C");
                        for(int l = 0;l < 14;l++)
                        {
                            System.out.println("");
                        }
                        for(int l = 0;l < 45;l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("done....\n\n\n\n");
                        for(int l = 0;l < 45;l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("type back to go bact to start");
                        title_opt =j.next();
                        if(title_opt.equals("back"))
                        {
                            continue;
                        }
                        else
                        {
                            System.out.println("\u000C");
                            System.out.println("Invalid input entered");
                            try
                            {
                                Thread.sleep(7000);
                            }
                            catch(InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    }

                    else
                    {
                        System.out.println("\u000C");
                        System.out.println("Invalid input entered");
                        try
                        {
                            Thread.sleep(7000);
                        }
                        catch(InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                }
                else if(title_opt.equals("info"))
                {
                    System.out.println("\u000C");

                    System.out.println("YOU CAN TYPE \"exit\" AT ANY TIME");
                    System.out.print("TO COME OUT OF THE PROGRAM");
                    System.out.println("EXCEPT WHEN THE ANIMATION IS RUNNING");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("WHEN YOU TYPE RESTART,");
                    System.out.print("IT RESTARTS THE GAME AND SUMMONS THE PLAYER FROM THE TOP");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("TO SUCCESSFULLY START THE GAME AFTER THE ANIMATION");
                    System.out.println("YOU HAVE TO ENTER A NUMBER BUT NOT 30 AS IT IS IT'S SPAWN PLACE");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("WHEN YOU TYPE IN PAUSE , THE PAUSE SCREEN APPEARS");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("HASH-CODES");
                    System.out.println("");
                    System.out.println("\"#action#\" TURNS ON THE ACTION MODE");
                    System.out.println("\"#normal#\" TURNS OFF THE ACTION MODE");
                    System.out.println("\"#addPlayer#\" ADDS THE SECOND PLAYER");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("TYPE \"back\" TO GO BACK");
                    title_opt = j.next();
                    if(title_opt.equals("back"))
                    {
                        System.out.println("\u000C");
                        continue;
                    }
                }
            }
            else if(title_opt.equals("play"))
            {
                title_comp = true;
                int t,t2 = 0;//variables used to check the number of times the loading screen is refreshed
                System.out.println("\u000C");
                for(int l = 0;l < 14;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 55;l++)
                {
                    System.out.print(" ");
                }
                System.out.println("PLEASE ENTER YOUR GAMER TAG");
                j.nextLine();//consume line
                GamerTag = j.nextLine();

                for(int l = 0;l < 60;l++)
                {
                    System.out.print(" ");
                }
                System.out.println("GAMER TAG IS :"+GamerTag);
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                if(loading_agree == true)
                {
                    do
                    {

                        System.out.println("\u000C");

                        t = 0;
                        for(int l = 0;l < 10;l++)//leaving lines
                        {
                            System.out.println("");
                        }
                        System.out.println("");
                        for(int l = 0;l < 55;l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("LOADING... "+percentage_complete+"%");
                        for(int l = 0;l < 5;l++)
                        {
                            System.out.println("");
                        }

                        for(int l = 0;l < 70;l++)//leaving space
                        {
                            System.out.print(" ");
                        }
                        System.out.println("||");
                        for(int l = 0;l < 69;l++)//leaving space
                        {
                            System.out.print(" ");
                        }
                        System.out.println("\\||/");
                        for(int l = 0;l < 70;l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("\\/");
                        for(int l = 0;l < 20;l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.print("|");
                        for(int l = 0;l < 100;l++)
                        {
                            System.out.print("-");
                        }
                        System.out.println("|");
                        for(int l = 0;l < 20;l++)
                        {
                            System.out.print(" ");
                        }

                        System.out.print("|");
                        t2++;
                        do
                        {
                            System.out.print("~");
                            t++;
                            if(t == t2)
                            {
                                break;
                            }
                        }while(t < 100);
                        for(int t3 = 0;t3 < (100-t);t3++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("|");
                        for(int l = 0;l < 20;l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.print("|");
                        for(int l = 0;l < 100;l++)
                        {
                            System.out.print("-");
                        }
                        System.out.println("|");
                        try
                        {
                            Thread.sleep(30);
                        }
                        catch(InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                        percentage_complete++;
                        if(percentage_complete < 101)
                        {
                            System.out.println("\u000C");

                        }
                        if(percentage_complete == 101)
                        {
                            try
                            {
                                Thread.sleep(100);
                            }
                            catch(InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                            t = 200;
                        }

                    }while(t < 101);

                }
            }
            else if(title_opt.equals("exit"))
            {
                System.out.println("\u000C");
                for(int l = 0;l < 14;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 60;l++)
                {
                    System.out.print(" ");
                }
                System.out.println("PROGRAM CLOSED SUCCESSFULLY");

                System.exit(0);
            }
            else
            {
                System.out.println("\u000C");
                System.out.println("INVALID INPUT , PLEASE TRY AGAIN");
                try
                {
                    Thread.sleep(3000);

                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }while(title_comp == false);
        do
        {

            /*for(int i = 0;i < 25;i++)
            {
            System.out.println("");
            }
            System.out.println("type \"exit\" to exit the game    |"+"    press k to pick an object when you come within 2 space radius of the object");*/
            //the above was additional info that was displayed below the screen
            if(resumed == false)
            {
                if(a > 0)
                {
                    spawn = j.next();
                    if(spawn.equals("0"))
                    {
                        spawn = "4";
                    }
                    if(spawn.equals("1"))
                    {
                        spawn = "4";
                    }
                    if(spawn.equals("2"))
                    {
                        spawn = "4";
                    }
                    if(spawn.equals("3"))
                    {
                        spawn = "4";
                    }
                }
            }
            if(a == 0 && resumed == false)
            {
                spawn = "30";
            }
            if(resumed == true)
            {
                spawn = String.valueOf(b);
            }
            if(spawn.matches("\\d+"))
            {
                spawn_int = Integer.parseInt(spawn);
            }
            if(resumed == false && a == 0)// falling animation at the start
            {

                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/  \\");

                for(int l = 0;l < 15;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" ");
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 14;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" ");
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 13;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 12;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                counter = 0;
                for(int l = 0;l < 11;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = 2;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 10;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = 2;
                System.out.println("");
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 9;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = 2;
                System.out.println("");
                System.out.println("");
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 8;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = 2;
                System.out.println("");
                System.out.println("");
                System.out.println("");
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 7;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = 2;
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 6;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                counter = 2;
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 5;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                counter = 2;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 4;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                counter = 2;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                counter = 0;
                for(int l = 0;l < 2;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                counter = 2;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/+\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/   \\");
                for(int l = 0;l < 1;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(20);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                counter = 1;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("(^_^)");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/|\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/ | \\");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("I+I");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("I I");

                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                counter = 1;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("(^_^)");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/|\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/ | \\");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("I+I");
                counter = 0;

                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(55);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                counter = 1;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("(^_^)");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/|\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/ | \\");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|+|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("| |");

                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                counter = 1;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("(^_^)");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/|\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/ | \\");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|+|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("| |");
                for(int l = 0; l < 1;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(60);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("(^_^)");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/|\\");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("/ | \\");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|+|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("| |");
                for(int l = 0; l < 2;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(65);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("(^_^)");
                counter = 3;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("----|----");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|+|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("| |");
                for(int l = 0; l < 3;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(70);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("(^_^)");
                counter = 3;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("----|----");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|+|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("| |");
                for(int l = 0; l < 3;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(65);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                counter = 2;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|+|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("| |");
                for(int l = 0; l < 2;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(60);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                counter = 2;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|+|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("| |");
                for(int l = 0; l < 1;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                counter = 2;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\(^_^)/");
                counter = 1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("\\-|-/");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|+|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("| |");

                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(50);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

                counter = 1;

                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("(^_^)");
                counter = 3;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("----|----");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = -1;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("|+|");
                counter = 0;
                do
                {
                    System.out.print(" "); 
                    counter++;
                }while(counter <= spawn_int);
                System.out.println("| |");

                for(int l = 0;l < 100;l++)
                {
                    System.out.print("~~");
                }

                try
                {
                    Thread.sleep(67);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println("\u000C");
            }
            if(spawn.matches("\\d+"))
            {
                spawn_int = Integer.parseInt(spawn);
                System.out.println("\u000C");
                if(a == 0 && action == false)//fist time summoning
                {

                    System.out.println("\u000C");
                    for(int i = 0;i < 10;i++)
                    {
                        System.out.println("");
                    }

                    counter = 2;
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 1;
                    System.out.println("(^_^)");

                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 2;
                    System.out.println("/|\\");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 0;
                    System.out.println("/ | \\");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 1;
                    System.out.println("|");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 2;
                    System.out.println("/+\\");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 0;
                    System.out.println("/   \\");
                    a++;

                    for (int i = 0; i < 200; i++)
                    {
                        System.out.print("~");

                    }
                    System.out.println("");
                    for(int l = 0;l < (spawn_int+1);l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println("^");
                    for(int l = 0;l < (spawn_int - 3);l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(GamerTag);

                    resumed = false;
                    continue;
                }
                if(a == 0 && action == true)
                {
                    if (a == 0)//fist time summoning in action mode
                    {

                        System.out.println("\u000C");
                        for(int i = 0;i < 10;i++)
                        {
                            System.out.println("");
                        }
                        counter = 2;
                        do {
                            System.out.print(" ");
                            counter++;
                        } while (counter <= spawn_int);
                        counter = 1;
                        System.out.println("(\\-/)");

                        do {
                            System.out.print(" ");
                            counter++;
                        } while (counter <= spawn_int);
                        counter = 2;
                        System.out.println("/|\\");
                        do {
                            System.out.print(" ");
                            counter++;
                        } while (counter <= spawn_int);
                        counter = 0;
                        System.out.println("/ | \\");
                        do {
                            System.out.print(" ");
                            counter++;
                        } while (counter <= spawn_int);
                        counter = 1;
                        System.out.println("|");
                        do {
                            System.out.print(" ");
                            counter++;
                        } while (counter <= spawn_int);
                        counter = 2;
                        System.out.println("/+\\");
                        do {
                            System.out.print(" ");
                            counter++;
                        } while (counter <= spawn_int);
                        counter = 0;
                        System.out.println("/   \\");
                        a++;

                        for (int l = 0; l < 1; l++) {
                            for (int i = 0; i < 200; i++) {
                                System.out.print("~");

                            }
                            System.out.println("");
                        }

                        for(int l = 0;l < (spawn_int+1);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("^");
                        for(int l = 0;l < (spawn_int - 3);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println(GamerTag);
                        resumed = false;
                        continue;
                    }
                }
                if (b > spawn_int && a > 0 && action == false)//the code in this block will be the animation for moving left or backwards
                {
                    int dif = b - spawn_int;
                    stepmul = dif / stepsize;
                    do {
                        temp = spawn_int;

                        for(int i = 0;i < 10;i++)
                        {
                            System.out.println("");
                        }
                        temp = temp + (stepsize * stepmul);
                        if (turn == 1) {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|>");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            turn++;
                            //stickAnim.run();
                            //System.out.println("");
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else if (turn == 2) {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("|>");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("| | |");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("|");

                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/ |");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else if (turn == 3) {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("|>");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/ | \\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/  \\");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("|>");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("| | |");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("| \\");
                            turn = 1;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        }

                        for(int l = 0;l < (temp+1);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("^");
                        for(int l = 0;l < (temp - 3);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println(GamerTag);
                        try {
                            Thread.sleep(speed);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        stepmul--;
                        System.out.println("\u000C");
                    } while (temp > spawn_int);
                }
                else if(b < spawn_int && a > 0 && action == false)//the code in this block will be the animation for moving right or straight
                {
                    int dif = spawn_int - b;
                    stepmul = dif / stepsize;
                    do {
                        temp = spawn_int;

                        for(int i = 0;i < 10;i++)
                        {
                            System.out.println("");
                        }
                        temp = temp - (stepsize * stepmul);
                        if (turn == 1) {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("<|");

                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else if (turn == 2) {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("<|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("| | |");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("| \\");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else if (turn == 3) {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("<|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/ | \\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("/\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/  \\");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("<|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("| | |");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("|");

                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);

                            counter = 2;
                            System.out.println("/|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/ |");
                            turn = 1;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        }

                        for(int l = 0;l < (temp+1);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("^");
                        for(int l = 0;l < (temp - 3);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println(GamerTag);
                        try {
                            Thread.sleep(speed);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        stepmul--;
                        System.out.println("\u000C");
                    } while (temp < spawn_int);
                }
                if (b > spawn_int && a > 0 && action == true)//the code in this block will be the animation for moving left or backwards in action mode
                {
                    int dif = b - spawn_int;
                    stepmul = dif / stepsize;
                    do {
                        temp = spawn_int;

                        for(int i = 0;i < 10;i++)
                        {
                            System.out.println("");
                        }
                        temp = temp + (stepsize * stepmul);
                        if (turn == 1) {
                            counter = 3;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("[>");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("\\======");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("/\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/  \\");
                            turn++;

                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else if (turn == 2) {
                            counter = 3;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("[>");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("\\======");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("\\");

                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("| \\");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else if (turn == 3) {
                            counter = 3;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("[>");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("\\======");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("||");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("||");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else {
                            counter = 3;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("[>");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("\\======");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("/|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/ |");
                            turn = 1;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        }

                        for(int l = 0;l < (temp+1);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("^");
                        for(int l = 0;l < (temp - 3);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println(GamerTag);
                        try {
                            Thread.sleep((speed/2));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        stepmul--;
                        System.out.println("\u000C");
                    } while (temp > spawn_int);
                }
                else if(b < spawn_int && a > 0 && action == true)//the code in this block will be the animation for moving right or straight in action mode
                {
                    int dif = spawn_int - b;
                    stepmul = dif / stepsize;
                    do {
                        temp = spawn_int;

                        for(int i = 0;i < 10;i++)
                        {
                            System.out.println("");
                        }
                        temp = temp - (stepsize * stepmul);
                        if (turn == 1) {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 6;
                            System.out.println("<]");

                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("======/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 3;
                            System.out.println("/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 4;
                            System.out.println("/\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/  \\");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else if (turn == 2) {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 6;
                            System.out.println("<]");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("======/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 3;
                            System.out.println("/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 4;
                            System.out.println("/|");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("/ |");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else if (turn == 3) {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 6;
                            System.out.println("<]");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("======/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 3;
                            System.out.println("/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 3;
                            System.out.println("||");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("||");
                            turn++;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        } else {
                            counter = 0;
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 6;
                            System.out.println("<]");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 1;
                            System.out.println("======/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 2;
                            System.out.println("/");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 3;
                            System.out.println("/");

                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);

                            counter = 3;
                            System.out.println("|\\");
                            do {
                                System.out.print(" ");
                                counter++;
                            } while (counter <= temp);
                            counter = 0;
                            System.out.println("| \\");
                            turn = 1;
                            for (int l = 0; l < 1; l++) {
                                for (int i = 0; i < 200; i++) {
                                    System.out.print("~~~");
                                }
                                System.out.println("");
                            }
                        }

                        for(int l = 0;l < (temp+1);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("^");
                        for(int l = 0;l < (temp - 3);l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println(GamerTag);
                        try {
                            Thread.sleep((speed/2));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        stepmul--;
                        System.out.println("\u000C");
                    } while (temp < spawn_int);
                }
                if (a > 0 && action == false)//the block in this code is for the last appearance without action mode after animation
                {
                    for(int i = 0;i < 10;i++)
                    {
                        System.out.println("");
                    }
                    counter = 2;
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 1;
                    System.out.println("(^_^)");

                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 2;
                    System.out.println("/|\\");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 0;
                    System.out.println("/ | \\");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 1;
                    System.out.println("|");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 2;
                    System.out.println("/+\\");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 0;
                    System.out.println("/   \\");
                    for (int l = 0; l < 1; l++) {
                        for (int i = 0; i < 200; i++) {
                            System.out.print("~~~");
                        }
                        System.out.println();
                    }

                    for(int l = 0;l < (spawn_int+1);l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println("^");
                    for(int l = 0;l < (spawn_int - 3);l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(GamerTag);
                }
                if (a > 0 && action == true)//the block in this code is for the last appearance in action mode after animation
                {
                    for(int i = 0;i < 10;i++)
                    {
                        System.out.println("");
                    }
                    counter = 2;
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 1;
                    System.out.println("(\\-/)");

                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 2;
                    System.out.println("/|\\");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 0;
                    System.out.println("/ | \\");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 1;
                    System.out.println("|");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 2;
                    System.out.println("/+\\");
                    do {
                        System.out.print(" ");
                        counter++;
                    } while (counter <= spawn_int);
                    counter = 0;
                    System.out.println("/   \\");
                    for (int l = 0; l < 1; l++) {
                        for (int i = 0; i < 200; i++) {
                            System.out.print("~~~");
                        }
                        System.out.println();
                    }

                    for(int l = 0;l < (spawn_int+1);l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println("^");
                    for(int l = 0;l < (spawn_int - 3);l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(GamerTag);
                }

                b = spawn_int;//stores the last value of spawn ; and is used in the above code
            }
            if(spawn.equals("exit"))
            {
                System.out.println("\u000C");
                for(int l = 0;l < 14;l++)
                {
                    System.out.println("");
                }
                for(int l = 0;l < 55;l++)
                {
                    System.out.print(" ");
                }
                System.out.println("PROGRAM  CLOSED  SUCCESSFULLY");

                break;
            }
            if(spawn.equals("pause"))
            {
                resumed = false;
                System.out.println("\u000C");
                do
                {
                    for(int l = 0;l < 100;l++)//top border of pause menu
                    {
                        System.out.print("~~");
                    }
                    for(int l = 0;l < 10;l++)
                    {
                        System.out.println("");
                    }
                    for(int l = 0;l < 65;l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println("GAME  PAUSED");
                    System.out.println("");
                    System.out.println("");
                    for(int l = 0;l < 54;l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println("TYPE \"resume\" TO RESUME THE GAME");
                    System.out.println("");
                    System.out.println("");
                    for(int l = 0;l < 57;l++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println("TYPE \"exit\" TO EXIT THE GAME");
                    for(int l = 0;l < 18;l++)
                    {
                        System.out.println("");
                    }
                    for(int l = 0;l < 100;l++)//bottom border of pause menu
                    {
                        System.out.print("~~");
                    }
                    pause_input = j.next();
                    if(pause_input.equals("resume"))
                    {
                        System.out.println("\u000C");
                        resumed = true;
                        a = 0;
                        break;
                    }
                    else if(pause_input.equals("exit"))
                    {
                        System.out.println("\u000C");
                        for(int l = 0;l < 14;l++)
                        {
                            System.out.println("");
                        }
                        for(int l = 0;l < 55;l++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("PROGRAM  CLOSED  SUCCESSFULLY");

                        System.exit(0);
                    }

                }while(true);
                continue;
            }
            else if(spawn.equals("restart"))
            {
                a = 0;
                b = 30;
                continue;
            }
            else if(spawn.equals("#action#"))
            {
                a = 0;
                action = true;
                resumed = true;
                System.out.println("\u000C");
                continue;
            }
            else if(spawn.equals("#normal#"))
            {
                a = 0;
                action = false;
                resumed = true;
                System.out.println("\u000C");
                continue;
            }

        }while(true);//run the loop until the break command  comes
    }

}
