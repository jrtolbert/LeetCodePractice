// There are n kids with candies. You are given an integer array candies, 
// where each candies[i] represents the number of candies the ith kid has, 
// and an integer extraCandies, denoting the number of extra candies that you 
// have.
// Return a boolean array result of length n, where result[i] is true if,
//  after giving the ith kid all the extraCandies, they will have the 
// greatest number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.



// Runtime: 56ms  Memory: 42.13MB
var kidsWithCandies = function (candies, extraCandies) {
    var max = findMax(candies)
    var result = []

    for (var i = 0; i < candies.length; i++) {
        if(candies[i] + extraCandies >= max)
            result.push(true)
        else
            result.push(false)
    }

    return result
}

var findMax = (arr) => {
    var holder = 0
    for (var i = 0; i < arr.length; i++) {
        if (holder < arr[i])
            holder = arr[i]
    }
    return holder
}