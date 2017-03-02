package com.example.email_validator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ValidateTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ValidateTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ValidateTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    private String e1="blah.blah.blah@blah";
    private String e2="bla5483(__#blah@blah";
    private String e3="b&l#gt#..blk";
    
    public void test1(){  	
    	Validate.Validate(e1);
    	assertTrue(Validate.getAtChar()==1);
    }
    
    public void test2(){  	
    	Validate.Validate(e1);
    	assertTrue(Validate.getDotChar()==2);
    }
    
    public void test3(){  	
    	Validate.Validate(e1);
    	assertTrue(Validate.getRulesPassed()==2);
    }
    
    public void test4(){  	
    	Validate.Validate(e2);
    	assertTrue(Validate.getAtChar()==1);
    }
    
    public void test5(){  	
    	Validate.Validate(e2);
    	assertTrue(Validate.getDotChar()==0);
    }
    public void test6(){  	
    	Validate.Validate(e2);
    	assertTrue(Validate.getRulesPassed()==1);
    }
    
    public void test7(){  	
    	Validate.Validate(e3);
    	assertTrue(Validate.getAtChar()==0);
    }
    
    public void test8(){  	
    	Validate.Validate(e3);
    	assertTrue(Validate.getDotChar()==2);
    }
    public void test15(){  	
    	Validate.Validate(e3);
    	assertTrue(Validate.getRulesPassed()==1);
    }
    
    
}

