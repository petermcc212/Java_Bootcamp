import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);
    }


    private static void printList(LinkedList<String> linkedList ){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String>linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            // compare to function
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                // comparison = 0 if they match
                // equal then we do not want to add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if(comparison > 0){
                // new City should appear before this one
                // Brisbane --> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                // move on to next city
                // it's already moved on to the next one anyway as .next was used above
                // so no action req
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIteator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        }else{
            System.out.println("Now visiting " + listIteator.next());
            printMenu();
        }
        while(! quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;

                case 1:
                    if(! goingForward){
                        if(listIteator.hasNext()){
                            listIteator.next();
                        }
                        goingForward = true;
                    }
                    if(listIteator.hasNext()){
                        System.out.println("Now visiting " + listIteator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIteator.hasPrevious()){
                            listIteator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIteator.hasPrevious()){
                        System.out.println("Now visiting " + listIteator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = false;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }

        }

    }


    private static void printMenu(){
        System.out.println("Available actions: \n  press ");
        System.out.println("0 - to quit \n" +
                "1 - go to next city \n" +
                "2 - go to previous city \n" +
                "3 - print menu options");
    }

}
