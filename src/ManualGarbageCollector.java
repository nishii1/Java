public class ManualGarbageCollector {
    public void finalize() {
        System.out.println("finalize() is invoked");
    }
    public static void main(String[] args) {
        ManualGarbageCollector mgc1=new ManualGarbageCollector();
        ManualGarbageCollector mgc2=new ManualGarbageCollector();
        ManualGarbageCollector mgc3=new ManualGarbageCollector();
        ManualGarbageCollector mgc4=new ManualGarbageCollector();
        mgc1=null;
        mgc2=mgc4;
        mgc3=mgc2;
        new ManualGarbageCollector();
        System.gc();
    }
}