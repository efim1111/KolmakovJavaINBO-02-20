package Lab5;

import java.util.Scanner;

public class TestLab5 {
    public static String recursion1(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(recursion1(--n) + " " + j);
        }
        return "";
    }
    public static String recursion2(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion2(n - 1) + " " + n;
    }
    public static String recursion3(int a, int b) {
        // основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion3(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion3(a + 1, b);
        }
    }
    public static int recursion4(int len, int sum, int k, int s) {
        // Базовый случай
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        // Шаг рекурсии / рекурсивное условие
        for (int i = c; i < 10; i++) {
            res += recursion4(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static int recursion5(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            return n % 10 + recursion5(n / 10);
        }
    }
    public static boolean recursion6(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return false;
        } // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < n / 2) {
            return recursion6(n, i + 1);
        } else {
            return true;
        }
    }
    public static void recursion7(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            recursion7(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            recursion7(n, ++k);
        }
    }
    public static String recursion8(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                // Базовый случай
                if (s.length() == 2) {
                    return "YES";
                }
                // Шаг рекурсии / рекурсивное условие
                return recursion8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static int recursion9(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion9(a, b - 1) + recursion9(a - 1, b - 1);
    }
    public static int recursion10(int n, int i) {
        return (n==0) ? i : recursion10( n/10, i*10 + n%10 );
    }
    public static int recursion11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 1) {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return recursion11() + n + m;
            } else {
                int k = in.nextInt();
                // Базовый случай
                if (k == 1) {
                    // Шаг рекурсии / рекурсивное условие
                    return recursion11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return recursion11() + n + m;
            } else {
                return n + m;
            }
        }
    }
    public static void recursion12() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                recursion12();
            } else {
                recursion12();
            }
        }
    }
    public static void recursion13() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            // Базовый случай
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                recursion13();
            }
        }
    }
    public static String recursion14(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return recursion14(n / 10) + " " + n % 10;
        }
    }
    public static int recursion15(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            System.out.print(n % 10 + " ");
            return recursion15(n / 10);
        }
    }
    public static void recursion16(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n > max) {
                recursion16(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                recursion16(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                recursion16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static int recursion17() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, recursion17());
        }
    }
    public static void main(String [] args){
        recursion1(5);
        System.out.println(recursion2(10));
        System.out.println(recursion3(20, 15));
        System.out.println(recursion4(0, 0, 3, 15));
        System.out.println(recursion5(123));
        System.out.println(recursion6(18, 2));
        recursion7(150, 2);
        System.out.println(recursion8("radar"));
        System.out.println(recursion9(5, 8));
        System.out.println(recursion10(158, 0));
        System.out.println(recursion11());
        recursion12();
        recursion13();
        System.out.println(recursion14(153));
        System.out.println(recursion15(123));
        recursion16(0, 0);
        System.out.println(recursion17());
    }
}
