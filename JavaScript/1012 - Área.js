var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
var [A, B, C] = input[0].split(' ').map(parseFloat);

console.log(`TRIANGULO: ${(A * C / 2).toFixed(3)}`);
console.log(`CIRCULO: ${(3.14159 * C * C).toFixed(3)}`);
console.log(`TRAPEZIO: ${((A + B) * C / 2).toFixed(3)}`);
console.log(`QUADRADO: ${(B * B).toFixed(3)}`);
console.log(`RETANGULO: ${(A * B).toFixed(3)}`);