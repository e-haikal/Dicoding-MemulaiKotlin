package kotlinFundameental

fun main() {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

    /*
        Output : Office is open
     */

    /*Hasil evaluasi expression di atas adalah true. Namun, ketika menggunakan operator NOT, hasilnya akan dinegasikan menjadi nilai false sehingga statement pada branch else-lah yang akan dijalankan.
*/



}