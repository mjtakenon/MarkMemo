package net.link_designers.markmemo


class Item {

    var num = arrayOf(1,1,1)
    var level = 0

    fun getString() : String {

        var str : String = num[0].toString()
        if(level >= 1) str += "." + num[1].toString()
        if(level >= 2) str += "." + num[2].toString()

        return str
    }

    fun upIndent() {
        level++
        if(level > 3) level = 3
    }

    fun downIndent() {
        level--
        if(level < 0) level = 0
    }

    fun nextItem() {
        num[level]++
    }

    fun prevItem() {
        num[level]--
    }
}