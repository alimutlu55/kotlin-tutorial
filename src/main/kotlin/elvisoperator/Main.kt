package elvisoperator

fun main(){
    val response = getValueFromApi()
    print(toUpper(response))

}

fun getValueFromApi(): String?{
    return null
}

fun toUpper(s: String?): String = s?.uppercase() ?: "DUDE!"