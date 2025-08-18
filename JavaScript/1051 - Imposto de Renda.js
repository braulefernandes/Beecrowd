var salario = parseFloat(require('fs').readFileSync('/dev/stdin', 'utf8'));

if (salario <= 2000.00) {
    console.log("Isento");
} else {
    let imposto = 0;
    if (salario > 4500.00) {
        imposto += (salario - 4500.00) * 0.28;
        salario = 4500.00;
    }
    if (salario > 3000.00) {
        imposto += (salario - 3000.00) * 0.18;
        salario = 3000.00;
    }
    if (salario > 2000.00) {
        imposto += (salario - 2000.00) * 0.08;
    }
    console.log(`R$ ${imposto.toFixed(2)}`);
}