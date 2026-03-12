// Select the button
const button = document.getElementById("myButton");

// When mouse enters (hover starts)
button.addEventListener("mouseenter", function() {
    button.style.backgroundColor = "crimson";
    button.textContent = "You're Hovering!";
});

// When mouse leaves (hover ends)
button.addEventListener("mouseleave", function() {
    button.style.backgroundColor = "royalblue";
    button.textContent = "Hover Me";
});