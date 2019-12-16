package ЛР5;

public class Vector {
    public static void  main (String [] args){
        Rect rect = new Rect(new Vector2(3, 9), new Vector2(2, 4));

        rect.foundRect();
    }

    public static class Vector2 {
        int x;
        int y;
        Vector2(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Rect {
        int a;
        Vector2 vector;
        Vector2 vector2;

        Rect (Vector2 vector, Vector2 vector2) {
            this.vector = vector;
            this.vector2 = vector2;
        }

        void foundRect() {
            System.out.println("Площадь " + (vector2.x - vector.x) * (vector.y - vector2.y));
            System.out.println("Периметр " + (((vector2.x - vector.x) + (vector.y - vector2.y)) * 2));
        }
    }
}
