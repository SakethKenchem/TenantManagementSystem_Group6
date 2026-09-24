fun main() {

    /* A constructor makes sure the tenant's required information is provided when the object is created,
     making the code shorter and ensuring the object starts with its basic details.*/

    val tenant1 = Tenant("John", 101, 15000.0)

    val tenant2 = Tenant("Mary", 102, 18000.0)

    tenant1.payRent()

    // Display the payment status of both tenants
    println("${tenant1.name} rent paid: ${tenant1.isPaid}")
    println("${tenant2.name} rent paid: ${tenant2.isPaid}")
}