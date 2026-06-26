package org.apache.syncope.core.provisioning.java.pushpull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultRealmPullResultHandlerRandoopNOCoverageTest {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        java.lang.Class<?> wildcardClass1 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass2 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = defaultRealmPullResultHandler0.handle(syncDelta3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = defaultRealmPullResultHandler0.handle(syncDelta2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        java.lang.Class<?> wildcardClass3 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass3 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = defaultRealmPullResultHandler0.handle(syncDelta3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = defaultRealmPullResultHandler0.handle(syncDelta4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = defaultRealmPullResultHandler0.handle(syncDelta6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = defaultRealmPullResultHandler0.handle(syncDelta7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = defaultRealmPullResultHandler0.handle(syncDelta7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass4 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        java.lang.Class<?> wildcardClass11 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        java.lang.Class<?> wildcardClass4 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass10 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = defaultRealmPullResultHandler0.handle(syncDelta4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        java.lang.Class<?> wildcardClass14 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        java.lang.Class<?> wildcardClass12 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile14 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile14);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        java.lang.Class<?> wildcardClass14 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass10 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass13 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        defaultRealmPullResultHandler0.stop();
    }
}

