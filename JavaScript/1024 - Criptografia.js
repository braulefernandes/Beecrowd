var input = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var N = parseInt(input[0]);

for (let i = 1; i <= N; i++) {
    let text = input[i];
    let step1 = text.split('').map(c => /[A-Za-z]/.test(c) ? String.fromCharCode(c.charCodeAt(0) + 3) : c).join('');
    let step2 = step1.split('').reverse().join('');
    let step3 = step2.substring(0, Math.floor(step2.length / 2)) +
                step2.substring(Math.floor(step2.length / 2)).split('').map(c => String.fromCharCode(c.charCodeAt(0) - 1)).join('');
    console.log(step3);
}