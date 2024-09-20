package kotlinFundameental

fun main() {
    //basic approach
//    val statement: String = "Kotlin is "Awesome!""
//    println("$statement")

    /*Bila kita menggunakan petik ganda dalam string, maka terjadi ambiguitas nilai pada variabel statement karena kompiler tidak dapat mengetahui akhir dari baris nilai untuk variabel statement. Untuk mengatasinya, kita bisa melakukan escaped dengan menambahkan karakter backslash (\) sebelum tanda petik ganda seperti berikut:*/


    //using escaped string
    val statement: String = "Kotlin is \"Awesome!\""
    println("$statement")
/*
    Selain \” di atas, terdapat beberapa karakter lain yang dapat digunakan untuk melakukan escaped di dalam sebuah String, antara lain:

    \t: menambah tab ke dalam teks.
    \n: membuat baris baru di dalam teks.
    \’: menambah karakter single quote kedalam teks.
    \”: menambah karakter double quote kedalam tek  s.
    \\: menambah karakter backslash kedalam teks.*/

}