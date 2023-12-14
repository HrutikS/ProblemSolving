# Problem Statement
You are given a 0-indexed m x n binary matrix grid.   
A 0-indexed m x n difference matrix diff is created with the following procedure:
* Let the number of ones in the ith row be onesRowi.
* Let the number of ones in the jth column be onesColj.
* Let the number of zeros in the ith row be zerosRowi.
* Let the number of zeros in the jth column be zerosColj.

   
diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
Return the difference matrix diff.

   
Example 1:  
Input: haystack = "sadbutsad", needle = "sad"  
Output: 0  
Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.  
  
Example 2:  
Input: haystack = "leetcode", needle = "leeto"  
Output: -1  
Explanation: "leeto" did not occur in "leetcode", so we return -1.
