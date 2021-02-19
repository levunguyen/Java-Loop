package _08_loop_statement;

public class LoopStatement {
    public static void main(String[] args) {
/*
    for (initial-action; loop-condition; action-after-each-iteration) {
        // code block to be executed
    }
*/
    for(int index = 1; index <=4; index++){
        if(index == 3){
            continue;
        }
        System.out.print(index + "\t");
    }
/*
    for (type variableName : arrayName) {
        // code block to be executed
    }
*/
    System.out.println();
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for(String element: cars){
        System.out.print(element + "\t");
    }
/*
    while (condition) {
        // code block to be executed
    }
*/
    System.out.println();
    int i = 0;
    while (i < 5){
        System.out.print(i + "\t");
        i++;
    }
/*
    do {
        // code block to be executed
    }
    while (condition);
*/
    System.out.println();
    int j = 0;
    do {
        System.out.print(j + "\t");
        j++;
    }while (j < 5);

    }
}
