var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var A = parseInt(input[0]);
var B = parseInt(input[1]);
var C = parseFloat(input[2]);

var salario = B * C;

console.log(`NUMBER = ${A}`);
console.log(`SALARY = U$ ${salario.toFixed(2)}`);