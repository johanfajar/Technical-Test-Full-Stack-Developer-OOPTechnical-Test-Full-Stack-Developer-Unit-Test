fun calculateShippingCost(weight: Double, distance: Double): Double {
    require(weight > 0) { "Weight must be greater than zero" }
//    require(weight > 0) { "Weight cannot be zero or negative" } //if we want to try failed unit test
    require(distance > 0) { "Distance must be greater than zero" }

    val rate = when {
        weight > 50 -> 20.0
        weight >= 10 -> 15.0
        else -> 10.0
    }

    return rate * distance
}