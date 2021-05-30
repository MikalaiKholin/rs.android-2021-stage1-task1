package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        //throw NotImplementedError("Not implemented")
        var summ: Int = 0
        for (i in 0 until bill.size){
            if (i!=k) summ+=bill[i]
        }
        if (summ/2==b){
            return ("Bon Appetit")
        }
        else{
            var refund: Int = b - summ/2
            return ("$refund")
        }
    }
}
