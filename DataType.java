import java.util.*;


public class DataType
{
  private String name= "DataType";
  public Object data = null;
  private int count = 0;
  
  public DataType(String inName, Object inData)
  {
    name = inName;
    data = inData;
  }
  
  public String toString()
  {
    return name;
  }
  
  public void add(int num)
  {
    if (data instanceof ArrayList)
      ((ArrayList) data).add(num);
    else if (data instanceof Vector)
      ((Vector) data).add(num);
    else if (data instanceof Hashtable)
      ((Hashtable) data).put(num, num);
    else if (data instanceof HashSet)
      ((HashSet) data).add(num);
    else if (data instanceof HashMap)
      ((HashMap) data).put(num, num);
    else if (data instanceof LinkedHashSet)
      ((LinkedHashSet) data).add(num);
    else if (data instanceof LinkedHashMap)
      ((LinkedHashMap) data).put(num, num);
    else if (data instanceof LinkedList)
      ((LinkedList) data).add(num);
    else if (data instanceof TreeSet)
      ((TreeSet) data).add(num);
    else if (data instanceof TreeMap)
      ((TreeMap) data).put(num, num);
  }
  
    public void remove(int num)
  {
    if (data instanceof ArrayList)
      ((ArrayList) data).remove((Integer) num);
    else if (data instanceof Vector)
      ((Vector) data).remove((Integer) num);
    else if (data instanceof Hashtable)
      ((Hashtable) data).remove(num);
    else if (data instanceof HashSet)
      ((HashSet) data).remove(num);
    else if (data instanceof HashMap)
      ((HashMap) data).remove(num);
    else if (data instanceof LinkedHashSet)
      ((LinkedHashSet) data).remove(num);
    else if (data instanceof LinkedHashMap)
      ((LinkedHashMap) data).remove(num);
    else if (data instanceof LinkedList)
      ((LinkedList) data).remove((Integer) num);
    else if (data instanceof TreeSet)
      ((TreeSet) data).remove(num);
    else if (data instanceof TreeMap)
      ((TreeMap) data).remove(num);
  }
    
    public boolean contains(int num)
  {
    if (data instanceof ArrayList)
      return ((ArrayList) data).contains(num);
    else if (data instanceof Vector)
      return ((Vector) data).contains(num);
    else if (data instanceof Hashtable)
      return ((Hashtable) data).contains(num);
    else if (data instanceof HashSet)
      return ((HashSet) data).contains(num);
    else if (data instanceof HashMap)
      return ((HashMap) data).containsValue(num);
    else if (data instanceof LinkedHashSet)
      return ((LinkedHashSet) data).contains(num);
    else if (data instanceof LinkedHashMap)
      return ((LinkedHashMap) data).containsValue(num);
    else if (data instanceof LinkedList)
      return ((LinkedList) data).contains(num);
    else if (data instanceof TreeSet)
      return ((TreeSet) data).contains(num);
    else if (data instanceof TreeMap)
      return ((TreeMap) data).containsValue(num);
    return false;
  }

    public String sort()
  {
    if (data instanceof ArrayList)
    {
     Collections.sort((ArrayList) data);
     return data.toString();  
    }
    
    else if (data instanceof Vector)
    {
      Collections.sort((Vector) data);
      return data.toString();  
    }
    else if (data instanceof Hashtable)
    {
      int[] tmp = new int[((Hashtable) data).size()];
      int x = 0;
      Enumeration<Integer> enumKey = ((Hashtable) data).keys();
      while (enumKey.hasMoreElements())
      {
        tmp[x] = (int) ((Hashtable) data).get(enumKey.nextElement());
        x++;
      }

      Arrays.sort(tmp);
      return Arrays.toString(tmp);
    }
    else if (data instanceof HashSet)
    {
      int[] tmp = new int[((HashSet) data).size()];
      int x = 0;
      Iterator itr = ((HashSet) data).iterator();
      while (itr.hasNext())
      {
        tmp[x] = (int) itr.next();
        x++;
      }

      Arrays.sort(tmp);
      return Arrays.toString(tmp);
    }
    else if (data instanceof HashMap)
    {
      int[] tmp = new int[((HashMap) data).size()];
      int x = 0;
      Iterator itr = ((HashMap) data).entrySet().iterator();
      while (itr.hasNext())
      {
        tmp[x] = (int) ((Map.Entry) itr.next()).getValue();
        x++;
      }

      Arrays.sort(tmp);
      return Arrays.toString(tmp);
    }
    
    else if (data instanceof LinkedHashSet)
    {
      return ((LinkedHashSet) data).toString();
    }
    
    else if (data instanceof LinkedHashMap)
    {
      return ((LinkedHashMap) data).toString();
    }
    
    else if (data instanceof LinkedList)
    {
     Collections.sort((LinkedList) data);
     return data.toString();  
    }
  
    else if (data instanceof TreeSet)
      return ((TreeSet) data).toString();
    
    else if (data instanceof TreeMap)
      return ((TreeMap) data).toString();
      
    return "";
    //  
  }
    
}
  