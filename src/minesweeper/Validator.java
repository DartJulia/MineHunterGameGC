package minesweeper;

import java.util.Scanner;

public class Validator
{
    public static String getString(Scanner sc, String prompt)
    {
		boolean isValid = false;
		String s = null;
		while (isValid == false) {
        System.out.print(prompt);

			s = sc.next(); // read user entry
			if (s.equalsIgnoreCase("easy") || s.equalsIgnoreCase("medium") || s.equalsIgnoreCase("hard")
					|| s.equalsIgnoreCase("click") || s.equalsIgnoreCase("flag") || s.equalsIgnoreCase("unflag")
					|| s.equalsIgnoreCase("u") || s.equalsIgnoreCase("f") || s.equalsIgnoreCase("c"))

				isValid = true;
			else
				System.out.println("Error, please enter a valid option.");

		}

        return s;

    }
    

    public static int getInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt,
    int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(sc, prompt);
            if (i < min)
                System.out.println(
                    "Error! Number must be " + min + " or greater.");
            else if (i > max)
                System.out.println(
                    "Error! Number must be " + max + " or less.");
            else
                isValid = true;
        }
        return i;
    }

    public static double getDouble(Scanner sc, String prompt)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt,
    double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            d = getDouble(sc, prompt);
            if (d < min)
                System.out.println(
                    "Error! Number must be " + min + " or greater.");
            else if (d > max)
                System.out.println(
                    "Error! Number must be " + max + " or less.");
            else
                isValid = true;
        }
        return d;
    }
}