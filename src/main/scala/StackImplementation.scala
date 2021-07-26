class StackImplementation[T] {
  var top :StackNode[T] = null

  def push(data:T):Unit = {
    val newNode: StackNode[T] = StackNode(data,null)
    if(top==null){
      top=newNode
    }else{
      val tempNode = top
      top=newNode
      newNode.next=tempNode
    }
  }
  def pop(): Unit ={
    if(top==null){
      println("Stack is Empty")
    }else{
      val topElement =top.data
      println(s"$topElement is Popped Out from the Stack ")
      top=top.next
      val newTopElement = top.data
      println(s"Now the New Top is $newTopElement ")
    }
  }
  def traverse(): Unit = {
    if (top != null) {
      top.printList()
    }
    println()
  }
}
case class StackNode[T](data:T, var next:StackNode[T]){
  def printList(): Unit = {
    print(data)
    if (next != null) {
      print(",")
      next.printList()
    }
  }

}