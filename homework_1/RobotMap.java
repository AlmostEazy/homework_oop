package homework_1;

import java.util.ArrayList;
import java.util.List;

public class RobotMap {

    private final int n;
    private final int m;
    private final int maxRobotsCount; //Ограничение кол - ва роботов

    private List<Robot> robots;

    public RobotMap(int n, int m, int maxRobotsCount) {
        validateMapSize(n, m);
        this.n = n;
        this.m = m;
        this.maxRobotsCount = maxRobotsCount;
        this.robots = new ArrayList<>();
    }

    //Метод с заданным параметром колличества роботов
    public RobotMap(int n, int m) {
        this(n, m, 5);
        this.robots = new ArrayList<>();
        validateMapSize(n, m);
    }

    public Robot createRobot(Point point) {
        validatePoint(point);
        Robot robot = new Robot(point);
        robots.add(robot);
        checkRobotsLimit(robots, maxRobotsCount);

        return robot;
    }
    
    //Проверка лимита роботов (arr - массив с роботами)
    private void checkRobotsLimit(List<Robot> arr, int maxRobotsCount) {
        if (arr.size() > maxRobotsCount) {
            throw new IllegalStateException("Вы не можете использовать больше " + maxRobotsCount + " роботов!");
        }
    }

    //Проверка игрового поля
    private void validateMapSize(int n, int m) {
        if (n < 0 || m < 0) {
            throw new IllegalStateException("Координаты поля не могут быть отрицательными!");
        }
    }

    private void validatePoint(Point point) {
        validatePointIsCorrect(point);
        validatePointIsFree(point);
    }

    private void validatePointIsCorrect(Point point) {
        if (point.x() < 0 || point.x() > n || point.y() < 0 || point.y() > m) {
            throw new IllegalStateException("Некоректное значение точки!");
        }
    }

    private void validatePointIsFree(Point point) {
        for (Robot robot : robots) {
            Point robotPoint = robot.point;
            if (robotPoint.equals(point)) {
                throw new IllegalStateException("Точка " + point + " занята!");
            }
        }
    }

    public class Robot {

        public static final Direction DEFAULT_DIRECTION = Direction.TOP;

        private Direction direction;
        private Point point;

        public Robot(Point point) {
            this.direction = DEFAULT_DIRECTION;
            this.point = point;
        }

        public void changeDirection(Direction direction) {
            this.direction = direction;
        }

        public void move() {
            Point newPoint = switch (direction) {
                case TOP -> new Point(point.x() - 1, point.y());
                case RIGHT -> new Point(point.x(), point.y() + 1);
                case BOTTOM -> new Point(point.x() + 1, point.y());
                case LEFT -> new Point(point.x(), point.y() - 1);
            };
            validatePoint(newPoint);

            System.out.println("Робот переместился с " + point + " на " + newPoint);
            this.point = newPoint;
        }

        // move с параметром
        public void move(int steps) {
            for (int i = 0; i < steps; i += 1) {
                move();
            }
        }

        @Override
        public String toString() {
            return point.toString() + ", [" + direction.name() + "]";
        }
    }

}
