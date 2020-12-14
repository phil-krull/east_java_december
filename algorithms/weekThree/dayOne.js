Binary Search Trees
-----------------------------------------------------------------
class BSTNode {
    constructor(value) {
        this.val = value;
        this.left = null;
        this.right = null;
    }
}

class BST {
    constructor() {
        this.root = null;
    }
    add(newVal) {

    }
    contains(searchVal) {

    }
}

const myTree = new BST();
myTree.add(50);
myTree.add(25);
myTree.add(75);
myTree.add(10);
myTree.add(80);
console.log(myTree.contains(30));
// false
console.log(myTree.contains(80));
// true