package char

fun main() {
    var vocal = 'A'
    //mencoba iterasi di tipe data Char
    println("Vocal " + vocal ++)
    println("Vocal " + vocal ++)
    println("Vocal " + vocal --)
    println("Vocal " + vocal --)

/*    Outputnya
    Vocal A
    Vocal B
    Vocal C
    Vocal B*/

    /*Pada kode ini, menggunakan operator increment (++) dan decrement (--) yang memengaruhi nilai variabel vocal. Namun, perlu diperhatikan bahwa operator ini memiliki dua bentuk:

    Postfix Increment/Decrement (vocal++, vocal--): Ini berarti nilai vocal akan digunakan terlebih dahulu, kemudian baru diubah.
    Prefix Increment/Decrement (++vocal, --vocal): Ini berarti nilai vocal akan diubah terlebih dahulu, kemudian digunakan.*/
}