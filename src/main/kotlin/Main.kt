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

    // PART 3 - STRINGS

    // Concatenation
    println(name + " lives in house " + houseNumber)

    // String template
    println("$name lives in house $houseNumber")

    /* PART 3.2: The string template version is easier to read because it keeps the text in a natural
    tone without repetitive quotes or + operators.
    */

    // Expression template
    println("Total rent for 6 months: KES ${monthlyRent * 6}")

    // Triple quote multiline string
    val receipt = """
        ===== RENT RECEIPT =====
        Tenant: $name
        House: $houseNumber
        Paid: KES $amountPaid
     """.trimIndent()
    println(receipt)
    /*
     - Without .trimIndent(), Kotlin preserves all the leading spaces from the code indentation,
       shifting the lines far to the right in the terminal.
     - .trimIndent() detects the smallest indent across non-empty lines, removes it
        from all lines, and drops any initial blank lines.
     */

    val greeting = "Dear Tenant"
    greeting.uppercase()
    println(greeting)
    /*
     Task 3.5 Questions:
     - greeting remains unchanged because String objects in Kotlin are immutable;
     - By printing the return value directly: println(greeting.uppercase())
     */

    // PART 4 - OPERATORS

    // Calculating balance
    val balance: Int = monthlyRent - amountPaid
    println("Balance: KES $balance")

    // Percentage paid
    val percentPaid = (amountPaid / monthlyRent) * 100
    println("Paid: $percentPaid%")
    val registrationNumber: Long = 999_999_999L
    println("Registration number: $registrationNumber")

    /*
     PART 4.2
     - I got 0%. No it is not correct, 20,000 out of 25,000 should be 80%
     - Integer division truncates decimals: 20000 / 25000 evaluates to 0. Then 0 * 100 = 0.
     - Method 1 (Double casting): val correctPercent1 = ((amountPaid.toDouble() / monthlyRent) * 100).toInt()
       Method 2 (Multiply first to prevent early truncation): val correctPercent2 = (amountPaid * 100) / monthlyRent
     */

    val fixedPercentPaid = (amountPaid * 100) / monthlyRent
    println("Paid: $fixedPercentPaid%")

    // Instalments calculation
    val instalmentAmount = 6000
    val fullInstalments = monthlyRent / instalmentAmount
    val remainingAmount = monthlyRent % instalmentAmount
    println("Full instalments: $fullInstalments")
    println("Remaining amount: KES $remainingAmount")

    // Numeric operator method
    val totalRent = monthlyRent.times(6)
    println("Total rent using method syntax: $totalRent")

    // Boolean comparison without if
    val isRentPaid: Boolean = amountPaid >= monthlyRent
    println("Is rent paid: $isRentPaid")

    // Logical operators and reminder condition
    var monthsInArrears = 2
    val isRentOutstanding: Boolean = amountPaid < monthlyRent
    val needsReminder: Boolean = isRentOutstanding && (monthsInArrears > 1)
    println("Needs reminder (2 months in arrears): $needsReminder")

    monthsInArrears = 1
    val needsReminderAfterChange: Boolean = isRentOutstanding && (monthsInArrears > 1)
    println("Needs reminder (1 month in arrears): $needsReminderAfterChange")
    /*
     PART 4.6:
     - When monthsInArrears is changed to 1, needsReminder evaluates to false.
     - The condition requires that (monthsInArrears > 1). When monthsInArrears is 1,
       (1 > 1) is false. The logical AND (&&) operator requires both operands
       to be true, therefore the entire expression evaluates to false.
     */


 //TASK 7

    // Task 7.1
    // Creating a list of tenants
    val tenantsList = listOf("Jane Wanjiku", "Brian Otieno", "Mary Achieng", "John Kamau")

    // First element is index 0, last element is at size - 1
    println("First tenant: ${tenantsList[0]}")
    println("Last tenant: ${tenantsList[tenantsList.size - 1]}")


    // Task 7.2
    // trying tenantsList.add("David Mwangi") gives a compilation error: "Unresolved reference: add"
    // It happens because listOf() creates an immutable list, so you can't add or remove items and to fix this, we can use mutableListOf()


    val mutableTenants = mutableListOf("Jane Wanjiku", "Brian Otieno", "Mary Achieng", "John Kamau")

    mutableTenants.add("David Mwangi")
    mutableTenants.remove("Brian Otieno")

    println("Final tenant list: $mutableTenants")
    println("Final list size: ${mutableTenants.size}")


    // Task 7.3
    val houseNumbers = arrayOf("A-101", "A-102", "A-103", "A-104")

    // Printing 2nd house
    println("Second house: ${houseNumbers[1]}")

    // Updating element at index 0 to A-201
    houseNumbers[0] = "A-201"

    // Printing elements with a space seperator
    println(houseNumbers.joinToString(" "))


    // Task 7.4
    // Prediction: Printing an array variable directly gives a memory reference eg [Ljava.lang.String;@1b6d3586
    // Reason is because arrays in Kotlin don't override toString() and so it prints that
    // To fix it we can use: .joinToString() and .contentToString


    val houseNumberz = arrayOf("A-101", "A-102")
    println(houseNumberz)



    // Task 7.5
    // Prediction:output will be "1, 2, 3, 4, 5, 6"
    val blockA = intArrayOf(1, 2, 3)
    val blockB = intArrayOf(4, 5, 6)

    val combined = blockA + blockB
    println("Combined: ${combined.joinToString()}")

    // Swapping to blockB + blockA
    val swappedCombined = blockB + blockA
    println("Combined: ${swappedCombined.joinToString()}")
    // Rule: The + operator joins the arrays in the exact order that they are.


    // Task 7.6

    // 1- MutableList and Array: A MutableList can change its size dynamically while an array's size is fixed once created
    // 2- Array and Read-only List: An Array lets you change its existing elements while a read-only List won't let you modify anything


// Task 8.1 & 8.2: Declaring Nullable String
    // To make a variable nullable, append '?' to the data type.
    var tenantEmail: String? = null
    println("Task 8.2 Direct Print: Email is $tenantEmail")

    // Task 8.3
    var emailDisplay = tenantEmail ?: "Not provided"
    println("Email: $emailDisplay")

    // Reassigning to confirm the fallback is overridden when data exists
    tenantEmail = "jane@example.com"
    emailDisplay = tenantEmail ?: "Not provided"
    println("Email: $emailDisplay")

    // Task 8.4: Testing Null Safety Operators
    tenantEmail = null
    println(tenantEmail?.length)           // Output: null (Safe call)
    println(tenantEmail?.length ?: 0)      // Output: 0 (Elvis Operator fallback)
    
    // Un-commenting the line below triggers a NullPointerException (NPE) crash:
    // println(tenantEmail!!.length)

    // Task 8.5
    val nextOfKin: String? = null // Change to "John Doe" to test both cases
    val nokDisplay = nextOfKin?.uppercase() ?: "No next of kin on record"
    println("Next of Kin: $nokDisplay")



}
