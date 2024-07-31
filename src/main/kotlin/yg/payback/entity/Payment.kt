package yg.payback.entity

import jakarta.persistence.*
import yg.payback.entity.common.BaseTimeEntity

@Entity
class Payment(
    val money: Int,
    val status: String,

    @ManyToOne
    val user: User,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

): BaseTimeEntity() {
}