# Perfect Number Checker

## Overview

This Java program checks if a given number is a **perfect number**. A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding itself. For example, `28` is a perfect number because `1 + 2 + 4 + 7 + 14 = 28`. The user is prompted to input a number, and the program determines whether it is a perfect number.

## How It Works

1. **Input**: The user is prompted to enter a number (`sayi`).
2. **Find Divisors**: The program finds all positive divisors of the number up to half of the number (`sayi/2`).
   - For each number from `1` to `sayi/2`, it checks if it divides the given number without a remainder.
   - If it does, the value is added to a cumulative sum (`toplam`).
3. **Check for Perfection**:
   - If the sum of the divisors (`toplam`) is equal to the original number, then the number is a perfect number.
   - Otherwise, it is not a perfect number.
4. **Output**: The program prints whether the input number is a perfect number.

## How to Run the Program

1. Make sure you have Java installed on your system.
2. Copy the Java code into a file named `Main.java`.
3. Compile the Java file using the following command:

   ```
   javac Main.java
   ```

4. Run the program with the following command:

   ```
   java Main
   ```

5. Enter an integer value when prompted, and the program will determine if it is a perfect number.

## Example Output

```
Bir sayi giriniz : 
28
28 sayısı mükemmel sayıdır.
```

## Author

This program was created by **hekimcanaktas**.

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software. See the [LICENSE](LICENSE) file for more details.

