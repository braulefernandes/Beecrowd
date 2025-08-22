var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
var N = parseInt(input[0]);

let total = 0, coelhos = 0, ratos = 0, sapos = 0;

for (let i = 1; i <= N; i++) {
    let [qtd, tipo] = input[i].split(' ');
    qtd = parseInt(qtd);
    total += qtd;

    if (tipo === 'C') coelhos += qtd;
    else if (tipo === 'R') ratos += qtd;
    else if (tipo === 'S') sapos += qtd;
}

console.log(`Total: ${total} cobaias`);
console.log(`Total de coelhos: ${coelhos}`);
console.log(`Total de ratos: ${ratos}`);
console.log(`Total de sapos: ${sapos}`);
console.log(`Percentual de coelhos: ${(coelhos * 100 / total).toFixed(2)} %`);
console.log(`Percentual de ratos: ${(ratos * 100 / total).toFixed(2)} %`);
console.log(`Percentual de sapos: ${(sapos * 100 / total).toFixed(2)} %`);