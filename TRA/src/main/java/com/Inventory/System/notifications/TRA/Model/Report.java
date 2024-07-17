package com.Inventory.System.notifications.TRA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

//This is class for making report for
@Entity
@Data
@Table(name = "report") //This is report Table
public class Report extends BaseEntity{

    String ReportTitle;
    ReportType reportType; //This is an enum for business performance
    ReportStatus reportStatus; //This is an enum
    String content; //This is for saving HTMl page as JSON

}
