package com.ll.array;

public class ArrayList {
    int[] datas;
    int lastIdx;
    ArrayList(){
        datas=new int[2];
        lastIdx=-1;
    }
    public int size() {
        return lastIdx+1;
    }

    public void add(int data) {
        sizeUpIfFull();
        datas[++lastIdx]=data;
    }

    private void sizeUpIfFull() {
        if(isFull()){
            sizeUp();
        }
    }

    private void sizeUp() {
        int[] temp=new int[datas.length*2];
        for(int i=0;i<datas.length;i++){
            temp[i]=datas[i];
        }
        datas=temp;
    }

    private boolean isFull() {
        return lastIdx+1>=datas.length?true: false;
    }

    public int get(int idx) {
        return datas[idx];
    }

    public void removeAt(int idx) {
        for(int i=idx+1;i<=lastIdx;i++){
            datas[i-1]=datas[i];
        }
        lastIdx--;
    }

    public int getArrayLength() {
        return datas.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i=0;i<size();i++){
            System.out.println(i+" : "+datas[i]);
        }
    }

    public void addAt(int idx,int data) {
        sizeUpIfFull();

        for (int i = size()- 1; i > idx; i--) {
            datas[i] = datas[i - 1];
        }
        datas[idx] = data;
        lastIdx++;
    }
}
