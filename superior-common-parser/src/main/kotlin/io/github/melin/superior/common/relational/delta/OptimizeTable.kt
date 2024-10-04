package io.github.melin.superior.common.relational.delta

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.abs.AbsTableStatement

data class OptimizeTable(override val tableId: TableId) : AbsTableStatement() {
    override val statementType = StatementType.OPTIMIZE_TABLE
    override val privilegeType = PrivilegeType.WRITE
    override val sqlType = SqlType.DML
}
