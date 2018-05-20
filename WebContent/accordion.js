var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].onclick = function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight){
      panel.style.maxHeight = null;
    } else {
      panel.style.maxHeight = panel.scrollHeight + "px";
    } 
  }
}

function validateForm() {
    var x = document.forms["loginform"]["UID"].value;
	var y = document.forms["loginform"]["Password"].value;
    if (x == ""||y == "") {
        alert("Please type in credentials");
        return false;
    }
}