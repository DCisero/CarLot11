/**
 * Created by D.Cisero on 7/24/17.
 */

import java.util.ArrayList;

public class CarLot extends Car {

    private ArrayList<Car> carArrayListM;


    public CarLot(ArrayList<Car> carArrayList) {

        carArrayListM = carArrayList;
    }

    public void listAll() { //

        for (int i = 0; i < carArrayListM.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(carArrayListM.get(i));

        }

    }

    public void addCar(Car addCar) {

        carArrayListM.add(addCar);
    }

    public void deleteCar(int selection) {

        carArrayListM.remove(selection);
    }

    public void infoCar() {

        for (int i = 0; i < carArrayListM.size(); i++) {
            System.out.print(i + ". ");
            System.out.print(carArrayListM.get(i));
        }
    }

    public void carSwap() {

        for (int i = 0; i < carArrayListM.size(); i++) {
            System.out.print(i + ". ");
            System.out.print(carArrayListM.get(i));
        }
    }
}
//}
//    public void allCars(){
//        for(int i = 0; i < carArrayList.size(); i++){
//            System.out.println("Car " + (i+1) + ": " + carArrayList.get(i));
//            System.out.println();
//        }
//    }
//    public void addCar(Car addCar){
//        carArrayList.add(addCar);
//    }
//    public void removeCar(int carIndex){
//        carArrayList.remove(carIndex);
//    }
//
//    public Car findCar(int carIndex){
//        return carArrayList.get(carIndex);
//    }
//    public void replaceCar(int index,Car replacement){
//
//        carArrayList.remove(index);
//        carArrayList.add(index, replacement);
//
//    }
