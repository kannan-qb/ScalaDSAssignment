object Main1 extends App{
  val treeImplementation = new TreeImplementation
  val rootNode = TreeNode(5)
  println("TREE IMPLEMENTAION")
  treeImplementation.insert(rootNode,2)
  treeImplementation.insert(rootNode,4)
  treeImplementation.insert(rootNode,8)
  treeImplementation.insert(rootNode,7)
  treeImplementation.insert(rootNode,9)
  treeImplementation.insert(rootNode,3)
  treeImplementation.insert(rootNode,6)
  treeImplementation.traverseInOrder(rootNode)
  println()
  treeImplementation.traversePreOrder(rootNode)
  println()
  treeImplementation.traversePostOrder(rootNode)
  println()
  println(">>>>>>>>>>>>>>>>>>>>>>")
  println("HASH TABLE  IMPLEMENTATION")
  val hashTableImplementaion =new HashTableImplementaion[Int,String](Vector.empty)
  val a1 = hashTableImplementaion.add(1,"Aakash")
  val a2 = a1.add(2,"Deepa")
  val a3 = a2.add(3,"Kannan")
  a1.get(2)




}
