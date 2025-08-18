var salario = parseFloat(require('fs').readFileSync('/dev/stdin', 'utf8'));
var percentuais = [
    [400.00, 15],
    [800.00, 12],
    [1200.00, 10],
    [2000.00, 7],
    [Infinity, 4]
];

for (let [limite, p] of percentuais) {
    if (salario <= limite) {
        let reajuste = salario * p / 100;
        let novo = salario + reajuste;
        console.log(`Novo salario: ${novo.toFixed(2)}`);
        console.log(`Reajuste ganho: ${reajuste.toFixed(2)}`);
        console.log(`Em percentual: ${p} %`);
        break;
    }
}