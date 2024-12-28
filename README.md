# Tree Constructor

## Problem Description
The function `TreeConstructor(strArr)` takes an array of strings stored in `strArr`, which contains pairs of integers in the format: `(i1,i2)`. Here, `i1` represents a child node in a tree, and `i2` signifies that it is the parent of `i1`.

For example, if `strArr` is:

```plaintext
["(1,2)", "(2,4)", "(7,2)"]
```

the resulting tree is:

```
    4
   /
  2
 / \
1   7
```

This forms a proper binary tree. In this case, the program should return the string `"true"` because a valid binary tree can be formed. If a proper binary tree cannot be formed with the integer pairs, the function should return the string `"false"`. All integers within the tree are unique, meaning there can only be one node in the tree with a given integer value.

## Examples

### Example 1
**Input:**

```plaintext
["(1,2)", "(2,4)", "(7,2)", "(9,5)"]
```

**Output:**

```plaintext
true
```

### Example 2
**Input:**

```plaintext
["(1,2)", "(3,2)", "(2,12)", "(5,2)"]
```

**Output:**

```plaintext
false
```

## Problem Approach
To solve the problem, recall the rules of a binary tree and implement these rules programmatically. The key rule is that each node can have at most two children. Following this, the solution can be structured as follows:

1. **Initialize Data Structures**:
   - Store all child nodes from the tree in an array `child_nodes`.
   - Store all parent nodes in an array `par_nodes`.

2. **Validate Tree Rules**:
   - Ensure that each integer in `child_nodes` is unique.
   - Ensure that integers in `par_nodes` do not occur more than twice.

3. **Determine Validity**:
   - If the conditions above are satisfied, the program should return `"true"`.
   - Otherwise, it should return `"false"`.

