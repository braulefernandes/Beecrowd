var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
var [x1, y1] = input[0].split(' ').map(parseFloat);
var [x2, y2] = input[1].split(' ').map(parseFloat);

var distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
console.log(distancia.toFixed(4));