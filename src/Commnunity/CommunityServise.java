package Commnunity;

public class CommunityServise extends DTO {
    
    public void display(){   
        switch(showMenu()){
        case 1:
            newCom();
            break;
        case 2:
            showCom();
            break;
        case 3:
            delCom();
            break;
        default:
    }}

    public int showMenu(){			
        System.out.println("[1] 게시글 작성");
        System.out.println("[2] 게시글 보기");
        System.out.println("[3] 게시글 삭제");
        System.out.println("[4] 나가기");
        int menu=chosMenu();
        return menu;}
        

    public void newCom(){
        setInputTitle();
        setInputCont();
        setComList();
        System.out.println("업로드가 되었습니다.");

    }
    public void delCom(){
        if (getComList().isEmpty()){
            System.out.println("아직 작성 된 게시글이 없습니다.");
        }
        else{
            try {
                getTitleList();
                System.out.print("");
                System.out.println("삭제하려는 게시글을 선택하십시오.");
                delComList(chosMenu());
                System.out.println("삭제되었습니다.");
            } catch (Exception e) {
            	e.printStackTrace();
                System.out.println("삭제할 수 없는 게시글입니다.");
            }
        }}

    public void showCom(){
        if (getComList().isEmpty()){
            System.out.println("아직 작성 된 게시글이 없습니다.");
        }
        else{
            try {
                getTitleList();
                System.out.println();
                getContent(chosMenu());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("볼 수 없는 게시글입니다.");
            }
        }


    }

    }

