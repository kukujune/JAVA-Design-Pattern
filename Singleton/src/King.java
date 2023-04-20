public class King {
    private King(){}

    private static King self = null; // 정적 필드로 static

    public synchronized static King getInstance(){ // multi thread에서 문제 없도록 synchronized 선언
        if(self == null){
            self = new King();
        }
        return self;
    }

    public void say(){
        System.out.println("I am the Singleton");
    }

}
