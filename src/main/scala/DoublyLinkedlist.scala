class DoublyLinkedlist[T] {
  var head: NodeofDoubly[T] = null
  var tail: NodeofDoubly[T] = null

  def insert(data: T): Unit = {
    val newNode: NodeofDoubly[T] = new NodeofDoubly[T](data, null, null)
    if (head == null) {
      head = newNode
      tail = newNode
      head.prev = null
      tail.next = null
    } else {
      tail.next = newNode
      newNode.prev = tail
      tail = newNode
      tail.next = null
    }
  }

  def delete(itemtobeDeleted: T): Unit = {
    var currentNode: NodeofDoubly[T] = head
    while (currentNode != null && currentNode.data != itemtobeDeleted) {
      currentNode = currentNode.next;
    }
    deleteNode(currentNode);
  }
  private def deleteNode(nodeofDoubly: NodeofDoubly[T]) {
    if (nodeofDoubly != null) {
      if (nodeofDoubly.prev != null)
        nodeofDoubly.prev.next = nodeofDoubly.next
      else
        head = nodeofDoubly.next
      if (nodeofDoubly.next != null)
        nodeofDoubly.next.prev = nodeofDoubly.prev
      else
        tail = nodeofDoubly.prev
    }
  }

  def traverse(): Unit = {
    if (head != null) {
      head.printList()
    }
    println()
  }
  def traverseinReverse(): Unit = {
    if (tail != null) {
      tail.printListReverse()
    }
    println()
  }

  def search(head: NodeofDoubly[T], data: T): Unit = {
    if (head == null) {
      println("Element is not found ")
    } else if (head.data == data) {
      println("Element is found")
    } else {
      search(head.next, data)
    }
  }
}

case class NodeofDoubly[T](data:T, var next:NodeofDoubly[T], var prev:NodeofDoubly[T]){
  def printList(): Unit = {
    print(data)
    if (next != null) {
      print("-><-")
      next.printList()
    }
  }
  def printListReverse(): Unit = {
    print(data)
    if (prev != null) {
      print("-><-")
      prev.printListReverse()
    }
  }

}
