package ch12;

public class Student {
    private int num;
    private String name;

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    // equals를 오버라이딩 받아서 새롭게 정의하자!(메모리 주소로 동일한 학생인지 판단하고 싶지 않아서... 이름 & 학번이 같으면 같은 학생인데 equals는 객체 주소로 판단하기 때문에 이름 & 학번이 같아도 다르다고 나옴, 그래서 재정의함)
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) { // obj가 Student 클래스에서 나온 애가 맞아?
            if(this.num == ((Student) obj).num) { // 학번이 같으면 같은 사람
                return true;
            }
        }
        return false;
    }

}
