/*As you can see there are five questions in this contest, each question has submission from different participants. Plagiarism needs to be checked for each submission.
So, a successful submission is a submission that is accepted and has passed a plagiarism check. Among all submissions, there is a submission Id which along with its all children 
fails plagiarism check.
Input Format
The first line of the input contains an integer X, denoting Id of Submission which fails plagiarism check. X will definitely be present in the tree.
The second line of the input contains the nodes of the tree. The binary tree is constructed in level order format.
Output format
Return the sum of all successful submission ID's.
Input
5
1 2 3 4 5 6 7 -1 -1 8 9 -1 -1 -1 -1 -1 -1 -1 -1
Output
23
Input:
                               1
            
                         /           \
      
                      2                 3
                    
                 /       \            /         \
               4           5        6             7
                        /     \
                      8         9                
Output:
  sum of all successful submission = 1 + 2 + 3 + 4 + 6 + 7 = 23 */

  int PlagiarismTest(Node root, int x)
  {
        // write your code here
        if(root==null)
          return 0;
        if(root.value==x)
          return 0;

        return PlagiarismTest( root.left, x) + 
        PlagiarismTest(root.right, x) + root.value ;
  }
