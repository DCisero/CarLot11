/**
 * Created by D.Cisero on 7/24/17.
 */
import java.util.*;
import java.util.Scanner;

public class CarLotApp {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<Car> carArrayList = new ArrayList<>();

        carArrayList.add(new UsedCar("BMW", "328i", 2011, 11000, 109000));
        carArrayList.add(new Car("Ford", "Fusion", 2017, 28000));
        carArrayList.add(new UsedCar("GM", "Corvette", 2015, 30000, 78000));
        carArrayList.add(new Car("Lexus", "GX 460", 2017, 66000));
        carArrayList.add(new UsedCar("Mercedes", "CL500", 2001, 18000, 160000));
        carArrayList.add(new Car("Ford", "Mustang", 2017, 35000));
        carArrayList.add(new UsedCar("BMW", "740", 2010, 19000, 152000));
        carArrayList.add(new UsedCar("Ford", "Pinto", 1974, 2.63, 732.9));


        System.out.println("\n\n\nWelcome to King Cisero New & Used Cars!");
        System.out.println();

        int userChoice = 0;
        System.out.println("Which would you like to do: ");
        System.out.println("1.Print a list of our inventory" + "/" + "2.Add a Car" + "/" + "3.Remove a car" + "/"
                + "4.Look up a car" + "/" + "5.Replace a car");
        userChoice = scnr.nextInt();

        //list all cars
        if (userChoice == 1) {
            System.out.println("\nCurrent Inventory:");
            System.out.printf("\n%-2s %-12s%-12s%-12s%-18s%-18s\n", "#", "Make", "Model", "Year", "Price", "Mileage(Used Cars)");
            System.out.printf("%-2s %-12s%-12s%-12s%-18s%-18s\n", "==", "==========", "==========", "==========", "==============", "==================");

            CarLot carList = new CarLot(carArrayList);
            carList.listAll();

        }

        //user add a car
        if (userChoice == 2) {
            int userAdd = 0;
            for (int i = 0; i < userAdd; i++) {
                Car car = new Car();

                System.out.print("Enter Car " + "#" + (i + 1) + " Make:");
                car.setMakeM(scnr.next());

                System.out.print("Enter Car " + "#" + (i + 1) + " Model:");
                car.setModelM(scnr.next());

                System.out.print("Enter Car " + "#" + (i + 1) + " Year:");
                car.setYearM(scnr.nextInt());

                System.out.print("Enter Car " + "#" + (i + 1) + " Price:");
                car.setPriceM(scnr.nextDouble());
                System.out.println();

                carArrayList.add(car);
            }
        }

        //remove a car
        if (userChoice == 3) {
            int userRemove = 0;

            System.out.print("Enter the number you want to delete: ");
            userRemove = scnr.nextInt();

            carArrayList.remove(userRemove);
            for (int i = 1; i < carArrayList.size(); i++) {
                System.out.println(i + ": ");
                i--;
            }
        }

        //look up a car
        if (userChoice == 4){
            int userLookUp = 0;

            System.out.print("Enter the car number you want to look up: ");
            userLookUp = scnr.nextInt();

            carArrayList.get(userLookUp);
        }

        //replace a car
        if(userChoice == 5){


        }


        }
    }







