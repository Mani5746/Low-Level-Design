# Low Level Design (LLD) in Java

My personal notes and code for learning **Low Level Design**: OOP, SOLID principles, design patterns, and real-world machine-coding problems, all in plain Java.

Every topic is written in two versions:

- **`without/`**: the naive approach and the problem it causes
- **`with/`**: the same code refactored using the pattern or principle

Comparing the two side by side shows *why* a pattern exists, not just *what* it looks like.

---

## What is Low Level Design?

High Level Design (HLD) decides **which systems** to build: services, databases, queues, scaling.
Low Level Design decides **how the code inside a system is structured**: classes, interfaces, relationships, and responsibilities.

Good LLD gives you code that is:
- **Extensible**: new features mean adding code, not rewriting it
- **Maintainable**: each class has one clear job
- **Testable**: dependencies can be swapped out
- **Readable**: another developer can follow it quickly

---

## Roadmap & Progress

### 1. OOP Fundamentals
- [ ] Classes & Objects
- [ ] Encapsulation
- [ ] Abstraction
- [ ] Inheritance
- [ ] Polymorphism
- [ ] Composition vs Inheritance

### 2. SOLID Principles
- [ ] **S**ingle Responsibility Principle
- [ ] **O**pen/Closed Principle
- [ ] **L**iskov Substitution Principle
- [ ] **I**nterface Segregation Principle
- [ ] **D**ependency Inversion Principle

### 3. Design Patterns

**Behavioral**
- [x] [Strategy](src/designpatterns/strategy)
- [ ] Observer
- [ ] Command
- [ ] State
- [ ] Template Method
- [ ] Chain of Responsibility
- [ ] Iterator

**Creational**
- [ ] Singleton
- [ ] Factory / Abstract Factory
- [ ] Builder
- [ ] Prototype

**Structural**
- [ ] Decorator
- [ ] Adapter
- [ ] Facade
- [ ] Proxy
- [ ] Composite
- [ ] Bridge
- [ ] Flyweight

### 4. LLD Problems (Machine Coding)
- [ ] Parking Lot
- [ ] Tic-Tac-Toe
- [ ] Snake & Ladder
- [ ] Elevator System
- [ ] Vending Machine
- [ ] Library Management System
- [ ] BookMyShow (Movie Ticket Booking)
- [ ] Splitwise
- [ ] Rate Limiter
- [ ] LRU Cache

---

## Patterns Covered

### Strategy Pattern
📁 [`src/designpatterns/strategy`](src/designpatterns/strategy)

**Intent:** Define a family of algorithms, put each one in its own class, and make them interchangeable at runtime.

**The problem (`without/`):**
`Vehicle` has a `drive()` method and each subclass overrides it. When several unrelated subclasses (e.g. `SportVehicle`, `OffRoadVehicle`) need the *same* special drive behaviour, that code gets copy-pasted into each one. Inheritance can't share behaviour sideways between siblings.

**The solution (`with/`):**
The behaviour moves out into a `DriveStrategy` interface. `Vehicle` *has-a* strategy (composition) and delegates to it:

```java
public class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
```

```
        Vehicle ──has-a──▶ «interface» DriveStrategy
           ▲                        ▲
     ┌─────┴──────┐          ┌──────┴────────┐
NormalVehicle SportVehicle  NormalDrive   SportsDrive
                             Strategy      Strategy
```

**Key takeaways**
- Favour **composition over inheritance**
- Follows the **Open/Closed Principle**: a new drive style is a new class, and nothing existing changes
- Any number of vehicles can reuse the same strategy with no duplication

**Real-world uses:** payment methods (Card / UPI / Wallet), sorting via `Comparator`, pricing and discount rules, navigation routes (car / walk / bike).

---

## Project Structure

```
LowLevelDesign/
└── src/
    └── designpatterns/
        └── strategy/
            ├── without/        # Inheritance-only approach (the problem)
            └── with/           # Strategy pattern applied (the solution)
                └── strategy/   # DriveStrategy interface + implementations
```

---

## How to Run

**Requirements:** Java 8+ (JDK)

**IntelliJ IDEA:** open the project, open any `Main.java`, and click ▶.

**Terminal:**
```bash
# compile everything
javac -d out $(find src -name "*.java")

# run a specific example
java -cp out designpatterns.strategy.without.Main
java -cp out designpatterns.strategy.with.Main
```

---

## How I Approach an LLD Problem

1. **Clarify requirements**: list functional requirements and ask about edge cases
2. **Identify entities**: the nouns become classes (e.g. `ParkingLot`, `Slot`, `Ticket`)
3. **Define relationships**: is-a (inheritance) vs has-a (composition)
4. **Find what varies**: put it behind an interface (this is where patterns fit)
5. **Draw a class diagram**: before writing code
6. **Code it up**: keep classes small and follow SOLID
7. **Review**: can a new feature be added without modifying existing code?

---

## Resources

- *Head First Design Patterns*: Freeman & Robson
- *Design Patterns: Elements of Reusable Object-Oriented Software*: the Gang of Four
- [Refactoring.Guru: Design Patterns](https://refactoring.guru/design-patterns)

---

⭐ This is a learning repo, updated as I go. Feedback and suggestions are welcome!
