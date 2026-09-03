fun main(){
    for (i in 15 downTo 1 step 2){
        print("$i ")
    }
    println()
    
    val mencapaiBintang = 5
    for (i in 1..mencapaiBintang){
        for (j in 1..i){
            print("*")
        }
        println()
    }
}