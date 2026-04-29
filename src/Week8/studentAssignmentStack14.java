package Week8;

public class studentAssignmentStack14 {
    Student14[] stack;
    int size;
    int top;

    studentAssignmentStack14(int size){
        this.size = size;
        top = -1;
        stack = new Student14[size];
    }

    boolean isFull(){
        if(top==size-1){
            return true;
        }else {
            return false;
        }
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    void push(Student14 std){
        if(!isFull()){
            top++;
            stack[top] = std;
        }else{
            System.out.println("Stack is already full");
        }
    }

    Student14 pop(){
        if(!isEmpty()){
            Student14 std = stack[top];
            top--;
            return std;
        }else{
            System.out.println("There is no data in Stack");
            return null;
        }
    }

    Student14 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("There is no data in stack");
            return null;
        }
    }

    void print(){
        for (int i = 0; i <= top; i++){
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t"
            + stack[i].className);
        }
        System.out.println("");
    }
    String convertToBinary(int grade) {
        conversionStack stack = new conversionStack();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }

}
