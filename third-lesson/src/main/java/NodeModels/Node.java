package NodeModels;

/**
 * NodeModels.Node class for linked lists.
 */
public class Node<T> {

  public T data;
  public Node<T> next;

  public Node(T data,
              Node<T> next) {
    this.data = data;
    this.next = next;
  }

  public Node() {}
}
