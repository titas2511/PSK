package task.lt.mybatis.model;

import java.util.List;

public class Driver {
    private List<Trip> trips;

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    private List<Bus> buses;

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.driver.driver_id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private Integer driverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.driver.cell_phone
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private String cellPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.driver.name
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.driver.surname
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private String surname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.driver.driver_id
     *
     * @return the value of public.driver.driver_id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.driver.driver_id
     *
     * @param driverId the value for public.driver.driver_id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.driver.cell_phone
     *
     * @return the value of public.driver.cell_phone
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.driver.cell_phone
     *
     * @param cellPhone the value for public.driver.cell_phone
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.driver.name
     *
     * @return the value of public.driver.name
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.driver.name
     *
     * @param name the value for public.driver.name
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.driver.surname
     *
     * @return the value of public.driver.surname
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.driver.surname
     *
     * @param surname the value for public.driver.surname
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}