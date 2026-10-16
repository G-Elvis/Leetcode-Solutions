class Solution(object):
    def maximumWealth(self, accounts):
        max_wealth = 0
        for i in range (len(accounts)):
            account_wealth = 0
            for j in range (len(accounts[i])):
                account_wealth += accounts[i][j]
                max_wealth = max(max_wealth, account_wealth)
        return max_wealth

solution = Solution()
account1 = [[1,2,3,4],[4,5,4,4]]
print(solution.maximumWealth(account1))