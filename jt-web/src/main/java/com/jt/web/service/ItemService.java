package com.jt.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.common.service.HttpClientService;
import com.jt.common.util.ObjectUtil;
import com.jt.web.pojo.Item;
import com.jt.web.pojo.ItemDesc;
@Service
public class ItemService {
	//��ȡ��̨����
	@Autowired
	private HttpClientService client;

	public Item queryItem(Long itemId) throws Exception {
		// TODO Auto-generated method stub
		//ҵ������,��Ҫ�����ϵͳ�ķ���,ʹ�õ���httpclient
		/*����url:"manage.jt.com/items/{itemId}"
		����ʽ:get
		����:Long itemId 
		��������: item��json�ַ������طŵ���Ӧ����;*/
		//url��ַ
		String url="http://manage.jt.com/items/"+itemId;
		//������Ӧ���е��ַ���
		String itemJson = client.doGet(url);
		//ת��json��item���� readValue�ǽ����������jsonת���ɶ���ķ���
		//����ת��json writeValueAsString
		Item item=ObjectUtil.mapper.readValue(itemJson, Item.class);
		return item;

	}

	public ItemDesc queryItemDesc(Long itemId)throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 	��Ʒ����
		����url:"manage.jt.com/itemDescs/{itemId}"
		����ʽ:get
		����:Long itemId
		��������:itemDesc��json�ַ���
		 */
		String url="http://manage.jt.com/itemDescs/"+itemId;
		String itemDescJson = client.doGet(url);
		//ת��json��item���� readValue�ǽ����������jsonת���ɶ���ķ���
		//����ת��json writeValueAsString
		ItemDesc itemDesc=ObjectUtil.mapper.
				readValue(itemDescJson, ItemDesc.class);
		return itemDesc;
	}

}
