fun main() {

    /* A constructor makes sure the tenant's required information is provided when the object is created,
     making the code shorter and ensuring the object starts with its basic details.*/

    val tenant1 = Tenant("John", 101, 15000.0)

    val tenant2 = Tenant("Mary", 102, 18000.0)

    tenant1.payRent()

    // Display the payment status of both tenants
    println("${tenant1.name} rent paid: ${tenant1.isPaid}")
    println("${tenant2.name} rent paid: ${tenant2.isPaid}")

    println("\n--- Task 3: Control the Rent Amount Using a Setter ---")

    /*
    Validating values before they are stored protects data integrity and prevents bugs
    such as negative rent amounts or ages breaking business logic. Handling this directly in the
    setter allows the class to enforce its own rules consistently, blocking bad data no matter
    where the change originates.
    */

    // Tenant with a valid rent amount
    val tenant3 = Tenant("Alice", 103, 20000.0)
    println("Initial rent for ${tenant3.name}: KES ${tenant3.rentAmount}")

    // Negative Rent value
    println("Attempting to change rent to -5000.0...")
    tenant3.rentAmount = -5000.0

    // Print new rent amount
    println("Rent amount after attempted change: KES ${tenant3.rentAmount}")

    if (tenant3.rentAmount >= 0) {
        println("Validation Check: The negative value was successfully rejected! Rent remains KES ${tenant3.rentAmount}")
    } else {
        println("Validation Check: The negative value was accepted.")
    }

    println("\n--- Task 4: Add a Custom Getter ---")

    /*
        The getter is executed when the property's value is accessed.
        This occurs whenever the property is referenced in code, such as in a println() statement.

        - Getting a property (get):
          Retrieves the current value of the property from the object without modifying it
          and returns data to the caller.
        - Setting a property (set):
          Writes a new value to the property (e.g., tenant.rentAmount = 25000.0).
          It receives an incoming value, validates it, and updates the backing field (field).
    */

    println("Testing custom getter:")
    println(tenant3.rentAmount)

    //Task 6: Adding Tenants to an Apartment

    //Creating an Apartment object
    val apartment = Apartment(apartmentNumber = 1)

//Creating two Tenant objects
    val tenant4 = Tenant("Markus", 104, 16000.0)
    val tenant5 = Tenant("Alicia", 105, 17000.0)

//Adding both tenants to the apartment
    apartment.addTenant(tenant4)
    apartment.addTenant(tenant5)

//Verifying that both tenants are stored in the apartment
    println("Number of tenants in apartment ${apartment.apartmentNumber}: ${apartment.tenants.size}")
    for (tenant in apartment.tenants) {
        println("Tenant: ${tenant.name}")
    }

    // the Apartment doesn't inherit from Tenant,it simply stores references to tenant objects


    // Custom getter
    // Task 7-Loops through the apartment's tenant list to print each tenant's name, rent, and payment status
    println("Testing custom getter:")
    println(tenant3.rentAmount)

    println("Apartment: $apartmentNumber")

    // Loop through each tenant stored in the tenants list and print their details
    for (tenant in tenants) {
        println("Tenant: ${tenant.name}")
        println("Rent: ${tenant.rentAmount}")
        println("Rent paid: ${tenant.isPaid}")
    }

}
