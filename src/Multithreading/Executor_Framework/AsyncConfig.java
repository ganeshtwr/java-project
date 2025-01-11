//package Multithreading.Executor_Framework;
//
//@EnableAsync
//@Import(SpringAsyncConfig.class)
//public class AsyncConfig {
//
//    @Value("${spring.async.deliveryPromiseKafkaEvent.core-pool-size:5}")
//    private int corePoolSize;
//
//    @Value("${spring.async.deliveryPromiseKafkaEvent.max-pool-size:100}")
//    private int maxPoolSize;
//
//    @Value("${spring.async.deliveryPromiseKafkaEvent.queue-capacity:500}")
//    private int queueCapacity;
//
//    @Value("${spring.async.deliveryPromiseKafkaEvent.thread-priority:5}")
//    private int threadPriority;
//
//    @Value("${spring.async.deliveryPromiseKafkaEvent.thread-name:DeliveryPromiseKafkaEventAsyncPool}")
//    private String threadName;
//
//    @Value("${spring.async.deliveryPromiseKafkaEvent.rejectionHandlerType:callerRuns}")
//    private String rejectionHandlerType;
//
//    @Bean(name = "deliveryPromiseKafkaEventThreadPoolExecutor")
//    public Executor threadPoolTaskExecutor(TaskDecorator mdcTaskDecorator) {
//    /* when queue gets full and there is no available thread to process the task,  task would be by default
//    aborted as per spring. This feature can be changed by providing different implementation of rejected execution
//    handler.
//    */
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(corePoolSize);
//        executor.setMaxPoolSize(maxPoolSize);
//        executor.setQueueCapacity(queueCapacity);
//        executor.setThreadNamePrefix(threadName);
//        executor.setThreadPriority(threadPriority);
//        executor.setWaitForTasksToCompleteOnShutdown(true);
//        executor.setTaskDecorator(mdcTaskDecorator);
//        executor.setRejectedExecutionHandler(getRejectionHandler());
//        executor.initialize();
//        return executor;
//    }
//
//    private RejectedExecutionHandler getRejectionHandler() {
//        switch (rejectionHandlerType) {
//            case "abort":
//                return new ThreadPoolExecutor.AbortPolicy();
//            case "callerRuns":
//                return new ThreadPoolExecutor.CallerRunsPolicy();
//            case "discardOldest":
//                return new ThreadPoolExecutor.DiscardOldestPolicy();
//            case "discard":
//                return new ThreadPoolExecutor.DiscardPolicy();
//            default:
//                throw new IllegalArgumentException("Unsupported rejectionHandlerType: " + rejectionHandlerType);
//        }
//    }
//}
