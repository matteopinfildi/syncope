package org.apache.syncope.core.provisioning.java.pushpull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean4 = defaultRealmPullResultHandler2.handle(syncDelta3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = defaultRealmPullResultHandler0.handle(syncDelta3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta5);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean6 = defaultRealmPullResultHandler4.handle(syncDelta5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = defaultRealmPullResultHandler0.handle(syncDelta5);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = defaultRealmPullResultHandler0.handle(syncDelta2);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = defaultRealmPullResultHandler0.handle(syncDelta7);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean4 = defaultRealmPullResultHandler2.handle(syncDelta3);
        defaultRealmPullResultHandler2.stop();
        defaultRealmPullResultHandler2.stop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean8 = defaultRealmPullResultHandler2.handle(syncDelta7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = defaultRealmPullResultHandler0.handle(syncDelta7);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperHandlerRandoop();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getHelperDeltaRandoop();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        boolean boolean11 = defaultRealmPullResultHandler5.handle(syncDelta9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = defaultRealmPullResultHandler0.handle(syncDelta9);
    }
}

