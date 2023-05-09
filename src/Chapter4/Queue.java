package Chapter4;

public class Queue<E> {
    //--- 실행 시 예외 : 큐가 비어 있음 ---//
    public static class EmptyGqueueException extends RuntimeException {
        public EmptyGqueueException() { }
    }

    //--- 실행 시 예외 : 큐가 가득 참 ---//
    public static class OverflowGqueueException extends RuntimeException {
        public OverflowGqueueException() { }
    }

    private E[] que;			// 큐의 본체
    private int capacity;			// 큐의 용량
    private int num;			// 현재 데이터 개수
    private int front;		// 맨앞 요소 커서
    private int rear;			// 맨끝 요소 커서

    public Queue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try{
            que = (E [])new Object[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public E enque(E x) throws OverflowGqueueException {
        if(num>=capacity) throw new OverflowGqueueException()
    }

}
//qgdgjj