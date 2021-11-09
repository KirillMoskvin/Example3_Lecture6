/*
 * This file is generated by jOOQ.
 */
package generated.tables.records;


import generated.tables.Author;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorRecord extends UpdatableRecordImpl<AuthorRecord> implements Record5<Integer, String, String, LocalDate, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.author.id</code>.
     */
    public AuthorRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.author.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.author.first_name</code>.
     */
    public AuthorRecord setFirstName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.author.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.author.last_name</code>.
     */
    public AuthorRecord setLastName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.author.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.author.date_of_birth</code>.
     */
    public AuthorRecord setDateOfBirth(LocalDate value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.author.date_of_birth</code>.
     */
    public LocalDate getDateOfBirth() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>public.author.year_of_birth</code>.
     */
    public AuthorRecord setYearOfBirth(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.author.year_of_birth</code>.
     */
    public Integer getYearOfBirth() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, LocalDate, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, LocalDate, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Author.AUTHOR.ID;
    }

    @Override
    public Field<String> field2() {
        return Author.AUTHOR.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Author.AUTHOR.LAST_NAME;
    }

    @Override
    public Field<LocalDate> field4() {
        return Author.AUTHOR.DATE_OF_BIRTH;
    }

    @Override
    public Field<Integer> field5() {
        return Author.AUTHOR.YEAR_OF_BIRTH;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public LocalDate component4() {
        return getDateOfBirth();
    }

    @Override
    public Integer component5() {
        return getYearOfBirth();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public LocalDate value4() {
        return getDateOfBirth();
    }

    @Override
    public Integer value5() {
        return getYearOfBirth();
    }

    @Override
    public AuthorRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AuthorRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public AuthorRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public AuthorRecord value4(LocalDate value) {
        setDateOfBirth(value);
        return this;
    }

    @Override
    public AuthorRecord value5(Integer value) {
        setYearOfBirth(value);
        return this;
    }

    @Override
    public AuthorRecord values(Integer value1, String value2, String value3, LocalDate value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorRecord
     */
    public AuthorRecord() {
        super(Author.AUTHOR);
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    public AuthorRecord(Integer id, String firstName, String lastName, LocalDate dateOfBirth, Integer yearOfBirth) {
        super(Author.AUTHOR);

        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setYearOfBirth(yearOfBirth);
    }
}