class Solution(object):
    def findErrorNums(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        expectedOutput = n * (n + 1) // 2
        actualOutput = sum(nums)
        uniqueOutput = sum(set(nums))

        duplicate = actualOutput - uniqueOutput
        missing = expectedOutput - uniqueOutput

        return [duplicate, missing]