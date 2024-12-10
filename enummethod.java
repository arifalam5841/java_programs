public class enummethod {
    
    enum season{
        winter, summer, rainy, falls
    }

    enum days{
        monday, tuesday, wednesdaym, thursday
    }

    public static void main(String[] args) {
        for(season s : season.values()){
            System.out.println(s);
        }


        days day1 = days.monday;

        System.out.println(day1);
    }
}
