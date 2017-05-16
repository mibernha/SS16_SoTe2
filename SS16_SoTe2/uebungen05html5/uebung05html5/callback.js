function a(text){
	alert("Ich bin Funktion a! " + text);
}
function b(text){
	alert("Ich bin Funktion b! " + text);
}
function funktionausführen(neFunktion, text){
	neFunktion(text);
}
function start(){
	funktionausführen(a, "funktion...erm a!");
	funktionausführen(b, "noch ne Funktion, b!");
}