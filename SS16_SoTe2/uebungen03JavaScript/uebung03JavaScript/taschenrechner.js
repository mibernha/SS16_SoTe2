function dosth() {
	var input = document.getElementById("input01").value;
	var add = input.split("+");
	var sub = input.split("-");
	var mult = input.split("*");
	var div = input.split("/");
	if(typeof add != "undefined" && add != null && add.length > 1){
		var result = parseInt(add[0])+parseInt(add[1]);
	} 
	else if(typeof sub != "undefined" && sub != null && sub.length > 1){
		var result = parseInt(sub[0])-parseInt(sub[1]);
	}
	else if(typeof mult != "undefined" && mult != null && mult.length > 1){
		var result = parseInt(mult[0])*parseInt(mult[1]);
	}
	else if(typeof div != "undefined" && div != null && div.length > 1){
		var result = parseInt(div[0])/parseInt(div[1]);
	} 
	document.getElementById("div01").innerHTML = result;
}