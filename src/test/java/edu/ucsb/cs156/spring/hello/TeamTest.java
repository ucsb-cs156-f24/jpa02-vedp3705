package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    //Team otherTeam;

    // @Test
    // public void equals_returns_correct_bool() {
    //     Team emptyTeam = new Team("test-team");

    //     assertEquals(true, team.equals(team));

    //     String stringTest = "test";
    //     assertEquals(false, team.equals(stringTest));

    //     Team testObj = new Team("test-team");
    //     assertEquals(true, team.equals(testObj));

    //     testObj.addMember("testMem");
    //     assertEquals(false, team.equals(testObj));

    //     team.addMember("testMem");
    //     assertEquals(true, team.equals(testObj));

    //     assert !(team.equals(otherTeam));
    // }


    @Test
    public void equals_returns_correct_bool() {
    Team team = new Team("test-team");
    Team otherTeam = new Team("test-team");

    assertEquals(true, team.equals(team));

    assertEquals(false, team.equals("test"));

    assertEquals(true, team.equals(otherTeam));

    otherTeam.addMember("testMem");
    assertEquals(false, team.equals(otherTeam));

    team.addMember("testMem");
    assertEquals(true, team.equals(otherTeam));

    Team team3 = new Team("test-team");
    team3.addMember("anotherMem");
    assertEquals(false, team.equals(team3));

    Team diffTeam = new Team("diff-name");
    diffTeam.addMember("testMem");
    assertEquals(false, team.equals(diffTeam));

    //Team emptyTeam = new Team("test-team");
    //String stringTest = "test";
    //assertEquals(false, team.equals(stringTest));
    //assert !(team.equals(otherTeam));
}


    @Test
    public void hashCode_returns_correct_val() {
        Team t1 = new Team();
        t1.setName("t1");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("t1");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
        
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
