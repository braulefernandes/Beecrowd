var valores = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n').map(Number);
var pares = valores.filter(v => v % 2 === 0).length;
var impares = valores.filter(v => v % 2 !== 0).length;
var positivos = valores.filter(v => v > 0).length;
var negativos = valores.filter(v => v < 0).length;

console.log(`${pares} valor(es) par(es)`);
console.log(`${impares} valor(es) impar(es)`);
console.log(`${positivos} valor(es) positivo(s)`);
console.log(`${negativos} valor(es) negativo(s)`);