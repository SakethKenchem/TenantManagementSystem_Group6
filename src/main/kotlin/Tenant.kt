class Tenant(
    var name: String,
    var apartmentNumber: Int,
    var rentAmount: Double
) {

    var isPaid: Boolean = false

    fun payRent() {
        isPaid = true
        println("Rent paid successfully by $name")
    }
}