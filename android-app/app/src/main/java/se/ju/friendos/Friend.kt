package se.ju.friendos

data class Friend (
    val id: Int,
    val name: String,
    val age: Int
) {

    override fun toString() = name

}