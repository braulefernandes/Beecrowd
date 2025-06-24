var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var primeiro_valor = parseInt(input[0]);
var segundo_valor = parseInt(input[1]);

var produto = primeiro_valor * segundo_valor;

console.log(`PROD = ${produto}`);