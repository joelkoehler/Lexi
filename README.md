## Description
Lexi is a graphical WYSIWYG document editor based on the case study presented in The Gang of Four's Design Patterns book. 

* Author: Joel Koehler
* Class: CS472 (Object-Oriented Design Patterns)
* Semester: Spring '21

### Object-Oriented Design Patterns Used
* Composite (163) - composition
* Strategy (315) - formatting. 
* AbstractFactory(87), Factory Method (107) and Singelton(127) - look & feel
* Bridge (151) - allows for Swing or Awt windowing systems
* Command (233)
* Prototype (117)
* Chain of Responsibility - tree structure traversal for clickable glyphs

## Usage
$ javac *.java
$ LexiWindow="x" LexiWidget="y" java Lexi
    (where x is either "Swing" or "Awt", and y is either "Red" or "Green")
