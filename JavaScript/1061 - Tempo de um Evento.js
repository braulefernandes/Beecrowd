var input = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var diaInicio = parseInt(input[0].split(' ')[1]);
var [hInicio, mInicio, sInicio] = input[1].split(' : ').map(Number);
var diaFim = parseInt(input[2].split(' ')[1]);
var [hFim, mFim, sFim] = input[3].split(' : ').map(Number);

var inicio = sInicio + mInicio*60 + hInicio*3600 + diaInicio*86400;
var fim = sFim + mFim*60 + hFim*3600 + diaFim*86400;

var duracao = fim - inicio;

var dias = Math.floor(duracao / 86400); duracao %= 86400;
var horas = Math.floor(duracao / 3600); duracao %= 3600;
var minutos = Math.floor(duracao / 60);
var segundos = duracao % 60;

console.log(`${dias} dia(s)`);
console.log(`${horas} hora(s)`);
console.log(`${minutos} minuto(s)`);
console.log(`${segundos} segundo(s)`);