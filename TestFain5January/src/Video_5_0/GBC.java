package Video_5_0;

import java.awt.GridBagConstraints;
import java.awt.Insets;



public class GBC extends GridBagConstraints{

//	������� ������ GBC, ��������� gridx, gridy.
//	�������� ��������� ���������� ������������ �� ���������
//  @param gridx ������� gridx
//  @param	gridy ������� gridy
//  @param gridWidth ���������� ������ � ����������� x
//  @param gridHeght ���������� ������ � ����������� y

	public GBC(int gridx, int gridy) {
		this.gridx = gridx;
		this.gridy = gridy;
	}
	
//	������� ������ GBC, ��������� gridx, gridy, gridWidth � gridHeigth.
//	�������� ��������� ���������� ������������ �� ���������.
//	@param gridx ������� gridx
//	@param gridy ������� gridy	
//	@param gridWidth ���������� ������ � ����������� x
//	@param gridHeight ����������� ������ � ����������� y

	public GBC(int gridx, int gridy, int gridWidth, int gridHeight) {
		
		this.gridx = gridx;
		this.gridy = gridy;
		this.gridwidth = gridWidth;
		this.gridheight = gridHeight;
		
	}
	
//	������������� �������� anchor.
//	@param anchor �������� ��������� 
//	@return ������ this, ��������� ��� ���������� �����������
	
	public GBC setAnchor(int anchor) {
		this.anchor = anchor;
		return this;
		
		
	}
	
//	������������� �������� fill.
//	@param fill �������� ��������� 
//	@return ������ this, ��������� ��� ���������� �����������
	
	public GBC setFill(int fill) {
		this.fill = fill;
		return this;
		
		
	}
	
//	������������� ���� ������.
//	@param weightx ��� � ����������� x
//	@param weigthy ��� � ����������� y
//	@return ������ this. ��������� ��� ���������� �����������
	
	public GBC setWeight(double weightx, double weighty) {
		
		this.weightx = weightx;	
		this.weighty = weighty;
			return this;	
		}
		
//	������������� ������� ���������� ������������ ��� ������.
//	@param distance ������� �� ���� ������������
//	@return ������ this, ��������� ��� ���������� �����������

	
	public GBC setInsets(int distance) {
		this.insets = new Insets(distance, distance, distance, distance);
		return this;
	}
	

//	������������� ������� ���������� ������������ ��� ������.
//	@param top ������ ������� ����� ���������� ������������
//	@param left ������ ����� ����� ���������� ������������
//	@param bottom ������ ������ ����� ���������� ������������
//	@param right ������ ������ ����� ���������� ������������
//	@return ������ this, ��������� ��� ���������� �����������
	
	public GBC setInsets(int top, int left, int bottom, int right) {
		this.insets = new Insets(top, left, bottom, right);
		return this;
	}
	
	
//	������������� ��������� ����������.
// @param ipadx ��������� ���������� � ����������� x
//	@param ipady ��������� ���������� � ����������� y
//	@return ������ this, ��������� ��� ���������� �����������
	
	public GBC setIpad(int ipadx, int ipady) {
		this.ipadx = ipadx;
		this.ipady = ipady;
		return this;
	}

	
	
}
