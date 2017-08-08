package com.sk.spring;
import java.util.ArrayList;

public class LegoBlock {

   // 자식 노드들을 관리할 수 있다.

   ArrayList<LegoBlock> al = new ArrayList<LegoBlock>();

   String color;

   public LegoBlock(String color) {
      this.color = color;
   }

   public void run() {
      System.out.println(color + "");
      for (int i = 0; i < al.size(); i++) {
          al.get(i).run(); // 모든 하부 block에서 run()호출
      }
   }

   // 자기 자신에게 달라 붙인다.
   public void add(LegoBlock another) {
      al.add(another); // 현재 객체에 another를 추가 시킨다.
   }
   
   public void setBlock(LegoBlock another) {
      al.add(another); 
   }
   
   public void setBlocks(ArrayList<LegoBlock> another) {
      this.al = another;  
   }
   
   
}