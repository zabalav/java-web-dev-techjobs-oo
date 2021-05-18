package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

//    @Before
//    public void createJobObject() {
//        Job job1 = new Job();
//        Job job2 = new Job();
//        System.out.println(job1.getId());
//        System.out.println(job2.getId());
//    }

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        System.out.println(job1.getId());
        System.out.println(job2.getId());
        assertEquals(1, job1.getId());
        assertEquals(2, job2.getId());
        assertTrue(!(job1 == job2));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        System.out.println(job.getId());
        assertTrue(job.getId() == 1);

        assertTrue(job.getName() == "Product Tester");
        assertTrue((job.getName() instanceof String));
        assertTrue(job.getEmployer().getValue() == "ACME");
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation().getValue() == "Desert");
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType().getValue() == "Quality Control");
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency().getValue() == "Persistence");
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        System.out.println(job1.getId());
        Job job2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        System.out.println(job2.getId());
        assertFalse(job1 == job2);
    }
}
