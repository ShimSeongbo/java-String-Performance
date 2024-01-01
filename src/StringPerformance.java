public class StringPerformance {

    public static void main(String[] args) {
        long startTime, endTime;

        // String
        String str = "";
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            str += i; // 매번 새로운 String 객체 생성
        }

        endTime = System.currentTimeMillis();

        System.out.println("Time taken by String: " + (endTime - startTime) + "ms");

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i); // 같은 객체 내에서 변경
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + "ms");

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + "ms");

    }
}
