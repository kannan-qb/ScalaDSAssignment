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

//  def searchValue(treeNode:TreeNode, value: Int): TreeNode = {
//    if (treeNode == null || treeNode.value == value) {
//      treeNode
//    }
//    if (treeNode.value > value) {
//      searchValue(treeNode.left, value)
//    }
//    searchValue(treeNode.right, value)
//  }


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