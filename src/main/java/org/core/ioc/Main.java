package org.core.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/book/it?page=10&size=20&name=spring-boot";

        // 외부에서 사용하는 객체를 주입받는 형태를 DI라고 한다. (의존성 주입)
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);
        System.out.println(result);

    }
}