import Main1.rootNode
class TreeImplementation {
  def insert(treeNode: TreeNode, value: Int): Unit = {
    if (value < treeNode.value) {
      if (treeNode.left != null) {
        insert(treeNode.left, value)
      } else {
        println(s"Inserted $value to the Left of " + treeNode.value)
        treeNode.left = TreeNode(value)

      }
    }
    else if (value > treeNode.value) {
      if (treeNode.right != null) {
        insert(treeNode.right, value)

      } else {
        println(s"Inserted $value to the Right of " + treeNode.value)
        treeNode.right = TreeNode(value)
      }
    }
  }
  def delete(value:Int):Unit={
    deleteKey(rootNode,value)
  }
  def deleteKey(rootNode:TreeNode, value: Int):TreeNode= {
    if (rootNode == null) {
      rootNode
    }
    if (value < rootNode.value) {
      rootNode.left = deleteKey(rootNode.left, value)
    }
    else if (value > rootNode.value) {
      rootNode.right = deleteKey(rootNode.right, value)
    }
    else {
      if (rootNode.left == null) {
        rootNode.right
      }
      else if (rootNode.right == null) {
        rootNode.left
      }

      rootNode.right = deleteKey(rootNode.right, minimum(rootNode.right))
    }
    rootNode
  }
  def search(treeNode: TreeNode,value:Int): Unit ={
    if (treeNode==null){
      println("Element is Not Present")
    }else if(value==treeNode.value){
      println("Element is Present")
    }else if(value<treeNode.value){
      search(treeNode.left,value)
    }else{
      search(treeNode.right,value)
    }
  }
  def minimum(treeNode:TreeNode):Int={
    var min=treeNode.value
    while (treeNode.value!=null){
      min=treeNode.left.value
    }
    min
  }
  def traverseInOrder(treeNode: TreeNode): Unit = {
    if (treeNode != null) {
      traverseInOrder(treeNode.left)
      print(" " + treeNode.value)
      traverseInOrder(treeNode.right)
    }
  }
  def traversePreOrder(treeNode: TreeNode): Unit = {
    if (treeNode != null) {
      print(" " + treeNode.value)
      traversePreOrder(treeNode.left)
      traversePreOrder(treeNode.right)
    }
  }
  def traversePostOrder(treeNode: TreeNode): Unit = {
    if (treeNode != null) {
      traversePostOrder(treeNode.left)
      traversePostOrder(treeNode.right)
      print(" " + treeNode.value)
    }
  }
}
case class TreeNode(value:Int){
  var left:TreeNode = null
  var right:TreeNode =null
}