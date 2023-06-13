window.onload = function() {
        document.getElementById("popDiv").style.display = "none";
}

function popDivShow(){
    let popBox = document.getElementById("popDiv");
    popBox.style.display = "block";
    let kubun = document.getElementById("kbSearch_input1").value;
    if (kubun=="検索"){
        document.getElementById("selKaisha_input").value = document.getElementById("selKaisha_input1").value;
        document.getElementById("cdJigyoMc5_input").value = document.getElementById("cdJigyoMc5_input1").value;
        document.getElementById("kbMc5Busho_input").value = document.getElementById("kbMc5Busho_input1").value;
        document.getElementById("cdBusho_input").value = document.getElementById("cdBusho_input1").value;
        document.getElementById("nmBusho_input").value = document.getElementById("nmBusho_input1").value;
        let kbBushoRadio1 = document.getElementsByName("kbBusho1_input");
        let kbBushoRadio = document.getElementsByName("kbBusho_input");
        let fgDeleteRadio1 = document.getElementsByName("fgDelete1_input");
        let fgDeleteRadio = document.getElementsByName("fgDelete_input");
        console.log(kbBushoRadio1);
        console.log(kbBushoRadio);
        console.log(fgDeleteRadio1);
        console.log(fgDeleteRadio);
        for (let i = 0;i< kbBushoRadio1.length; i++){
            if (kbBushoRadio1[i].checked){
                for (let j = 0; j < kbBushoRadio.length; j++){
                    if (kbBushoRadio[j].value==kbBushoRadio1[i].value){
                        kbBushoRadio[i].checked = "checked";
                    }
                }
            }
        }
        for (let i = 0;i< fgDeleteRadio1.length; i++){
            if (fgDeleteRadio1[i].checked){
                for (let j = 0; j < fgDeleteRadio.length; j++){
                    if (fgDeleteRadio1[i].value==fgDeleteRadio[j].value){
                        fgDeleteRadio[i].checked = "checked";
                    }
                }
            }
        }
    }
}

//$("#btnJiko").on("click",popDivShow())

/*document.getElementById("close").onclick = function() {
    document.getElementById("popDiv").style.display = "none";
}*/

$("#btnsubmit").on("click", function() {
    let kbBushoInput = document.getElementsByName("kbBusho_input");
    let fgDeleteInput = document.getElementsByName("fgDelete_input");
    let kbBushoValue = null;
    let fgDeleteValue = null;

    for (let i = 0;i<kbBushoInput.length; i++){
        if (kbBushoInput[i].checked){
            kbBushoValue = kbBushoInput[i].value;
            console.log("kbBushoValue"+kbBushoInput[i].value)
        }
        console.log("进入循环")
    }

    for (let i = 0;i<fgDeleteInput.length; i++){
        if (fgDeleteInput[i].checked){
            fgDeleteValue = fgDeleteInput[i].value;
            console.log("fgDeleteValue"+fgDeleteInput[i].value)
        }
    }

    let busyo = {
        "cdKaisha":$("#selKaisha_input").val(),
        "cdJigyoMc5":$("#cdJigyoMc5_input").val(),
        "kbBushoMc5":$("#kbMc5Busho_input").val(),
        "cdBusho":$("#cdBusho_input").val(),
        "nmBusho":$("#nmBusho_input").val(),
        "kbBusho":kbBushoValue,
        "fgDelete":fgDeleteValue
    }

    let params = {"busyo":busyo,
    "cdBushoList":null};

    $.ajax({
        url : "/search/busyos",
        type : "POST",
        contentType:"application/json;charset=UTF-8",
        async:false,
        data: JSON.stringify(params),
        success : function(data) {
            console.log(data);
            //$("#dataShow1").show();
            $("#dataShow1").html(data);
        },
        error : function(data) {
            console.error("请求失败")
            console.log(data)
        }
    })
})

$("#close").on("click",function() {
    document.getElementById("popDiv").style.display = "none";
})

$("#btnClear_input1").on("click",function() {
    window.location.href="/search/busyos"
})

$("#btnClear_input").on("click",function (){
    $("#selKaisha_input").each(function(){
        $(this).find("option").eq(0).prop("selected",true)
    });
    $("#cdJigyoMc5_input").each(function(){
        $(this).find("option").eq(0).prop("selected",true)
    });
    $("#cdJigyoMc5_input").each(function(){
        $(this).find("option").eq(0).prop("selected",true)
    });
    $("#cdBusho_input").val("");
    $("#nmBusho_input").val("");
    $("#dataShow1").hide();
})

function bushoFind(bushoCode){
    console.log(bushoCode);

    window.location="/search/busyo?bushoCode="+bushoCode;
}



