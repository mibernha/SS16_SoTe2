function save() {
	sessionStorage.field1 = document.getElementById("feld1").value;
	sessionStorage.field2 = document.getElementById("feld2").value;
}
function load() {
	document.getElementById("feld1").value = sessionStorage.field1;
	document.getElementById("feld2").value = sessionStorage.field2;
}
var x = document.getElementById("location");
function getLocation() {
	if(navigator.geolocation){
		navigator.geolocation.getCurrentPosition(showPosition);
	} else {
		x.innerHTML = "Location blocked.";
	}
}
function showPosition(position) {
	x.innerHTML = "Latitude: " + position.coords.latitude + "<br>Longitude: " + position.coords.longitude; 
}