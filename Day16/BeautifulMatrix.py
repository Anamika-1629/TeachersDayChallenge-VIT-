class Solution:
    def position(self, arr):
        for i in range(len(arr)):
            for j in range(len(arr[i])):
                if arr[i][j] == 1:
                    return abs(i - 2) + abs(j - 2)
        return -1 

def main():
    print("Enter the 5x5 matrix (5 rows, each with 5 numbers separated by spaces):")
    matrix = []
    for _ in range(5):
        while True:
            row = input().strip().split()
            if len(row) != 5:
                print("Error: Each row must have exactly 5 numbers. Please try again.")
                continue
            try:
                row = [int(num) for num in row]
                matrix.append(row)
                break
            except ValueError:
                print("Error: Please enter only numbers. Try again.")

    sol = Solution()
    distance = sol.position(matrix)
    
    if distance == -1:
        print("The number 1 was not found in the matrix.")
    else:
        print(f"Manhattan distance of 1 from center: {distance}")

if __name__ == "__main__":
    main()