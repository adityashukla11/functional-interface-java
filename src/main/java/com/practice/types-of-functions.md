Functional Interface are of mainly 4 types:
- Function
- Consumer
- Predicate
- Supplier

Functions:
- Takes in a single argument, process it and returns a value.
- BiFunction take 2 argument and returns a single value.
- UnaryOperators take in a single value and return a single value of same datatype.
- BinaryOperators take in 2 values, but both should be of same datatype and returns a value with same datatype.
- All these interface offer an apply() method.

Supplier
- Supplier is a functional interface which doesn't take any value but returns a value.
- It offers a get() method.

Consumer
- It takes in a value, but doesn't return anything
- BiConsumer takes in 2 values but doesn't return anything.
- It offers a accept() method.

Predicate
 - It takes in a single value, and returns a boolean value
 - It offers a test() method.
 - It also and, or, negate methods.
 - BiPredicate takes in 2 variables and returns a boolean value.
