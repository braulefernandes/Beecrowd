var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
var tempo = parseInt(input[0]);
var velocidade = parseInt(input[1]);

var distancia = tempo * velocidade;
var litros = distancia / 12;

console.log(litros.toFixed(3));