package com.behaviour.mediator.demo;
public class CDDriver extends Colleague{
    //������ȡ����������
    private String data = "";
    /**
     * ���캯��
     */
    public CDDriver(Mediator mediator) {
        super(mediator);
    }
    /**
     * ��ȡ���̶�ȡ����������
     */
    public String getData() {
        return data;
    }
    /**
     * ��ȡ����
     */
    public void readCD(){
        //����ǰ����Ƶ��ʾ�����ݣ����ź�������
        this.data = "������,�������ҵ�����";
        //֪ͨ���壬�Լ���״̬�����˸ı�
        getMediator().changed(this);
    }
}