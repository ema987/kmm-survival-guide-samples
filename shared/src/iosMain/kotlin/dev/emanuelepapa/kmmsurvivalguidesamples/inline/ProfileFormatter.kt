package dev.emanuelepapa.kmmsurvivalguidesamples.inline

fun formatFirstAndLastName(
    firstName: FirstNameIos,
    lastName: LastNameIos
): String {
    return formatFirstAndLastName(FirstName(firstName.firstName), LastName(lastName.lastName))
}