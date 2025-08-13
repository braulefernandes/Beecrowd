var dias = parseInt(require('fs').readFileSync('/dev/stdin', 'utf8'));

var anos = Math.floor(dias / 365);
dias %= 365;
var meses = Math.floor(dias / 30);
dias %= 30;

console.log(`${anos} ano(s)`);
console.log(`${meses} mes(es)`);
console.log(`${dias} dia(s)`);