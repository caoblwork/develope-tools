<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.dao;

import org.springframework.stereotype.Repository;
import ${basepackage}.entity.${className};
import ${basepackage}.framework.dao.mybatis.BaseMyBatisDAOImpl;

/**
 * ${className}DAO
 * 
 * @author 修改成自己的名字
 * @version 1.0
 */
@Repository(value = "${classNameLower}Dao")
public class ${className}DAOImpl extends BaseMyBatisDAOImpl<${className}, String> implements ${className}DAO {

}