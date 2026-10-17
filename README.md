# Low Level Design

| Topic | Path | Summary |
|-------|------|---------|
| Strategy Pattern | `src/designpatterns/strategy` | `without/` duplicates behaviour via inheritance; `with/` injects a `DriveStrategy` into `Vehicle`. |

## Run
In IntelliJ: open any `Main.java` and click ▶.

From terminal:
```bash
javac -d out $(find src -name "*.java")
java -cp out designpatterns.strategy.with.Main
```
