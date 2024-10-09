package Listas;

import java.util.ArrayList;

import Listas.NodeList.*;

public class Main {
  
  public static void main(String[] args) {

    ArrayList<String> arrABC = new ArrayList<String>();
    arrABC.add("A");
    arrABC.add("X");
    arrABC.add("Y");
    arrABC.add("D");
    arrABC.add("E");
    arrABC.add("F");


    NodeList<String> nlABC = new NodeList<String>(arrABC);
    System.out.println(nlABC);
    System.out.println("NodeList.size(): "+nlABC.size());
    System.out.println("NodeList.isEmpty(): "+nlABC.isEmpty());
    nlABC.clear();
    System.out.println("NodeList.clear()");
    System.out.println(nlABC);
    System.out.println("NodeList.isEmpty(): " + nlABC.isEmpty());
    nlABC.addAll(arrABC);
    System.out.println("NodeList.addAll(arrABC)");
    System.out.println(nlABC);
    System.out.println("NodeList.getLast(): " + nlABC.getLast());
    nlABC.add("G");
    System.out.println("NodeList.add('G')");
    System.out.println("NodeList.getLast(): " + nlABC.getLast());
    nlABC.add(1,"B");
    System.out.println("NodeList.add(1, 'B')");
    System.out.println(nlABC);
    nlABC.set(2,"C");
    System.out.println("NodeList.set(2, 'C')");
    nlABC.set(7,"Z");
    System.out.println("NodeList.set(7, 'Z')");
    System.out.println("NodeList.getLast(): " +nlABC.getLast());
    nlABC.set(7,"G");
    System.out.println("NodeList.set(7, 'G')");
    System.out.println("NodeList.getLast(): " +nlABC.getLast());
    nlABC.remove("Y");
    System.out.println("NodeList.remove('Y')");
    System.out.println(nlABC);
    nlABC.remove(0);
    System.out.println("NodeList.remove(0)");
    System.out.println("NodeList.get(0): " +nlABC.get(0));
    System.out.println("NodeList.indexOf('C'): " +nlABC.indexOf("C"));
    System.out.println(nlABC);



  }
}
