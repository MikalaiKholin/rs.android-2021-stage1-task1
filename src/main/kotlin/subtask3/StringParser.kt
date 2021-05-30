package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        //throw NotImplementedError("Not implemented")
        var k : Array<String> = arrayOf()

        k=getStr(inputString)

        for (e in k){
            println(e)
        }

        return (k)
    }

    fun getSubStr (inputString: String): String{

        return("df")
    }

    fun getStr (inputString: String): Array<String>{
        var res : MutableList<String> = mutableListOf()

        val pattern = "[<].*?[>]|[(].*?[)]|[\\[].*?[\\]]".toRegex()
        val str = pattern.findAll(inputString)
        for (s in str){
            var tmp : MutableList<String> = getStr(s.value.drop(1).dropLast(1)).toMutableList()
            if (tmp.size !=0) {
                for (t in tmp){
                    res.add(t)
                }
             //println (getStr(s.value.drop(1).dropLast(1)).elementAt(0))
            }
            res.add(s.value.drop(1).dropLast(1))
            println (s.value.drop(1).dropLast(1))
        }
        return (res.toTypedArray())
    }
}
