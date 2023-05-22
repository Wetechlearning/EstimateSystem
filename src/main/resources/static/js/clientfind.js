$("#btnSearchBusho_input,#btnDispBusho_input").on("click",function () {
    let bushoCode = document.getElementById("cdEigyoBusho_input");

    if (bushoCode.value!=null){
        $.ajax({
            url : "/search/clientBusho",
            type :"get",
            data:{"bushoCode":bushoCode.value},
            dataType:"text",
            success : function(data) {
                $("#nmEigyoBusho").attr("value",data);
                console.log(data);
            },
            error : function(data) {
                console.log(data);
            }
        })
    }
})

$("#btnSearchTanto_input,#btnDispTanto_input").on("click",function () {
    let tantoCode = document.getElementById("cdEigyoTanto_input");

    if (tantoCode.value!=null){
        $.ajax({
            url : "/search/clientShain",
            type :"get",
            data:{"shainCode":tantoCode.value},
            dataType:"text",
            success : function(data) {
                $("#nmEigyoTanto").attr("value",data);
                console.log(data);
            },
            error : function(data) {
                console.log(data);
            }
        })
    }
})

/*$("m1BtnDetail_input").on("click",function() {
    let clientCode = document.getElementById("m1BtnDetail_input").value;
    console.log(clientCode);
    /!*$.ajax({
        url : "/search/client",
        type : "get",
        data:{"clientCode":clientCode},
        dataType : "text",
        success : function(data) {
            window.location="/search/client?clientCode="+clientCode;
            console.log(data);
        },
        error:function (data) {
            console.log(data);
        }
    })*!/
    //window.location="/search/client?clientCode="+clientCode;
})*/
function clientFind(clientCode){
    console.log(clientCode);
    $.ajax({
        url : "/search/client",
        type : "get",
        data:{"clientCode":clientCode},
        dataType : "text",
        success : function(data) {
            window.location="/search/client?clientCode="+clientCode;
            //console.log(data);
        },
        error:function (data) {
            console.log(data);
        }
    })
}

$("#btnClear_input").on("click", function() {
    window.location.href="/search/clients"
})