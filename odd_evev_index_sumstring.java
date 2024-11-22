import java.util.Scanner;
public class odd_evev_index_sumstring {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();

        boolean istrue=true;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            istrue=false;
            if(c!='a'|| c!='e'|| c!='i'|| c!='o'|| c!='u'|| c!='A'|| c!='E'|| c!='I'||c!='O'||c!='U'){
                System.out.println("No");
                break;
            }
        }
        if(istrue) System.out.println("Yes");
    }
}
