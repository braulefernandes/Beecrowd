var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var [P1, NP1, VUP1] = input[0].split(' ').map(parseFloat);
var [P2, NP2, VUP2] = input[1].split(' ').map(parseFloat);

var soma1 = NP1 * VUP1;
var soma2 = NP2 * VUP2;
var somatotal = soma1 + soma2;

console.log(`VALOR A PAGAR: R$ ${somatotal.toFixed(2)}`);