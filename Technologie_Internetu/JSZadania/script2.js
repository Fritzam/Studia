const auto = {
    rok: 2020,
    przebieg: 200000,
    cena_wyjsciowa: 60000,
    cena_koncowa: 65000,
    powiekszCeneO1000: function() { this.cena_wyjsciowa += 1000 },
    obnizkaZaKazdyRok: function() { this.cena_koncowa -= 1000 * (auto.rok - 2020)},
    obnizkaZaPrzebieg: function() { this.cena_koncowa -= 10000 * Math.floor(Math.round(auto.przebieg - 200000) / 100000)},
    reset: function()  {
        this.rok = 2020;
        this.przebieg = 200000;
        this.cena_wyjsciowa = 60000;
        this.cena_koncowa = 65000;
    },
    zmienRok: function (rok) {
        this.rok = rok;
        this.obnizkaZaKazdyRok();
    },
    zmienPrzebieg: function(przebieg) {
        this.przebieg = przebieg;
        this.obnizkaZaPrzebieg();
    }
}

const auto1 = {
    rok: 2022,
    przebieg: 400000,
    cena_wyjsciowa: 34000,
    cena_koncowa: 45000,
    powiekszCeneO1000: function() { this.cena_wyjsciowa += 1000 },
    obnizkaZaKazdyRok: function() { this.cena_koncowa -= 1000 * (auto.rok - 2020)},
    obnizkaZaPrzebieg: function() { this.cena_koncowa -= 10000 * Math.floor(Math.round(auto.przebieg - 200000) / 100000)},
    reset: function()  {
        this.rok = 2020;
        this.przebieg = 200000;
        this.cena_wyjsciowa = 60000;
        this.cena_koncowa = 65000;
    },
    zmienRok: function (rok) {
        this.rok = rok;
        this.obnizkaZaKazdyRok();
    },
    zmienPrzebieg: function(przebieg) {
        this.przebieg = przebieg;
        this.obnizkaZaPrzebieg();
    }
}

const auto2 = {
    rok: 2023,
    przebieg: 80000,
    cena_wyjsciowa: 120000,
    cena_koncowa: 148000,
    powiekszCeneO1000: function() { this.cena_wyjsciowa += 1000 },
    obnizkaZaKazdyRok: function() { this.cena_koncowa -= 1000 * (auto.rok - 2020)},
    obnizkaZaPrzebieg: function() { this.cena_koncowa -= 10000 * Math.floor(Math.round(auto.przebieg - 200000) / 100000)},
    reset: function()  {
        this.rok = 2020;
        this.przebieg = 200000;
        this.cena_wyjsciowa = 60000;
        this.cena_koncowa = 65000;
    },
    zmienRok: function (rok) {
        this.rok = rok;
        this.obnizkaZaKazdyRok();
    },
    zmienPrzebieg: function(przebieg) {
        this.przebieg = przebieg;
        this.obnizkaZaPrzebieg();
    }
}

const tablicaAut = [];
const tablicaSamochodow = [];
tablicaAut.push(auto, auto1, auto2, function() {
    for (let i = 0; i < 3; i++) {
        if (tablicaAut[i].cena_koncowa >= 100000) {
            tablicaSamochodow.push(tablicaAut[i]);
        }
    }
}, function() {
    for (let i = 0; i < 3; i++) {
        tablicaAut[i].zmienRok(tablicaAut[i].rok + 1)
    }
});
tablicaAut[3]();
console.log("Auta z tablicySamochodow o cenie większej niż 100000 to: \n")
    for (let i = 0; i < tablicaSamochodow.length; i++) {
        console.log(tablicaSamochodow[i]);
}


for (let i = 0; i < 3; i++) {
    console.log("Bazowy rok auta: " + (i + 1) + " to: " + tablicaAut[i].rok);
}

tablicaAut[4]();

for (let i = 0; i < 3; i++) {
    console.log("Obecny rok auta: " + (i + 1) + " to: " + tablicaAut[i].rok)
};

class Ocena {
    constructor(przedmiot, wartosc) {
        this.przedmiot = przedmiot;
        this.wartosc = wartosc;
    }
}
const oceny = []
const ocena1 = new Ocena("Historia", 4);
const ocena2 = new Ocena("Matematyka", 5);
oceny.push(ocena1, ocena2);
for (let i = 0; i < oceny.length; i++) {
    console.log(oceny[i]);
}

class Student {
    tablicaOcen = [];
    sredniaOcen;
    constructor(imie, nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    hello() {
        return "Hello, " + this.imie + " " + this.nazwisko + ". Twoja średnia ocen to: " + this.sredniaOcen;
    }

    getSrednia() {
        return this.sredniaOcen.toFixed(2);
    }

    set Ocena(ocena) {
        if (ocena instanceof Ocena) {
            this.tablicaOcen.push(ocena);
            let sumaOcen = 0;
            for (let i = 0; i < this.tablicaOcen.length; i++) {
                sumaOcen += this.tablicaOcen[i].wartosc;
            }
            this.sredniaOcen = sumaOcen/this.tablicaOcen.length;
        } else {
            return "Podana wartość nie jest instancją klasy Ocena";
        }
    }

    get Oceny() {
        let stringOcen = "";
        for (let i = 0; i < this.tablicaOcen.length; i++) {
            stringOcen += ("Przedmiot: " + this.tablicaOcen[i].przedmiot + " - ocena: " + this.tablicaOcen[i].wartosc + ". \n");
        }
        return stringOcen;
    }
}

let student1 = new Student("Michał", "Fritza")
student1.Ocena = ocena1;
student1.Ocena = ocena2;
student1.Ocena = (new Ocena("Polski", 4));
console.log(student1.Oceny);




