# -NEU-library-SOLID-with-Design-Pattern

## Problem Statement

The NEU Library provides different types of resources such as books, theses, capstones, journals, newspapers, and internet access.

The current system design has a Student class that contains methods such as:

borrowBook(title)
borrowJournal(title)

This design violates the Dependency Inversion Principle (DIP) because the Student class directly depends on concrete classes like Book and Journal.

This makes the system difficult to extend. For example, if the library introduces new resource types like AudioBooks or E-Journals, the Student class must be modified again.

To solve this problem, the system must be refactored so that:

• High-level modules (Student class) do not depend on low-level modules (Book, Journal).
• Both depend on abstractions.
• The system remains open for extension but closed for modification (Open/Closed Principle).

The solution introduces a LibraryResource interface that represents any borrowable resource. Concrete resource classes such as Book, Journal, Thesis, and others implement this interface.

The Student class now interacts with the abstraction instead of specific implementations, making the system flexible and scalable for future resource types.
