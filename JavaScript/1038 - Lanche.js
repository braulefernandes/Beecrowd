var input = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ').map(Number);
var codigo = input[0];
var quantidade = input[1];

var precos = {1: 4.00, 2: 4.50, 3: 5.00, 4: 2.00, 5: 1.50};
var total = precos[codigo] * quantidade;

console.log(`Total: R$ ${total.toFixed(2)}`);