// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. 
//The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or 
// multiple spaces between two words. The returned string should 
// only have a single space separating the words. 
// Do not include any extra spaces.

// Runtime: 55ms Memory: 43.71MB
var reverseWords = function(s) {
    var string = s.split(" ").filter((cell) => {
        return cell != ''
    })
    var result = []

    for (var i = string.length; i >= 0; i--) {
        result.push(string[i])
    }
    result = result.join(" ")

    return result.substring(1, result.length)
}


console.log(reverseWords("the sky is blue   "))