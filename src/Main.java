public class Main {
    public static void main(String[] args) {
        double[] jdm = {-51.43, 43.56, -45.565, 43.1, 135.45, -65.2, 4.2 , -89.33, 32.5, -76.8, -54.45, 1.3, 33.4, -56.30, 4.4};
        double rds=0;
        int doub = 0;
        boolean jake = false;
        for (double hammer: jdm
             ) {
            if (hammer <0){
                jake = true;
            } else if (jake) {
                doub++;
                rds +=hammer;

            }

        }
        System.out.println(rds / doub);


        }


            }
            






            

        

