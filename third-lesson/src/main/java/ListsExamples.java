import NodeModels.Node;

/**
 * Implementation of lists.
 */
public class ListsExamples {

  public static void main(String[] args) {
     CustomList<String> myList = new CustomList<String>();
     myList.add("My first person");
     myList.add("Second element");
     System.out.println(myList.get(0));
     System.out.println(myList.get(1));
     System.out.println(myList.size());
     myList.remove("My first person");
    System.out.println(myList.size());
    System.out.println(myList.get(0));
    System.out.println(myList.toArray());


  }
}
