package lectures.part2oop

import lectures.part2oop.B_MethodNotations.Person

object Test extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangout (person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def + (person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)

  val tom = new Person("Tom", "Fight Club")
  println(mary.hangout(tom));
  println( mary hangout tom);
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

}
