package yg.payback.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.MapsId
import jakarta.persistence.OneToOne

@Entity
class UserLimitPayment(
    val oneCountLimit: Int,
    val dayLimit: Int,
    val monthLimit: Int,

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    val user: User,

    @Id
    val id: Long? = null
) {
}