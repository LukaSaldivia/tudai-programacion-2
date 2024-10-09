package Listas;

import java.util.List;

/**
 * SimpleList
 */
public interface SimpleList<T> {

  public int size();
  public boolean isEmpty();
  public boolean contains(T obj);
  public void add(T obj);
  public T add(int index, T obj);
  public T set(int index, T obj);
  public boolean remove(T obj);
  public T remove(int index);
  public void addAll(List<T> another);
  public void clear();
  public T get(int index);
  public int indexOf(T obj);
  
}