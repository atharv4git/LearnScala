// Implement a program to simulate a deck of cards using
// an immutable List. The program should represent each card
// as a tuple of a rank and a suit, and the deck as a List of
// tuples. The program should allow shuffling and dealing cards
// from the deck, while ensuring that the original deck is not
// modified.

object deckOfCards{
    def main(args: Array[String]): Unit = {
        distributeCards(5)
    }
    def cards():List[String]={
        val ranks = List("Ace1️⃣","King🤴","Queen👸","Jack🃏","9","8","7","6","5","4","3","2")
        val suits = List("Hearts💖", "Diamonds♦️", "Clubs♣️", "Spades♠️")
        val shuffledRanks = scala.util.Random.shuffle(ranks)
        val shuffledSuits = scala.util.Random.shuffle(suits)
        var cards = List.empty[String]
        for(rank <- shuffledRanks){
            for(suit <- shuffledSuits){
                cards = cards :+ s"${rank} of ${suit}"
            }
        }
        val shuffledCards = scala.util.Random.shuffle(cards)
        return shuffledCards
    }

    def distributeCards(num: Int)={
        val groups = divideListIntoNParts(cards(),num)
        var i = 1
        for(group <- groups){
            println(s"for person $i: ")
            for(card <- group){
                println(s"\t $card")
            }
            println("---------------------------------------")
            i+=1
        }
    }
    def divideListIntoNParts(list: List[String], n: Int): List[List[String]] = {
        val sizeOfEachGroup = (list.length + n - 1) / n  // round up if necessary
        list.grouped(sizeOfEachGroup).toList
    }


}