package Week8;

public class excuseLetterStack {
    excuseLetter[] stack;
    int size;
    int top;

    excuseLetterStack(int size){
        this.size = size;
        this.top = -1;
        this.stack = new excuseLetter[size];
    }
    boolean isFull() {
        return top == size -1;
    }
    boolean isEmpty() {
        return top == -1;
    }
    void push(excuseLetter letter){
        if (!isFull()){
            top++;
            stack[top] = letter;
        } else {
            System.out.println("Stack already full");
        }
    }
    excuseLetter pop() {
        if (!isEmpty()) {
            excuseLetter letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }
    excuseLetter peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    void print() {
        System.out.println("NIM\tName\tReason\tDate");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t"
                    + stack[i].reason + "\t" + stack[i].date);
        }
        System.out.println();
    }

    void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + stack[i].nim + "\t" + stack[i].name
                        + "\t" + stack[i].reason + "\t" + stack[i].date);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No excuse letter found for: " + name);
        }
    }
}
