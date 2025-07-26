class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a = 0
        for i in range(len(nums)):
            temp = str(nums[i])
            if len(temp) % 2 == 0:
                a += 1
        return a


def main():
    sol = Solution()

    test_cases = [
        [12, 345, 2, 6, 7896],     
        [555, 901, 482, 1771]
    ]

    for i, nums in enumerate(test_cases, 1):
        result = sol.findNumbers(nums)
        print(f"Test case {i}: Input: {nums}\nOutput: {result}\n")


if __name__ == "__main__":
    main()
