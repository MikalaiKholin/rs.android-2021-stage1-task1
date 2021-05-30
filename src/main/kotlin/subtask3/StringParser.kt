package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        //throw NotImplementedError("Not implemented")
        var k : Array<String> = arrayOf()
        var str: String = inputString


        k=getStr(inputString)



        return (k)
    }

    fun getSubStr (inputString: String): String{
        val pattern = "[<].*?[>]|[(].*?[)]|[\\[].*?[\\]]".toRegex()
        var str = pattern.find(inputString)
        println(str?.value)
        return(str?.value.toString())
    }

    fun getStr (inputString: String): Array<String>{
        var res : MutableList<String> = mutableListOf()

        val pattern = "[<].*?[>]|[(].*?[)]|[\\[].*?[\\]]".toRegex()
        val str = pattern.findAll(inputString)
        for (s in str){
            var tmp: String = s.value.drop(1).dropLast(1).toString()

            res.add(tmp)
            println (tmp)
            for (s in getStr(tmp)){
                var tmp: String = s
                res.add(tmp)
            }

        }
        return (res.toTypedArray())
    }
}
