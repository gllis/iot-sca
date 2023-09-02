<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${package.Mapper}.${table.mapperName}">

    <resultMap id="BaseResultMap" type="${package.Entity}.${entity}">
<#list table.fields as field>
    <#if field.keyFlag>
        <id column="${field.name}" property="${field.propertyName}" />
    </#if>
</#list>
<#list table.fields as field>
    <#if !field.keyFlag>
        <result column="${field.name}" property="${field.propertyName}" />
    </#if>
</#list>
    </resultMap>
    <sql id="Base_Column_List">
        <#list table.commonFields as field>
            ${field.name},
        </#list>
        ${table.fieldNames}
    </sql>
</mapper>