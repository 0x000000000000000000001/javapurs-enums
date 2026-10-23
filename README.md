# purescript-enums

Java port of the PureScript `enums` package. See the
[port maintenance guide](../javapurs/docs/port-maintenance.md)
for source layout, local dependency selection and JVM validation.

## JVM tests

`./bin/test` selects `enums` in the [common isolated runner](../javapurs/docs/testing.md#port-particulier), preserving this checkout and its outputs.
Use `./bin/test --help` for options and `./bin/test --clean` to rebuild the backend. The linked guide covers prerequisites, Java target/runtime settings and retained failure logs.

[![Latest release](http://img.shields.io/github/release/purescript/purescript-enums.svg)](https://github.com/purescript/purescript-enums/releases)
[![Build status](https://github.com/purescript/purescript-enums/workflows/CI/badge.svg?branch=master)](https://github.com/purescript/purescript-enums/actions?query=workflow%3ACI+branch%3Amaster)
[![Pursuit](https://pursuit.purescript.org/packages/purescript-enums/badge)](https://pursuit.purescript.org/packages/purescript-enums)

Operations for sequentially ordered types.

## Installation

```
spago install enums
```

## Documentation

Module documentation is [published on Pursuit](http://pursuit.purescript.org/packages/purescript-enums).
