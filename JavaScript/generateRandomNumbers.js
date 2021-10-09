const numbers = [];

function generateRandomNumber(range, howMany) {
    let num;
    while (numbers.length < howMany) {
        num = Math.floor((Math.random() * range) + 1);
        numbers.push(num);
    }
    return numbers;
}

generateRandomNumber(10, 3)
generateRandomNumber(5, 3)
generateRandomNumber(100, 20)