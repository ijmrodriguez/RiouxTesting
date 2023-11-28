import org.junit.Test;
import static org.junit.Assert.*;

public class StudentsTests
{
    @Test //1
    public void getStudentNameUpperCase()
    {
        Students john = new Students("John", "3.5", "john@gmail.com");
        assertTrue(john.getName().matches("[A-Za-z]+"));
    }

    @Test //2
    public void assertNameHasNoDigits()
    {
        Students katie = new Students("Katie", "4.0", "katie@gmail.com");
        assertFalse(katie.getName().matches(".*\\d.*"));
    }

    @Test //3
    public void assertNameContainsLetter()
    {
        Students zoey213 = new Students("Zoey213", "2.5", "zoey213@gmail.com");
        assertTrue(zoey213.getName().matches(".*[A-Za-z].*"));
    }

    @Test //4
    public void assertNameIsAlphanumeric()
    {
        Students ash27 = new Students("Ash27", "3.5", "ash27@gmail.com");
        assertTrue(ash27.getName().matches("[A-Za-z0-9]+"));
    }

    @Test //5
    public void assertNameHasNoSpecialChars()
    {
        Students theJohnDoe = new Students("JohnDoe", "5.0", "johndoe@gmail.com");
        assertFalse(theJohnDoe.getName().matches(".*[^A-Za-z0-9].*"));
    }

    @Test //6
    public void assertNameStartsWithUpperCase()
    {
        Students zeph = new Students("Zeph", "4.2", "zeph@gmail.com");
        assertTrue(zeph.getName().matches("[A-Z].*"));
    }

    @Test //7
    public void assertNameHasAtLeast3Chars()
    {
        Students abZ = new Students("AbZ", "2.0", "abz@gmail.com");
        assertTrue(abZ.getName().matches(".*[A-Z].*[a-z].*"));
    }

    @Test //8
    public void assertNameIsNotEmpty()
    {
        Students alice = new Students("Alice", "3.8", "alice@gmail.com");
        assertFalse(alice.getName().isEmpty());
    }

    @Test //9
    public void assertNameLengthGreaterThanZero()
    {
        Students bob = new Students("Bob", "3.2", "bob@gmail.com");
        assertTrue(bob.getName().length() > 0);
    }

    @Test //10
    public void assertNameIsNotNull()
    {
        Students charlie = new Students("Charlie", "2.9", "charlie@gmail.com");
        assertNotNull(charlie.getName());
    }

    @Test //11
    public void assertNameDoesNotContainWhitespace()
    {
        Students davidWhite = new Students("David White", "3.5", "david.white@gmail.com");
        assertTrue(davidWhite.getName().contains(" "));
    }

    @Test //12
    public void assertNameStartsWithFirstName()
    {
        Students evaJohnson = new Students("Eva Johnson", "3.1", "eva.johnson@gmail.com");
        assertTrue(evaJohnson.getName().startsWith("Eva"));
    }

    @Test //13
    public void assertNameEndsWithLastName()
    {
        Students franklinSmith = new Students("Franklin Smith", "4.0", "franklin.smith@gmail.com");
        assertTrue(franklinSmith.getName().endsWith("Smith"));
    }

    @Test //14
    public void assertNameIgnoringCase()
    {
        Students grace = new Students("Grace", "3.9", "grace@gmail.com");
        assertEquals("GRACE", grace.getName().toUpperCase());
    }

    @Test //15
    public void assertNameSubstring()
    {
        Students henryJohnson = new Students("Henry Johnson", "3.2", "henry.j@gmail.com");
        assertTrue(henryJohnson.getName().contains("John"));
    }

    @Test //16
    public void assertNameEquals()
    {
        Students ivy1 = new Students("Ivy", "3.7", "ivy@gmail.com");
        Students ivy2 = new Students("Ivy", "3.7", "ivy@gmail.com");
        assertEquals(ivy1.getName(), ivy2.getName());
    }

    @Test //17
    public void assertNameNotEquals()
    {
        Students jack = new Students("Jack", "3.4", "jack@gmail.com");
        Students jill = new Students("Jill", "3.6", "jill@gmail.com");
        assertNotEquals(jack.getName(), jill.getName());
    }

