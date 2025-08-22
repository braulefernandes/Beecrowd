var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n').map(Number);

let maior = input[0];
let pos = 1;

for (let i = 1; i < 100; i++) {
    if (input[i] > maior) {
        maior = input[i];
        pos = i + 1;
    }
}

console.log(maior);
console.log(pos);