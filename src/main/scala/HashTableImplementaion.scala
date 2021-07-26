case class Entry[K, V](key: K, value: V)
class HashTableImplementaion[K,V](entries:Vector[Vector[Entry[K,V]]]){
  def add(key: K, value: V): HashTableImplementaion[K, V] ={
    val idx = indexFor(key)
    // if the table is empty, initialize and then run 'add' again
    if(entries.isEmpty) {
      init.add(key, value)
    } else {
      val chain = entries(idx)
      chain.indexWhere(_.key == key) match {
        case -1 => // key not found
          val e = Entry(key, value)
          new HashTableImplementaion(entries.updated(idx, e +: chain))
        case i =>
          val replaced = chain(i).copy(value = value)
          new HashTableImplementaion(entries.updated(idx, chain.updated(i, replaced)))
      }
    }
  }
  private val initialCapacity = 16
  private def init: HashTableImplementaion[K, V] = {
    new HashTableImplementaion(Vector.fill(initialCapacity)(Vector.empty))
  }
  def indexFor(key: K): Int = {
    key.hashCode() & entries.length
  }
  def remove(key: K): HashTableImplementaion[K, V] = {
    val idx = indexFor(key)
    val updated = entries.updated(idx, entries(idx).filter(_.key != key))
    new HashTableImplementaion(updated)
  }
  def get(key: K): Unit = {
    val idx = indexFor(key)
    val a: Option[V] =entries(idx).find(_.key == key).map(_.value)
     println(a)
  }



}
