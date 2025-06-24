var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var primeiro_valor = parseInt(input[0]);
var segundo_valor = parseInt(input[1]);
var soma = primeiro_valor + segundo_valor;

console.log(`SOMA = ${soma}`);