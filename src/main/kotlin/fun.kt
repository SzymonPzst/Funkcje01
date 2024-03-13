import java.util.Scanner

class Zwierze {
    var gatunek: String = ""
    var imie: String = ""
    var wiek: Int = 0

    fun dodajZwierze() {
        println("\nDODAWANIE NOWEGO ZWIERZECIA DO BAZY:")
        val scanner = Scanner(System.`in`)
        print("Podaj gatunek: ")
        gatunek = scanner.next()
        print("Podaj imie: ")
        imie = scanner.next()
        print("Podaj wiek: ")
        wiek = scanner.nextInt()
    }

    fun dajGlos() {
        when (gatunek) {
            "kot" -> println("$imie lat $wiek: Miau!")
            "koza" -> println("$imie lat $wiek: Beeeee!")
            "krowa" -> println("$imie lat $wiek: Muuuuu!")
            else -> println("Nieznany gatunek! Moze jakies UFO?!")
        }
    }
}

fun main() {
    val z1 = Zwierze()
    z1.dodajZwierze()
    z1.dajGlos()

    val z2 = Zwierze()
    z2.dodajZwierze()
    z2.dajGlos()
}
