```groovy
def myMethod(List<Integer> numbers) {
    numbers.eachWithIndex { number, index ->
        if (number % 2 == 0) {
            println "Even number: $number at index: $index"
        } else {
            println "Odd number: $number at index: $index"
        }
    }
}

myMethod([1, 2, 3, 4, 5])
```