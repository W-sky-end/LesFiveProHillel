import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "dog", "cat", "bird", "dog",
                "dog", "fox", "monkey", "mouse", "snake", "cow", "cow", "fox");
        int dogCount = Collection.countOccurance(words, "dog");
        System.out.println("Count of 'dog' is : " + dogCount);

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = ArrayToList.arrayToList(arr);
        System.out.println("Array to list : " + list);

        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = FindUniq.findUnique(numbers);
        System.out.println("Unique Numbers: " + uniqueNumbers);

        System.out.println("Word occurance :");
        CalculateOccurance.calcOccurance(words);

        List<FindOccurances.WordOccurance> occurances = FindOccurances.findOccurances(words);
        System.out.println("Occurances : " + occurances);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addRecord(new Record("Bob", "030488"));
        phoneBook.addRecord(new Record("Karl", "12345"));
        phoneBook.addRecord(new Record("Marry", "558845"));
        phoneBook.addRecord(new Record("Bob", "048498"));


        System.out.println("Find Bob " + phoneBook.find("Bob"));
        System.out.println("      ");
        System.out.println("Find all Bobs " + phoneBook.findAll("Bob"));


    }

}
