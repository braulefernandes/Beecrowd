var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var primeiro_valor = parseInt(input[0]);
var segundo_valor = parseInt(input[1]);

console.log(`X = ${primeiro_valor + segundo_valor}`);