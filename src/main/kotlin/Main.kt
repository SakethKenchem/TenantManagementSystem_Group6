/*
Andrew Mutero - 150736
Saketh Kenchem - 152324
Murji Viqarhussein - 193642
Mark Kipruto - 169386
Lewis Kamunjeru - 155669
 */

fun main() {
    println("Welcome to the Tenant Management System") //PART 0

    val tenantId: Int = 1001 // tenantID must remain the same
    //tenantID = 1002
    val name: String = "Jane Wanjiku" //the name is not being changed
    val phone: String = "0712345678" // phone number does not change frequently. 0 has no significance and could be lost, we don't perform arithmetic on phone numbers.
    val houseNumber: String = "A-204" //house number does not change at all
    val monthlyRent: Int = 25000 //the rent does not change

    var amountPaid: Int = 15000 //tenant's paid balance will change payments in the future
    val block: Char = 'A'
    val isActive: Boolean = true


    println("Amount paid before: $amountPaid")

    amountPaid = amountPaid + 5000

    println("Amount paid after: $amountPaid")

    val rentAsDouble: Double = monthlyRent.toDouble() //PART 2.3
    println("Rent as Double: " + rentAsDouble)

    /* PART 1.3- reassigning tenantID to 1002 results in "'val' cannot be reassigned." in the compiler.
    - the compiler refuses because tenantID has been declared using val, which cannot be reassigned.
    - val -> var can make the program compile
     */

    /* PART 2.3- Does not compile because Initializer type mismatch: expected 'Double', actual 'Int'.
    -Kotlin's explicit conversions ensure strict type safety, avoiding accidental precision loss
     and unexpected behavior.
     */

    val registrationNumber: Long = 999_999_999L
    println("Registration number: $registrationNumber")


}