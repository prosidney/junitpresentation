import com.prosidney.components.AcrComponent;
import com.prosidney.components.CcdComponent;
import com.prosidney.components.MyBrandNewComponent;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;



/**
 * Created by admin on 15/05/2017.
 */
public class MyBrandNewComponentTest {

    @Mock
    private AcrComponent acrComponent;

    @Mock
    private CcdComponent ccdComponent;

    @InjectMocks
    private MyBrandNewComponent myBrandNewComponent;

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);


        when(acrComponent.getInterestRate("0000000")).thenReturn(1.99);
        when(acrComponent.getInterestRate("1111111")).thenReturn(0.50);
    }

    @Test
    public void testShouldReturnTrue() throws Exception {
        final boolean isMoreThanZero =
                myBrandNewComponent.isInterestRateMoreThanZero("0000000");

        assertTrue("this should be true", isMoreThanZero);
        verify(acrComponent, times(1)).getInterestRate("0000000");
    }

    @Test
    public void testShouldReturnFalse() throws Exception {
        final boolean isMoreThanZero =
                myBrandNewComponent.isInterestRateMoreThanZero("1111111");

        assertFalse("this should be false", isMoreThanZero);
        verify(acrComponent, times(1)).getInterestRate("1111111");
    }
}
