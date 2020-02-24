public class Main2 {
    public static void main(String[] args) {
// I=1 V=5 X=10 L=50 C=100


        char cRomZiffer[] = {'I', 'V', 'X', 'L', 'C'};



        Integer iRoemer;
        String sRoemer = "";
        String sTmp = "";
        int iZiffer;

        for (int i = 1; i <= 100; i++) {
            iRoemer = i;
            if (iRoemer != 0) {
                for (int j = 0; iRoemer > 0; j += 2) {
                    sTmp = "";
                    iZiffer = iRoemer % 10;

                    if (iZiffer == 4) {
                        sTmp += cRomZiffer[j];
                        sTmp += cRomZiffer[j + 1];
                    } else if (iZiffer == 9) {
                        sTmp += cRomZiffer[j];
                        sTmp += cRomZiffer[j + 2];
                    } else {

                        if (iZiffer >= 5) {
                            sTmp += cRomZiffer[j + 1];
                            iZiffer -= 5;
                        }
                        for (; iZiffer > 0; iZiffer--)
                            sTmp += cRomZiffer[j];
                    }

                    iRoemer /= 10;
                    sRoemer = sTmp + sRoemer;

                }
            }
            System.out.println(sRoemer);
            sRoemer="";
        }
    }
}