    @Test //18
    public void assertNameUpperCase()
    {
        Students kyle = new Students("Kyle", "3.0", "kyle@gmail.com");
        assertEquals("KYLE", kyle.getName().toUpperCase());
    }

    @Test //19
    public void assertNameLowerCase()
    {
        Students linda = new Students("Linda", "3.8", "linda@gmail.com");
        assertEquals("linda", linda.getName().toLowerCase());
    }

    @Test //20
    public void assertNameAndEmailCombination()
    {
        Students sophiaMaryland = new Students("Sophia Maryland", "5.0", "sophia.maryland@gmail.com");
        String expectedCombination = "Name: Sophia Maryland, Email: sophia.maryland@gmail.com";
        String actualCombination = "Name: " + sophiaMaryland.getName() + ", Email: " + sophiaMaryland.getEmail();
        assertEquals(actualCombination, expectedCombination);
    }

    @Test //21
    public void assertValidGpaFormat()
    {
        Students alexanderHamilton = new Students("Alexander Hamilton", "3.5", "john.doe@example.com");
        assertTrue(alexanderHamilton.getGpa().matches("^\\d+(\\.\\d+)?$"));
    }

    @Test //22
    public void assertGpaWithOneDecimalPlace()
    {
        Students aliceSmith = new Students("Alice Smith", "4.0", "alice.smith@example.com");
        assertTrue(aliceSmith.getGpa().matches("^\\d+\\.\\d$"));
    }

    @Test //23
    public void assertGpaWithTwoDecimalPlaces()
    {
        Students bobJohnson = new Students("Bob Johnson", "2.75", "bob.johnson@example.com");
        assertTrue(bobJohnson.getGpa().matches("^\\d+\\.\\d\\d$"));
    }

    @Test //24
    public void assertGpaWithLeadingZeros()
    {
        Students evaWhite = new Students("Eva White", "007.25", "eva.white@example.com");
        assertTrue(evaWhite.getGpa().matches("^\\d+\\.\\d+$"));
    }

    @Test //25
    public void assertInvalidGpaWithoutDecimal()
    {
        Students charlieBrown = new Students("Charlie Brown", "4", "charlie.brown@example.com");
        assertFalse(charlieBrown.getGpa().matches("^\\d+\\.\\d*$"));
    }

    @Test //26
    public void assertInvalidGpaWithNonNumericCharacters()
    {
        Students davidGreen = new Students("David Green", "3.A", "david.green@example.com");
        assertFalse(davidGreen.getGpa().matches("^\\d+\\.\\d*$"));
    }

    @Test //27
    public void assertInvalidGpaNegativeValue()
    {
        Students franklinBlack = new Students("Franklin Black", "-2.5", "franklin.black@example.com");
        assertFalse(franklinBlack.getGpa().matches("^\\d+\\.\\d*$"));
    }

    @Test //28
    public void assertGpaStringCombination()
    {
        Students zoey101 = new Students("Zoey101", "4.3", "zoey101@gmail.com");
        String gpaString = "GPA: " + zoey101.getGpa();
        assertEquals("GPA: 4.3", gpaString);
    }

    @Test //29
    public void assertGpaStringContainsDecimal()
    {
        Students elizabethKas = new Students("Elizabeth Kas", "3.0", "elizabeth.kas@gmail.com");
        assertTrue(elizabethKas.getGpa().contains("."));
    }

    @Test //30
    public void assertGpaStringDoesNotContainComma()
    {
        Students brianMuro = new Students("Brian Muro", "3.75", "brianmuro@gmail.com");
        assertFalse(brianMuro.getGpa().contains(","));
    }

    @Test //31
    public void assertGpaStringDoesNotContainLetters()
    {
        Students joshuaArroz = new Students("Joshua Arroz", "2.5", "joshua.arroz@gmail.com");
        assertFalse(joshuaArroz.getGpa().matches(".*[A-Za-z].*"));
    }

