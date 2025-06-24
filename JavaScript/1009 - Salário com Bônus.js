var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var A = input[0];
var B = parseFloat(input[1]);
var C = parseFloat(input[2]);

var salario = B + (C * 0.15);

console.log(`TOTAL = R$ ${salario.toFixed(2)}`);