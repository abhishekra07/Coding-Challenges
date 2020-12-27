import numpy

def calculateMultiplication(nums):
    output = [1]
    prev = 1
    
    for i in range(1,len(nums)):
        prev = prev * nums[i-1]
        print(str(i) + " " + str(prev) + " " + str(nums[i-1]))
        output.append(prev)
    
    print(output)
    
    next = 1
    for i in range(len(nums)-2, -1, -1):
        next = next * nums[i+1]
        print(str(i) + " " + str(next)+ " " + str(nums[i+1]))
        output[i] *= next
        
    return output

# using numpy.prod to get multiplication
def calculateMultiplicationUsingNumpy(nums):
    multipliedResult = numpy.prod(nums)
    output = []
    for i in nums:
        output.append(multipliedResult//i)
    return output

def calculateMultiplicationUsingDivision(nums):
    multipliedResult = 1;
    for num in nums:
        multipliedResult *= num
        
    output = []
    for i in nums:
        output.append(multipliedResult//i)
    return output
    
print(calculateMultiplication([1,2,3,4]))
print(calculateMultiplicationUsingNumpy([1,2,3,4]))
print(calculateMultiplicationUsingDivision([1,2,3,4]))
