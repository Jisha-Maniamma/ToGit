package com.Java.Class1.Day12.Database1.DB.Model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/26 10:51
 */
public class AllAboutProject {
    //////////////////////////
    private SimpleIntegerProperty companyId;
    private SimpleStringProperty CompanyName;
    /////////////////////////
    private SimpleIntegerProperty departmentId;
    private SimpleStringProperty departmentName;
    ////////////////////////
    private SimpleIntegerProperty userId;
    private SimpleStringProperty fName;
    private SimpleStringProperty lName;
    private SimpleStringProperty email;
    private SimpleStringProperty gender;
    ////////////////////////
    private SimpleStringProperty loginId;
    private SimpleStringProperty password;
    ////////////////////////
    private SimpleStringProperty projectName;
    private SimpleStringProperty leaderName;
    private SimpleStringProperty milestone_Date;
    private SimpleStringProperty end_Date;
    private SimpleStringProperty actual_Date;
    private SimpleStringProperty check_Date;
    ////////////////////////
    //analysis//
    private SimpleStringProperty status;
    private SimpleDoubleProperty cc;
    private SimpleDoubleProperty pb;
    private SimpleDoubleProperty priority;
    private SimpleDoubleProperty remaining_wait;
    private SimpleStringProperty Scheduled_Start_Date;
    private SimpleDoubleProperty Xaxis;
    private SimpleDoubleProperty Yaxis;
    ///////////////////////
    //planing//

    private SimpleDoubleProperty T1;
    private SimpleDoubleProperty T2;
    private SimpleDoubleProperty T3;
    private SimpleDoubleProperty T4;
    private SimpleDoubleProperty T5;
    private SimpleDoubleProperty T6;
    private SimpleDoubleProperty T7;
    private SimpleDoubleProperty T8;
    private SimpleDoubleProperty T9;
    private SimpleDoubleProperty T10;
    private SimpleDoubleProperty T11;
    private SimpleDoubleProperty T12;
    private SimpleDoubleProperty planning_weight;
    private SimpleStringProperty wait_Criteria;
    private SimpleStringProperty task_Criteria;
    private SimpleDoubleProperty R1;
    private SimpleDoubleProperty R2;
    private SimpleDoubleProperty R3;
    private SimpleDoubleProperty R4;
    private SimpleDoubleProperty R5;
    private SimpleDoubleProperty R6;
    private SimpleDoubleProperty R7;
    private SimpleDoubleProperty R8;
    private SimpleDoubleProperty R9;
    private SimpleDoubleProperty R10;
    private SimpleDoubleProperty R11;
    private SimpleDoubleProperty R12;
    /////////////////////
    //execution//
    private SimpleStringProperty currentTask;
    private SimpleDoubleProperty Te1;
    private SimpleDoubleProperty Te2;
    private SimpleDoubleProperty Te3;
    private SimpleDoubleProperty Te4;
    private SimpleDoubleProperty Te5;
    private SimpleDoubleProperty Te6;
    private SimpleDoubleProperty Te7;
    private SimpleDoubleProperty Te8;
    private SimpleDoubleProperty Te9;
    private SimpleDoubleProperty Te10;
    private SimpleDoubleProperty Te11;
    private SimpleDoubleProperty Te12;
    private SimpleDoubleProperty we1;
    private SimpleDoubleProperty we2;
    private SimpleDoubleProperty we3;
    private SimpleDoubleProperty we4;
    private SimpleDoubleProperty we5;
    private SimpleDoubleProperty we6;
    private SimpleDoubleProperty we7;
    private SimpleDoubleProperty we8;
    private SimpleDoubleProperty we9;
    private SimpleDoubleProperty we10;
    private SimpleDoubleProperty we11;
    private SimpleDoubleProperty we12;
    private SimpleDoubleProperty Re1;
    private SimpleDoubleProperty Re2;
    private SimpleDoubleProperty Re3;
    private SimpleDoubleProperty Re4;
    private SimpleDoubleProperty Re5;
    private SimpleDoubleProperty Re6;
    private SimpleDoubleProperty Re7;
    private SimpleDoubleProperty Re8;
    private SimpleDoubleProperty Re9;
    private SimpleDoubleProperty Re10;
    private SimpleDoubleProperty Re11;
    private SimpleDoubleProperty Re12;

    //getters and setters


