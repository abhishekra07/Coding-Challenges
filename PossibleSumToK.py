"""
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For Example, given [10, 15, 3 ,7] and k of 17, retunr true since 10 + 7 is 17.

try to do it in one pass
"""
# use twon pointers one start from begining another from end
def approach1(numbers, k):
    j = len(numbers) - 1
    for i in range(0,len(numbers)):
        if i < j and (numbers[i] + numbers[j] == k):
            return True
        
    return False

  
print(approach1([10, 15, 3 ,7], 17))
