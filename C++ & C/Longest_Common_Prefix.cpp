// Problem https://leetcode.com/problems/longest-common-prefix

#include <bits/stdc++.h>

class Solution
{
public:
  std::string longestCommonPrefix(std::vector<std::string> &strs)
  {
    std::string res = "";
    if (strs.size() == 0)
      return res;
    if (strs[0].size() == 0)
      return res;
    if (strs.size() == 1)
      return strs[0];
    int j = 0;
    bool flag = false;
    while (true)
    {
      for (int i = 0; i < strs.size() - 1; i++)
      {
        if (strs[i][j] != strs[i + 1][j])
        {
          flag = true;
          break;
        }
      }
      if (flag)
        break;
      if (j >= strs[0].size())
        break; // this will check if j is getting outside
      j++;
    }

    for (int i = 0; i < j; i++)
      res += strs[0][i];
    return res;
  }
};

int main()
{
  Solution solution;
  std::vector<std::string> str = {"flower", "flow", "flight"};
  std::cout << solution.longestCommonPrefix(str) << std::endl;
  return 0;
}