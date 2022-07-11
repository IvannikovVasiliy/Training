package com.example.training;

import org.springframework.util.Assert;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StockExchange {
//    static Connection connection = null; // Соединение приложениея с БД
//    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/contactdb";
//    static final String USER = "postgres";
//    static final String PASS = "1";

//    public static void main(String[] args) throws SQLException {
//        Statement stmt = null; // Выполнение sql-запросов
//        ResultSet result = null; // Обрабатывает полученные результаты
//
//        String value = "";
//        String SQL = "";
//
//        try {
//            connection = DriverManager.getConnection(DB_URL, USER, PASS);

//            SQL = "INSERT INTO public.jc_contact VALUES (3, 'Elena', 'Smirnova', '89191823908', 'elena@gmail.com')";
//            stmt = connection.createStatement();
//            stmt.executeUpdate(SQL);

//            int i = 1;
//
//            SQL = "SELECT *" +
//                    "FROM public.jc_contact";
//            stmt = connection.createStatement();
//            result = stmt.executeQuery(SQL);
//
//            while (result.next()) {
//                value = result.getString("phone");
//                System.out.println(value);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Ошибка SQL");
//        }
//        finally {
//            connection.close();
//        }
//    }

//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Callable callable = new MyCallable();
//        FutureTask futureTask = new FutureTask(callable);
//        new Thread(futureTask).start();
//        System.out.println(futureTask.get());
//    }
//
//    static class MyCallable implements Callable<Integer> {
//        @Override
//        public Integer call() throws Exception {
//            return 3;
//        }
//    }

//    public static void main(String[] args) {
//        ExecutorService service = Executors.newFixedThreadPool(10);
//
//        service.execute(new MyRunnable()); // просто запуск потока
//        Future<?> sub = service.submit(new MyCallable());
//        service.submit(new MyCallable());
//
//        service.shutdown();
//    }
//
//    static class MyRunnable implements Runnable {
//        @Override
//        public void run() {
//            System.out.println(1);
//        }
//    }
//
//    static class MyCallable implements Callable {
//        @Override
//        public Object call() throws Exception {
//            return 2;
//        }
//    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService exec = Executors.newCachedThreadPool();
//        Future<Integer> f = exec.submit(() -> { return 11; } );
//        int result = f.get();
//        System.out.println(result);
//        exec.shutdown();

//        Comparator<Node> comparator = new Comparator<Node>() {
//            @Override
//            public int compare(Node o1, Node o2) {
//                return o1.id.compareTo(o2.id);
//            }
//        };
//
//        Comparator<Node> comparator1 = Comparator.comparing(obj -> obj.id);
//        Stream.generate(() -> 2).forEach(System.out::println);

//        Callable task = () -> {
//            return "Hello, World!";
//        };
//        FutureTask<String> future = new FutureTask<>(task);
//        System.out.println(future.get());

        CompletableFuture<String> completed;
        completed = CompletableFuture.completedFuture("value");

        completed = CompletableFuture.supplyAsync(() -> {
            System.out.println("dfpgoidf");
            return "1";
        });

        CompletableFuture<Void> voidCompletableFuture;
        voidCompletableFuture = CompletableFuture.runAsync(() -> {
            System.out.println("run " + Thread.currentThread().getName());
        });


        CompletableFuture<String> future1
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<Void> combinedFuture
                = CompletableFuture.allOf(future1, future2, future3);

        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));

        System.out.println("Hello Beautiful World".equals(combined));

    }

}

class Node {
    public Node(int id) {
        this.id = id;
    }

    public Integer id;


}
