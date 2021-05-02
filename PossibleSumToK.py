"""
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For Example, given [10, 15, 3 ,7] and k of 17, retunr true since 10 + 7 is 17.

try to do it in one pass
"""
# use twon pointers one start from begining another from end
def approach1(numbers, k):
    numbers.sort()
    i, j = 0, len(numbers)-1
    while i <= j:
        sum = numbers[i] + numbers[j]
        if sum == k:
            return True
        if sum > k:
            j -= 1
        if sum < k:
            i += 1
    return False

  
#if asked to print indexed as well then can try this approach
def approach2(numbers, k):
    myDict = dict()
    for i in range(0,len(numbers)):
        if (k-numbers[i]) in myDict:
            return [ myDict[k-numbers[i]], i]
        else:
            myDict[numbers[i]] = i
            
    return [-1,-1]

print(approach1([10, 15, 3 ,7], 17))
print(approach2([10, 15, 3 ,7], 17))
