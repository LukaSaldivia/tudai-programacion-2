package Listas.NodeList;

public class Node<T> {
  private T self;
  private Node<T> next;


  public Node(){
    this.self = null;
    this.next = null;
  }

  public Node(Node<T> node){
    this.self = node.get();
    this.next = node.next();
  }

  public Node(T self){
    this.self = self;
    this.next = null;
  }

  public Node(T self, T next){
    this.self = self;
    this.next = new Node<T>(next);
  }

  public T get(){
    return self;
  }

  public void setNext(T next){
    this.next = new Node<T>(next);
  }
  public void setNext(Node<T> next){
    this.next = next;
  }

  public void setSelf(T obj){
    this.self = obj;
  }

  public void setSelf(Node<T> node){
    this.self = node.get();
  }

  

  public Node<T> next(){
    return next;
  }
}
