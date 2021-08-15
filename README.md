[![Continuous Integration](https://github.com/alessandrocandolini/repository-sommelier/actions/workflows/ci.yml/badge.svg)](https://github.com/alessandrocandolini/repository-sommelier/actions/workflows/ci.yml)

# repository-sommelier

A Scala 3 / Cats-Effect 3 / fs2 command-line tool to taste sbt Scala repos. 

Wish list of capabilities:
* detect sbt version, scala version, dependencies 
* update sbt version, scala version, dependencies through a number of heuristics (or through a more rigorous approach if feasible)
* support evolutions and conditional updates 

Not sure yet if I want this program to also be responsible of downloading the repo and opening the PRs. In the MVP I will just assume the project is cloned. 

## Why not using Scala-Steward

Please use [Scala Steward](https://github.com/scala-steward-org/scala-steward) and not this project. I'm working on this project just for fun, and because sometimes i need a narrow set of more opinionated options compared to Scala Steward. 

## Run the tests

```shell
sbt test
```

## Build fat jar 

The project uses `sbt-assembly` to create a "fat" jar
```
sbt assembly
```

The plugin is configured explicitly to run tests on `assembly` task. The generated jar is `repository-sommelier.jar.jar`
