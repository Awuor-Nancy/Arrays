import javax.swing.plaf.metal.MetalIconFactory.FileIcon16

fun main() {
    patient("Jessica","Evelyn","Damian","Vicent")

     cityNames(arrayOf("harare","mumbai","dodoma","jakarta"))

    studentname(arrayOf("Albright","Lencier","Meshack"))




}
           //No.1
fun patient(name1:String,name2:String,name3:String,name4:String){
    var numArray= arrayOf(name1,name2,name3,name4)
    println(numArray.contentToString())


}
          //No.2
fun cityNames(name1:Array<String>){
    name1.forEach { names ->
        println(names.capitalize())
    }
         // 3(a)
    var nums = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = (nums[1]+nums[4])
    println(sum)

          // 3(b)
    var index = nums.indexOf(158)
    println(index)

          // 3(c)
    nums= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var values = nums.sortedArrayDescending()
    println(values.contentToString())

}
      /*No 4*/
fun studentname(name1: Array<String>){
    var array= arrayOf(name1)
    println(name1.contentToString())



}


