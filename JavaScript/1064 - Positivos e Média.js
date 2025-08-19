var valores = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n').map(Number);
var positivos = valores.filter(v => v > 0);
console.log(`${positivos.length} valores positivos`);
console.log((positivos.reduce((a,b) => a+b, 0) / positivos.length).toFixed(1));