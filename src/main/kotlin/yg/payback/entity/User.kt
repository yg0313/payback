package yg.payback.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import jakarta.persistence.PrimaryKeyJoinColumn
import jakarta.persistence.Table
import yg.payback.entity.common.BaseTimeEntity

@Entity
@Table(name = "tb_user")
class User(
    val loginId: String,
    val money: Int,
    val status: String, //TODO Enum

    @OneToOne
    @PrimaryKeyJoinColumn
    val userLimitPayment: UserLimitPayment,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
): BaseTimeEntity()