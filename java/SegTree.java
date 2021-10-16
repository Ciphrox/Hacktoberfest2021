
class SegTree{
    int leftmost;
    int rightmost;
    SegTree leftChild;
    SegTree rightChild;
    int sum;
    public SegTree(int leftmost,int rightmost,int[] a){
        this.rightmost = rightmost;
        this.leftmost = leftmost;

        if(leftmost == rightmost){
            sum = a[leftmost];
        }
        else{
            int mid = (leftmost+rightmost)/2;
            leftChild = new SegTree(leftmost,mid,a);
            rightChild = new SegTree(mid+1,rightmost,a);
            recalculate();
        }
    }
    public void recalculate(){
        if(leftmost == rightmost) return;
        sum = leftChild.sum+rightChild.sum;
    }

    public void pointUpdate(int index,int val){
        if(leftmost == rightmost){
            sum = val;
            return;
        }
        if(index <= leftChild.rightmost){
            leftChild.pointUpdate(index, val);
        }
        else rightChild.pointUpdate(index, val);
        recalculate();
    }
    public int rangeSum(int l,int r){
        if(r < leftmost || l > rightmost){
            return 0;
        }
        else if(l<= leftmost && r>=rightmost) {
            return sum;
        }
        return leftChild.rangeSum(l,r)+rightChild.rangeSum(l,r);
    }

}
