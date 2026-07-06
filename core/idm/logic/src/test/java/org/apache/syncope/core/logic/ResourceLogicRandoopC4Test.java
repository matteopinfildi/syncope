package org.apache.syncope.core.logic;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResourceLogicRandoopC4Test {

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
        org.apache.syncope.core.logic.RandoopHelperLogic RandoopHelperLogic0 = new org.apache.syncope.core.logic.RandoopHelperLogic();
        java.lang.Class<?> wildcardClass1 = RandoopHelperLogic0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO1 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = resourceLogic0.update(resourceTO1);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'Resource_DB'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTO1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = resourceLogic0.delete("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.syncope.common.lib.to.ResourceTO resourceTO0 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        java.lang.Class<?> wildcardClass1 = resourceTO0.getClass();
        org.junit.Assert.assertNotNull(resourceTO0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = resourceLogic0.delete("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO1 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = resourceLogic0.create(resourceTO1);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn-123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTO1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = resourceLogic0.getConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO1 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO1);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn-123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTO1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = resourceLogic0.read("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.lang.Class<?> wildcardClass1 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = resourceLogic0.getConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = resourceLogic0.getConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.update(resourceTO2);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'Resource_DB'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTO2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.create(resourceTO2);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn-123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTO2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.read("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.delete("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByAnyKey("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO2);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn-123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTO2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = resourceLogic0.getConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.create(resourceTO3);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn-123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTO3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.delete("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = resourceLogic0.read("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.delete("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.delete("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass2 = resourceTOList1.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = resourceLogic0.getConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByAnyKey("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = resourceLogic0.getConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.update(resourceTO3);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'Resource_DB'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTO3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO3);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn-123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTO3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByAnyKey("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.read("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.create(resourceTO5);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn-123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTO5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.delete("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass4 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO5);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn-123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTO5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = resourceLogic0.getConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByAnyKey("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass2 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.read("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass5 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.update(resourceTO4);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'Resource_DB'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTO4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.update(resourceTO5);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'Resource_DB'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTO5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO4);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn-123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTO4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = resourceLogic0.getConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.read("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = resourceLogic0.getConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.delete("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = resourceLogic0.getConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = resourceLogic0.getConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.read("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByAnyKey("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = resourceLogic0.getConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = resourceLogic0.getConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.read("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.delete("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.create(resourceTO4);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn-123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTO4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = resourceLogic0.getConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByAnyKey("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = resourceLogic0.getConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByAnyKey("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass5 = resourceTOList4.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = resourceLogic0.getConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = resourceLogic0.getConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.read("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass3 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass4 = resourceTOList3.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = resourceLogic0.getConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass7 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO6);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn-123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTO6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.read("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.delete("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass7 = resourceTOList6.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = resourceLogic0.getConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.create(resourceTO7);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn-123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTO7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.read("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = resourceLogic0.getConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.update(resourceTO7);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'Resource_DB'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTO7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = resourceLogic0.getConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.delete("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass6 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.create(resourceTO6);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn-123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTO6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.delete("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = resourceLogic0.getConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.delete("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.read("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.delete("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = resourceLogic0.getConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = resourceLogic0.getConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.read("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO7);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn-123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTO7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByAnyKey("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.update(resourceTO6);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'Resource_DB'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTO6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByAnyKey("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.read("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = resourceLogic0.getConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.create(resourceTO8);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn-123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTO8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO8);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn-123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTO8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.update(resourceTO8);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'Resource_DB'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTO8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.read("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = resourceLogic0.getConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = resourceLogic0.getConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = resourceLogic0.getConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.delete("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = resourceLogic0.getConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = org.apache.syncope.core.logic.RandoopHelperLogic.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = resourceLogic0.create(resourceTO9);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn-123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTO9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = resourceLogic0.getConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = resourceLogic0.getConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = resourceLogic0.getConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = resourceLogic0.getConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = resourceLogic0.read("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass6 = resourceTOList5.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass8 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass9 = resourceTOList8.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = resourceLogic0.getConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject4 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = resourceLogic0.getConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = resourceLogic0.read("");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass3 = resourceTOList2.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject11 = resourceLogic0.readConnObjectByAnyKey("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.read("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = resourceLogic0.getConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.delete("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject9 = resourceLogic0.readConnObjectByAnyKey("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.setLatestSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'hi!'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelperLogic.getHelperResourceLogicRandoop();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = resourceLogic0.getConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
    }
}

