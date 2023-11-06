// can we make this recursive as well? - given the set parameters, maybe that's not the best
// immediate idea. But what if I had a cache? It could reduce the need for redundant computation
// caching didn't handle the test case from hell, switching to iterative option
// iterative was the solution, courtesy of chatgpt

var productExceptSelf = function(nums) {
    console.log("We're going into the thick of it")
    var result = []
    var index = 0

    while (index < nums.length) {
        var value = helper(nums, index, {})
        if (value == -0)
            result.push(0)
        else
            result.push(value)
        index++
    }

    return result
}

var productExceptSelfIterative = function(nums) {
    var n = nums.length;
    var result = new Array(n);
    
    // Initialize two arrays to store products to the left and right of each element.
    var leftProducts = new Array(n);
    var rightProducts = new Array(n);
    
    leftProducts[0] = 1;
    rightProducts[n - 1] = 1;
    
    // Compute left products.
    for (var i = 1; i < n; i++) {
        leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
    }
    
    // Compute right products.
    for (var i = n - 2; i >= 0; i--) {
        rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
    }
    
    // Calculate the result by multiplying left and right products.
    for (var i = 0; i < n; i++) {
        result[i] = leftProducts[i] * rightProducts[i];
    }
    
    return result;
}


// arr: array of numbers, left: left current value, right: right of current value 
// found it difficult to keep track of left and right values, decided to split the problem
// into smaller problems, chunks
// issue: takes too long for absurd test case lol

var helper = (arr, index, cache) => {
    var left = helperLeft(arr, index - 1, cache)
    var right = helperRight(arr, index + 1, cache)

    return left * right
}

var helperLeft = (arr, index, cache) => {
    if (index < 0)
        return 1
    if (cache[index] !== undefined) 
        return cache[index]

    var result = arr[index] * helperLeft(arr, --index, cache)
    cache[index] = result

    return result
}

var helperRight = (arr, index, cache) => {
    if (index > arr.length - 1)
        return 1

    if (cache[index] !== undefined) 
        return cache[index]    

    var result = arr[index] * helperRight(arr, ++index, cache)
    cache[index] = result

    return result
}


var arr = [1,2,3,4]
console.log(productExceptSelfIterative(arr))