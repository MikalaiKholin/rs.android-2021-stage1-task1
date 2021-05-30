package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        //throw NotImplementedError("Not implemented")

        if (sadArray.size == 0){
            return intArrayOf()
        }
        var isSad: Boolean = true
        var happyArr: MutableList<Int> = sadArray.toMutableList()
        while (isSad==true) {
            var tmpArr: MutableList<Int> = mutableListOf()
            tmpArr.add(happyArr.elementAt(0))
            for(i in 1..happyArr.size-2){
                print (happyArr.size)
                print (happyArr.elementAt(i))
                if (happyArr.elementAt(i)<happyArr.elementAt(i+1)+happyArr.elementAt(i-1)){
                    tmpArr.add(happyArr.elementAt(i))
                }
            }
            tmpArr.add(happyArr.elementAt(happyArr.size-1))
            if (tmpArr==happyArr){
                isSad=false
            }
            happyArr.clear()
            happyArr=tmpArr
        }
        //tmpArr.add(sadArray[sadArray.size-1]);
        println (sadArray)
        println (happyArr)
        return happyArr.toIntArray()
    }
}
