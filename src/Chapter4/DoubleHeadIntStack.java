package Chapter4;

//스택 생성, push, pop만 만들어보자
public class DoubleHeadIntStack {
    private int capacity;
    private int [] stack;

    private int ptrA;
    private int ptrB;

    public enum AorB{StackA,StackB}

    //--- 실행 시 예외 : 스택이 비어 있음 ---//
    public class EmptyDoubleHeadIntStackException extends RuntimeException {
        public EmptyDoubleHeadIntStackException() { }
    }

    //--- 실행 시 예외 : 스택이 가득 참 ---//
    public class OverflowDoubleHeadIntStackException extends RuntimeException {
        public OverflowDoubleHeadIntStackException() { }
    }

    public DoubleHeadIntStack(int x){
        capacity = x;
        ptrA = 0;
        ptrB = capacity -1;
        try{
            stack = new int[x];
        }catch (OutOfMemoryError e){
            capacity=0;
        }
    }

    public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException{
        if(ptrA >= ptrB + 1)        // 스택이 가득 참
            throw new OverflowDoubleHeadIntStackException();
        switch (sw){
            case StackA: stack[ptrA++] = x; break;
            case StackB: stack[ptrB--] = x; break;

        }
        return x;
    }


    public int pop(AorB sw) throws EmptyDoubleHeadIntStackException{
        int x = 0;
        switch(sw){
            case StackA:
                if(ptrA <=0)
                    throw new EmptyDoubleHeadIntStackException();
                x = stack[--ptrA];
                break;
            case StackB:
                if(ptrB>=capacity-1)
                    throw new EmptyDoubleHeadIntStackException();
                x = stack[--ptrB];
                break;
        }
        return x;
    }



}
