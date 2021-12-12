$(function (){

    $(".Text").focus(function (){
        $(".searchText").css('border-color','cornflowerblue')
    }).blur(function (){
        $(".searchText").css('border-color','')
    })

})

