// You have a long flowerbed in which some of the plots are planted, 
// and some are not. However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, 
// where 0 means empty and 1 means not empty, and an integer n, 
// return true if n new flowers can be planted in the flowerbed 
// without violating the no-adjacent-flowers rule and false otherwise.

// Runtime: 57ms  Memory: 43.92MB
var canPlaceFlowers = function (flowerbed, n) {
    if (flowerbed.length == 1) {
        if (n == 0 && flowerbed[0] == 1)
            return true
        if (flowerbed[0] == 0)
            return true
        else 
            return false
    }

    if (flowerbed[0] == 0 && flowerbed[1] == 0) {
        flowerbed[0] = 1
        n--
    }
    
    var prev = flowerbed[0]
    for (var i = 1; i < flowerbed.length; i++) {
        var curr = flowerbed[i]
        var next = flowerbed[i + 1]
        var canPlant = prev == 1 || curr == 1 || next == 1 ? false : true  
        if (n > 0 && canPlant) {
            flowerbed[i] = 1
            n--
            curr = 1
        }
        prev = curr

    }
    console.log(flowerbed)
    console.log(n)
    return n <= 0 ? true : false
}



var testArr = [0,0,0,0,0,1,0,0]
//console.log(flowerHelper(testArr))
console.log(canPlaceFlowers(testArr, 0))