// Remove Duplicates
// ------------------------------------------------------------------
// Remove duplicates from an array. Do not alter the original array; return a new one, keeping results ‘stable’ (retain original order). Given [1, 2, 1, 3, 4, 2], return a new array [1, 2, 3, 4].

// Second: Work ‘in-place’ in given array. Alter order if needed (stability is not required). Ex.: [1,2,1,3,4,2] could become [1,2,4,3].

// Third: Make it in-place and stable.

// Fourth: Can you make this faster by eliminating any second inner loop?

function removeDuplicates(arr) {
    const dict = {};
    let counter = 0;
    for(let i = 0; i < arr.length; i++) {
        if(dict[arr[i]] == undefined) {
            dict[arr[i]] = true;
            arr[i - counter] = arr[i];
        } else {
            counter++;
        }
    }
    while(counter > 0) {
        arr.pop();
        counter--;
    }
}

const testArr = [1,2,1,3,4,2];
removeDuplicates(testArr);
console.log(testArr);