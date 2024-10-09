package Listas.NodeList;

import java.util.List;

import Listas.SimpleList;

public class NodeList<T> implements SimpleList<T> {


  private Node<T> first, last;

  public NodeList(){
    this.first = new Node<T>();
    this.last = new Node<T>();
  }

  public NodeList(List<T> list){
    this();
    this.addAll(list);
  }

  
  public T getFirst(){
    return this.first.get();
  }

  public T getLast() {
    return this.last.get();
  }
  

  @Override
  public int size() {
    if (isEmpty()) {
      return 0;
    }
    int size = 0;
    Node<T> actual = new Node<T>(first);
    while (actual.next() != null) {
      
      size++;
      actual = actual.next();

    }

    return size+1;
  }

  @Override
  public boolean isEmpty() {
    return first.get() == null;
  }

  @Override
  public boolean contains(T obj) {
    boolean contains = false;
    Node<T> actual = first;

    while (!contains && actual != null && actual.get() != null) {
      contains = actual.get().equals(obj);

      actual = actual.next();
    }


    return contains;
  }

  @Override
  public void add(T obj) {
    if (this.isEmpty()) {
      this.first = new Node<T>(obj);
      return;
    }

    Node<T> actual = first;

    while (actual.next() != null) {
      actual = actual.next();
    }

    actual.setNext(new Node<T>(obj));

    this.last = new Node<T>(obj);
    
    return;

  }

  @Override
  public T add(int index, T obj) {
    if ((index >= this.size() && index > 0) || index < 0) {
      return null;
    }

    Node<T> actual = first, rightSide;
    int i = 0;


    while (i < index && actual != null && actual.get() != null) {
      i++;
      actual = actual.next();
    }

    if (actual.get() != null) {
      rightSide = new Node<T>(actual);
      actual.setNext(rightSide);
    }
    actual.setSelf(obj);
    
    
    updateLast();
    return actual.get();
    
    
    
    
  }
  
  @Override
  public T set(int index, T obj) {
    if ((index >= this.size() && index > 0) || index < 0) {
      return null;
    }
    
    Node<T> actual = first, rightSide;
    int i = 0;
    
    while (i < index && actual != null && actual.get() != null) {
      i++;
      actual = actual.next();
    }
    
    if (actual.next() != null) {
      rightSide = new Node<T>(actual.next());
      actual.setNext(rightSide);
    }
    actual.setSelf(obj);
    
    updateLast();
    return actual.get();
    
    
    
    
  }
  
  @Override
  public boolean remove(T obj) {
    if (this.contains(obj)) {
      
      if (this.getFirst().equals(obj)) {
        this.first = first.next();
        return true;
      }
      Node<T> actual = first;
      
      
      
      while (actual.next() != null) {
        if (actual.next().get().equals(obj)) {
          actual.setNext(actual.next().next());
          updateLast();
          return true;
        }

        actual = actual.next();
      }

      



    }


    return false;
  }

  @Override
  public T remove(int index) {
    if (index >= size() || index < 0)
      return null;

    int i = 0;
    Node<T> actual = first;

    while (i < index) {
      i++;
      actual = actual.next();
    }

    this.remove(actual.get());

    return actual.get();
  }

  @Override
  public void addAll(List<T> another) {
    for (T t : another) {
      add(t);
    }
  }

  @Override
  public void clear() {
    this.first = new Node<T>();
    this.last = new Node<T>();
  }

  @Override
  public T get(int index) {
    if (index >= size() || index < 0) {
      return null;
    }
    int i = 0;

    Node<T> actual = first;

    while (actual.next() != null && i < index) {
      if (actual.next() != null && i < index) {
        i++;
        actual = actual.next();
      }
    }

    return actual.get();



  }

  @Override
  public int indexOf(T obj) {
    int i = 0;
    boolean found = false;

    Node<T> actual = first;

    while (!found && actual != null) {
      found = actual.get().equals(obj);
      if (!found) {
        i++;
        actual = actual.next();
      }
    }

    if (i >= size()) {
      return -1;
    }
    return i;

  }

  public String toString(){
    String res = "[";
    Node<T> actual = first;

    while (actual != null && actual.get() != null) {
      res += actual.get().toString();

      if (actual.next() != null) {
        res += ", ";
      }
      actual = actual.next();
    }

    res += "]";

    return res;
  }

  private void updateLast(){
    Node<T> actual = first;

    while (actual.next() != null) {
      if (actual.next() != null) {
        actual = actual.next();
      }
    }

    last = new Node<T>(actual);
  }

  
}
