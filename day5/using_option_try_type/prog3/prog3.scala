// Problem: Write a function that takes a map as input and
// returns the value associated with a given key. If the key
// is not found or the input map is null, return None.

object prog3{
    def main(args: Array[String]): Unit = {
        val map1 = scala.collection.immutable.Map("key1" -> "value1", "key2" -> "value2", "key3" -> "value3", "key4" -> "value4")
        println(getValueByKey(map1,"key2"))
    }

    def getValueByKey(map: Map[String, String], key: String): Option[String] = {
        if (map == null) {
            None
        } else {
            map.get(key)
        }
    }

}