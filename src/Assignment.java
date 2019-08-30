import java.io.*;

public class Assignment
{
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV file header
    private static final String FILE_HEADER = "Email-Template";
    public static void main(String[] args) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("/Users/sandhyasingh/Downloads/sample_email.csv"));

        String row="";
        csvReader.readLine();
        int i=0;

        while ((row = csvReader.readLine()) != null)
        {



            PrintWriter outputfile = new PrintWriter(new File("test.csv"+i));



            StringBuilder sb = new StringBuilder();


            String[] data = row.split(",");
            String name=data[0]+data[1];
            String company_name=data[2]+data[3];
            String address=data[4];
            String city=data[5];
            String country=data[6];
            String state=data[7];
            String zip=data[8];
            String phone1=data[9];
            String phone=data[10];
            String email=data[11];
            String subject=data[12];
            String emailBody=data[13];

            System.out.println(name);
            System.out.println(company_name);
            System.out.println(address);
            System.out.println(city);
            System.out.println(country);
            System.out.println(state);
            System.out.println(zip);
            System.out.println(phone1);
            System.out.println(phone);
            System.out.println(email);
            System.out.println(subject);
            System.out.println(emailBody);

            System.out.println("##----------------------------##");


            sb.append("Email to "+email+"\n");
            sb.append("Subject Line: "+subject+"\n");
            sb.append("Hi  "+name+","+"\n");
            sb.append(emailBody+"\n");
            sb.append("Thanks "+"\n"+company_name);

            outputfile.write(sb.toString());

            outputfile.close();

        i++;

        }

        csvReader.close();
    }
}
