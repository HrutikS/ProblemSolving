# Problem Statement
An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down the average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother). If one or more of the surrounding cells of a cell is not present, we do not consider it in the average (i.e., the average of the four cells in the red smoother).    
![image](https://github.com/HrutikS/ProblemSolving/assets/134339154/1521b5d5-d647-4872-a9c0-056939f70528)    
Given an m x n integer matrix img representing the grayscale of an image, return the image after applying the smoother on each cell of it.

Example 1:  
![image](https://github.com/HrutikS/ProblemSolving/assets/134339154/39b8c100-ca23-456c-8606-aa1a576c884b)   
Input: img = [[1,1,1],[1,0,1],[1,1,1]]   
Output: [[0,0,0],[0,0,0],[0,0,0]]  
Explanation:    
For the points (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0   
For the points (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0   
For the point (1,1): floor(8/9) = floor(0.88888889) = 0
  
Example 2:  
![image](https://github.com/HrutikS/ProblemSolving/assets/134339154/5a14f0e7-8897-49f8-9337-4f95e3770cf2)   
Input: img = [[100,200,100],[200,50,200],[100,200,100]]   
Output: [[137,141,137],[141,138,141],[137,141,137]]   
Explanation:   
For the points (0,0), (0,2), (2,0), (2,2): floor((100+200+200+50)/4) = floor(137.5) = 137   
For the points (0,1), (1,0), (1,2), (2,1): floor((200+200+50+200+100+100)/6) = floor(141.666667) = 141   
For the point (1,1): floor((50+200+200+200+200+100+100+100+100)/9) = floor(138.888889) = 138
