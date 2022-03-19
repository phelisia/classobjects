fun main(){
    var student=User("Phelisia","Jeruto",718117097,1234)
    println(student.firstName)
    println(student.phonenumber)
    var person=Human("saido",23,57)
    person.weight
    println(person.eat(2))
    println(person.age)
    person.birthday()
    person.speak("baba")





}
class  Human( var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight:Int):Int{
        weight+=foodWeight
        println( "I am eating $foodWeight kgs of food")
        return weight


    }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday():Int{
        println(age+1)
        return age

    }

}
data class  User (var firstName:String,var lastName:String,var phonenumber:Int,var password:Int)