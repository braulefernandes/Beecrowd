var input = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');

if (input[0] === 'vertebrado') {
    if (input[1] === 'ave') {
        console.log(input[2] === 'carnivoro' ? 'aguia' : 'pomba');
    } else {
        console.log(input[2] === 'onivoro' ? 'homem' : 'vaca');
    }
} else {
    if (input[1] === 'inseto') {
        console.log(input[2] === 'hematofago' ? 'pulga' : 'lagarta');
    } else {
        console.log(input[2] === 'hematofago' ? 'sanguessuga' : 'minhoca');
    }
}