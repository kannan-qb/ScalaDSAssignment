class SinglyLinkedlist[T] {
  var head: Node[T] = null
  def insert(data: T): Unit = {
    val newNode: Node[T] =new Node[T](data,null)
    if(head==null){
      head=newNode
    }else{
      var last: Node[T] = head
      while (last.next!=null){
        last=last.next
      }
      last.next=newNode
    }
  }
  def delete(deleteItem: T): Unit = {
    var previousNode: Node[T] = null
    var currentNode: Node[T] = head
    if ((search(head,deleteItem)=="Element is Found"))
    {
      if (currentNode != null && currentNode.data == deleteItem) {
        head = currentNode.next
      }
      while (currentNode != null & currentNode.data != deleteItem) {
        previousNode = currentNode
        currentNode = currentNode.next
      }
      previousNode.next = currentNode.next
    }
    else{
      println("Element is Not Found in the List")
    }

  }
  def traverse(): Unit = {
    if (head != null) {
      head.printList()
    }
    println()
  }
  def search(head: Node[T], data: T): Unit = {
    if (head == null) {
      println("Element is not found ")
    } else if (head.data == data) {
      println("Element is found")
    } else {
      search(head.next, data)
    }

  }
}
case class Node[T](data: T, var next: Node[T]) {
  def printList(): Unit = {
    print(data)
    if (next != null) {
      print("->")
      next.printList()
    }
  }
}