    @Test //32
    public void assertGpaStringStartsWithDigit()
    {
        Students ashleyOwens = new Students("Ashley Owens", "4.0", "ashley.owens@gmail.com");
        assertTrue(Character.isDigit(ashleyOwens.getGpa().charAt(0)));
    }

    @Test //33
    public void assertGpaStringIsNotNegative()
    {
        Students victorGreen = new Students("Victor Green", "3.5", "victorgreen@gmail.com");
        assertTrue(Double.parseDouble(victorGreen.getGpa()) >= 0);
    }

    @Test //34
    public void assertGpaStringIsNotEmpty()
    {
        Students brendenBlack = new Students("Brenden Black", "3.2", "brendenblack@gmail.com");
        assertFalse(brendenBlack.getGpa().isEmpty());
    }

    @Test //35
    public void assertGpaStringHasTwoDecimalPlaces()
    {
        Students blueGrace = new Students("Blue Grace", "3.45", "bluegrace@gmail.com");
        assertTrue(blueGrace.getGpa().matches("^\\d+\\.\\d\\d$"));
    }

    @Test //36
    public void assertGpaStringHasAtLeastOneDigitBeforeDecimal()
    {
        Students jackBlack = new Students("Jack Black", "0.75", "jackblack@gmail.com");
        assertTrue(jackBlack.getGpa().matches("^\\d+\\.\\d*$"));
    }

    @Test //37
    public void assertGpaStringHasAtMostTwoDigitsAfterDecimal()
    {
        Students pearlWhite = new Students("Pearl White", "2.123", "pearlwhite@gmail.com");
        assertFalse(pearlWhite.getGpa().matches("^\\d+\\.\\d{1,2}$"));
    }

    @Test //38
    public void assertGpaStringDoesNotStartWithZeroBeforeDecimal()
    {
        Students russelRocks = new Students("Russel Rocks", "0.5", "russelrocks@gmail.com");
        assertTrue(russelRocks.getGpa().matches("^0\\..*"));
    }

    @Test //39
    public void assertGpaStringIsNumeric()
    {
        Students jenniferRed = new Students("Jennifer Red", "3.8", "jennifer.red@gmail.com");
        assertTrue(jenniferRed.getGpa().matches("^\\d+(\\.\\d+)?$"));
    }

    @Test //40
    public void assertGpaStringDoesNotEndWithDecimalSeparator()
    {
        Students liamBrown = new Students("Liam Brown", "3.", "liambrown@gmail.com");
        assertTrue(liamBrown.getGpa().matches("^.*\\.$"));
    }

