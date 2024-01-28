let firstInput;
let secondInput;
let operator;
let result;

document.addEventListener('DOMContentLoaded', function () {
    document.getElementById('form').addEventListener('submit', function (event) {
        event.preventDefault();

         firstInput = document.getElementById('firstField').value;
         secondInput = document.getElementById('secondField').value;
         operator = document.getElementById('operators').value;

        // Perform calculation based on the selected operation
        switch (operator) {
            case 'addition':
                result = addition(firstInput, secondInput);
                break;
            case 'subtraction':
                result = subtraction(firstInput, secondInput);
                break;
            case 'multiplication':
                result = multiplication(firstInput, secondInput);
                break;
            case 'division':
                result = division(firstInput, secondInput);
                break;
            default:
                result = 'Invalid operation';
        }

        // Set the result in the wynik field
        document.querySelector('.poleWyniku').textContent = "Wynik: " + result;


    });
});


function addition(a, b) {
    return Number(a)+Number(b);
}

function subtraction(a, b) {
    return Number(a)-Number(b);
}

function multiplication(a, b) {
    return Number(a)*Number(b);
}

function division(a, b) {
if (Number(a) === 0) {
    return "err";
} else {
    return Number(a)/Number(b);
}
}