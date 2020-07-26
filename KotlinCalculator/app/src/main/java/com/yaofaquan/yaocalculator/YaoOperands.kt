package com.yaofaquan.yaocalculator

@ExperimentalStdlibApi
class YaoOperands {
    private val mOperands : ArrayDeque<Char> = ArrayDeque()

    fun add(operand : Char) {
        mOperands.add(operand)
    }

    fun clear() {
        mOperands.clear()
    }

    fun del() {
        if (!mOperands.isEmpty()) {
            mOperands.removeLast()
        }
    }

    fun compute() {
        //
    }

    override fun toString() : String {
        var str = StringBuilder()
        for(c in mOperands) {
            str.append(c)
        }
        return str.toString();
    }
}