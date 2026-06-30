package org.apache.syncope.core.provisioning.java.pushpull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorRandoopC3Test0 {

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
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean3 = defaultRealmPullResultHandler1.handle(syncDelta2);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean6 = defaultRealmPullResultHandler4.handle(syncDelta5);
        boolean boolean7 = defaultRealmPullResultHandler1.handle(syncDelta5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = defaultRealmPullResultHandler0.handle(syncDelta5);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean4 = defaultRealmPullResultHandler2.handle(syncDelta3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = defaultRealmPullResultHandler0.handle(syncDelta3);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        defaultRealmPullResultHandler1.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        boolean boolean6 = defaultRealmPullResultHandler1.handle(syncDelta4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = defaultRealmPullResultHandler0.handle(syncDelta4);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        defaultRealmPullResultHandler3.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        boolean boolean8 = defaultRealmPullResultHandler3.handle(syncDelta6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        boolean boolean12 = defaultRealmPullResultHandler3.handle(syncDelta10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta17);
        boolean boolean20 = defaultRealmPullResultHandler3.handle(syncDelta17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = defaultRealmPullResultHandler0.handle(syncDelta17);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        defaultRealmPullResultHandler3.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        boolean boolean8 = defaultRealmPullResultHandler3.handle(syncDelta6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        boolean boolean12 = defaultRealmPullResultHandler3.handle(syncDelta10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta17);
        boolean boolean20 = defaultRealmPullResultHandler3.handle(syncDelta17);
        defaultRealmPullResultHandler3.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean24 = defaultRealmPullResultHandler22.handle(syncDelta23);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler25 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta26 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean27 = defaultRealmPullResultHandler25.handle(syncDelta26);
        boolean boolean28 = defaultRealmPullResultHandler22.handle(syncDelta26);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler29 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta30 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean31 = defaultRealmPullResultHandler29.handle(syncDelta30);
        boolean boolean32 = defaultRealmPullResultHandler22.handle(syncDelta30);
        boolean boolean33 = defaultRealmPullResultHandler3.handle(syncDelta30);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler34 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta35 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean36 = defaultRealmPullResultHandler34.handle(syncDelta35);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler37 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta38 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean39 = defaultRealmPullResultHandler37.handle(syncDelta38);
        boolean boolean40 = defaultRealmPullResultHandler34.handle(syncDelta38);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler41 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta42 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean43 = defaultRealmPullResultHandler41.handle(syncDelta42);
        boolean boolean44 = defaultRealmPullResultHandler34.handle(syncDelta42);
        boolean boolean45 = defaultRealmPullResultHandler3.handle(syncDelta42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean46 = defaultRealmPullResultHandler0.handle(syncDelta42);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        defaultRealmPullResultHandler2.stop();
        defaultRealmPullResultHandler2.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        boolean boolean11 = defaultRealmPullResultHandler5.handle(syncDelta9);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        boolean boolean15 = defaultRealmPullResultHandler5.handle(syncDelta13);
        boolean boolean16 = defaultRealmPullResultHandler2.handle(syncDelta13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = defaultRealmPullResultHandler0.handle(syncDelta13);
    }
}

