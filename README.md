<div align="center">

![MrPikchu-NumberGuesser](https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=180&section=header&text=Number-Guesser&fontSize=40&fontColor=fff&animation=twinkling&fontAlignY=32&desc=CLI-based+logic+game+built+for+roadmap.sh&descAlignY=52&descSize=16)

[![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Project](https://img.shields.io/badge/Roadmap.sh-Project-blue?style=for-the-badge)](https://roadmap.sh/projects/number-guessing-game)
[![License](https://img.shields.io/badge/License-MIT-2ECC71?style=for-the-badge)](LICENSE)

<br>

> Prosta gra logiczna typu CLI, w której gracz musi odgadnąć liczbę wybraną przez komputer.
> Projekt wykonany w ramach ścieżki rozwoju na roadmap.sh.

<br>

</div>

---

## 🎮 O Projekcie

Program losuje liczbę z zakresu **1 do 100**. Twoim zadaniem jest odgadnięcie jej w jak najmniejszej liczbie prób, zależnie od wybranego poziomu trudności.

| Poziom | Liczba szans | Opis |
|---|---|---|
| **Easy** | 10 | Idealny na start, dużo miejsca na błędy. |
| **Medium** | 5 | Standardowe wyzwanie. |
| **Hard** | 3 | Tylko dla mistrzów dedukcji. |

---

## 🚀 Funkcje

* **System Poziomów:** Wybór trudności wpływa na dynamiczną liczbę dostępnych żyć.
* **Inteligentne Podpowiedzi:** Gra informuje, czy szukana liczba jest większa, czy mniejsza od Twojego strzału.
* **Licznik Prób:** Na końcu gry dowiesz się dokładnie, w której próbie udało Ci się wygrać.
* **Nieskończona Rozgrywka:** Po zakończeniu rundy gra automatycznie restartuje się, pozwalając na nową próbę.

---

## 🛠️ Podgląd Kodu

Główna logika pętli zgadywania:

```java
while (attempts < chances) {
    System.out.print("Enter your guess: ");
    int guess = scanner.nextInt();
    attempts++;

    if (guess == randomNum) {
        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
        won = true;
        break;
    } else if (guess < randomNum) {
        System.out.println("Incorrect! The number is greater than " + guess + ".");
    } else {
        System.out.println("Incorrect! The number is less than " + guess + ".");
    }
}
```

## 📝 Wymagania (Roadmap.sh)
* **Wybór poziomu trudności (Easy, Medium, Hard).

* **Losowanie liczby z zakresu 1-100.

* **System podpowiedzi (Greater / Less).

* **Dynamiczny limit szans.

* **Podsumowanie liczby prób po wygranej.

<div align="center">

![footer](https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,11,20&height=80&section=footer)

Made with ☕ by [MrPikchu](https://github.com/mrpikchu)  • Java 21

</div>



