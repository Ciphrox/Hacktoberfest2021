// Here are all the listed array functionalities which are in javascript arrays

// 1. Array.prototype.some()
/* 
In brief, the some() tests whether at least one element in an array
passes the test implemented by the provided function
*/
const arrSome = [1, 2, 3, 4, 5, 6].some(val => val > 2);
// Output -> true


// 2. Array.prototype.every()
/* 
In brief, the every() tests is mostly similar as some(), slight difference 
is that is will check all elements in an array
*/
const arrEvery = [1, 2, 3, 4, 5, 6].every(val => val > 3);
// Output -> false


// 3. Array.prototype.reduce()
/* 
In brief, the reduce() provides the sum of all elements in an array
*/
const arrReduce = [1, 2, 3, 4, 5, 6];
const reducer = (prevValue, currVal) => prevValue + currVal;
arrReduce.reduce(reducer);
// Output -> 21


// 4. Array.prototype.map()
/* 
In brief, the map() creates a new arrray populated with the result of
callback function for each element in the array.
*/
const arrMap = [1, 2, 3, 4, 5, 6].map(val => val * 2);
// Output -> [2, 4, 6, 8, 10, 12]


// 5. Array.prototype.flat()
/* 
In brief, The flat() method creates a new array with all sub-array 
elements concatenated into it recursively up to the specified depth.
Note - You can set the flat value to any value according to multiple arrays.
By default value is 1
*/
const arrFlat = [1, 2, [3, 4, [5, 6, [7, 8, [9, 10]]]]].flat();
// Output -> [1, 2, 3, 4, Array(3)]


// 6. Array.prototype.filter()
/* 
In brief, the filter() method creates a new array with all elements 
that pass the test implemented by the provided function.
*/
const arrFilter = [1, 2, 3, 4, 5, 6].filter(item => item % 2 == 0);
// Output -> [2, 4, 6]


// 7. Array.prototype.forEach()
/* 
In brief, the forEach() method executes a provided function once 
for each array element.
*/
const arrForEach = [1, 2, 3, 4, 5, 6].forEach(item => console.log(item * 2));
// Output -> [2, 4, 6, 8, 10, 12]


// 8. Array.prototype.find()
/* 
In brief, the find() method returns the value of the first element in 
the provided array that satisfies the provided testing function. 
If no values satisfy the testing function, undefined is returned.
*/
const arrFind = [1, 2, 3, 4, 5, 6].find(val => val > 4);
// Output -> 5


// 9. Array.prototype.sort()
/* 
In brief, The sort() function is very common and simply allows 
us to sort the elements of an array in place and returning the 
sorting array.
*/
// Ascending order is by default
const arrSortAsc = [2, 6, 5, 3, 1, 4].sort((a, b) => a - b);
// Output -> [1, 2, 3, 4, 5, 6]

// Descending order
const arrSortDesc = [2, 6, 5, 3, 1, 4].sort((a, b) => b - a);
// Output -> [6, 5, 4, 3, 2, 1]


// 10. Array.prototype.concat()
/* 
In brief, the concat() method is used to merge two or more 
arrays into a new array.
*/
const arrConcat = [1, 2, 3, 4, 5, 6].concat(['a', 'b', 'c', 'd']);
// Output -> [1, 2, 3, 4, 5, 6, 'a', 'b', 'c', 'd']


// 11. Array.prototype.includes()
/* 
In brief, the includes() method determines whether an array 
includes a certain value among its entries, returning true or false
*/
const arrIncludes = [1, 2, 3, 4, 5, 6].includes(3);
// Output -> true


// 11. Array.prototype.flatMap()
/* 
In brief, the flatMap() method applies a function to each element 
of the array and then flatten the result into an array. 
It combines flat() and map() in one function.
*/
const arrFlatMap = [[1], [2], [3], [4], [5]].flatMap(val => val * 10);
// Output -> [10, 20, 30, 40, 50]