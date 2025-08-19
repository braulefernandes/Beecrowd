var mes = parseInt(require('fs').readFileSync('/dev/stdin', 'utf8'));
var nomes = ["January", "February", "March", "April", "May", "June", "July",
             "August", "September", "October", "November", "December"];

console.log(nomes[mes - 1]);