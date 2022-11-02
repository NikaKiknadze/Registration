fun validCarNumber(){
    println("Car Number: ")
    val a = readln()
    if(a.toString()[0] in ('A'..'Z') && a.toString()[1] in ('A'..'Z') && a.toString()[5] in ('A'..'Z') && a.toString()[6] in ('A'..'Z') && a.toString()[2] in ('0'..'9') && a.toString()[3] in ('0'..'9') && a.toString()[4] in ('0'..'9') && a.length == 7){
        println("Correct")
    }else{
        println("Incorrect")
    }
}

fun Nomeri(){
    println("Sheiyvane piradi nomeri")
    val a = readln()

    if(a.toString()[0] != '5'){
        println("Incorrect")
    }else{
        println("Correct")
    }
}

fun emailValidation(){
    println("Sheiyvane E-Mail")
    val a = readln()
    var index1 = 0
    var index2 = 0
    for(i in a){
        if(i == '@'){
            break
        }
        index1++
    }
    for(i in a){
        if(i == '.'){
            break
        }
        index2++
    }
    if(index1 == a.length){
        index1 = 0
    }
    if(index2 == a.length){
        index2 = 0

    }
    if(index1 < index2 && index1 != 0 && index2 != 0){
        println("E-Mail validated")
    }else if(index1 > index2 && index1 != 0 && index2 != 0){

    }else if(index1 == 0 || index2 == 0){
        println("E-Mail is not validated")
    }
}
