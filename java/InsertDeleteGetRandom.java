/* 
Implement the RandomizedSet class:

RandomizedSet() Initializes the RandomizedSet object.
bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.

You must implement the functions of the class such that each function works in average O(1) time complexity. 

*/

class RandomizedSet {
    HashSet<Integer> set;
    ArrayList<Integer> al;
    Random rd;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        rd=new Random();
        al=new ArrayList<Integer>();
        set=new HashSet<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!set.contains(val))
        {
            set.add(val);
            al.add(val);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
         if(set.contains(val))
        {
            set.remove(val);
            al.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return al.get(rd.nextInt(al.size()));
    }
}
