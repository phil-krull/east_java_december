// Flatten
// --------------------------------------------------------------------------------------------
// Flatten a given array, eliminating nested and empty arrays. Do not alter the array; return a new one retaining the order. Given the array [1,[2,3],4,[]], return a new [1,2,3,4].

// Second: Work ‘in-place’ in the given array (do not create another). Alter order if needed. Ex.: [1,[2,3],4,[]] could become [1,3,4,2].

// Third: Make your algorithm both in-place and stable. Do you need a return value?

// First
function flattenNew(arr){
    let newArr = [];
    let isArr = false;
    for(let i = 0; i < arr.length; i++){
        if(typeof arr[i] == 'object'){
            for(let j = 0; j < arr[i].length; j++){
                newArr.push(arr[i][j]);
                isArr = true;
            }
        } else {
            newArr.push(arr[i]);
        }
    }
    if(isArr){
        return flattenNew(newArr);
    }
    return newArr;
}

// Second
function flattenInPlace(arr){
    let oLen = arr.length
    let isArr = false;
    for(let i = 0; i < oLen; i++){
        if(typeof arr[i] == 'object'){
            for(let j = 0; j < arr[i].length; j++){
                arr.push(arr[i][j]);
                isArr = true
            }
        } else {
            arr.push(arr[i]);
        }
    }
    arr.splice(0,oLen);
    if(oLen != arr.length || isArr){
        flattenInPlace(arr);
    } else {
        return arr
    }
}

// Third, Recursive, in place and stable flatten function
function flatten(arr){
    let i = 0
    while(i < arr.length){
        if(Array.isArray(arr[i])){
            flatten(arr[i])
            let new_items = arr[i].length
            arr.splice(i, 1, ...arr[i])
            i+=new_items
        } else {
            i++
        }
    }
}

let my_array = [1,[2,3],[[4],[5,6,[7,[8],9],[[10]]]],11]
let fAll = [1,[],2,[3,[4]]];

console.log(flattenNew(fAll));

flatten(my_array)
console.log(my_array)

console.log(fAll);
flattenInPlace(fAll);
console.log(fAll);