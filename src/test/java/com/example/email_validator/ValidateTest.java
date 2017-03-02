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
    private String e2="bla#blah@bl.ah";
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
    	assertTrue(Validate.getHashtagChar()==0);
    }
    public void test4(){  	
    	Validate.Validate(e1);
    	assertTrue(Validate.getAmpChar()==0);
    }
    public void test5(){  	
    	Validate.Validate(e1);
    	assertTrue(Validate.getRulesPassed()==4);
    }
    
    public void test6(){  	
    	Validate.Validate(e2);
    	assertTrue(Validate.getAtChar()==1);
    }
    
    public void test7(){  	
    	Validate.Validate(e2);
    	assertTrue(Validate.getDotChar()==1);
    }
    
    public void test8(){  	
    	Validate.Validate(e2);
    	assertTrue(Validate.getHashtagChar()==1);
    }
    public void test9(){  	
    	Validate.Validate(e2);
    	assertTrue(Validate.getAmpChar()==0);
    }
    public void test10(){  	
    	Validate.Validate(e2);
    	assertTrue(Validate.getRulesPassed()==3);
    }
    
    public void test11(){  	
    	Validate.Validate(e3);
    	assertTrue(Validate.getAtChar()==0);
    }
    
    public void test12(){  	
    	Validate.Validate(e3);
    	assertTrue(Validate.getDotChar()==2);
    }
    
    public void test13(){  	
    	Validate.Validate(e3);
    	assertTrue(Validate.getHashtagChar()==2);
    }
    public void test14(){  	
    	Validate.Validate(e3);
    	assertTrue(Validate.getAmpChar()==1);
    }
    public void test15(){  	
    	Validate.Validate(e3);
    	assertTrue(Validate.getRulesPassed()==1);
    }
    
    
}

