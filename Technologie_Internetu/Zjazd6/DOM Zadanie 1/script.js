window.onload = function() {
    let button1 = document.getElementById("button1");
    let button2 = document.getElementById("button2");
    let button3 = document.getElementById("button3");
    let button4 = document.getElementById("button4");


    button1.onclick = function() {
        let box = document.createElement("div");
        box.classList.add("divs");
        document.querySelector("div.flexboxdivs").appendChild(box);
    }

    button2.onclick = function() {
        document.querySelector("div.flexboxdivs").firstElementChild.remove();
    };

    button3.onclick = function() {
        document.querySelector("div.flexboxdivs").children[2].style.background("red");
    }
}
