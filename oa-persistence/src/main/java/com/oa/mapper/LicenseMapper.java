package com.oa.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.oa.entity.License;
import com.oa.entity.Record;
import com.oa.entity.vo.LicenseVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  打卡记录Mapper 接口
 * </p>
 *
 * @author zhengwen
 * @since 2018年10月22日09:33:03
 */
@Repository
public interface LicenseMapper extends BaseMapper<License> {
    List<LicenseVO> selectLicenseVOList();
}
