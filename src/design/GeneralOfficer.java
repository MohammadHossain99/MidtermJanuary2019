package design;

public class GeneralOfficer {

        static design.GeneralOfficer gOfficer = new design.GeneralOfficer();

        private GeneralOfficer(){}

        public design.GeneralOfficer getInstance(){
            return gOfficer;
        }


        public int resposibiities(){
            int number =300;
            int hour = 40;

            int total = number*hour;

            System.out.println("Working " + hour+" hours, with $"+number+" dollar for an hour GM making $"+total
                    +" dollar a month !");
            return total;

        }





    }

