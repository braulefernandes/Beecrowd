var [inicio, fim] = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ').map(Number);

var duracao = fim - inicio;
if (duracao <= 0) duracao += 24;

console.log(`O JOGO DUROU ${duracao} HORA(S)`);