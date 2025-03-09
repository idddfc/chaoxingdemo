package com.hangzhoudianzi.demo;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommaSeparatedIntegerListTypeHandler extends BaseTypeHandler<List<Integer>> {

    // 设置参数时，将 List<Integer> 转换为逗号分隔的字符串
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<Integer> parameter, JdbcType jdbcType) throws SQLException {
        StringBuilder sb = new StringBuilder();
        for (Integer num : parameter) {
            sb.append(num).append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        ps.setString(i, sb.toString());
    }

    // 从结果集中获取字符串并转换为 List<Integer>
    @Override
    public List<Integer> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String value = rs.getString(columnName);
        return parseStringToList(value);
    }

    @Override
    public List<Integer> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String value = rs.getString(columnIndex);
        return parseStringToList(value);
    }

    @Override
    public List<Integer> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String value = cs.getString(columnIndex);
        return parseStringToList(value);
    }

    private List<Integer> parseStringToList(String value) {
        List<Integer> result = new ArrayList<>();
        if (value != null && !value.isEmpty()) {
            String[] parts = value.split(",");
            for (String part : parts) {
                try {
                    result.add(Integer.valueOf(part.trim()));
                } catch (NumberFormatException e) {
                    // 如果转换失败，可记录日志或忽略
                }
            }
        }
        return result;
    }
}