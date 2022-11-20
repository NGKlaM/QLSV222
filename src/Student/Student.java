package Student;

public class Student {
        private String name;
        private int year;
        private String sex;
        private int DTB;

        public Student(String name, int year, String sex, int DTB) {
            this.name = name;
            this.year = year;
            this.sex = sex;
            this.DTB = DTB;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getDTB() {
            return DTB;
        }

        public void setDTB(int DTB) {
            this.DTB = DTB;
        }
        public void inttSV(){
            System.out.println(" hien thị thông tin sinh viên");
            System.out.println("họ và tên"+name+ "tuổi học sinh" +year + "Giới tính" + sex + "điểm trung binh"+ DTB);
        }
}

