def error(msg: String) = throw new Error(msg)

// Every reference class type also has null as a value
// Null is a subtype of every class that inherits from Object;
// it is incompatible with subtypes of AnyVal

val x = null // type of x is the Null type
val y: String = x
// NOT VALID val z: Int = null

if ( true ) 1 else false