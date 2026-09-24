class Tenant(
    var name: String,
    var apartmentNumber: Int,
    rentAmount: Double
) {

    // Custom getter and setter for rentAmount
    var rentAmount: Double = rentAmount
        get() {
            println("Rent amount accessed.")
            return field
        }
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Rent amount cannot be negative.")
            }
        }

    var isPaid: Boolean = false

    fun payRent() {
        isPaid = true
        println("Rent paid successfully by $name")
    }
}