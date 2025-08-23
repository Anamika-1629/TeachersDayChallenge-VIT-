class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        new_s = "".join(c.lower() for c in s if c.isalnum())

        if new_s == new_s[::-1]:
            return True
        else:
            return False

if __name__ == "__main__":
    sol = Solution()
    test1 = "A man, a plan, a canal: Panama"
    print(f'"{test1}" is palindrome? {sol.isPalindrome(test1)}')

    test2 = "race a car"
    print(f'"{test2}" is palindrome? {sol.isPalindrome(test2)}')
