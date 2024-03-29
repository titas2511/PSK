package task.lt.mybatis.model;

import java.util.List;

public class Trip {
    private Driver assignedDriver;
    private Bus assignedBus;
    private List<Ticket> tickets;

    public Driver getAssignedDriver() {
        return assignedDriver;
    }

    public void setAssignedDriver(Driver assignedDriver) {
        this.assignedDriver = assignedDriver;
    }

    public Bus getAssignedBus() {
        return assignedBus;
    }

    public void setAssignedBus(Bus assignedBus) {
        this.assignedBus = assignedBus;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.trip.id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.trip.arrival_time
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private String arrivalTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.trip.departure_time
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private String departureTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.trip.name
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.trip.bus_id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private Integer busId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.trip.driver_id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    private Integer driverId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.trip.id
     *
     * @return the value of public.trip.id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.trip.id
     *
     * @param id the value for public.trip.id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.trip.arrival_time
     *
     * @return the value of public.trip.arrival_time
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.trip.arrival_time
     *
     * @param arrivalTime the value for public.trip.arrival_time
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.trip.departure_time
     *
     * @return the value of public.trip.departure_time
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.trip.departure_time
     *
     * @param departureTime the value for public.trip.departure_time
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.trip.name
     *
     * @return the value of public.trip.name
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.trip.name
     *
     * @param name the value for public.trip.name
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.trip.bus_id
     *
     * @return the value of public.trip.bus_id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public Integer getBusId() {
        return busId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.trip.bus_id
     *
     * @param busId the value for public.trip.bus_id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.trip.driver_id
     *
     * @return the value of public.trip.driver_id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.trip.driver_id
     *
     * @param driverId the value for public.trip.driver_id
     *
     * @mbg.generated Sat Apr 10 20:15:58 EEST 2021
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }
}