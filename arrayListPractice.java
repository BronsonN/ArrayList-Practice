import java.util.ArrayList;

public class arrayListPractice {

  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>();


    names.add("Bronson");
    names.add("Nolan");



    System.out.println(names.toString());
    System.out.println(names.size());
    System.out.println(names.isEmpty());

    ArrayList<String> copyNames = names;

    System.out.println(copyNames.toString());

    System.out.println(names.isEmpty());
    System.out.println(names.indexOf("Nolan"));

    copyNames.add("Brent");
    copyNames.add("Brandon");
    copyNames.add("Satan");
    copyNames.add("Jesus");
    copyNames.add("God");
    copyNames.add("Lucifer");
    copyNames.add("Dean");
    copyNames.add("Sam");
    copyNames.set(8, "SAMMY");

    System.out.println(copyNames.toString());


  }

}
