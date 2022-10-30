package destructering

data class Person(var id: Int, var fullname: String, var age: Int)


fun main(){
    val person = Person(1, "Jon Snow", 20)
    destructure(person)
    components(person)
    returnTypes()
}

fun destructure(person: Person) {
    val(id, name, age) = person
    println(id)     //1
    println(name)   //Jon Snow
    println(age)    //20
}


fun components(person: Person) {
    val id = person.component1();
    val name = person.component2();
    val age = person.component3();
}


fun returnTypes() {
    fun getPersonInfo() = Person(2, "Ned Stark", 45)
    val(id, name, age) = getPersonInfo()
}