## Problem description
The function TreeConstructor(strArr) takes the array of strings stored in strArr, which will contain pairs of integers in the format: (i1,i2), where i1 represents a child node in a tree and integer i2 signifies that it is the parent of i1.

If strArr is ["(1,2)", "(2,4)", "(7,2)"]
we get the following tree    4
                            /
                           2
                          / \
                         1   7
which we can see forms a proper binary tree. This program should, in this case, return the string "true" bacuase a valid binary tree can be formed. If a proper binary tree cannot formed with the integers pairs, then return the string "false". All of the integers within the tree will be unique, which means there can only be one node in the tree with the given integer value.

## Example
Input: new String[]{"(1,2)", "(2,4)", "(7,2)", "(9,5)"}
Output: true

Input: new String[]{"(1,2)", "(3,2)", "(2,12)", "(5,2)"}
Output: false

## Problem approach

Recall the rules of a binary tree, then define this rules in the program, this way we will be conceptually building a proper binary tree. The rule is that each node contains one element and and it can only have less than or equal to two children.

Store all children nodes that exist from the tree to an array child_nodes, and store all parent nodes to an array par_nodes. Then check if integers in child nodes are unique, and those of parent nodes are not occuring more than twice. Hence a valid binary tree is defined according to these rules.