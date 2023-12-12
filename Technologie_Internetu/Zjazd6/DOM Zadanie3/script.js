window.onload = function() {
    function auto(marka, rok, przebieg, cena_wyjsciowa, cena_koncowa) {
        return {
            marka: marka,
            rok: rok,
            przebieg: przebieg,
            cena_wyjsciowa: cena_wyjsciowa,
            cena_koncowa: cena_koncowa,
        }
    }

    const citroen = auto("Citroen", 2005, 335000, 8000, 2500);
    const auto1 = auto("Toyota",2018, 50000, 25000, 20000);
    const auto2 = auto("Audi", 2015, 80000, 20000, 15000);
    const auto3 = auto("Honda" ,2020, 30000, 30000, 25000);
    const auto4 = auto("BMW",2012, 120000, 15000, 10000);

    const cars = [citroen, auto1, auto2, auto3, auto4];

    const listOfKeys = Object.keys(citroen);

    const body = document.getElementById("body");

    const table = document.createElement("table");

    const headersRow = document.createElement("tr");
    for (let i = 0; i < cars.length; i++) {
        const header = document.createElement("th");
        header.appendChild(document.createTextNode(listOfKeys[i]));
        headersRow.appendChild(header);
    }

    table.appendChild(headersRow);

    for (let i = 0; i < cars.length; i++) {
        const row = document.createElement("tr");
        for (let j = 0; j < listOfKeys.length; j++) {
            const tableData = document.createElement("td");
            const dataValue = document.createTextNode(Object.values(cars[i])[j].toString());
            tableData.appendChild(dataValue);
            row.appendChild(tableData)
        }
        table.appendChild(row);
    }

    body.appendChild(table);


}