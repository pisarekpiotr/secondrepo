package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

        public static final String SHOPPINGTASK = "SHOPPING";
        public static final String PAINTINGTASK = "PAINTING";
        public static final String DRIVINGTASK = "DRIVING";

        public final com.kodilla.patterns.factory.tasks.Task makeTask(final String taskClass) {
            switch (taskClass) {
                case SHOPPINGTASK:
                    return new ShoppingTask("Important mission", "Beer",5);
                case PAINTINGTASK:
                    return new PaintingTask("Wall painting", "Blue","Wall");
                case DRIVINGTASK:
                    return new DrivingTask("Road trip", "Rome", "Alfa Romeo Grand Turismo Veloce");
                default:
                    return null;
        }
        }

    public static void main(String[] args) {
        String someobject = "test";
        switch (someobject){
            case "test1":
                System.out.println("test1"); break;
            case "test":
                System.out.println("test"); break;
            case "test2":
                System.out.println("test2"); break;
            case "test3":
                System.out.println("test3"); break;
        }
    }
    }

