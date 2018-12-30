import org.junit.*;

public class QuickBeforeAfterTest {

    @BeforeClass  // method should be static for @BeforeClass Annotation
    public static void beforeClass(){
        System.out.println("before class");
    }

    @BeforeClass
    public static void beforeClass1(){
        System.out.println("before class1");
    }

    @Before
    public void setUp1(){
        System.out.println("excuted before every TEST method 1");
    }

    @Before
    public void setUp2(){
        System.out.println("excuted before every TEST method 2");
    }

    @Test   //method should public void for @Test Annotation
    public void test1() {
        System.out.println("test1 excuted");
    }

    @Test
    public void test2() {
        System.out.println("test2 excuted");
    }

    @After
    public void tearDown1(){
        System.out.println("excuted after every TEST method 1");
    }

    @After
    public void tearDown2(){
        System.out.println("excuted after every TEST method 2");
    }

    @AfterClass
    public static void AfterClass(){
        System.out.println("After Class");
    }

    @AfterClass
    public static void AfterClass1(){
        System.out.println("After Class1");
    }
}
