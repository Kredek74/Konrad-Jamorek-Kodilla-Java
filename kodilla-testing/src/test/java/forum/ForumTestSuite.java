package forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Tast Case: Begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: End");
    }
    @BeforeClass
    public static void beforClass(){
        System.out.println("Test Suite: Begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: End");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jan Kowalski");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("Jan Kowalski", result);
    }
}
