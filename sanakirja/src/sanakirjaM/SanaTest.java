package sanakirjaM;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2017.07.21 14:23:35 // Generated by ComTest
 *
 */
public class SanaTest {



  // Generated by ComTest BEGIN
  /** testRekisteroi78 */
  @Test
  public void testRekisteroi78() {    // Sana: 78
    Sana koira1 = new Sana(); 
    assertEquals("From: Sana line: 80", 0, koira1.getSid()); 
    koira1.rekisteroi(); 
    Sana koira2 = new Sana(); 
    koira2.rekisteroi(); 
    int n1 = koira1.getSid(); 
    int n2 = koira2.getSid(); 
    assertEquals("From: Sana line: 86", n2-1, n1); 
  } // Generated by ComTest END
}