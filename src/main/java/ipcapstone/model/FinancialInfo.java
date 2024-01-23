package ipcapstone.model;
public class FinancialInfo {
    private int financialInfoId;
    private int userId;
    private double annualIncome;
    private String employmentStatus;
    private String employerName;
    private String jobTitle;
    private int employmentDuration; 
    private int creditScore;
    private double existingDebts;
    
    public FinancialInfo() {
    }
    
    public FinancialInfo(int userId, double annualIncome, String employmentStatus) {
        this.userId = userId;
        this.annualIncome = annualIncome;
        this.employmentStatus = employmentStatus;
    }
    
    public FinancialInfo(int financialInfoId, int userId, double annualIncome, String employmentStatus,
                        String employerName, String jobTitle, int employmentDuration, 
                        int creditScore, double existingDebts) {
        this.financialInfoId = financialInfoId;
        this.userId = userId;
        this.annualIncome = annualIncome;
        this.employmentStatus = employmentStatus;
        this.employerName = employerName;
        this.jobTitle = jobTitle;
        this.employmentDuration = employmentDuration;
        this.creditScore = creditScore;
        this.existingDebts = existingDebts;
    }
    
    public int getFinancialInfoId() {
        return financialInfoId;
    }

    public void setFinancialInfoId(int financialInfoId) {
        this.financialInfoId = financialInfoId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmploymentDuration() {
        return employmentDuration;
    }

    public void setEmploymentDuration(int employmentDuration) {
        this.employmentDuration = employmentDuration;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getExistingDebts() {
        return existingDebts;
    }

    public void setExistingDebts(double existingDebts) {
        this.existingDebts = existingDebts;
    }
    
    public double calculateDebtToIncomeRatio() {
        if (annualIncome <= 0) {
            return Double.MAX_VALUE; 
        }
        return (existingDebts / annualIncome) * 100;
    }
    
    @Override
    public String toString() {
        return "FinancialInfo{" +
                "financialInfoId=" + financialInfoId +
                ", userId=" + userId +
                ", annualIncome=" + annualIncome +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", creditScore=" + creditScore +
                ", existingDebts=" + existingDebts +
                '}';
    }
} 