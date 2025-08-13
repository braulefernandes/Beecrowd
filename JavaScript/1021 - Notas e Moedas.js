var N = parseFloat(require('fs').readFileSync('/dev/stdin', 'utf8'));
var notas = [100, 50, 20, 10, 5, 2];
var moedas = [1, 0.50, 0.25, 0.10, 0.05, 0.01];

console.log("NOTAS:");
for (let nota of notas) {
    let qtd = Math.floor(N / nota);
    console.log(`${qtd} nota(s) de R$ ${nota.toFixed(2)}`);
    N %= nota;
}

console.log("MOEDAS:");
for (let moeda of moedas) {
    let qtd = Math.floor(N / moeda + 0.00001);
    console.log(`${qtd} moeda(s) de R$ ${moeda.toFixed(2)}`);
    N %= moeda;
}