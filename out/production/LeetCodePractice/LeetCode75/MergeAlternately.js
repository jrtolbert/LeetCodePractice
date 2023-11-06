// Runtime: 56ms, Memory: 43.19MB
var mergeAlternately = function(word1, word2) {
    var maxLen = Math.max(word1.length, word2.length)
    var targetString = ""

    for(var i = 0; i < maxLen; i++) {
        targetString += word1.charAt(i) != undefined ? word1.charAt(i) : word2.charAt(i)
        targetString += word2.charAt(i) != undefined ? word2.charAt(i) : word1.charAt(i)
    }

    return targetString
}

// Optimized Attempt
// Runtime: 57ms, Memory: 42.23MB
var mergeAlternatelyOpt = function (word1, word2) {
    var index = 0
    var targetString = ""

    while (index < Math.min(word1.length, word2.length)) {
        targetString += word1.charAt(index)
        targetString += word2.charAt(index)
        index++
    }

    if (targetString.length == word1.length + word2.length)
        return targetString
    else {
        targetString += word1.length > word2.length ? word1.slice(index, word1.length) : word2.slice(index, word2.length)
        return targetString
    } 
}


var someString = "ab"
var anotherString = "pqrs"

var someArr = [...someString]
var anotherArr = [...anotherString]

console.log(someArr[3] + anotherArr[1])

console.log(mergeAlternatelyOpt(someString, anotherString))