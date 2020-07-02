/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/defanging-an-ip-address/
Code by : Sagar Kulkarni
*/

class IPAddr 
{
    public String defangIPaddr(String address)
    {
        String str=new String(address.replace(".","[.]"));
        return str;
    }
}
