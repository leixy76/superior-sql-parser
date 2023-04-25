package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class DeleteTable(
    override val tableId: TableId?,
    val inputTables: List<TableId> = listOf()
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
    override val sqlType: SqlType = SqlType.DML

    var outputTables: List<TableId> = listOf()

    constructor(inputTables: List<TableId>) : this(null, inputTables)

    fun firstTableId() = outputTables.first()
}
