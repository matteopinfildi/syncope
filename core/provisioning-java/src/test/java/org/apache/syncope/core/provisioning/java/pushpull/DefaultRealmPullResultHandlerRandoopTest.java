package org.apache.syncope.core.provisioning.java.pushpull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DefaultRealmPullResultHandlerRandoopTest {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = defaultRealmPullResultHandler0.handle(syncDelta3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        java.lang.Class<?> wildcardClass1 = syncDelta0.getClass();
        org.junit.Assert.assertNotNull(syncDelta0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        java.lang.Class<?> wildcardClass3 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler randoopHelperHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler();
        java.lang.Class<?> wildcardClass1 = randoopHelperHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler4.handle(syncDelta5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = defaultRealmPullResultHandler0.handle(syncDelta5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler4);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = defaultRealmPullResultHandler0.handle(syncDelta6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler5);
        org.junit.Assert.assertNotNull(syncDelta6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        java.lang.Class<?> wildcardClass3 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        java.lang.Class<?> wildcardClass1 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        java.lang.Class<?> wildcardClass3 = syncDelta1.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass3 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler4.handle(syncDelta5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = defaultRealmPullResultHandler0.handle(syncDelta5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler4);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass4 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass2 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        java.lang.Class<?> wildcardClass1 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = defaultRealmPullResultHandler0.handle(syncDelta3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncDelta3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass4 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        java.lang.Class<?> wildcardClass13 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        java.lang.Class<?> wildcardClass3 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass10 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        java.lang.Class<?> wildcardClass4 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass11 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean8 = defaultRealmPullResultHandler6.handle(syncDelta7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = defaultRealmPullResultHandler0.handle(syncDelta7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler6);
        org.junit.Assert.assertNotNull(syncDelta7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        java.lang.Class<?> wildcardClass10 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        java.lang.Class<?> wildcardClass12 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        java.lang.Class<?> wildcardClass15 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean8 = defaultRealmPullResultHandler6.handle(syncDelta7);
        defaultRealmPullResultHandler6.stop();
        defaultRealmPullResultHandler6.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler6.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler6);
        org.junit.Assert.assertNotNull(syncDelta7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = defaultRealmPullResultHandler0.handle(syncDelta6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler5);
        org.junit.Assert.assertNotNull(syncDelta6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
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
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean8 = defaultRealmPullResultHandler6.handle(syncDelta7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = defaultRealmPullResultHandler0.handle(syncDelta7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler6);
        org.junit.Assert.assertNotNull(syncDelta7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        java.lang.Class<?> wildcardClass10 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        defaultRealmPullResultHandler11.stop();
        defaultRealmPullResultHandler11.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean17 = defaultRealmPullResultHandler11.handle(syncDelta16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = defaultRealmPullResultHandler0.handle(syncDelta16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(syncDelta16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = defaultRealmPullResultHandler0.handle(syncDelta6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        defaultRealmPullResultHandler9.stop();
        defaultRealmPullResultHandler9.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        defaultRealmPullResultHandler9.stop();
        defaultRealmPullResultHandler9.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        defaultRealmPullResultHandler8.stop();
        defaultRealmPullResultHandler8.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler8.handle(syncDelta13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean17 = defaultRealmPullResultHandler15.handle(syncDelta16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = defaultRealmPullResultHandler0.handle(syncDelta16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler15);
        org.junit.Assert.assertNotNull(syncDelta16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = defaultRealmPullResultHandler0.handle(syncDelta4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        java.lang.Class<?> wildcardClass13 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        defaultRealmPullResultHandler8.stop();
        defaultRealmPullResultHandler8.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler8.handle(syncDelta13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass13 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        java.lang.Class<?> wildcardClass15 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        defaultRealmPullResultHandler10.stop();
        defaultRealmPullResultHandler10.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler10.handle(syncDelta15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = defaultRealmPullResultHandler0.handle(syncDelta15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        defaultRealmPullResultHandler12.stop();
        defaultRealmPullResultHandler12.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler12.handle(syncDelta17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = defaultRealmPullResultHandler0.handle(syncDelta17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        java.lang.Class<?> wildcardClass12 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = defaultRealmPullResultHandler0.handle(syncDelta6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler5);
        org.junit.Assert.assertNotNull(syncDelta6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean17 = defaultRealmPullResultHandler15.handle(syncDelta16);
        boolean boolean18 = defaultRealmPullResultHandler12.handle(syncDelta16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = defaultRealmPullResultHandler0.handle(syncDelta16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler15);
        org.junit.Assert.assertNotNull(syncDelta16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        java.lang.Class<?> wildcardClass11 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        boolean boolean14 = defaultRealmPullResultHandler8.handle(syncDelta12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        java.lang.Class<?> wildcardClass11 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        java.lang.Class<?> wildcardClass6 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta11);
        java.lang.Class<?> wildcardClass15 = syncDelta11.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
        java.lang.Class<?> wildcardClass7 = syncDelta4.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean8 = defaultRealmPullResultHandler6.handle(syncDelta7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        boolean boolean12 = defaultRealmPullResultHandler6.handle(syncDelta10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler6);
        org.junit.Assert.assertNotNull(syncDelta7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        boolean boolean16 = defaultRealmPullResultHandler10.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        java.lang.Class<?> wildcardClass10 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncDelta5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        boolean boolean14 = defaultRealmPullResultHandler8.handle(syncDelta12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        java.lang.Class<?> wildcardClass5 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = defaultRealmPullResultHandler0.handle(syncDelta6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncDelta6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean8 = defaultRealmPullResultHandler6.handle(syncDelta7);
        defaultRealmPullResultHandler6.stop();
        defaultRealmPullResultHandler6.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler6.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler6);
        org.junit.Assert.assertNotNull(syncDelta7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass2 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler14.handle(syncDelta15);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean19 = defaultRealmPullResultHandler17.handle(syncDelta18);
        boolean boolean20 = defaultRealmPullResultHandler14.handle(syncDelta18);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean23 = defaultRealmPullResultHandler21.handle(syncDelta22);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler24 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta25 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean26 = defaultRealmPullResultHandler24.handle(syncDelta25);
        boolean boolean27 = defaultRealmPullResultHandler21.handle(syncDelta25);
        boolean boolean28 = defaultRealmPullResultHandler14.handle(syncDelta25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = defaultRealmPullResultHandler0.handle(syncDelta25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler14);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler17);
        org.junit.Assert.assertNotNull(syncDelta18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler21);
        org.junit.Assert.assertNotNull(syncDelta22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler24);
        org.junit.Assert.assertNotNull(syncDelta25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass11 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean8 = defaultRealmPullResultHandler6.handle(syncDelta7);
        boolean boolean9 = defaultRealmPullResultHandler3.handle(syncDelta7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        boolean boolean16 = defaultRealmPullResultHandler10.handle(syncDelta14);
        boolean boolean17 = defaultRealmPullResultHandler3.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler6);
        org.junit.Assert.assertNotNull(syncDelta7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile14 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile14);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = defaultRealmPullResultHandler0.handle(syncDelta17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler16);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        defaultRealmPullResultHandler12.stop();
        defaultRealmPullResultHandler12.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler12.handle(syncDelta17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = defaultRealmPullResultHandler0.handle(syncDelta17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler14.handle(syncDelta15);
        boolean boolean17 = defaultRealmPullResultHandler11.handle(syncDelta15);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean20 = defaultRealmPullResultHandler18.handle(syncDelta19);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean23 = defaultRealmPullResultHandler21.handle(syncDelta22);
        boolean boolean24 = defaultRealmPullResultHandler18.handle(syncDelta22);
        boolean boolean25 = defaultRealmPullResultHandler11.handle(syncDelta22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = defaultRealmPullResultHandler0.handle(syncDelta22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler14);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler18);
        org.junit.Assert.assertNotNull(syncDelta19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler21);
        org.junit.Assert.assertNotNull(syncDelta22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean8 = defaultRealmPullResultHandler6.handle(syncDelta7);
        boolean boolean9 = defaultRealmPullResultHandler3.handle(syncDelta7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        boolean boolean16 = defaultRealmPullResultHandler10.handle(syncDelta14);
        boolean boolean17 = defaultRealmPullResultHandler3.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler6);
        org.junit.Assert.assertNotNull(syncDelta7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta11);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile16 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile16);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean19 = defaultRealmPullResultHandler17.handle(syncDelta18);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean22 = defaultRealmPullResultHandler20.handle(syncDelta21);
        boolean boolean23 = defaultRealmPullResultHandler17.handle(syncDelta21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = defaultRealmPullResultHandler0.handle(syncDelta21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler17);
        org.junit.Assert.assertNotNull(syncDelta18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler20);
        org.junit.Assert.assertNotNull(syncDelta21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        defaultRealmPullResultHandler7.stop();
        defaultRealmPullResultHandler7.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta17);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean22 = defaultRealmPullResultHandler20.handle(syncDelta21);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta24 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean25 = defaultRealmPullResultHandler23.handle(syncDelta24);
        boolean boolean26 = defaultRealmPullResultHandler20.handle(syncDelta24);
        boolean boolean27 = defaultRealmPullResultHandler13.handle(syncDelta24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = defaultRealmPullResultHandler0.handle(syncDelta24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler16);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler20);
        org.junit.Assert.assertNotNull(syncDelta21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler23);
        org.junit.Assert.assertNotNull(syncDelta24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean17 = defaultRealmPullResultHandler15.handle(syncDelta16);
        boolean boolean18 = defaultRealmPullResultHandler12.handle(syncDelta16);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean21 = defaultRealmPullResultHandler19.handle(syncDelta20);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean24 = defaultRealmPullResultHandler22.handle(syncDelta23);
        boolean boolean25 = defaultRealmPullResultHandler19.handle(syncDelta23);
        boolean boolean26 = defaultRealmPullResultHandler12.handle(syncDelta23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = defaultRealmPullResultHandler0.handle(syncDelta23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler15);
        org.junit.Assert.assertNotNull(syncDelta16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler19);
        org.junit.Assert.assertNotNull(syncDelta20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler22);
        org.junit.Assert.assertNotNull(syncDelta23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        java.lang.Class<?> wildcardClass11 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass3 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = defaultRealmPullResultHandler0.handle(syncDelta17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        java.lang.Class<?> wildcardClass11 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        defaultRealmPullResultHandler13.stop();
        defaultRealmPullResultHandler13.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = defaultRealmPullResultHandler0.handle(syncDelta18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(syncDelta18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass10 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        java.lang.Class<?> wildcardClass11 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        defaultRealmPullResultHandler9.stop();
        defaultRealmPullResultHandler9.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        boolean boolean11 = defaultRealmPullResultHandler5.handle(syncDelta9);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean17 = defaultRealmPullResultHandler15.handle(syncDelta16);
        boolean boolean18 = defaultRealmPullResultHandler12.handle(syncDelta16);
        boolean boolean19 = defaultRealmPullResultHandler5.handle(syncDelta16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = defaultRealmPullResultHandler0.handle(syncDelta16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler5);
        org.junit.Assert.assertNotNull(syncDelta6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler15);
        org.junit.Assert.assertNotNull(syncDelta16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass4 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile14 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile14);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = defaultRealmPullResultHandler0.handle(syncDelta16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta16);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncDelta9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler14.handle(syncDelta15);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean19 = defaultRealmPullResultHandler17.handle(syncDelta18);
        boolean boolean20 = defaultRealmPullResultHandler14.handle(syncDelta18);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean23 = defaultRealmPullResultHandler21.handle(syncDelta22);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler24 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta25 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean26 = defaultRealmPullResultHandler24.handle(syncDelta25);
        boolean boolean27 = defaultRealmPullResultHandler21.handle(syncDelta25);
        boolean boolean28 = defaultRealmPullResultHandler14.handle(syncDelta25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = defaultRealmPullResultHandler0.handle(syncDelta25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler14);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler17);
        org.junit.Assert.assertNotNull(syncDelta18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler21);
        org.junit.Assert.assertNotNull(syncDelta22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler24);
        org.junit.Assert.assertNotNull(syncDelta25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean8 = defaultRealmPullResultHandler6.handle(syncDelta7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        boolean boolean12 = defaultRealmPullResultHandler6.handle(syncDelta10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler6);
        org.junit.Assert.assertNotNull(syncDelta7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile14 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile14);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta11);
        java.lang.Class<?> wildcardClass15 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncDelta11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass12 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = defaultRealmPullResultHandler0.handle(syncDelta17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta17);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = defaultRealmPullResultHandler0.handle(syncDelta17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta13);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean21 = defaultRealmPullResultHandler19.handle(syncDelta20);
        boolean boolean22 = defaultRealmPullResultHandler16.handle(syncDelta20);
        boolean boolean23 = defaultRealmPullResultHandler9.handle(syncDelta20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = defaultRealmPullResultHandler0.handle(syncDelta20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler16);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler19);
        org.junit.Assert.assertNotNull(syncDelta20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler4.handle(syncDelta5);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        boolean boolean10 = defaultRealmPullResultHandler4.handle(syncDelta8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler4);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncDelta5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta11);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass18 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile17 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile17);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        boolean boolean11 = defaultRealmPullResultHandler5.handle(syncDelta9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler5);
        org.junit.Assert.assertNotNull(syncDelta6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        boolean boolean14 = defaultRealmPullResultHandler0.handle(syncDelta11);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean17 = defaultRealmPullResultHandler15.handle(syncDelta16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = defaultRealmPullResultHandler0.handle(syncDelta16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler15);
        org.junit.Assert.assertNotNull(syncDelta16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass15 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        boolean boolean14 = defaultRealmPullResultHandler8.handle(syncDelta12);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean17 = defaultRealmPullResultHandler15.handle(syncDelta16);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean20 = defaultRealmPullResultHandler18.handle(syncDelta19);
        boolean boolean21 = defaultRealmPullResultHandler15.handle(syncDelta19);
        boolean boolean22 = defaultRealmPullResultHandler8.handle(syncDelta19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = defaultRealmPullResultHandler0.handle(syncDelta19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler15);
        org.junit.Assert.assertNotNull(syncDelta16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler18);
        org.junit.Assert.assertNotNull(syncDelta19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncDelta8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler14.handle(syncDelta15);
        defaultRealmPullResultHandler14.stop();
        defaultRealmPullResultHandler14.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean20 = defaultRealmPullResultHandler14.handle(syncDelta19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = defaultRealmPullResultHandler0.handle(syncDelta19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler14);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(syncDelta19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        java.lang.Class<?> wildcardClass15 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass10 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler3);
        org.junit.Assert.assertNotNull(syncDelta4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass8 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile14 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile14);
        java.lang.Class<?> wildcardClass16 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta17);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean22 = defaultRealmPullResultHandler20.handle(syncDelta21);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta24 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean25 = defaultRealmPullResultHandler23.handle(syncDelta24);
        boolean boolean26 = defaultRealmPullResultHandler20.handle(syncDelta24);
        boolean boolean27 = defaultRealmPullResultHandler13.handle(syncDelta24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = defaultRealmPullResultHandler0.handle(syncDelta24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler16);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler20);
        org.junit.Assert.assertNotNull(syncDelta21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler23);
        org.junit.Assert.assertNotNull(syncDelta24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        defaultRealmPullResultHandler13.stop();
        defaultRealmPullResultHandler13.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = defaultRealmPullResultHandler0.handle(syncDelta18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(syncDelta18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = defaultRealmPullResultHandler0.handle(syncDelta9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean19 = defaultRealmPullResultHandler17.handle(syncDelta18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = defaultRealmPullResultHandler0.handle(syncDelta18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler17);
        org.junit.Assert.assertNotNull(syncDelta18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        defaultRealmPullResultHandler9.stop();
        defaultRealmPullResultHandler9.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass9 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass13 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        defaultRealmPullResultHandler9.stop();
        defaultRealmPullResultHandler9.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile14 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile14);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler14.handle(syncDelta15);
        defaultRealmPullResultHandler14.stop();
        defaultRealmPullResultHandler14.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean20 = defaultRealmPullResultHandler14.handle(syncDelta19);
        defaultRealmPullResultHandler14.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean24 = defaultRealmPullResultHandler22.handle(syncDelta23);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler25 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta26 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean27 = defaultRealmPullResultHandler25.handle(syncDelta26);
        boolean boolean28 = defaultRealmPullResultHandler22.handle(syncDelta26);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler29 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta30 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean31 = defaultRealmPullResultHandler29.handle(syncDelta30);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler32 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta33 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean34 = defaultRealmPullResultHandler32.handle(syncDelta33);
        boolean boolean35 = defaultRealmPullResultHandler29.handle(syncDelta33);
        boolean boolean36 = defaultRealmPullResultHandler22.handle(syncDelta33);
        boolean boolean37 = defaultRealmPullResultHandler14.handle(syncDelta33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = defaultRealmPullResultHandler0.handle(syncDelta33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler14);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(syncDelta19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler22);
        org.junit.Assert.assertNotNull(syncDelta23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler25);
        org.junit.Assert.assertNotNull(syncDelta26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler29);
        org.junit.Assert.assertNotNull(syncDelta30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler32);
        org.junit.Assert.assertNotNull(syncDelta33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        boolean boolean16 = defaultRealmPullResultHandler10.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        boolean boolean16 = defaultRealmPullResultHandler10.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        defaultRealmPullResultHandler10.stop();
        defaultRealmPullResultHandler10.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler10.handle(syncDelta15);
        defaultRealmPullResultHandler10.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean20 = defaultRealmPullResultHandler18.handle(syncDelta19);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean23 = defaultRealmPullResultHandler21.handle(syncDelta22);
        boolean boolean24 = defaultRealmPullResultHandler18.handle(syncDelta22);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler25 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta26 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean27 = defaultRealmPullResultHandler25.handle(syncDelta26);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler28 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta29 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean30 = defaultRealmPullResultHandler28.handle(syncDelta29);
        boolean boolean31 = defaultRealmPullResultHandler25.handle(syncDelta29);
        boolean boolean32 = defaultRealmPullResultHandler18.handle(syncDelta29);
        boolean boolean33 = defaultRealmPullResultHandler10.handle(syncDelta29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = defaultRealmPullResultHandler0.handle(syncDelta29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler18);
        org.junit.Assert.assertNotNull(syncDelta19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler21);
        org.junit.Assert.assertNotNull(syncDelta22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler25);
        org.junit.Assert.assertNotNull(syncDelta26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler28);
        org.junit.Assert.assertNotNull(syncDelta29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        java.lang.Class<?> wildcardClass17 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass13 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta17);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean22 = defaultRealmPullResultHandler20.handle(syncDelta21);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta24 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean25 = defaultRealmPullResultHandler23.handle(syncDelta24);
        boolean boolean26 = defaultRealmPullResultHandler20.handle(syncDelta24);
        boolean boolean27 = defaultRealmPullResultHandler13.handle(syncDelta24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = defaultRealmPullResultHandler0.handle(syncDelta24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler16);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler20);
        org.junit.Assert.assertNotNull(syncDelta21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler23);
        org.junit.Assert.assertNotNull(syncDelta24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile14 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile14);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        defaultRealmPullResultHandler10.stop();
        defaultRealmPullResultHandler10.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler10.handle(syncDelta15);
        defaultRealmPullResultHandler10.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean20 = defaultRealmPullResultHandler18.handle(syncDelta19);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean23 = defaultRealmPullResultHandler21.handle(syncDelta22);
        boolean boolean24 = defaultRealmPullResultHandler18.handle(syncDelta22);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler25 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta26 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean27 = defaultRealmPullResultHandler25.handle(syncDelta26);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler28 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta29 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean30 = defaultRealmPullResultHandler28.handle(syncDelta29);
        boolean boolean31 = defaultRealmPullResultHandler25.handle(syncDelta29);
        boolean boolean32 = defaultRealmPullResultHandler18.handle(syncDelta29);
        boolean boolean33 = defaultRealmPullResultHandler10.handle(syncDelta29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = defaultRealmPullResultHandler0.handle(syncDelta29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler18);
        org.junit.Assert.assertNotNull(syncDelta19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler21);
        org.junit.Assert.assertNotNull(syncDelta22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler25);
        org.junit.Assert.assertNotNull(syncDelta26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler28);
        org.junit.Assert.assertNotNull(syncDelta29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        defaultRealmPullResultHandler13.stop();
        defaultRealmPullResultHandler13.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = defaultRealmPullResultHandler0.handle(syncDelta18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(syncDelta18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler14.handle(syncDelta15);
        boolean boolean17 = defaultRealmPullResultHandler11.handle(syncDelta15);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean20 = defaultRealmPullResultHandler18.handle(syncDelta19);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean23 = defaultRealmPullResultHandler21.handle(syncDelta22);
        boolean boolean24 = defaultRealmPullResultHandler18.handle(syncDelta22);
        boolean boolean25 = defaultRealmPullResultHandler11.handle(syncDelta22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = defaultRealmPullResultHandler0.handle(syncDelta22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler14);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler18);
        org.junit.Assert.assertNotNull(syncDelta19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler21);
        org.junit.Assert.assertNotNull(syncDelta22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass12 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        boolean boolean16 = defaultRealmPullResultHandler10.handle(syncDelta14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        defaultRealmPullResultHandler11.stop();
        defaultRealmPullResultHandler11.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean17 = defaultRealmPullResultHandler11.handle(syncDelta16);
        defaultRealmPullResultHandler11.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean21 = defaultRealmPullResultHandler19.handle(syncDelta20);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean24 = defaultRealmPullResultHandler22.handle(syncDelta23);
        boolean boolean25 = defaultRealmPullResultHandler19.handle(syncDelta23);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler26 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta27 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean28 = defaultRealmPullResultHandler26.handle(syncDelta27);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler29 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta30 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean31 = defaultRealmPullResultHandler29.handle(syncDelta30);
        boolean boolean32 = defaultRealmPullResultHandler26.handle(syncDelta30);
        boolean boolean33 = defaultRealmPullResultHandler19.handle(syncDelta30);
        boolean boolean34 = defaultRealmPullResultHandler11.handle(syncDelta30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = defaultRealmPullResultHandler0.handle(syncDelta30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(syncDelta16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler19);
        org.junit.Assert.assertNotNull(syncDelta20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler22);
        org.junit.Assert.assertNotNull(syncDelta23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler26);
        org.junit.Assert.assertNotNull(syncDelta27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler29);
        org.junit.Assert.assertNotNull(syncDelta30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile13 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile13);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile15 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile15);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile17 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile17);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile19 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile19);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        defaultRealmPullResultHandler5.stop();
        defaultRealmPullResultHandler5.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler5.handle(syncDelta10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler5);
        org.junit.Assert.assertNotNull(syncDelta6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        java.lang.Class<?> wildcardClass7 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile14 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile14);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile16 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile16);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean22 = defaultRealmPullResultHandler20.handle(syncDelta21);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta24 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean25 = defaultRealmPullResultHandler23.handle(syncDelta24);
        boolean boolean26 = defaultRealmPullResultHandler20.handle(syncDelta24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = defaultRealmPullResultHandler0.handle(syncDelta24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler20);
        org.junit.Assert.assertNotNull(syncDelta21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler23);
        org.junit.Assert.assertNotNull(syncDelta24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        defaultRealmPullResultHandler5.stop();
        defaultRealmPullResultHandler5.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler5.handle(syncDelta10);
        defaultRealmPullResultHandler5.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta17);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta21 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean22 = defaultRealmPullResultHandler20.handle(syncDelta21);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta24 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean25 = defaultRealmPullResultHandler23.handle(syncDelta24);
        boolean boolean26 = defaultRealmPullResultHandler20.handle(syncDelta24);
        boolean boolean27 = defaultRealmPullResultHandler13.handle(syncDelta24);
        boolean boolean28 = defaultRealmPullResultHandler5.handle(syncDelta24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = defaultRealmPullResultHandler0.handle(syncDelta24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler5);
        org.junit.Assert.assertNotNull(syncDelta6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler13);
        org.junit.Assert.assertNotNull(syncDelta14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler16);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler20);
        org.junit.Assert.assertNotNull(syncDelta21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler23);
        org.junit.Assert.assertNotNull(syncDelta24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = defaultRealmPullResultHandler0.handle(syncDelta14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(syncDelta14);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = defaultRealmPullResultHandler0.handle(syncDelta8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile11 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile11);
        java.lang.Class<?> wildcardClass13 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile14 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile14);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile16 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile16);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile19 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile19);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        defaultRealmPullResultHandler8.stop();
        defaultRealmPullResultHandler8.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler8.handle(syncDelta13);
        defaultRealmPullResultHandler8.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean21 = defaultRealmPullResultHandler19.handle(syncDelta20);
        boolean boolean22 = defaultRealmPullResultHandler16.handle(syncDelta20);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta24 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean25 = defaultRealmPullResultHandler23.handle(syncDelta24);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler26 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta27 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean28 = defaultRealmPullResultHandler26.handle(syncDelta27);
        boolean boolean29 = defaultRealmPullResultHandler23.handle(syncDelta27);
        boolean boolean30 = defaultRealmPullResultHandler16.handle(syncDelta27);
        boolean boolean31 = defaultRealmPullResultHandler8.handle(syncDelta27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = defaultRealmPullResultHandler0.handle(syncDelta27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler8);
        org.junit.Assert.assertNotNull(syncDelta9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler16);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler19);
        org.junit.Assert.assertNotNull(syncDelta20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler23);
        org.junit.Assert.assertNotNull(syncDelta24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler26);
        org.junit.Assert.assertNotNull(syncDelta27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile10 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile12 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile12);
        java.lang.Class<?> wildcardClass14 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        java.lang.Class<?> wildcardClass12 = defaultRealmPullResultHandler0.getClass();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile7 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile7);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta13);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean21 = defaultRealmPullResultHandler19.handle(syncDelta20);
        boolean boolean22 = defaultRealmPullResultHandler16.handle(syncDelta20);
        boolean boolean23 = defaultRealmPullResultHandler9.handle(syncDelta20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = defaultRealmPullResultHandler0.handle(syncDelta20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler9);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler12);
        org.junit.Assert.assertNotNull(syncDelta13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler16);
        org.junit.Assert.assertNotNull(syncDelta17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler19);
        org.junit.Assert.assertNotNull(syncDelta20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean13 = defaultRealmPullResultHandler11.handle(syncDelta12);
        defaultRealmPullResultHandler11.stop();
        defaultRealmPullResultHandler11.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean17 = defaultRealmPullResultHandler11.handle(syncDelta16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = defaultRealmPullResultHandler0.handle(syncDelta16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler11);
        org.junit.Assert.assertNotNull(syncDelta12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(syncDelta16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile6 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile6);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile9 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile9);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile1 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile1);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile3 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile3);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean16 = defaultRealmPullResultHandler14.handle(syncDelta15);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean19 = defaultRealmPullResultHandler17.handle(syncDelta18);
        boolean boolean20 = defaultRealmPullResultHandler14.handle(syncDelta18);
        boolean boolean21 = defaultRealmPullResultHandler7.handle(syncDelta18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = defaultRealmPullResultHandler0.handle(syncDelta18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile.getTask()\" because \"this.profile\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler7);
        org.junit.Assert.assertNotNull(syncDelta8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler10);
        org.junit.Assert.assertNotNull(syncDelta11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler14);
        org.junit.Assert.assertNotNull(syncDelta15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler17);
        org.junit.Assert.assertNotNull(syncDelta18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        defaultRealmPullResultHandler5.stop();
        defaultRealmPullResultHandler5.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean11 = defaultRealmPullResultHandler5.handle(syncDelta10);
        boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta10);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler5);
        org.junit.Assert.assertNotNull(syncDelta6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(syncDelta10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile4 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile4);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile8 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile8);
        defaultRealmPullResultHandler0.stop();
        org.junit.Assert.assertNotNull(defaultRealmPullResultHandler0);
        org.junit.Assert.assertNotNull(syncDelta1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(syncDelta5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile2 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile2);
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.api.pushpull.ProvisioningProfile<org.apache.syncope.core.persistence.api.entity.task.PullTask, org.apache.syncope.core.provisioning.api.pushpull.InboundActions> pullTaskProvisioningProfile5 = null;
        defaultRealmPullResultHandler0.setProfile(pullTaskProvisioningProfile5);
    }
}

