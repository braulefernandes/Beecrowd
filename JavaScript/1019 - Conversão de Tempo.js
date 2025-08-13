var N = parseInt(require('fs').readFileSync('/dev/stdin', 'utf8'));

var horas = Math.floor(N / 3600);
N %= 3600;
var minutos = Math.floor(N / 60);
var segundos = N % 60;

console.log(`${horas}:${minutos}:${segundos}`);