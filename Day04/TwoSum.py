class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """        
        d = {}

        for i, j in enumerate(nums):
            a = target - j
            if a in d:
                return [d[a], i]
            else:
                d[j] = i

def main():
    solution = Solution()
    nums = [2, 7, 11, 15]
    target = 9
    result = solution.twoSum(nums, target)
    print("Indices:", result)

if __name__ == "__main__":
    main()
