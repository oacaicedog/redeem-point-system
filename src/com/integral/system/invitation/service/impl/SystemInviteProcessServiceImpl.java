package com.integral.system.invitation.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.integral.common.dao.impl.BaseDao;
import com.integral.system.invitation.bean.SystemInviteProcess;
import com.integral.system.invitation.dao.ISystemInviteProcessDao;
import com.integral.system.invitation.service.ISystemInviteProcessService;

/** 
 * <p>Description: [描述该类概要功能介绍]</p>
 * @author  <a href="mailto: swpigris81@126.com">代超</a>
 * @version $Revision$ 
 */
public class SystemInviteProcessServiceImpl implements ISystemInviteProcessService {
    private BaseDao baseDao;
    private ISystemInviteProcessDao systemInviteProcessDao;
    public BaseDao getBaseDao() {
        return baseDao;
    }
    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }
    public ISystemInviteProcessDao getSystemInviteProcessDao() {
        return systemInviteProcessDao;
    }
    public void setSystemInviteProcessDao(ISystemInviteProcessDao systemInviteProcessDao) {
        this.systemInviteProcessDao = systemInviteProcessDao;
    }
    @Override
    public List<SystemInviteProcess> findByUserId(String userId, String fromUserId, String menuId, String status, int start, int limit) {
        //String sql = "from SystemInviteProcess model  JOIN MenuInfo menu where model.invitationMenu = menu.menuId and model.recipient = :userId";
        String sql = "SELECT ps.id, ps.sponsor, ps.recipient, ps.sponsor_time, ps.process_time, ps.process_status, ps.invitation_menu," +
        		" m.menu_name, ps.process_result_code, ps.invitation_event, ps.invitation_reason, ps.nextaction, ps.relation_data, ps.ralation_entity_name" +
        		" FROM system_invite_process AS ps" +
        		" LEFT JOIN menu_info AS m ON ps.invitation_menu = m.menu_id where 1 = 1 "; 
        Map<String, Object> params = new HashMap<String, Object>();
        if(fromUserId != null && !"".equals(fromUserId.trim())){
            sql += " and ps.sponsor = :fromUserId ";
            params.put("fromUserId", fromUserId);
        }else{
            if(userId != null && !"".equals(userId.trim())){
                //sql += " and ps.recipient = :userId ";
                sql += (" and binary ucase(ps.recipient) like concat('%',ucase(:userId),'%') ");
                
                params.put("userId", userId);
            }
            if(menuId != null && !"".equals(menuId.trim())){
                sql = sql + " and ps.invitation_menu = :menuId";
                params.put("menuId", menuId);
            }
            if(status != null && !"".equals(status.trim())){
                sql += " and ps.process_status = :status";
                params.put("status", status);
            }
        }
        List list = this.systemInviteProcessDao.findByParams(sql, false, start, limit, params);
        
        List<SystemInviteProcess> processList = new ArrayList<SystemInviteProcess>();
        if(list != null && list.size()>0){
            for (int i = 0, j = list.size(); i < j; i++) {
                Object[] obj = (Object[]) list.get(i);
                SystemInviteProcess process = new SystemInviteProcess();
                process.setId(obj[0] == null ? "" : obj[0].toString());
                process.setSponsor(obj[1] == null ? "" : obj[1].toString());
                process.setRecipient(obj[2] == null ? "" : obj[2].toString());
                process.setSponsorTime(obj[3] == null ? null : (Date)obj[3]);
                process.setProcessTime(obj[4] == null ? null : (Date)obj[4]);
                process.setProcessStatus(obj[5] == null ? "" : obj[5].toString());
                process.setInvitationMenu(obj[6] == null ? "" : obj[6].toString());
                process.setInvitationMenuName(obj[7] == null ? "" : obj[7].toString());
                process.setProcessResultCode(obj[8] == null ? "" : obj[8].toString());
                process.setInvitationEvent(obj[9] == null ? "" : obj[9].toString());
                process.setInvitationReason(obj[10] == null ? "" : obj[10].toString());
                process.setNextaction(obj[11] == null ? "" : obj[11].toString());
                process.setRelationData(obj[12] == null ? "" : obj[12].toString());
                process.setRelationEntityName(obj[13] == null ? "" : obj[13].toString());
                processList.add(process);
            }
        }
        return processList;
    }
    @Override
    public int findCountByUserId(String userId, String fromUserId, String menuId, String status) {
        String sql = "from SystemInviteProcess model where 1 = 1 ";
        Map<String, Object> params = new HashMap<String, Object>();
        if(fromUserId != null && !"".equals(fromUserId.trim())){
            sql += " and model.sponsor = :fromUserId ";
            params.put("fromUserId", fromUserId);
        }else{
            if(userId != null && !"".equals(userId.trim())){
                sql += " and model.recipient = :userId ";
                params.put("userId", userId);
            }
            if(menuId != null && !"".equals(menuId.trim())){
                sql = sql + " and model.invitationMenu = :menuId";
                params.put("menuId", menuId);
            }
            if(status != null && !"".equals(status.trim())){
                sql += " and model.processStatus = :status";
                params.put("status", status);
            }
        }
        return this.systemInviteProcessDao.findCountByParams(sql, true, -1, -1, params);
    }
    @Override
    public void save(SystemInviteProcess instance) {
        this.systemInviteProcessDao.save(instance);
    }
    @Override
    public void saveOrUpdate(SystemInviteProcess instance) {
        this.systemInviteProcessDao.saveOrUpdate(instance);
    }
    @Override
    public void saveOrUpdateAll(List<SystemInviteProcess> persistentInstances) {
        this.systemInviteProcessDao.saveOrUpdateAll(persistentInstances);
    }
    @Override
    public void delete(SystemInviteProcess persistentInstance) {
        this.systemInviteProcessDao.delete(persistentInstance);
    }
    @Override
    public void deleteAll(List<SystemInviteProcess> persistentInstances) {
        this.systemInviteProcessDao.deleteAll(persistentInstances);
    }
    @Override
    public SystemInviteProcess findById(String id) {
        return this.systemInviteProcessDao.findById(id);
    }
}
