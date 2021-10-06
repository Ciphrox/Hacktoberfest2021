// Polyfill filter functionality of Array

function map() {
    if (!Array.prototype.map) {
        Array.prototype.map = function (cb) {
            if (typeof cb !== "function") {
                throw new Error("Argument passed has to be function");
            }

            let newArr = [];

            for (let index in this) {
                newArr.push(cb(this[index], index, this));
            }
            return newArr;
        }
    }
}