class QueueImplementaion[T]{
  var frontEnd:QueueNode[T] = null
  var rearEnd:QueueNode[T] = null
  def enQueue(data:T): Unit = {
    val newNode = new QueueNode[T](data,null)
    if(rearEnd==null){
      frontEnd=newNode
      rearEnd=newNode
    }
    rearEnd.next=newNode
    rearEnd=newNode
  }
  def deque(): Unit = {
    if (frontEnd==null){
      println("Queue is Empty ")
    }
    val tempNode = frontEnd
    val tempdata =tempNode.data
    println(s"Removed $tempdata")
    frontEnd=frontEnd.next
    if(frontEnd==null){
      rearEnd=null
    }
  }
  def traverse(): Unit = {
    if (frontEnd != null) {
      frontEnd.printList()
    }
    println()
  }

}
case class QueueNode[T](data:T,var next:QueueNode[T]){
  def printList(): Unit = {
    print(data)
    if (next != null) {
      print(",")
      next.printList()
    }
  }
}