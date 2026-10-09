package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    private static final double EPS = 1e-9;

    // ---------- length ----------

    @Test
    void length_of_3_and_4_is_5() {
        Vector v = new Vector(3, 4);
        assertEquals(5.0, v.length(), EPS);
    }

    @Test
    void length_of_zero_vector_is_0() {
        Vector v = new Vector(0, 0, 0);
        assertEquals(0.0, v.length(), EPS);
    }

    @Test
    void length_of_unit_vector_is_1() {
        Vector v = new Vector(1, 0);
        assertEquals(1.0, v.length(), EPS);
    }

    // ---------- dot ----------

    @Test
    void dot_product_basic() {
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(4, 5, 6);
        // 1*4 + 2*5 + 3*6 = 4 + 10 + 18 = 32
        assertEquals(32.0, a.dot(b), EPS);
    }

    @Test
    void dot_product_of_orthogonal_is_0() {
        Vector a = new Vector(1, 0);
        Vector b = new Vector(0, 1);
        assertEquals(0.0, a.dot(b), EPS);
    }

    @Test
    void dot_product_different_sizes_throws() {
        Vector a = new Vector(1, 2);
        Vector b = new Vector(1, 2, 3);
        assertThrows(IllegalArgumentException.class, () -> a.dot(b));
    }

    // ---------- increment / decrement ----------

    @Test
    void increment_adds_1_to_each_component() {
        Vector v = new Vector(1, 2, 3);
        v.increment();
        assertEquals(2.0, v.get(0), EPS);
        assertEquals(3.0, v.get(1), EPS);
        assertEquals(4.0, v.get(2), EPS);
    }

    @Test
    void decrement_subtracts_1_from_each_component() {
        Vector v = new Vector(5, 5, 5);
        v.decrement();
        assertEquals(4.0, v.get(0), EPS);
        assertEquals(4.0, v.get(1), EPS);
        assertEquals(4.0, v.get(2), EPS);
    }

    @Test
    void increment_then_decrement_returns_same() {
        Vector v = new Vector(7, -3, 0);
        v.increment().decrement();
        assertEquals(7.0, v.get(0), EPS);
        assertEquals(-3.0, v.get(1), EPS);
        assertEquals(0.0, v.get(2), EPS);
    }

    // ---------- get / set ----------

    @Test
    void get_returns_component() {
        Vector v = new Vector(10, 20, 30);
        assertEquals(20.0, v.get(1), EPS);
    }

    @Test
    void set_changes_component() {
        Vector v = new Vector(0, 0, 0);
        v.set(1, 42);
        assertEquals(42.0, v.get(1), EPS);
    }

    @Test
    void get_with_negative_index_throws() {
        Vector v = new Vector(1, 2, 3);
        assertThrows(IndexOutOfBoundsException.class, () -> v.get(-1));
    }

    @Test
    void get_with_too_large_index_throws() {
        Vector v = new Vector(1, 2, 3);
        assertThrows(IndexOutOfBoundsException.class, () -> v.get(10));
    }

    @Test
    void set_with_invalid_index_throws() {
        Vector v = new Vector(1, 2, 3);
        assertThrows(IndexOutOfBoundsException.class, () -> v.set(5, 100));
    }

    // ---------- size ----------

    @Test
    void size_is_correct() {
        assertEquals(3, new Vector(1, 2, 3).size());
        assertEquals(1, new Vector(0).size());
        assertEquals(0, new Vector().size());
    }

    // ---------- angle ----------

    @Test
    void angle_between_orthogonal_is_90() {
        Vector a = new Vector(1, 0);
        Vector b = new Vector(0, 1);
        assertEquals(90.0, VectorMath.angleDegrees(a, b), 1e-6);
    }

    @Test
    void angle_between_parallel_is_0() {
        Vector a = new Vector(1, 0);
        Vector b = new Vector(5, 0);
        assertEquals(0.0, VectorMath.angleDegrees(a, b), 1e-6);
    }

    @Test
    void angle_between_opposite_is_180() {
        Vector a = new Vector(1, 0);
        Vector b = new Vector(-1, 0);
        assertEquals(180.0, VectorMath.angleDegrees(a, b), 1e-6);
    }

    @Test
    void angle_with_zero_vector_throws() {
        Vector a = new Vector(0, 0);
        Vector b = new Vector(1, 1);
        assertThrows(ArithmeticException.class, () -> VectorMath.angleDegrees(a, b));
    }
}