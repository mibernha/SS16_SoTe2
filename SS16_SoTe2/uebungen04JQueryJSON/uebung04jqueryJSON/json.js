var object = {
        "list" : { 
          "meta" : { 
            "type" : "resource-list",
            "start" : 0,
            "count" : 163
            },
          "resources" : [ 
            {
              "resource" : { 
                "classname" : "Quote",
                "fields" : { 
                  "name" : "USD/KRW",
                  "price" : "1111.300049",
                  "symbol" : "KRW=X",
                  "ts" : "1350021593",
                  "type" : "currency",
                  "utctime" : "2012-10-12T05:59:53+0000",
                  "volume" : "663253708"
                }
              }
            },
            {
              "resource" : { 
                "classname" : "Quote",
                "fields" : { 
                  "name" : "SILVER 1 OZ 999 NY",
                  "price" : "0.029372",
                  "symbol" : "XAG=X",
                  "ts" : "1349991010",
                  "type" : "currency",
                  "utctime" : "2012-10-11T21:30:10+0000",
                  "volume" : "663253708"
                }
              }
            }]
        }
    };

function getInfos(){
	var a = object.list.resources;
	for(b in a){
		$("#json01").append("<div>Name: " + a[b].resource.fields.name + "</div>");
		$("#json01").append("<div>Preis: " + a[b].resource.fields.price + "</div>");
	}
}