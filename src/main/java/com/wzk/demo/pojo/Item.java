package com.wzk.demo.pojo;

public class Item {

	private Integer orderId;

	private Integer ItemId;

	private String ItemName;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getItemId() {
		return ItemId;
	}

	public void setItemId(Integer itemId) {
		ItemId = itemId;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	@Override
	public String toString() {
		return "Item{" +
				"orderId=" + orderId +
				", ItemId=" + ItemId +
				", ItemName='" + ItemName + '\'' +
				'}';
	}
}
