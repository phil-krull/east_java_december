function hashMap(cap) {
    this.capacity = cap;
    this.table = [];

    add(key, val) {
        // Create an add(key, val) method on hashMap to add a new key and value to the map. This entails hashing key, mod’ing it into the size of your array, and placing the value there.
    }

    find(key) {
        // Create a find(key) method to return value for given key. If key is not found, return null.
    }
}


// Use the below to hash a string:
String.prototype.hashCode = function() {
    var hash = 0;
    if (this.length == 0) return hash;
    for (i = 0; i < this.length; i++) {
        char = this.charCodeAt(i);
        hash = ((hash<<5)-hash)+char;
        hash &= hash; //Convert to 32b int
    }
    return hash;
}

let myString = "Today";
let myHashCode = myString.hashCode();

console.log('myHashCode', myHashCode);