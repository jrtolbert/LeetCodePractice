
var moveZeroes = (nums) => {
    var containZeroes = []
    while (true) {
        var index = nums.indexOf(0)
        if (index > -1) {
            containZeroes.push(nums[index])
            nums.splice(index, 1)
        } else { 
            break
        }
    }

    while (containZeroes.length > 0) {
        nums.push(containZeroes.pop())
    }

    console.log(nums)
    console.log(containZeroes)
}

var number = [0]

moveZeroes(number)
console.log(number)