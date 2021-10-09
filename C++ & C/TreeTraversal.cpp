#include <bits/stdc++.h>

//PreOrder => Root Left Right
//InOrder => Left Root Right
//PostOrder => Left Right Root

class TreeNode
{
public:
  int val;
  struct TreeNode *left;
  struct TreeNode *right;
  TreeNode() : val(0), left(nullptr), right(nullptr) {}
  TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

void PreOrderRecursive(TreeNode *root)
{
  if (root == nullptr)
  {
    return;
  }
  std::cout << root->val << " ";
  PreOrderRecursive(root->left);
  PreOrderRecursive(root->right);
}

void InOrderRecursive(TreeNode *root)
{
  if (root == nullptr)
  {
    return;
  }
  InOrderRecursive(root->left);
  std::cout << root->val << " ";
  InOrderRecursive(root->right);
}

void PostOrderRecursive(TreeNode *root)
{
  if (root == nullptr)
  {
    return;
  }
  PostOrderRecursive(root->left);
  PostOrderRecursive(root->right);
  std::cout << root->val << " ";
}

int main()
{

  TreeNode *root = new TreeNode(1);
  root->left = new TreeNode(2);
  root->right = new TreeNode(3);
  root->left->left = new TreeNode(4);
  root->left->right = new TreeNode(5);
  root->right->left = new TreeNode(6);
  root->right->right = new TreeNode(7);

  /*
                    1
                  /   \
                 2     3
               /  \   /  \
              4    5 6    7
  */

  std::cout << "Select Choice: \n";
  std::cout << "1. Pre-Order\n";
  std::cout << "2. In-Order\n";
  std::cout << "3. Post-Order\n";

  int choice;
  std::cin >> choice;

  switch (choice)
  {
  case 1:
  {
    std::cout << "\nPreorder Recursive \n";
    PreOrderRecursive(root);
  }
  break;
  case 2:
  {
    std::cout << "\nInorder Recursive \n";
    InOrderRecursive(root);
  }
  break;
  case 3:
  {
    std::cout << "\nPostorder Recursive \n";
    PostOrderRecursive(root);
  }
  break;

  default:
    break;
  }

  return 0;
}