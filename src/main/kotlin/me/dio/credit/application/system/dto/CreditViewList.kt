package me.dio.credit.application.system.dto

import me.dio.credit.application.system.entity.Credit
import java.math.BigDecimal
import java.util.*

data class CreditViewList(
    val creditCCode: UUID, val creditValue: BigDecimal, val numberOfInstallments: Int
) {
    constructor(credit: Credit) : this(
        creditCCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallments = credit.numberOfInstallments
    )
}
