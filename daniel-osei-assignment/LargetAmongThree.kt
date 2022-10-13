

// write a program to find largest of three numbers


fun main() {
    // largest number a,b,c is always greater than the others at any given time

    val a= 8
    val b= 45
    val c= 10

    val maxNum = if((a>b)&&(a>c)){ // check if a is greater than both numbers
        a  //maxNumber is a

    }else if ((b>a)&&(b>c)){ check if b is greater then both numbers
        b  // maxNumber is b
        
    }else{ // else c is the greatest
        c
    }
    println("Among $a, $b and $c.\n $maxNum is greatest") // 45
}