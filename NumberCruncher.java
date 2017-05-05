import java.util.*;
public class NumberCruncher{
  static Random rand = new Random();
  public static void main(String[] args)  {
    int DATA_SIZE = Integer.MAX_VALUE / 10000;
    //Generate an array
    int[] data = generate(DATA_SIZE);
    //Generate Datatypes
    DataType[] dataTypes = new DataType[10];
    long[] adds = new long[10];
    long[] searches = new long[10];
    long[] removes = new long[10];
    long[] sorting = new long[10];
    dataTypes[0] = new DataType("ArrayList", new ArrayList());
    dataTypes[1] = new DataType("Vector", new Vector());
    dataTypes[2] = new DataType("HashTable", new Hashtable());
    dataTypes[3] = new DataType("HashSet", new HashSet());
    dataTypes[4] = new DataType("HashMap", new HashMap());
    dataTypes[5] = new DataType("Linked HashSet", new LinkedHashSet());
    dataTypes[6] = new DataType("Linked HashMap", new LinkedHashMap());
    dataTypes[7] = new DataType("Linked List", new LinkedList());
    dataTypes[8] = new DataType("TreeSet", new TreeSet());
    dataTypes[9] = new DataType("TreeMap", new TreeMap());
    //Adds data
    System.out.println("------------------------");
    for (int y = 0; y < dataTypes.length; y++)    {
      long startTime = System.nanoTime();
      for (int x = 0; x < data.length; x++)
        dataTypes[y].add(data[x]);
      long endTime = System.nanoTime();
      adds[y] = (endTime - startTime);
      System.out.println(dataTypes[y] + " Add Time:\n\t\t" + adds[y] + " nano seconds");
    }
    //Searches data
    System.out.println("------------------------");
    int[] targets = generate(DATA_SIZE/10);
    for (int y = 0; y < dataTypes.length; y++)    {
      int hits = 0;
      long startTime = System.nanoTime();
      for (int x = 0; x < targets.length; x++)
       dataTypes[y].contains(targets[x]);
      long endTime = System.nanoTime();
      searches[y] = (endTime - startTime);
      System.out.println(dataTypes[y] + " Search Time:\n\t\t" + searches[y] + " nano seconds");
    }
    //Removes data
    System.out.println("------------------------");
    targets = generate(DATA_SIZE/10);
    for (int y = 0; y < dataTypes.length; y++)    {
      long startTime = System.nanoTime();
      for (int x = 0; x < targets.length / 10; x++)
        dataTypes[y].remove(targets[x]);
      long endTime = System.nanoTime();
      removes[y] = (endTime - startTime);
      System.out.println(dataTypes[y] + " Remove Time:\n\t\t" + removes[y] + " nano seconds");
    }
    //Sorting data ...Note, the DataType.sort() returns a sorted String, so you can look at it if you want!
    System.out.println("------------------------");
    for (int y = 0; y < dataTypes.length; y++)    {
      long startTime = System.nanoTime();
      dataTypes[y].sort();
      long endTime = System.nanoTime();
      sorting[y] = (endTime - startTime);
      System.out.println(dataTypes[y] + " Sort Time:\n\t\t" + sorting[y] + " nano seconds");
    }
    //Totals data
    System.out.println("------------------------");
    for (int y = 0; y < dataTypes.length; y++)
      System.out.println(dataTypes[y] + " Total Time:\n\t\t" + (adds[y] + removes[y] + searches[y] + sorting[y]) + " nano seconds");
  }
  public static int[] generate(int size)
  {
    int[] output = new int[size];
    for (int x = 0; x < size; x++)
      output[x] = rand.nextInt(size*10);
    return output;
  }
}