// HigherOrderFunctions/NullableFunction.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
  val returnTypeNullable: (String) -> Int? =
    { null }
  val mightBeNull: ((String) -> Int)? = null
  returnTypeNullable("abc") eq null
  // Doesn't compile without a null check:
  // mightBeNull("abc")
  if (mightBeNull != null) {
    mightBeNull("abc")
  }
}
