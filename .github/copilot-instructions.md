## Quick orientation

This is a tiny Spring Boot demo project (groupId=com.example, artifactId=demo). The codebase is intentionally minimal — most logic should live under `src/main/java/com/example/demo` and tests under `src/test/java/com/example/demo`.

Key files
- `pom.xml` — Maven, Spring Boot 4 snapshot, Java 25 (check JDK compatibility).
- `mvnw`, `mvnw.cmd` — Maven wrapper; prefer `./mvnw` in the repo root for reproducible builds.
- `src/main/java/com/example/demo/LeetCodeApplication.java` — main application class (contains non-Java console-style calls that currently prevent compilation).
- `src/test/java/com/example/demo/LeetCodeApplicationTests.java` — basic SpringBootTest starter test.
- `src/main/resources/application.properties` — runtime configuration.

What to know (big picture)
- This is a standard Spring Boot app. Expect controllers, services, and components to be placed under `com.example.demo` (use subpackages like `.controller`, `.service`, `.repo`).
- No external integrations are present in the repo (no DB drivers, no web clients). The `pom.xml` references Spring Snapshot repositories — builds may require network access to repo.spring.io.

Build & test commands (use these first)
- Build (with wrapper):
  - `./mvnw -DskipTests package` — produce artifact (still compiles sources).
  - `./mvnw test` — run unit tests.
  - `./mvnw spring-boot:run` — run the app locally.

Project-specific gotchas
- `LeetCodeApplication.java` currently contains non-Java console calls (for example: `Console.WriteLine`, `Console.ReadKey`) and a call to an undefined `Tinh(...)` method. This will fail Java compilation. If an agent is asked to run or build, the first action should be to inspect and either fix or temporarily replace `main` with a minimal Java-compatible entrypoint (for example, `System.out.println("starting")`).
- Java version is set to `25` in `pom.xml`. Ensure the environment uses a matching JDK or update `pom.xml` to target a supported version for your environment.
- Spring Boot version is a SNAPSHOT (4.0.0-SNAPSHOT). Network access to Spring snapshot repo may be required to resolve dependencies.

Suggested first tasks for an AI code agent
1. Run a fast build to surface compiler errors: `./mvnw -DskipTests package`.
2. If build fails due to `LeetCodeApplication.java`, open that file and either:
   - Replace the body of `main` with a minimal Java entry (use `System.out.println`) to allow builds, or
   - Implement `Tinh(int a, int b)` and replace `Console.*` with `System.out.*` if the intended logic is known.
3. Add package-structured code under `com.example.demo.controller` / `.service` and corresponding tests in `src/test/java/com/example/demo`.

How to run tests locally
- Use the wrapper: `./mvnw test`.
- To run a single test class: `./mvnw -Dtest=LeetCodeApplicationTests test`.

Notes for contributors/agents
- Keep changes scoped: update or add classes under `src/main/java/com/example/demo` and tests under `src/test/java/com/example/demo`.
- If you update `pom.xml` (e.g., change Java version or Spring Boot release), run a full build and update any README or CI config that assumes the previous values.

If anything here is unclear or you want examples of how to fix `LeetCodeApplication.java`, tell me which style you prefer (quick patch to make the project build vs implement intended algorithm) and I will prepare a candidate change.
