$(function (){


    $(".userBtn").click(function (){
        $(".userRedact").show()
        $(".articleRedact").hide()
    })
    $(".articleBtn").click(function (){
        $(".articleRedact").show()
        $(".userRedact").hide()
    })

})