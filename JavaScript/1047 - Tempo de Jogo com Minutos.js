var [h1, m1, h2, m2] = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ').map(Number);
var inicio = h1 * 60 + m1;
var fim = h2 * 60 + m2;
var duracao = fim - inicio;
if (duracao <= 0) duracao += 24 * 60;

var horas = Math.floor(duracao / 60);
var minutos = duracao % 60;

console.log(`O JOGO DUROU ${horas} HORA(S) E ${minutos} MINUTO(S)`);