## Question One
It will print **`one`**, **`three`** and **`four`**, because for **`one`** and **`three`** we are using the method **`equals()`** which compare the content of the string, for **`four`** we are using the operator **`==`** that compares the object reference, in this case, the string "Hello" is the object reference.
It will not print **`two`** and **`five`**, because the operator **`==`** as I said, it compares the object reference, and it case for `s` is references is to the string `Hello` and for `t` is the string `s`.

## Question Two
With the `append("aaa")` the string will be `aaa`, with the first `insert(1,"bb")` the string will be `abbaa`, with the last `insert(4,"ccc")` the final string will be `abbaccca`

## Question Three
It will be an error for the way that you initialize the string because the second expression is not an string is a boolean.

## Question Four
It is a infinite loop.

## Question Five
At first, I thought that will be an error because in the condition you are assigned instead of comparing with `"=="`, but then I realized that you can do that when you are using boolean variables

## Question Six
It will be an error because you are using int in the `"switch-case"` when you have to use enum values.
