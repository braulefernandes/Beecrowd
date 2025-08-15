var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
var [n1, n2, n3, n4] = input[0].split(' ').map(Number);

var media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;
console.log(`Media: ${media.toFixed(1)}`);

if (media >= 7.0) {
    console.log("Aluno aprovado.");
} else if (media < 5.0) {
    console.log("Aluno reprovado.");
} else {
    console.log("Aluno em exame.");
    var exame = parseFloat(input[1]);
    console.log(`Nota do exame: ${exame.toFixed(1)}`);
    var final = (media + exame) / 2;
    if (final >= 5.0) {
        console.log("Aluno aprovado.");
    } else {
        console.log("Aluno reprovado.");
    }
    console.log(`Media final: ${final.toFixed(1)}`);
}