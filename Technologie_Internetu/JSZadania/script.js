console.log("Hello World!")

function trojkaPitagorejska(x, y, z) {
    if (x*x + y*y == z*z) {
        return true;
    } else {
        return false;
    }
}

console.log(trojkaPitagorejska(3, 4, 5));

function liczbyZPrzedzialu(a, b, c) {
    let wPrzedziale = [];
    for (let i = a; i <= b; i++) {
        if (i % c == 0) {
            wPrzedziale.push(i);
        }
    }
    return wPrzedziale;
}

console.log(liczbyZPrzedzialu(1, 10, 2))

function tablicaMnozenia(bok) {
    for (let i = 1; i <= bok; i++) {
        for (let j = 1; j <= bok; j++) {
        }
    }
}

function Fibonacci(x) {
    let array = [];
    array.push(0);
    array.push(1);
    for (let i = 0; i < x - 2; i++) {
        array.push(array[i] + array[i + 1]);
    }
    return array;
}

console.log(Fibonacci(10));

function choinka(x) {
}

function poleProstokata(a, b) {
    return a + b;
}

function poleTrapezu(a, b, h) {
    return ((a + b) * h)/2;
}

function poleRownoległoboku(a, h) {
    return a * h;
}

function poleTrojkata(a, h) {
    return (a*h)/2;
}

function poleFigury(figura, a, b, h) {
    switch(figura) {
        case "prostokat":
            return poleProstokata(a, b);
        case "trapez":
            return poleTrapezu(a, b, h);
        case "rownoleglobok":
            return poleRownoległoboku;
        case "trojkat":
            return poleTrojkata;
        default:
            return "Prosze wpisac 'prostokat', 'trapez', 'rownoleglobok', lub 'trojkat' dla wybrania figury."
    }
}

console.log(poleFigury("trapez", 4, 3, 2))

function cenzura(tablica, y) {
    let array = y.split(" ");
    for (let i = 0; i < tablica.length; i++) {
        array.replace()
    }
}

console.log(cenzura(["Ala", "kot"], "Ala ma kota a kot ma ale"));