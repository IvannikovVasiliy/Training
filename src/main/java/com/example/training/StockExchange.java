package com.example.training;

import java.util.concurrent.*;

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

    public static void main(String[] args) {
        CompletableFuture<String> completed;
        completed = CompletableFuture.completedFuture("Просто значение");
        // CompletableFuture, запускающий (run) новый поток с Runnable, поэтому он Void
        CompletableFuture<Void> voidCompletableFuture;
        voidCompletableFuture = CompletableFuture.runAsync(() -> {
            System.out.println("run " + Thread.currentThread().getName());
        });
        // CompletableFuture, запускающий новый поток, результат которого возьмём у Supplier
        CompletableFuture<String> supplier;
        supplier = CompletableFuture.supplyAsync(() -> {
            System.out.println("supply " + Thread.currentThread().getName());
            return "Значение";
        });
    }



}
