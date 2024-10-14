package Commnunity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DTO {
    Scanner input=new Scanner(System.in);
    private HashMap<String, String>comList=new HashMap<String,String>();
    private ArrayList<String> titleList=new ArrayList<String>();
    private String inputTitle,inputCont,content,key;
    private int menu;

    //글 입력, 확인 비밀번호 입력
    //arraylist에 글 저장
    //최상단의 3개 불러오기
    //필터?
    public void setInputTitle(){System.out.print("제목: ");this.inputTitle=input.next();}
    public void setInputCont(){System.out.print("내용: ");this.inputCont=input.next();}

    public void getTitleList(){
        for (int i=0;i<comList.size();i++){
            System.out.print((i+1)+" ) "); getTitle(i);}
        }

    public void getContent(int i){
        System.out.println(comList.get(getKey(i-1)));}

    public void getTitle(int i){
        System.out.println((String)getKey(i));}

    public int chosMenu(){System.out.print(">>>");menu=input.nextInt();return menu;}

    public void setComList(){
        titleList.add(inputTitle);
        comList.put(inputTitle,inputCont);}
    
    public String getKey(int i){
        key=titleList.get(i);return key;}

    public void delComList(int i){
            comList.remove(getKey(i-1));
            titleList.remove(i-1);}
            
    public HashMap getComList(){return comList;}

    // public void setComPw(){
    //     comPw.put(inputTitle, inputPw);}
    // public HashMap getcomPw(){return comPw;}

}
