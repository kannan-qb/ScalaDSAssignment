object Main extends App{

  println(">>SINGLY LINKEDLIST<<")
  val singlyLinkedList: SinglyLinkedlist[Int] = new SinglyLinkedlist
  singlyLinkedList.insert(1)
  singlyLinkedList.insert(2)
  singlyLinkedList.insert(3)
  singlyLinkedList.insert(23)
  singlyLinkedList.traverse()
  singlyLinkedList.search(singlyLinkedList.head,3)
  singlyLinkedList.search(singlyLinkedList.head,56)
  singlyLinkedList.insert(9)
  singlyLinkedList.search(singlyLinkedList.head,9)
  singlyLinkedList.delete(93)
  singlyLinkedList.traverse()
  println(">>>>>>>>>>>>>>>>>>>")
  println(">>DOUBLY LINKEDLIST<<")
  val doublyLinkedList: DoublyLinkedlist[Int] = new DoublyLinkedlist
  doublyLinkedList.insert(8)
  doublyLinkedList.insert(9)
  doublyLinkedList.insert(10)
  doublyLinkedList.insert(11)
  doublyLinkedList.traverse()
  doublyLinkedList.search(doublyLinkedList.head,9)
  doublyLinkedList.delete(19)
  doublyLinkedList.traverse()
  doublyLinkedList.search(doublyLinkedList.head,9)
  doublyLinkedList.traverseinReverse()
  println(">>>>>>>>>>>>>>>>>>>")
  println(">>STACK OPERATIONS<<")
  val stackImplementation: StackImplementation[Int] = new StackImplementation
  stackImplementation.push(12)
  stackImplementation.push(13)
  stackImplementation.push(14)
  stackImplementation.push(15)
  stackImplementation.traverse()
  stackImplementation.pop()
  stackImplementation.traverse()
  println(">>>>>>>>>>>>>>>>>>>")
  println(">>Queue OPERATIONS<<")
  val queueImplementaion: QueueImplementaion[Int]= new QueueImplementaion
  queueImplementaion.enQueue(16)
  queueImplementaion.enQueue(17)
  queueImplementaion.enQueue(18)
  queueImplementaion.enQueue(19)
  queueImplementaion.traverse()
  queueImplementaion.deque()
  queueImplementaion.traverse()

}