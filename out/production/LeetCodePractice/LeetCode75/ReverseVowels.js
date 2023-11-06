// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in
// both lower and upper cases, more than once.

 


// Runtime: 72ms Memory: 52.38MB
var reverseVowels = function(s) {
    var stack = []

    for (var c of s) {
        if (isVowel(c))
            stack.push(c)
    }
    

    var index = 0
    var reverse = ""

    while (stack.length > 0 || index < s.length) {
        if (isVowel(s[index])) {
            reverse += stack.pop()
        } else 
            reverse+= s[index]

        index++
    }

    return reverse
}

var isVowel = (c) => {
    var temp = c.toLowerCase()
    var vowels = ['a', 'e', 'i', 'o', 'u']
    
    if (vowels.includes(temp))
        return true
}

var arr = ['a', 'e', 'i', 'o', 'u']
console.log(reverseVowels("leetcode"))