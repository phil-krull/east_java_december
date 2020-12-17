// Binary Search Trees
// -----------------------------------------------------------------
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
        var newNode = new BSTNode(newVal);
        if(!this.root){
            this.root = newNode;
            return;
        } else {
            var runner = this.root;
            while(runner){
                if(runner.val < newVal){
                    if(runner.right == null){
                        runner.right = newNode;
                        return;
                    }
                    runner = runner.right;
                }
                else {
                    if(runner.left == null){
                        runner.left = newNode;
                        return;
                    } 
                    runner = runner.left;
                }
            }
        }
    }
    inOrderArray(node = this.root, rArr = []){
        // returns an array with the values in ascending order
    }
}

function isValid(tree) {
    // returns a boolean if the given tree is a valid binary search tree
}

const myTree = new BST();
myTree.add(50);
myTree.add(25);
myTree.add(45);
myTree.add(75);
myTree.add(10);
myTree.add(60);
myTree.add(80);
console.log(myTree.inOrderArray())
// [10,25,25,45,50,60,75,80]
console.log(isValid(myTree));
// true

const treeTwo = new BST();
treeTwo.add(30);
treeTwo.add(20);
treeTwo.add(10);
treeTwo.add(5);
treeTwo.add(60);
treeTwo.add(40);
treeTwo.add(70);
const newBSTNode = new BSTNode(55);
treeTwo.root.left.right = newBSTNode;
console.log(treeTwo.inOrderArray());
// [5, 10, 20, 55, 30, 40, 60, 70]
console.log(isValid(treeTwo));
// false