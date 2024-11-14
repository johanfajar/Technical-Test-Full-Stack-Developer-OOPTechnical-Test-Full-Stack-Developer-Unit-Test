import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows

class ShippingCostTest {

    @Test
    fun `calculate cost for weight over 50 kg`() {
        // Tes untuk berat lebih dari 50 kg
        val result = calculateShippingCost(60.0, 100.0)
        assertEquals(2000.0, result, 0.0)
    }

    @Test
    fun `calculate cost for weight between 10 and 50 kg`() {
        // Tes untuk berat antara 10 dan 50 kg
        val result = calculateShippingCost(30.0, 100.0)
        assertEquals(1500.0, result, 0.0)
    }

    @Test
    fun `calculate cost for weight less than 10 kg`() {
        // Tes untuk berat kurang dari 10 kg
        val result = calculateShippingCost(5.0, 100.0)
        assertEquals(1000.0, result, 0.0)
    }

    @Test
    fun `calculate cost with zero weight should throw exception`() {
        // Tes ketika berat adalah nol, harus melempar IllegalArgumentException
        val exception = assertThrows(IllegalArgumentException::class.java) {
            calculateShippingCost(0.0, 100.0)
        }
        assertEquals("Weight must be greater than zero", exception.message)
    }

    @Test
    fun `calculate cost with zero distance should throw exception`() {
        // Tes ketika jarak adalah nol, harus melempar IllegalArgumentException
        val exception = assertThrows(IllegalArgumentException::class.java) {
            calculateShippingCost(10.0, 0.0)
        }
        assertEquals("Distance must be greater than zero", exception.message)
    }

    @Test
    fun `calculate cost with negative weight should throw exception`() {
        // Tes ketika berat adalah negatif, harus melempar IllegalArgumentException
        val exception = assertThrows(IllegalArgumentException::class.java) {
            calculateShippingCost(-5.0, 100.0)
        }
        assertEquals("Weight must be greater than zero", exception.message)
    }

    @Test
    fun `calculate cost with negative distance should throw exception`() {
        // Tes ketika jarak adalah negatif, harus melempar IllegalArgumentException
        val exception = assertThrows(IllegalArgumentException::class.java) {
            calculateShippingCost(10.0, -100.0)
        }
        assertEquals("Distance must be greater than zero", exception.message)
    }


}