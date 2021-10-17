#include<bits/stdc++.h>
using namespace std;
struct node{
    int data;
    node* left;
    node* right;
    node(int val){
        data=val;
        right=NULL;
        left=NULL;
    }
};
int search(int inorder[],int start,int end,int curr){
    for(int i=start;i<=end;i++){
        if(inorder[i]==curr){
            return i;
        }
    }
    return -1; //will never reach here
}
void inorderPrint(node* root){
    if(root==NULL){
        return;
    }
    inorderPrint(root->left);
    cout<<root->data<<" ";
    inorderPrint(root->right); 
}
node* buildTree(int preorder[],int inorder[],int start,int end){
    static int idx=0;
    if(start>end){
        return NULL;
    }
    int curr=preorder[idx];
    idx++;
    node* n=new node(curr);
    if(start==end){
        return n;
    }
    int pos=search(inorder,start,end,curr);
    n->left=buildTree(preorder,inorder,start,pos-1);
    n->right=buildTree(preorder,inorder,pos+1,end);
    return n;
}
int main(){
    int preorder[]={1 ,2 ,4 ,5 ,3 ,6 ,7};
    int inorder[]={4 ,2 ,5 ,1 ,6 ,3 ,7};
    inorderPrint(buildTree(preorder,inorder,0,6));
    return 0;
}