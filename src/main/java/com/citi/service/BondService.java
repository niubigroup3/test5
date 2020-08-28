package com.citi.service;









import com.citi.bean.DemoBondsSalesRecord;




import com.citi.dao.BondMapper;




import org.springframework.stereotype.Service;









import javax.annotation.Resource;




import java.sql.Date;




import java.util.List;









@Service




public class BondService {









    @Resource




    private BondMapper bondMapper;









    public void insertBond(DemoBondsSalesRecord bond)




    {




         bondMapper.insertBond(bond);




    }









    public List<DemoBondsSalesRecord> selectBonds(String salesName, String bondsName) {




    	return bondMapper.selectBondByName(salesName, bondsName);




    }









    public DemoBondsSalesRecord selectBondById(int id) {




    	return bondMapper.selectBondById(id);




    }









    public List<DemoBondsSalesRecord> selectBondByName(String salesName, String bondsName) {




    	return bondMapper.selectBondByName(salesName, bondsName);




    }









    public List<DemoBondsSalesRecord> selectRecent() {




    	return bondMapper.selectRecent();




    }









    public List<DemoBondsSalesRecord> selectBonds(String salesName, String bondsName, Date stime, Date etime) {




    	return bondMapper.selectBonds(salesName, bondsName, stime, etime);




    }














    public int countTotalSales() {




        int totalSales = bondMapper.countTotalSales();




        return totalSales;




    }









    public int countTotalRecords() {




        int totalRecords = bondMapper.countTotalRecords();




        return totalRecords;




    }




}