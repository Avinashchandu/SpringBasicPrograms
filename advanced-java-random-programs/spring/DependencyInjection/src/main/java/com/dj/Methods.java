package com.dj;

public class Methods {
	static String removerep(String s1)
    {
    char s[] = s1.toCharArray();	
    	for(int i =0;i<s.length;i++)
    	{
    		for(int j = i+1;j<s.length;j++)
    		{
    			if(s[i]==s[j])
    				s[j]='*';
    		}
    	}
    	String s2 = "";
        for(int i =0;i<s1.length();i++)
        {
        	if(s[i]=='*')
        		continue;
        	s2+=s[i];
        }
        return s2;
    }
    static String addSpecial(String s1)
    {
    char s[] = s1.toCharArray();	
    	for(int i =0;i<s.length;i++)
    	{
    		for(int j = i+1;j<s.length;j++)
    		{
    			if(s[i]==s[j])
    				s[j]='*';
    		}
    	}
    	String s2 = "";
        for(int i =0;i<s1.length();i++)
        {
        	s2+=s[i];
        }
        return s2;
    }
    static String reverseHalf(String s)
    {
    	String rev = "";
    	for(int i = s.length()-1;i>=s.length()/2;i--)
        {
    		rev+=s.charAt(i);
	    }
    	return s.substring(0,s.length()/2)+rev;
    	
    }
}
