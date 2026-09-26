# Java Problems and Solutions

A collection of classic Java coding problems and their solutions, each covered by JUnit 4 unit tests.

## Project Structure

```
├── src/          # main source code
└── tests/        # JUnit 4 test classes
```

## Requirements

- Java 8+
- JUnit 4 (test dependency)
- Maven 3.x (optional — for building and running all tests from the command line)
- An IDE: Eclipse or IntelliJ IDEA (both work out of the box)

## Setup and Run

### From the command line (Maven)

```bash
mvn clean install   # build and run all tests
```

### In Eclipse

1. Import the project: `File → Import… → Maven → Existing Maven Projects`, select the project root folder, and click *Finish*.
- If the project is not a Maven project yet, import it via `File → Import… → General → Existing Projects into Workspace`, then right-click the project → *Configure → Convert to Maven Project*.
2. Make sure `src/` is on the build path as a source folder and `tests/` as a test source folder: right-click the folder → *Build Path → Use as Source Folder*.
3. Right-click a test class or package → **Run As → JUnit Test**.

### In IntelliJ IDEA

1. Import the project: `File → Open…` and select the project root folder (the one containing `src/` and `tests/`).
- For a Maven project, IDEA detects the `pom.xml` automatically and imports the configuration.
2. Verify the folder marks: right-click `src/` → *Mark Directory as → Sources Root*, and `tests/` → *Mark Directory as → Test Sources Root* (IntelliJ usually marks these automatically).
3. Make sure JUnit 4 is available on the test classpath (add it to `pom.xml`, or IntelliJ will offer to add the library when you open a test).
4. Right-click a test class or package → **Run '…Tests'** (green ▶ icon in the gutter also works).

## Running a single test

- **Eclipse:** right-click the test class or method → *Run As → JUnit Test*.
- **IntelliJ:** click the ▶/▶︎ icon next to the test class or method.
- **Maven:** `mvn test -Dtest=ClassName`

## Contributing

Feel free to open an issue or a pull request with new problems, improved solutions, or additional tests.