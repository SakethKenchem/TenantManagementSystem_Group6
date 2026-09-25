// Task 5: Create the Apartment class
// An Apartment has tenants (this is composition, a 'has-a' relationship)
class Apartment(
    // The apartment number (e.g, 101, 102 etc )
    val apartmentNumber: Int,

    // A mutable list to store all the Tenant objects living here
    // Setting it to mutableListOf() by default allows creating an apartment with 0 tenants from start
    val tenants: MutableList = mutableListOf()
) {

    // Adding Tenant Function
    // This takes a Tenant object and adds it to our apartment's tenant list
    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    // Prints details for every tenant in this apartment
    fun showTenants() {
        println("Apartment: $apartmentNumber")
        for (tenant in tenants) {
            println("Tenant: ${tenant.name}")
            println("Rent: ${tenant.rentAmount}")
            println("Rent paid: ${tenant.isPaid}")
        }
    }
}