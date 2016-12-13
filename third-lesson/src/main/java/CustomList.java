import NodeModels.Node;

import java.util.Arrays;

/**
 * Created by dmladeno on 01.12.2016.
 */
public class CustomList<T> implements
  List<T>{

  private int listSize = 0;
  private Node<T> first;
  private Node<T> last;

  public int size() {
    return listSize;
  }

  public T get(int index) {
    if (index > (listSize-1)) {
      return null;
    }
    return getNodeData(index);
  }

  private T getNodeData(int index) {
    if (index == 0) {
      return first.data;
    }
    if (index == (listSize-1)) {
      return last.data;
    }
    Node<T> tmp = first;
    int i = 0;
    while (i <= index) {
      tmp = tmp.next;
      i++;
    }
    return tmp.data;

  }

  private Node<T> getNode(int index) {
    if (index == 0) {
      return first;
    }
    if (index == (listSize-1)) {
      return last;
    }
    Node<T> tmp = first;
    int i = 0;
    while (i <= index) {
      tmp = tmp.next;
      i++;
    }
    return tmp;

  }

  public void add(T t) {
    Node<T> newNode = new Node<T>(t, null);
    if(first == null) {
      first = newNode;
      last = newNode;
      listSize++;
    } else {
      Node<T> l = last;
      l.next = newNode;
      last = newNode;
      listSize++;
    }
  }

  public void insertAt(int index, T data) {
    Node<T> newNode = new Node<T>(data, null);
    Node<T> prevNode = getNode(index-1);
    newNode.next = prevNode.next;
    prevNode.next = newNode;
  }

  public void removeAt(int index) {
    if (index == 0) {
      first = first.next;
      listSize--;
      return;
    }
    Node<T> prevNode = getNode(index-1);
    prevNode.next = prevNode.next.next;
    listSize--;
  }

  public void remove(T data) {

//    Node<T> node = first;
//    while(node != null) {
//      if(node.data == data) {
//        prevNode = node.prev;
//        nextNode = node.next;
//        prev.Node.next = nextNode;
//      }
//      node = node.next;
//    }

    Node<T> node = first;
    for(int i = 0; i < listSize; i++) {
      if(node.data == data) {
        removeAt(i);
        break;
      }
    }
  }

  public boolean isEmpty() {
    return first == null;
  }

  public boolean contains(T t) {
    boolean result = false;
    Node<T> node = first;
    while(node != null) {
      if(node.data == t) {
        result = true;
      }
      node = node.next;
    }
    return result;
  }

  public T[] toArray() {

    T[] array = (T[])new Object[listSize];
    Node<T> node = first;
    int i = 0;
    while (node != null) {
      array[i] = (T)node.data;
      i++;
      node = node.next;
    }

    return array;
  }

  public void clear() {
    first = null;
    last = null;
    listSize = 0;
  }

  public int lastIndexOf(T t) {
    int index = -1;
    Node<T> node = first;
    for (int i = 0; i < listSize; i++) {
      if(node.data == t) {
        index = i;
      }
      node = node.next;
    }
    return index;
  }
}
