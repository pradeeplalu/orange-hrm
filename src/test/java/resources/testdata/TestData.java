package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by NEha
 */
public class TestData {

    @DataProvider(name = "cvlibraryjob")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester","Watford","up to 5 miles","230","50000","Per annum","Permanent","Permanent Tester jobs in Watford"},
                {"sell","cardiff","up to 7 miles","45000","7000","Per month","Contract","Contract Sell jobs in Cardiff"},
                {"Tester","leeds","up to 25 miles","5500","8900","Per day","Temporary","Temporary Tester jobs in Leeds"},
                {"Admin","newcastle","up to 5 miles","990","99009","Per annum","Permanent","Permanent Admin jobs in Newcastle upon Tyne"},
                {"architect","cardiff","up to 7 miles","45000","7000","Per month","Contract","Contract Architect jobs in Cardiff"},
                {"manager","leeds","up to 25 miles","5500","8900","Per day","Temporary","Temporary Manager jobs in Leeds"},
        };
        return data;
    }

}
