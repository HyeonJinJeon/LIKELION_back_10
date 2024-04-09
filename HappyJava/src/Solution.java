class SuperClass {
    SuperClass() {
        System.out.print("super");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        System.out.print("sub");
    }
}
class Solution {
    public static void main(String[] args) {
        SubClass s = new SubClass();
    }
}
