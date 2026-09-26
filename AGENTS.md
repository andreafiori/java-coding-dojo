# [AGENTS.md](http://AGENTS.md)

Guidance for AI coding agents working on this repository.

## Project overview

A collection of classic Java coding problems and solutions, each covered by JUnit 4 unit tests.

- **Language:** Java 8 (compiler source/target 1.8)
- **Build tool:** Maven
- **Test framework:** JUnit 4 (with Hamcrest matchers)
- **Layout:** non-standard — main sources in `src/`, test sources in `tests/` (mapped in `pom.xml` via `sourceDirectory` / `testSourceDirectory`)

## Common commands

```bash
mvn clean install              # full build + all tests
mvn test                       # run tests only
mvn test -Dtest=ClassName      # run a single test class
mvn test -Dtest=ClassName#methodName  # run a single test method
```

With Docker:

```bash
docker compose run --rm test   # run all tests inside a container
docker compose run --rm build  # full build inside a container
```

## Code style

- Keep solutions self-contained: one problem per class, no shared utility classes unless truly reusable.
- Prefer plain Java 8 (streams, `Optional` only where they add clarity) — do not use Java 9+ APIs.
- `commons-lang3` is the only runtime dependency; use it only when it simplifies the solution, not as a shortcut around the exercise's intent.

## Tests

- Every solution **must** have a corresponding JUnit 4 test class in `tests/`, mirroring the source package.
- Use JUnit 4 idioms only (`org.junit.Test`, `Assert.*`, `@Before`), not JUnit 5 (`org.junit.jupiter`).
- Cover edge cases: empty input, null (where applicable), single element, large input.
- Test names follow `methodName_condition_expectedResult` or descriptive camelCase.

## Conventions

- Do not restructure the directory layout to the Maven standard (`src/main/java`, `src/test/java`) — the current layout is intentional and mapped in the POM.
- Do not upgrade the Java target past 8 without explicit instruction.
- Keep dependencies minimal; adding a new dependency requires justification.

## Verification

Before submitting changes, run `mvn clean install` and ensure all tests pass. New code without passing tests should not be committed.