    public int getCompanyId() {
        return companyId.get();
    }

    public SimpleIntegerProperty companyIdProperty() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId.set(companyId);
    }

    public String getCompanyName() {
        return CompanyName.get();
    }

    public SimpleStringProperty companyNameProperty() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        this.CompanyName.set(companyName);
    }

    public int getDepartmentId() {
        return departmentId.get();
    }

    public SimpleIntegerProperty departmentIdProperty() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId.set(departmentId);
    }

    public String getDepartmentName() {
        return departmentName.get();
    }

    public SimpleStringProperty departmentNameProperty() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName.set(departmentName);
    }

    public int getUserId() {
        return userId.get();
    }

    public SimpleIntegerProperty userIdProperty() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId.set(userId);
    }

    public String getfName() {
        return fName.get();
    }

    public SimpleStringProperty fNameProperty() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName.set(fName);
    }

    public String getlName() {
        return lName.get();
    }

    public SimpleStringProperty lNameProperty() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName.set(lName);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getGender() {
        return gender.get();
    }

    public SimpleStringProperty genderProperty() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public String getLoginId() {
        return loginId.get();
    }

    public SimpleStringProperty loginIdProperty() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId.set(loginId);
    }

    public String getPassword() {
        return password.get();
    }

    public SimpleStringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public String getProjectName() {
        return projectName.get();
    }

    public SimpleStringProperty projectNameProperty() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName.set(projectName);
    }

    public String getLeaderName() {
        return leaderName.get();
    }

    public SimpleStringProperty leaderNameProperty() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName.set(leaderName);
    }

    public String getMilestone_Date() {
        return milestone_Date.get();
    }

    public SimpleStringProperty milestone_DateProperty() {
        return milestone_Date;
    }

    public void setMilestone_Date(String milestone_Date) {
        this.milestone_Date.set(milestone_Date);
    }

    public String getEnd_Date() {
        return end_Date.get();
    }

    public SimpleStringProperty end_DateProperty() {
        return end_Date;
    }

    public void setEnd_Date(String end_Date) {
        this.end_Date.set(end_Date);
    }

    public String getActual_Date() {
        return actual_Date.get();
    }

    public SimpleStringProperty actual_DateProperty() {
        return actual_Date;
    }

    public void setActual_Date(String actual_Date) {
        this.actual_Date.set(actual_Date);
    }

    public String getCheck_Date() {
        return check_Date.get();
    }

    public SimpleStringProperty check_DateProperty() {
        return check_Date;
    }

    public void setCheck_Date(String check_Date) {
        this.check_Date.set(check_Date);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public double getCc() {
        return cc.get();
    }

    public SimpleDoubleProperty ccProperty() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc.set(cc);
    }

    public double getPb() {
        return pb.get();
    }

    public SimpleDoubleProperty pbProperty() {
        return pb;
    }

    public void setPb(double pb) {
        this.pb.set(pb);
    }

    public double getPriority() {
        return priority.get();
    }

    public SimpleDoubleProperty priorityProperty() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority.set(priority);
    }

    public double getRemaining_wait() {
        return remaining_wait.get();
    }

    public SimpleDoubleProperty remaining_waitProperty() {
        return remaining_wait;
    }

    public void setRemaining_wait(double remaining_wait) {
        this.remaining_wait.set(remaining_wait);
    }

    public String getScheduled_Start_Date() {
        return Scheduled_Start_Date.get();
    }

    public SimpleStringProperty scheduled_Start_DateProperty() {
        return Scheduled_Start_Date;
    }

    public void setScheduled_Start_Date(String scheduled_Start_Date) {
        this.Scheduled_Start_Date.set(scheduled_Start_Date);
    }

    public double getXaxis() {
        return Xaxis.get();
    }

    public SimpleDoubleProperty xaxisProperty() {
        return Xaxis;
    }

    public void setXaxis(double xaxis) {
        this.Xaxis.set(xaxis);
    }

    public double getYaxis() {
        return Yaxis.get();
    }

    public SimpleDoubleProperty yaxisProperty() {
        return Yaxis;
    }

    public void setYaxis(double yaxis) {
        this.Yaxis.set(yaxis);
    }

    public String getCurrentTask() {
        return currentTask.get();
    }

    public SimpleStringProperty currentTaskProperty() {
        return currentTask;
    }

    public void setCurrentTask(String currentTask) {
        this.currentTask.set(currentTask);
    }

    public double getT1() {
        return T1.get();
    }

    public SimpleDoubleProperty t1Property() {
        return T1;
    }

    public void setT1(double t1) {
        this.T1.set(t1);
    }

    public double getT2() {
        return T2.get();
    }

    public SimpleDoubleProperty t2Property() {
        return T2;
    }

    public void setT2(double t2) {
        this.T2.set(t2);
    }

    public double getT3() {
        return T3.get();
    }

    public SimpleDoubleProperty t3Property() {
        return T3;
    }

    public void setT3(double t3) {
        this.T3.set(t3);
    }

    public double getT4() {
        return T4.get();
    }

    public SimpleDoubleProperty t4Property() {
        return T4;
    }

    public void setT4(double t4) {
        this.T4.set(t4);
    }

    public double getT5() {
        return T5.get();
    }

    public SimpleDoubleProperty t5Property() {
        return T5;
    }

    public void setT5(double t5) {
        this.T5.set(t5);
    }

    public double getT6() {
        return T6.get();
    }

    public SimpleDoubleProperty t6Property() {
        return T6;
    }

    public void setT6(double t6) {
        this.T6.set(t6);
    }

    public double getT7() {
        return T7.get();
    }

    public SimpleDoubleProperty t7Property() {
        return T7;
    }

    public void setT7(double t7) {
        this.T7.set(t7);
    }

    public double getT8() {
        return T8.get();
    }

    public SimpleDoubleProperty t8Property() {
        return T8;
    }

    public void setT8(double t8) {
        this.T8.set(t8);
    }

    public double getT9() {
        return T9.get();
    }

    public SimpleDoubleProperty t9Property() {
        return T9;
    }

    public void setT9(double t9) {
        this.T9.set(t9);
    }

    public double getT10() {
        return T10.get();
    }

    public SimpleDoubleProperty t10Property() {
        return T10;
    }

    public void setT10(double t10) {
        this.T10.set(t10);
    }

    public double getT11() {
        return T11.get();
    }

    public SimpleDoubleProperty t11Property() {
        return T11;
    }

    public void setT11(double t11) {
        this.T11.set(t11);
    }

    public double getT12() {
        return T12.get();
    }

    public SimpleDoubleProperty t12Property() {
        return T12;
    }

    public void setT12(double t12) {
        this.T12.set(t12);
    }

    public double getPlanning_weight() {
        return planning_weight.get();
    }

    public SimpleDoubleProperty planning_weightProperty() {
        return planning_weight;
    }

    public void setPlanning_weight(double planning_weight) {
        this.planning_weight.set(planning_weight);
    }

    public String getWait_Criteria() {
        return wait_Criteria.get();
    }

    public SimpleStringProperty wait_CriteriaProperty() {
        return wait_Criteria;
    }

    public void setWait_Criteria(String wait_Criteria) {
        this.wait_Criteria.set(wait_Criteria);
    }

    public String getTask_Criteria() {
        return task_Criteria.get();
    }

    public SimpleStringProperty task_CriteriaProperty() {
        return task_Criteria;
    }

    public void setTask_Criteria(String task_Criteria) {
        this.task_Criteria.set(task_Criteria);
    }

    public double getR1() {
        return R1.get();
    }

    public SimpleDoubleProperty r1Property() {
        return R1;
    }

    public void setR1(double r1) {
        this.R1.set(r1);
    }

    public double getR2() {
        return R2.get();
    }

    public SimpleDoubleProperty r2Property() {
        return R2;
    }

    public void setR2(double r2) {
        this.R2.set(r2);
    }

    public double getR3() {
        return R3.get();
    }

    public SimpleDoubleProperty r3Property() {
        return R3;
    }

    public void setR3(double r3) {
        this.R3.set(r3);
    }

    public double getR4() {
        return R4.get();
    }

    public SimpleDoubleProperty r4Property() {
        return R4;
    }

    public void setR4(double r4) {
        this.R4.set(r4);
    }

    public double getR5() {
        return R5.get();
    }

    public SimpleDoubleProperty r5Property() {
        return R5;
    }

    public void setR5(double r5) {
        this.R5.set(r5);
    }

    public double getR6() {
        return R6.get();
    }

    public SimpleDoubleProperty r6Property() {
        return R6;
    }

    public void setR6(double r6) {
        this.R6.set(r6);
    }

    public double getR7() {
        return R7.get();
    }

    public SimpleDoubleProperty r7Property() {
        return R7;
    }

    public void setR7(double r7) {
        this.R7.set(r7);
    }

    public double getR8() {
        return R8.get();
    }

    public SimpleDoubleProperty r8Property() {
        return R8;
    }

    public void setR8(double r8) {
        this.R8.set(r8);
    }

    public double getR9() {
        return R9.get();
    }

    public SimpleDoubleProperty r9Property() {
        return R9;
    }

    public void setR9(double r9) {
        this.R9.set(r9);
    }

    public double getR10() {
        return R10.get();
    }

    public SimpleDoubleProperty r10Property() {
        return R10;
    }

    public void setR10(double r10) {
        this.R10.set(r10);
    }

    public double getR11() {
        return R11.get();
    }

    public SimpleDoubleProperty r11Property() {
        return R11;
    }

    public void setR11(double r11) {
        this.R11.set(r11);
    }

    public double getR12() {
        return R12.get();
    }

    public SimpleDoubleProperty r12Property() {
        return R12;
    }

    public void setR12(double r12) {
        this.R12.set(r12);
    }

    public double getTe1() {
        return Te1.get();
    }

    public SimpleDoubleProperty te1Property() {
        return Te1;
    }

    public void setTe1(double te1) {
        this.Te1.set(te1);
    }

    public double getTe2() {
        return Te2.get();
    }

    public SimpleDoubleProperty te2Property() {
        return Te2;
    }

    public void setTe2(double te2) {
        this.Te2.set(te2);
    }

    public double getTe3() {
        return Te3.get();
    }

    public SimpleDoubleProperty te3Property() {
        return Te3;
    }

    public void setTe3(double te3) {
        this.Te3.set(te3);
    }

    public double getTe4() {
        return Te4.get();
    }

    public SimpleDoubleProperty te4Property() {
        return Te4;
    }

    public void setTe4(double te4) {
        this.Te4.set(te4);
    }

    public double getTe5() {
        return Te5.get();
    }

    public SimpleDoubleProperty te5Property() {
        return Te5;
    }

    public void setTe5(double te5) {
        this.Te5.set(te5);
    }

    public double getTe6() {
        return Te6.get();
    }

    public SimpleDoubleProperty te6Property() {
        return Te6;
    }

    public void setTe6(double te6) {
        this.Te6.set(te6);
    }

    public double getTe7() {
        return Te7.get();
    }

    public SimpleDoubleProperty te7Property() {
        return Te7;
    }

    public void setTe7(double te7) {
        this.Te7.set(te7);
    }

    public double getTe8() {
        return Te8.get();
    }

    public SimpleDoubleProperty te8Property() {
        return Te8;
    }

    public void setTe8(double te8) {
        this.Te8.set(te8);
    }

    public double getTe9() {
        return Te9.get();
    }

    public SimpleDoubleProperty te9Property() {
        return Te9;
    }

    public void setTe9(double te9) {
        this.Te9.set(te9);
    }

    public double getTe10() {
        return Te10.get();
    }

    public SimpleDoubleProperty te10Property() {
        return Te10;
    }

    public void setTe10(double te10) {
        this.Te10.set(te10);
    }

    public double getTe11() {
        return Te11.get();
    }

    public SimpleDoubleProperty te11Property() {
        return Te11;
    }

    public void setTe11(double te11) {
        this.Te11.set(te11);
    }

    public double getTe12() {
        return Te12.get();
    }

    public SimpleDoubleProperty te12Property() {
        return Te12;
    }

    public void setTe12(double te12) {
        this.Te12.set(te12);
    }

    public double getWe1() {
        return we1.get();
    }

    public SimpleDoubleProperty we1Property() {
        return we1;
    }

    public void setWe1(double we1) {
        this.we1.set(we1);
    }

    public double getWe2() {
        return we2.get();
    }

    public SimpleDoubleProperty we2Property() {
        return we2;
    }

    public void setWe2(double we2) {
        this.we2.set(we2);
    }

    public double getWe3() {
        return we3.get();
    }

    public SimpleDoubleProperty we3Property() {
        return we3;
    }

    public void setWe3(double we3) {
        this.we3.set(we3);
    }

    public double getWe4() {
        return we4.get();
    }

    public SimpleDoubleProperty we4Property() {
        return we4;
    }

    public void setWe4(double we4) {
        this.we4.set(we4);
    }

    public double getWe5() {
        return we5.get();
    }

    public SimpleDoubleProperty we5Property() {
        return we5;
    }

    public void setWe5(double we5) {
        this.we5.set(we5);
    }

    public double getWe6() {
        return we6.get();
    }

    public SimpleDoubleProperty we6Property() {
        return we6;
    }

    public void setWe6(double we6) {
        this.we6.set(we6);
    }

    public double getWe7() {
        return we7.get();
    }

    public SimpleDoubleProperty we7Property() {
        return we7;
    }

    public void setWe7(double we7) {
        this.we7.set(we7);
    }

    public double getWe8() {
        return we8.get();
    }

    public SimpleDoubleProperty we8Property() {
        return we8;
    }

    public void setWe8(double we8) {
        this.we8.set(we8);
    }

    public double getWe9() {
        return we9.get();
    }

    public SimpleDoubleProperty we9Property() {
        return we9;
    }

    public void setWe9(double we9) {
        this.we9.set(we9);
    }

    public double getWe10() {
        return we10.get();
    }

    public SimpleDoubleProperty we10Property() {
        return we10;
    }

    public void setWe10(double we10) {
        this.we10.set(we10);
    }

    public double getWe11() {
        return we11.get();
    }

    public SimpleDoubleProperty we11Property() {
        return we11;
    }

    public void setWe11(double we11) {
        this.we11.set(we11);
    }

    public double getWe12() {
        return we12.get();
    }

    public SimpleDoubleProperty we12Property() {
        return we12;
    }

    public void setWe12(double we12) {
        this.we12.set(we12);
    }

    public double getRe1() {
        return Re1.get();
    }

    public SimpleDoubleProperty re1Property() {
        return Re1;
    }

    public void setRe1(double re1) {
        this.Re1.set(re1);
    }

    public double getRe2() {
        return Re2.get();
    }

    public SimpleDoubleProperty re2Property() {
        return Re2;
    }

    public void setRe2(double re2) {
        this.Re2.set(re2);
    }

    public double getRe3() {
        return Re3.get();
    }

    public SimpleDoubleProperty re3Property() {
        return Re3;
    }

    public void setRe3(double re3) {
        this.Re3.set(re3);
    }

    public double getRe4() {
        return Re4.get();
    }

    public SimpleDoubleProperty re4Property() {
        return Re4;
    }

    public void setRe4(double re4) {
        this.Re4.set(re4);
    }

    public double getRe5() {
        return Re5.get();
    }

    public SimpleDoubleProperty re5Property() {
        return Re5;
    }

    public void setRe5(double re5) {
        this.Re5.set(re5);
    }

    public double getRe6() {
        return Re6.get();
    }

    public SimpleDoubleProperty re6Property() {
        return Re6;
    }

    public void setRe6(double re6) {
        this.Re6.set(re6);
    }

    public double getRe7() {
        return Re7.get();
    }

    public SimpleDoubleProperty re7Property() {
        return Re7;
    }

    public void setRe7(double re7) {
        this.Re7.set(re7);
    }

    public double getRe8() {
        return Re8.get();
    }

    public SimpleDoubleProperty re8Property() {
        return Re8;
    }

    public void setRe8(double re8) {
        this.Re8.set(re8);
    }

    public double getRe9() {
        return Re9.get();
    }

    public SimpleDoubleProperty re9Property() {
        return Re9;
    }

    public void setRe9(double re9) {
        this.Re9.set(re9);
    }

    public double getRe10() {
        return Re10.get();
    }

    public SimpleDoubleProperty re10Property() {
        return Re10;
    }

    public void setRe10(double re10) {
        this.Re10.set(re10);
    }

    public double getRe11() {
        return Re11.get();
    }

    public SimpleDoubleProperty re11Property() {
        return Re11;
    }

    public void setRe11(double re11) {
        this.Re11.set(re11);
    }

    public double getRe12() {
        return Re12.get();
    }

    public SimpleDoubleProperty re12Property() {
        return Re12;
    }

    public void setRe12(double re12) {
        this.Re12.set(re12);
    }
}
