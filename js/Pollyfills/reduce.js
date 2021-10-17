// Polyfill filter functionality of Array

function reduce() {
    if (!Array.prototype.reduce) {
        Array.prototype.reduce = function (cb, init) {
            let startPosition = 0;
            let accumulater = init ?? this[startPosition++];

            for (let index = startPosition; index < this.length; index++) {
                accumulater = cb(accumulater, this[index], index, this);
            }
            return accumulater;
        }
    }
}