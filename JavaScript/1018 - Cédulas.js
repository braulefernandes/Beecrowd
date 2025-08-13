var N = parseInt(require('fs').readFileSync('/dev/stdin', 'utf8'));
console.log(N);

var notas = [100, 50, 20, 10, 5, 2, 1];
for (let nota of notas) {
    let qtd = Math.floor(N / nota);
    console.log(`${qtd} nota(s) de R$ ${nota},00`);
    N %= nota;
}