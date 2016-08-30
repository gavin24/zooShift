package za.cput.gavin.zoo.Domain;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 * Created by gavin.ackerman on 2016-04-05.
 */
public class Staff {
    private long id;

    private List<Employee> employee;
    private Date workDay;
    private Time endTime;
    private Time startTime;

    public Staff(Builder builder) {
        this.id=builder.id;
        employee=builder.employee;
        workDay=builder.workDay;
        startTime=builder.startTime;
        endTime=builder.endTime;
    }
    public List<Employee> getsEmployees() {
        return employee;
    }

    public Date getDay() {
        return workDay;
    }
    public long getId() {
        return id;
    }
    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public static class Builder{
        private long id;
        private Date workDay;
        private Time startTime;
        private Time endTime;
        private List<Employee> employee;


        public Builder (long id)
        {
            this.id= id;

        }
        public Builder employee(List<Employee> employee) {
            this.employee = employee;
            return this;
        }
        public Builder Day(Date value) {
            this.workDay = value;
            return this;
        }

        public Builder startTime(Time value){
            this.startTime=value;
            return this;
        }

        public Builder endTime(Time value){
            this.endTime=value;
            return this;
        }

        public Builder copy(Staff value){
            this.id=value.id;

            this.startTime=value.startTime;
            this.endTime=value.endTime;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }


    }
}
