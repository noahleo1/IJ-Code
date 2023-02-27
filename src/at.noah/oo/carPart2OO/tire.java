package at.noah.oo.carPart2OO;


    public class tire {
        private enum ridetype {STREET, OFFROAD}
        private int rimSize;
        private String rimType;



        public tire(int rimSize, String rimType) {
            this.rimSize = rimSize;
            this.rimType = rimType;

        }




        public int getRimSize() {
            return rimSize;
        }

        public void setRimSize(int rimSize) {
            this.rimSize = rimSize;
        }

        public String getRimType() {
            return rimType;
        }

        public void setRimType(String rimType) {
            this.rimType = rimType;
        }


    }

