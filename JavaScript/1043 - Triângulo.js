var [A, B, C] = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ').map(Number);

if (A < B + C && B < A + C && C < A + B) {
    console.log(`Perimetro = ${(A + B + C).toFixed(1)}`);
} else {
    console.log(`Area = ${((A + B) * C / 2).toFixed(1)}`);
}