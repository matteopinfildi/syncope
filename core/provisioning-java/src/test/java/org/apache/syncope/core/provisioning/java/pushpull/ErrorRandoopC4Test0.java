package org.apache.syncope.core.provisioning.java.pushpull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorRandoopC4Test0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = defaultRealmPullResultHandler0.handle(syncDelta1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean4 = defaultRealmPullResultHandler2.handle(syncDelta3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = defaultRealmPullResultHandler0.handle(syncDelta3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean3 = defaultRealmPullResultHandler1.handle(syncDelta2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = defaultRealmPullResultHandler0.handle(syncDelta2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = defaultRealmPullResultHandler0.handle(syncDelta4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean3 = defaultRealmPullResultHandler1.handle(syncDelta2);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean6 = defaultRealmPullResultHandler4.handle(syncDelta5);
        boolean boolean7 = defaultRealmPullResultHandler1.handle(syncDelta5);
        defaultRealmPullResultHandler1.stop();
        defaultRealmPullResultHandler1.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        defaultRealmPullResultHandler10.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta15 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean16 = defaultRealmPullResultHandler14.handle(syncDelta15);
        boolean boolean17 = defaultRealmPullResultHandler10.handle(syncDelta15);
        boolean boolean18 = defaultRealmPullResultHandler1.handle(syncDelta15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = defaultRealmPullResultHandler0.handle(syncDelta15);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta2 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean3 = defaultRealmPullResultHandler1.handle(syncDelta2);
        defaultRealmPullResultHandler1.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean7 = defaultRealmPullResultHandler5.handle(syncDelta6);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean10 = defaultRealmPullResultHandler8.handle(syncDelta9);
        boolean boolean11 = defaultRealmPullResultHandler5.handle(syncDelta9);
        boolean boolean12 = defaultRealmPullResultHandler1.handle(syncDelta9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = defaultRealmPullResultHandler0.handle(syncDelta9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean8 = defaultRealmPullResultHandler6.handle(syncDelta7);
        boolean boolean9 = defaultRealmPullResultHandler3.handle(syncDelta7);
        defaultRealmPullResultHandler3.stop();
        defaultRealmPullResultHandler3.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        defaultRealmPullResultHandler12.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        boolean boolean19 = defaultRealmPullResultHandler12.handle(syncDelta17);
        boolean boolean20 = defaultRealmPullResultHandler3.handle(syncDelta17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = defaultRealmPullResultHandler0.handle(syncDelta17);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta5 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean6 = defaultRealmPullResultHandler4.handle(syncDelta5);
        boolean boolean7 = defaultRealmPullResultHandler3.handle(syncDelta5);
        defaultRealmPullResultHandler3.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        defaultRealmPullResultHandler9.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta14 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean15 = defaultRealmPullResultHandler13.handle(syncDelta14);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta17 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean18 = defaultRealmPullResultHandler16.handle(syncDelta17);
        boolean boolean19 = defaultRealmPullResultHandler13.handle(syncDelta17);
        boolean boolean20 = defaultRealmPullResultHandler9.handle(syncDelta17);
        boolean boolean21 = defaultRealmPullResultHandler3.handle(syncDelta17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = defaultRealmPullResultHandler0.handle(syncDelta17);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler1 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        defaultRealmPullResultHandler1.stop();
        defaultRealmPullResultHandler1.stop();
        defaultRealmPullResultHandler1.stop();
        defaultRealmPullResultHandler1.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler6 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        defaultRealmPullResultHandler6.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler9 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean11 = defaultRealmPullResultHandler9.handle(syncDelta10);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler12 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta13 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean14 = defaultRealmPullResultHandler12.handle(syncDelta13);
        boolean boolean15 = defaultRealmPullResultHandler9.handle(syncDelta13);
        defaultRealmPullResultHandler9.stop();
        defaultRealmPullResultHandler9.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler18 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta19 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean20 = defaultRealmPullResultHandler18.handle(syncDelta19);
        defaultRealmPullResultHandler18.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler22 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean24 = defaultRealmPullResultHandler22.handle(syncDelta23);
        boolean boolean25 = defaultRealmPullResultHandler18.handle(syncDelta23);
        boolean boolean26 = defaultRealmPullResultHandler9.handle(syncDelta23);
        boolean boolean27 = defaultRealmPullResultHandler8.handle(syncDelta23);
        boolean boolean28 = defaultRealmPullResultHandler6.handle(syncDelta23);
        boolean boolean29 = defaultRealmPullResultHandler1.handle(syncDelta23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = defaultRealmPullResultHandler0.handle(syncDelta23);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler0 = new org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler();
        defaultRealmPullResultHandler0.stop();
        defaultRealmPullResultHandler0.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler3 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta4 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean5 = defaultRealmPullResultHandler3.handle(syncDelta4);
        defaultRealmPullResultHandler3.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler7 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta8 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean9 = defaultRealmPullResultHandler7.handle(syncDelta8);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler10 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta11 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean12 = defaultRealmPullResultHandler10.handle(syncDelta11);
        boolean boolean13 = defaultRealmPullResultHandler7.handle(syncDelta11);
        boolean boolean14 = defaultRealmPullResultHandler3.handle(syncDelta11);
        defaultRealmPullResultHandler3.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler16 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        defaultRealmPullResultHandler16.stop();
        defaultRealmPullResultHandler16.stop();
        defaultRealmPullResultHandler16.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler20 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        defaultRealmPullResultHandler20.stop();
        defaultRealmPullResultHandler20.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler23 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler24 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta25 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean26 = defaultRealmPullResultHandler24.handle(syncDelta25);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler27 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta28 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean29 = defaultRealmPullResultHandler27.handle(syncDelta28);
        boolean boolean30 = defaultRealmPullResultHandler24.handle(syncDelta28);
        defaultRealmPullResultHandler24.stop();
        defaultRealmPullResultHandler24.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler33 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta34 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean35 = defaultRealmPullResultHandler33.handle(syncDelta34);
        defaultRealmPullResultHandler33.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler37 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta38 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean39 = defaultRealmPullResultHandler37.handle(syncDelta38);
        boolean boolean40 = defaultRealmPullResultHandler33.handle(syncDelta38);
        boolean boolean41 = defaultRealmPullResultHandler24.handle(syncDelta38);
        boolean boolean42 = defaultRealmPullResultHandler23.handle(syncDelta38);
        boolean boolean43 = defaultRealmPullResultHandler20.handle(syncDelta38);
        boolean boolean44 = defaultRealmPullResultHandler16.handle(syncDelta38);
        boolean boolean45 = defaultRealmPullResultHandler3.handle(syncDelta38);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler46 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler47 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta48 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean49 = defaultRealmPullResultHandler47.handle(syncDelta48);
        boolean boolean50 = defaultRealmPullResultHandler46.handle(syncDelta48);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler51 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta52 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean53 = defaultRealmPullResultHandler51.handle(syncDelta52);
        defaultRealmPullResultHandler51.stop();
        defaultRealmPullResultHandler51.stop();
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler56 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta57 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean58 = defaultRealmPullResultHandler56.handle(syncDelta57);
        org.apache.syncope.core.provisioning.java.pushpull.DefaultRealmPullResultHandler defaultRealmPullResultHandler59 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeHandler();
        org.identityconnectors.framework.common.objects.SyncDelta syncDelta60 = org.apache.syncope.core.provisioning.java.pushpull.RandoopHelperHandler.getGodModeDelta();
        boolean boolean61 = defaultRealmPullResultHandler59.handle(syncDelta60);
        boolean boolean62 = defaultRealmPullResultHandler56.handle(syncDelta60);
        boolean boolean63 = defaultRealmPullResultHandler51.handle(syncDelta60);
        boolean boolean64 = defaultRealmPullResultHandler46.handle(syncDelta60);
        boolean boolean65 = defaultRealmPullResultHandler3.handle(syncDelta60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean66 = defaultRealmPullResultHandler0.handle(syncDelta60);
    }
}

