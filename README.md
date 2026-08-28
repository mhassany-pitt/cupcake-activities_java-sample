# Cupcake Java Sample Activities

Canonical sample of how Cupcake activity types are authored in Java.

One shared `BankAccount.java` plus YAML definitions for each supported activity type (Learning Contents schemas).

## Activity types

| File | Activity type |
|------|----------------|
| `worked-example.yaml` | Worked example |
| `code-completion.yaml` | Code completion |
| `free-coding.yaml` | Free coding |
| `parsons-puzzle.yaml` | Parsons puzzle |
| `multiple-choice.yaml` | Multiple choice |
| `parameterized-codetracing.yaml` | Parameterized code tracing |

> *Note: Macro-visualization is Python-only as it relies on Python AST instrumentation and JSVEE.*

## Layout

```
BankAccount.java
worked-example.yaml
code-completion.yaml
free-coding.yaml
parsons-puzzle.yaml
multiple-choice.yaml
parameterized-codetracing.yaml
```
