// Implement a program to count the frequency of words
// in a given text file using an immutable Map. The program
// should read in the text file and split it into words, then
// count the frequency of each word and return a Map containing
// the word and its frequency.

import scala.io.StdIn
import scala.io.Source
import scala.collection.immutable.Map
import org.json4s.native.JsonMethods.{compact, render}
import org.json4s.JsonDSL._
import java.io.PrintWriter

object imm{
    def main(args: Array[String]):Unit={
        print("Enter the file name: ")
        val name = StdIn.readLine()
        println(s"Performing comparisions on lines in '${name}.txt'")
        println(read_file(s"${name}.txt"))
    }
    def read_file(name: String):Map[String,Int]={
        val file = Source.fromFile(name)
        val dict = scala.collection.mutable.Map.empty[String,Int]
        for (line <- file.getLines){
            val words = line.split(" ")
            for(word <- words){
                if (dict.contains(word.toUpperCase().replaceAll("[^A-Z\\s]", ""))){
                    dict(word.toUpperCase().replaceAll("[^A-Z\\s]", "")) += 1
                }else{
                    dict(word.toUpperCase().replaceAll("[^A-Z\\s]", "")) = 1
                }
            }
        }
        val json = ("person" -> dict)
        val jsonString = compact(render(json))
        val writer = new PrintWriter(s"${name}_words_count.json")
        writer.write(jsonString)
        writer.close()
        return dict.toMap
    }
}