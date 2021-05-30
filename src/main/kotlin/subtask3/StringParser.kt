package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        //throw NotImplementedError("Not implemented")
        var res : Array<String> = arrayOf()
        res=getStr(inputString)
        return (res)
    }

    fun getStr (inputString: String): Array<String>{
        var res : MutableList<String> = mutableListOf()

        val pattern = "[<].*?[>]|[(].*?[)]|[\\[].*?[\\]]".toRegex()
        val str = pattern.findAll(inputString)
        for (s in str){
            var tmp: String = s.value.drop(1).dropLast(1).toString()

            res.add(tmp)
           //println (tmp)
            for (s in getStr(tmp)){
                var tmp: String = s
                res.add(tmp)
            }

        }
        return (res.toTypedArray())
    }
}
