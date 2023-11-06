// str1 = s, str2 = t
// for two strings s and t, we say t divides s if and only if s = t + ... + t

// Runtime: 101ms Memory: 48.09MB --> I'm taking it lol
var gcdOfStrings = function(str1, str2) {
    var target = ""
    var temp = "" 
    //var min = str1.length > str2.length ? str1.split(str2[0]).length : str2.split(str2[0]).length

    for (var i = 0; i < str2.length; i++) {
        temp += str2[i]
        var arr1 = str1.split(temp)
        var arr2 = str2.split(temp)
        console.log("Array1:", arr1)
        console.log("Array2:", arr2)
        console.log("Temp:", temp)
        // console.log("Min value:", min)
        if (isEmpty(arr2) && isEmpty(arr1)) {
            console.log("Array1 and Array2 have empty cells")
            if(arr1.length > 1 && arr2.length > 1) {
                console.log("Making target temp")
                target = temp
            }
        } 
    }

    return target
}

var isEmpty = function (arr) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] != "")
            return false
    }
    return true
}


// This attempt didn't work, switching up the method
// if(str1.length > str2.length) {
//     var mainString = str1
//     var splitter = str2
// }
// else {
//     var mainString = str2
//     var splitter = str1
// }
// var split = mainString.split(splitter)
// console.log(split)
// var res = split.reduce((acc, curr) => {
//     return acc + curr
// }, "")

// console.log(res)

// if (res == "")
//     return str2
// else if (str2.includes(res))
//     return res
// else
//     return ""

var testString = "TAUXXTAUXXTAUXXTAUXXTAUXX"
var testSub = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"
var testArr = testString.split(testSub)
console.log(testArr)
//console.log(testString.length, testSub.length, expected.length)
//console.log(testArr)
console.log(gcdOfStrings(testString, testSub))