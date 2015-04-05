// @wolfram77
package main;

import org.junit.*;



public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void testMain() {
        System.out.println("test - main");
        String[] args = null;
        Main.main(args);
        System.out.println("\n");
    }
    
}
