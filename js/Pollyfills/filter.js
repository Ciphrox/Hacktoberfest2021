// Polyfill filter functionality of Array

function filter() {
    if (!Array.prototype.filter) {
        Array.prototype.filter = function (cb) {
            if (typeof cb !== "function") {
                throw new Error("Argument passed has to be function");
            }

            let newArr = [];

            for (let index in this) {
                if (cb(this[index], index, this)) {
                    newArr.push(this[index])
                }
            }
            return newArr;
        }
    }
}