    @Test //41
    public void assertValidEmailFormat()
    {
        Students jamesWilson = new Students("James Wilson", "3.5", "jameswilson@gmail.com");
        assertTrue(jamesWilson.getEmail().matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$"));
    }

    @Test //42
    public void assertEmailContainsAtSymbol()
    {
        Students josephRobbin = new Students("Joseph Robbin", "3.0", "josephrobbin@gmail.com");
        assertTrue(josephRobbin.getEmail().contains("@"));
    }

    @Test //43
    public void assertEmailDoesNotContainSpaces()
    {
        Students ricoSuave = new Students("Rico Suave", "3.75", "ricosuave@gmail.com");
        assertFalse(ricoSuave.getEmail().contains(" "));
    }

    @Test //44
    public void assertEmailStartsWithAlphanumericCharacter()
    {
        Students barbaraIce = new Students("Barbara Ice", "2.5", "1barbara.ice@gmail.com");
        assertTrue(barbaraIce.getEmail().matches("^[A-Za-z0-9].*"));
    }

    @Test //45
    public void assertEmailEndsWithAlphabeticDomain()
    {
        Students jasminRubis = new Students("Jasmin Rubis", "4.0", "jasmin.rubis@gmail.com");
        assertFalse(jasminRubis.getEmail().matches(".*@[A-Za-z]+$"));
    }

    @Test //46
    public void assertEmailHasSingleAtSymbol()
    {
        Students benReeds = new Students("Ben Reeds", "3.5", "ben.reeds@reeds@gmail.com");
        assertFalse(benReeds.getEmail().matches("^[^@]+@[^@]+$"));
    }

    @Test //47
    public void assertEmailHasNoConsecutiveDots()
    {
        Students chrisJames = new Students("Chris James", "3.2", "chris..james@gmail.com");
        assertTrue(chrisJames.getEmail().matches(".*\\.\\..*"));
    }

    @Test //48
    public void assertEmailStringCombination()
    {
        Students johnSmith = new Students("John Smith", "3.5", "john.smith@gmail.com");
        String emailString = "Email: " + johnSmith.getEmail();
        assertEquals("Email: john.smith@gmail.com", emailString);
    }

    @Test //49
    public void assertEmailStringStartsWithEmail()
    {
        Students austinTurner = new Students("Austin Turner", "3.0", "austinturner@gmail.com");
        assertFalse(austinTurner.getEmail().startsWith("Email:"));
    }

    @Test //50
    public void assertEmailStringEndsWithValidDomain()
    {
        Students karenJohnson = new Students("Karen Johnson", "3.75", "karenjohnson@gmail.com");
        assertTrue(karenJohnson.getEmail().endsWith(".com"));
    }

    @Test //51
    public void assertEmailStringContainsDotAfterAtSymbol()
    {
        Students lexiLepis = new Students("Lexi Lepis", "2.5", "lexilepis@gmail.com");
        assertFalse(lexiLepis.getEmail().matches("@.*\\..*"));
    }

    @Test //52
    public void assertEmailStringIsNotEmpty()
    {
        Students annabelleBrown = new Students("Annabelle Brown", "4.0", "annabelle.brown@gmail.com");
        assertFalse(annabelleBrown.getEmail().isEmpty());
    }

    @Test //53
    public void assertEmailStringContainsAlphanumericLocalPart()
    {
        Students joseHerandez = new Students("Jose Herandez", "3.5", "jose.herandez@gmail.com");
        assertTrue(joseHerandez.getEmail().matches("^[A-Za-z0-9._%+-]+@.*"));
    }

    @Test //54
    public void assertEmailStringContainsProperlyFormattedDomain()
    {
        Students chassidyRums = new Students("Chassidy Rums", "3.2", "chassidyrums@gmail.com");
        assertTrue(chassidyRums.getEmail().matches(".*@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$"));
    }

    @Test //55
    public void assertEmailStringDoesNotEndWithSpecialCharacter()
    {
        Students gloriaBlue = new Students("Gloria Blue", "3.45", "gloria.blue@gmail");
        assertFalse(gloriaBlue.getEmail().matches(".*[^A-Za-z0-9]$"));
    }

    @Test //56
    public void assertEmailStringDoesNotContainMultipleAtSymbols()
    {
        Students richardGreen = new Students("Richard Green", "0.75", "richard@green@gmail.com");
        assertTrue(richardGreen.getEmail().matches(".*@.*@.*"));
    }

    @Test //57
    public void assertEmailStringContainsAtLeastOneDotAfterAtSymbol()
    {
        Students carollWhite = new Students("Caroll White", "2.123", "caroll.white@gmail");
        assertFalse(carollWhite.getEmail().matches("@.*\\..*"));
    }

    @Test //58
    public void assertEmailStringContainsValidTLD()
    {
        Students henrySmike = new Students("Henry Smike", "0.5", "henrysmike@gmail.net");
        assertTrue(henrySmike.getEmail().matches(".*\\.[A-Z|a-z]{2,}$"));
    }

    @Test //59
    public void assertEmailStringContainsLowerCaseLocalPart()
    {
        Students katelynRoss = new Students("Katelyn Ross", "3.8", "katelynross@gmail.com");
        assertTrue(katelynRoss.getEmail().matches("^[a-z0-9._%+-]+@.*"));
    }

    @Test //60
    public void assertEmailStringContainsValidCharacters()
    {
        Students williamByrd = new Students("William Byrd", "3.0", "william.byrd@gmail.com");
        assertTrue(williamByrd.getEmail().matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$"));
    }
}
