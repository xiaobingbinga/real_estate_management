package com.xuetang9.house.houselogin.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class UserType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_type.ut_id
     *
     * @mbg.generated
     */
    private Integer utId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_type.ut_name
     *
     * @mbg.generated
     */
    private String utName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_type.ut_id
     *
     * @return the value of user_type.ut_id
     *
     * @mbg.generated
     */
    public Integer getUtId() {
        return utId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_type.ut_id
     *
     * @param utId the value for user_type.ut_id
     *
     * @mbg.generated
     */
    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_type.ut_name
     *
     * @return the value of user_type.ut_name
     *
     * @mbg.generated
     */
    public String getUtName() {
        return utName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_type.ut_name
     *
     * @param utName the value for user_type.ut_name
     *
     * @mbg.generated
     */
    public void setUtName(String utName) {
        this.utName = utName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", utId=").append(utId);
        sb.append(", utName=").append(utName);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserType other = (UserType) that;
        return (this.getUtId() == null ? other.getUtId() == null : this.getUtId().equals(other.getUtId()))
            && (this.getUtName() == null ? other.getUtName() == null : this.getUtName().equals(other.getUtName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_type
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUtId() == null) ? 0 : getUtId().hashCode());
        result = prime * result + ((getUtName() == null) ? 0 : getUtName().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table user_type
     *
     * @mbg.generated
     */
    public enum Column {
        utId("ut_id", "utId", "INTEGER", false),
        utName("ut_name", "utName", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_type
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_type
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_type
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_type
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_type
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_type
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_type
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}