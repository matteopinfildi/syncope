package org.apache.syncope.core.logic;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResourceLogicRandoopTest {

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
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic9.update(resourceTO10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.to.ResourceTO.getKey()\" because \"resourceTO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.removeSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic9.delete("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic9.read("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.identityconnectors.framework.common.objects.filter.Filter filter10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.springframework.data.domain.Sort.Order[] orderArray19 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList20 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList20, orderArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "hi!", "", 100, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(orderArray19);
        org.junit.Assert.assertArrayEquals(orderArray19, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.setLatestSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic9.create(resourceTO10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.to.ResourceTO.getKey()\" because \"resourceTO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.identityconnectors.framework.common.objects.filter.Filter filter10 = null;
        java.util.Set<java.lang.String> strSet11 = null;
        org.springframework.data.domain.Sort.Order[] orderArray16 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList17 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList17, orderArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair19 = resourceLogic9.searchConnObjects(filter10, strSet11, "", "", (int) (short) 10, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray16);
        org.junit.Assert.assertArrayEquals(orderArray16, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0f, 1.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO15 = resourceLogic9.resolveBeanReference(method10, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0, 1.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0, 1.0, 10]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.syncope.common.lib.to.ResourceTO resourceTO0 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        java.lang.Class<?> wildcardClass1 = resourceTO0.getClass();
        org.junit.Assert.assertNotNull(resourceTO0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        org.apache.syncope.common.lib.to.ResourceTO resourceTO13 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        java.lang.Class<?> wildcardClass14 = resourceTO13.getClass();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO16 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (byte) 100, ' ', resourceTO13, (-1L), resourceTO16, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO19 = resourceLogic9.resolveBeanReference(method10, objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceTO13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(resourceTO16);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic9.create(resourceTO10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO.authFind(String)\" because \"this.connInstanceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceTO10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.Class<?> wildcardClass10 = resourceLogic9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.identityconnectors.framework.common.objects.filter.Filter filter10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.springframework.data.domain.Sort.Order[] orderArray19 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList20 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList20, orderArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "hi!", "hi!", (int) (byte) 100, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(orderArray19);
        org.junit.Assert.assertArrayEquals(orderArray19, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic9.list();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.findAll()\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.check(resourceTO10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO.findById(String)\" because \"this.connInstanceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceTO10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic9.delete("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByAnyKey("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.setLatestSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { obj11, 0L, 10, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO17 = resourceLogic9.resolveBeanReference(method10, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic9.read("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        java.lang.Object[] objArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO12 = resourceLogic9.resolveBeanReference(method10, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.identityconnectors.framework.common.objects.filter.Filter filter10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.springframework.data.domain.Sort.Order[] orderArray19 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList20 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList20, orderArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "hi!", "hi!", 10, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(orderArray19);
        org.junit.Assert.assertArrayEquals(orderArray19, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO1 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = resourceLogic0.create(resourceTO1);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTO1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = resourceLogic9.getConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        org.springframework.data.domain.Sort.Order[] orderArray10 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList11 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList11, orderArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair13 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet4, "hi!", "", (int) 'a', "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList11);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertArrayEquals(orderArray10, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = resourceLogic9.getConnObjectKeyValue("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic9.update(resourceTO10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceTO10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet5, "hi!", "", (-1), "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO1 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO1);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTO1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.identityconnectors.framework.common.objects.filter.Filter filter10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "hi!", "", 100, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet5, "hi!", "hi!", 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO2);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTO2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.update(resourceTO2);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'RandoopKey'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTO2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByAnyKey("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet5, "", "", (int) (byte) 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.resolveBeanReference(method2, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1.0]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO1 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = resourceLogic0.update(resourceTO1);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'RandoopKey'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTO1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.create(resourceTO2);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTO2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet5, "hi!", "hi!", (-1), "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet6, "", "", 10, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.resolveBeanReference(method2, objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.removeSyncToken("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, '4', (-1L), 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.resolveBeanReference(method2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 4, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 4, -1, 1]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByAnyKey("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.resolveBeanReference(method1, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[100, -1]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.Class<?> wildcardClass1 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet5, "", "hi!", (int) (byte) -1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.resolveBeanReference(method1, objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[ ]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.util.List<org.springframework.data.domain.Sort.Order> orderList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair13 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet6, "", "", (int) (byte) 0, "hi!", orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic3 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic3.list();
        java.lang.Object[] objArray6 = new java.lang.Object[] { resourceLogic3, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.resolveBeanReference(method2, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceLogic3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.removeSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass2 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.removeSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource ''");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        java.lang.Class<?> wildcardClass3 = resourceTO2.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { resourceTO2, 10L, '4', (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.resolveBeanReference(method1, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTO2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) 0, (short) 1, (-1L), 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.resolveBeanReference(method2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 1, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 1, -1, 1]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass2 = resourceTOList1.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByAnyKey("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = resourceLogic9.getConnObjectKeyValue("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByAnyKey("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object[] objArray13 = new java.lang.Object[] { obj11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO14 = resourceLogic9.resolveBeanReference(method10, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.syncope.core.logic.RandoopHelper randoopHelper0 = new org.apache.syncope.core.logic.RandoopHelper();
        java.lang.Class<?> wildcardClass1 = randoopHelper0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = resourceLogic9.getConnObjectKeyValue("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.update(resourceTO3);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'RandoopKey'");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTO3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.reflect.Method method3 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.resolveBeanReference(method3, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.reflect.Method method3 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic4 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic4.list();
        java.lang.Class<?> wildcardClass6 = resourceTOList5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { wildcardClass6, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.resolveBeanReference(method3, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceLogic4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[class java.util.ImmutableCollections$ListN, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[class java.util.ImmutableCollections$ListN, -1.0]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.removeSyncToken("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet6, "", "hi!", (-1), "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.create(resourceTO3);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn123]");
        } catch (org.apache.syncope.common.lib.SyncopeClientException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTO3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
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
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = resourceLogic9.getConnObjectKeyValue("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet5, "hi!", "hi!", (int) (byte) 1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO12 = resourceLogic9.resolveBeanReference(method10, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet6, "", "", (int) (byte) 10, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.setLatestSyncToken("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet5, "hi!", "hi!", 10, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic2 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic2.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic5 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic5.list();
        java.lang.Object[] objArray10 = new java.lang.Object[] { resourceLogic2, resourceTO4, resourceTOList6, "hi!", 100.0f, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic0.resolveBeanReference(method1, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceLogic2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTO4);
        org.junit.Assert.assertNotNull(resourceLogic5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        java.lang.Object[] objArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.resolveBeanReference(method2, objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByAnyKey("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet6, "hi!", "", 100, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { obj3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.resolveBeanReference(method2, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        java.lang.Class<?> wildcardClass4 = resourceTO3.getClass();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] objArray10 = new java.lang.Object[] { resourceTO3, 10, "hi!", '4', '4', obj9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic0.resolveBeanReference(method2, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTO3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.springframework.data.domain.Sort.Order[] orderArray13 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList14 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList14, orderArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair16 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet7, "", "", (int) ' ', "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList14);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertArrayEquals(orderArray13, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByAnyKey("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.update(resourceTO4);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'RandoopKey'");
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
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass3 = resourceLogic0.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.setLatestSyncToken("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO.authFind(String)\" because \"this.resourceDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.reflect.Method method3 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { "", 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.resolveBeanReference(method3, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, 1.0]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO4);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.reflect.Method method3 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.resolveBeanReference(method3, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = resourceLogic0.getConnObjectKeyValue("hi!", "", "");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass3 = resourceTOList2.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        org.springframework.data.domain.Sort.Order[] orderArray10 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList11 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList11, orderArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair13 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet4, "", "", (int) (byte) 100, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList11);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertArrayEquals(orderArray10, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.lang.reflect.Method method4 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 10, (byte) -1, 10.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = resourceLogic0.resolveBeanReference(method4, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10.0, 100]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 100L, 1.0d, obj4, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.resolveBeanReference(method1, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter4, (java.util.Set<java.lang.String>) strSet8, "", "hi!", (int) (byte) 1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.springframework.data.domain.Sort.Order[] orderArray13 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList14 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList14, orderArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair16 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet7, "", "", 1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList14);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertArrayEquals(orderArray13, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic11 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic11.list();
        java.lang.Object[] objArray19 = new java.lang.Object[] { resourceLogic11, (byte) 1, 1, (byte) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO20 = resourceLogic9.resolveBeanReference(method10, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter4, (java.util.Set<java.lang.String>) strSet8, "hi!", "hi!", 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
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
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = null;
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.to.ResourceTO.getConnector()\" because \"resourceTO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "");
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.create(resourceTO5);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn123]");
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
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.reflect.Method method3 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic4 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic4.list();
        java.lang.Class<?> wildcardClass6 = resourceTOList5.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { resourceTOList5, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.resolveBeanReference(method3, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceLogic4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[], 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[], 100.0]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.lang.reflect.Method method6 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1L), '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = resourceLogic0.resolveBeanReference(method6, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, #]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.lang.reflect.Method method4 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.resolveBeanReference(method4, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.create(resourceTO4);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn123]");
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
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.update(resourceTO5);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'RandoopKey'");
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.create(resourceTO6);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn123]");
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet5, "hi!", "", 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter5 = null;
        java.util.Set<java.lang.String> strSet6 = null;
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter5, strSet6, "hi!", "hi!", (int) (short) -1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0.0f, 10.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.resolveBeanReference(method1, objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0, 10.0, -1.0]");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet5, "", "hi!", (int) '#', "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO5);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
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
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.resolveBeanReference(method1, objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter4, (java.util.Set<java.lang.String>) strSet8, "hi!", "hi!", (int) (byte) 10, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "", "hi!");
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
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "hi!");
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO3 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO4 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO5 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder6 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder7 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher8 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager9 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager10 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory11 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic12 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO3, anyTypeDAO4, connInstanceDAO5, resourceDataBinder6, connInstanceDataBinder7, outboundMatcher8, mappingManager9, connectorManager10, anyUtilsFactory11);
        java.lang.Class<?> wildcardClass13 = resourceLogic12.getClass();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] objArray15 = new java.lang.Object[] { "hi!", wildcardClass13, obj14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO16 = resourceLogic0.resolveBeanReference(method1, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
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
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter5 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter5, (java.util.Set<java.lang.String>) strSet8, "hi!", "", (int) (short) 10, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO6);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.lang.reflect.Method method6 = null;
        org.apache.syncope.core.logic.RandoopHelper randoopHelper9 = new org.apache.syncope.core.logic.RandoopHelper();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic11 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList15 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic11.list();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 0.0f, "", randoopHelper9, 1.0d, resourceLogic11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO18 = resourceLogic0.resolveBeanReference(method6, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceLogic11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTOList15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.lang.reflect.Method method6 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO7 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO8 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO9 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder10 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder11 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher12 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager13 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager14 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory15 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic16 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO7, anyTypeDAO8, connInstanceDAO9, resourceDataBinder10, connInstanceDataBinder11, outboundMatcher12, mappingManager13, connectorManager14, anyUtilsFactory15);
        org.apache.syncope.core.logic.ResourceLogic resourceLogic18 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList19 = resourceLogic18.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList20 = resourceLogic18.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList21 = resourceLogic18.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList22 = resourceLogic18.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList23 = resourceLogic18.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic24 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList25 = resourceLogic24.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList26 = resourceLogic24.list();
        java.lang.Class<?> wildcardClass27 = resourceLogic24.getClass();
        java.lang.Object[] objArray29 = new java.lang.Object[] { resourceLogic16, (short) 10, resourceLogic18, wildcardClass27, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO30 = resourceLogic0.resolveBeanReference(method6, objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceLogic18);
        org.junit.Assert.assertNotNull(resourceTOList19);
        org.junit.Assert.assertNotNull(resourceTOList20);
        org.junit.Assert.assertNotNull(resourceTOList21);
        org.junit.Assert.assertNotNull(resourceTOList22);
        org.junit.Assert.assertNotNull(resourceTOList23);
        org.junit.Assert.assertNotNull(resourceLogic24);
        org.junit.Assert.assertNotNull(resourceTOList25);
        org.junit.Assert.assertNotNull(resourceTOList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic2 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.Class<?> wildcardClass3 = resourceLogic2.getClass();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic4 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic4.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic4.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic4.list();
        java.lang.Class<?> wildcardClass8 = resourceLogic4.getClass();
        java.lang.Object[] objArray10 = new java.lang.Object[] { resourceLogic2, resourceLogic4, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic0.resolveBeanReference(method1, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceLogic2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(resourceLogic4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.lang.reflect.Method method7 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic11 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic11.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic15 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic15.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList17 = resourceLogic15.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList18 = resourceLogic15.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList19 = resourceLogic15.list();
        java.lang.Object[] objArray20 = new java.lang.Object[] { '#', 1.0d, 0.0f, resourceLogic11, 1L, resourceTOList19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO21 = resourceLogic0.resolveBeanReference(method7, objArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceLogic11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceLogic15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(resourceTOList17);
        org.junit.Assert.assertNotNull(resourceTOList18);
        org.junit.Assert.assertNotNull(resourceTOList19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject8 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "hi!");
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
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByAnyKey("", "", "hi!");
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
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = resourceLogic9.getConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter5 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter5, (java.util.Set<java.lang.String>) strSet8, "hi!", "", (int) (byte) 1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.springframework.data.domain.Sort.Order[] orderArray15 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList16 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList16, orderArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair18 = resourceLogic0.searchConnObjects(filter5, (java.util.Set<java.lang.String>) strSet9, "", "", (int) (short) -1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList16);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertArrayEquals(orderArray15, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.update(resourceTO6);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'RandoopKey'");
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
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet6, "hi!", "", (int) ' ', "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = resourceLogic0.getConnObjectKeyValue("hi!", "", "hi!");
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.update(resourceTO8);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'RandoopKey'");
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
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.lang.reflect.Method method5 = null;
        java.lang.Object[] objArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.resolveBeanReference(method5, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.lang.reflect.Method method6 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic7 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic7.list();
        java.lang.Class<?> wildcardClass10 = resourceLogic7.getClass();
        java.lang.Object[] objArray14 = new java.lang.Object[] { wildcardClass10, "hi!", 10.0f, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO15 = resourceLogic0.resolveBeanReference(method6, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceLogic7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[class org.apache.syncope.core.logic.ResourceLogic, hi!, 10.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[class org.apache.syncope.core.logic.ResourceLogic, hi!, 10.0, 100]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.springframework.data.domain.Sort.Order[] orderArray15 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList16 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList16, orderArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair18 = resourceLogic0.searchConnObjects(filter5, (java.util.Set<java.lang.String>) strSet9, "", "hi!", (int) '4', "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList16);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertArrayEquals(orderArray15, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.create(resourceTO8);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.common.lib.SyncopeClientException; message: InvalidExternalResource [Connector Conn123]");
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.springframework.data.domain.Sort.Order[] orderArray16 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList17 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList17, orderArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair19 = resourceLogic0.searchConnObjects(filter6, (java.util.Set<java.lang.String>) strSet10, "hi!", "hi!", (int) '4', "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList17);
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
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(orderArray16);
        org.junit.Assert.assertArrayEquals(orderArray16, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = resourceLogic0.resolveBeanReference(method1, objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO7);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
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
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
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
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet6, "hi!", "hi!", 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        org.apache.syncope.core.logic.RandoopHelper randoopHelper12 = new org.apache.syncope.core.logic.RandoopHelper();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic15 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic15.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList17 = resourceLogic15.list();
        java.lang.Class<?> wildcardClass18 = resourceTOList17.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10, randoopHelper12, (byte) 100, 'a', wildcardClass18 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO20 = resourceLogic9.resolveBeanReference(method10, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(resourceTOList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic2 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic2.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic2.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic2.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic2.list();
        java.lang.Object[] objArray7 = new java.lang.Object[] { resourceLogic2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.resolveBeanReference(method1, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceLogic2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.lang.reflect.Method method5 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = resourceLogic0.resolveBeanReference(method5, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
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
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass8 = resourceTOList7.getClass();
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
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.springframework.data.domain.Sort.Order[] orderArray15 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList16 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList16, orderArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair18 = resourceLogic0.searchConnObjects(filter5, (java.util.Set<java.lang.String>) strSet9, "hi!", "", (int) (byte) 10, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList16);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertArrayEquals(orderArray15, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic11 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic11.list();
        java.lang.Class<?> wildcardClass15 = resourceLogic11.getClass();
        java.lang.Object[] objArray19 = new java.lang.Object[] { resourceLogic11, (-1), (byte) 10, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO20 = resourceLogic9.resolveBeanReference(method10, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.springframework.data.domain.Sort.Order[] orderArray16 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList17 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList17, orderArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair19 = resourceLogic0.searchConnObjects(filter6, (java.util.Set<java.lang.String>) strSet10, "hi!", "", (int) (byte) 100, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList17);
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
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(orderArray16);
        org.junit.Assert.assertArrayEquals(orderArray16, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet6, "hi!", "", (int) '4', "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.springframework.data.domain.Sort.Order[] orderArray13 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList14 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList14, orderArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair16 = resourceLogic0.searchConnObjects(filter4, (java.util.Set<java.lang.String>) strSet7, "hi!", "hi!", (int) (short) -1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList14);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertArrayEquals(orderArray13, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.reflect.Method method3 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic4 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic5 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic5.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic5.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic5.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic5.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic5.list();
        java.lang.Class<?> wildcardClass11 = resourceLogic5.getClass();
        java.lang.Object[] objArray13 = new java.lang.Object[] { resourceLogic4, wildcardClass11, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO14 = resourceLogic0.resolveBeanReference(method3, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceLogic4);
        org.junit.Assert.assertNotNull(resourceLogic5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject5 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.lang.reflect.Method method8 = null;
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object[] objArray15 = new java.lang.Object[] { obj9, (short) 10, 1, 1.0d, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO16 = resourceLogic0.resolveBeanReference(method8, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
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
        org.junit.Assert.assertNotNull(resourceTOList5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet6, "hi!", "hi!", 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = null;
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic9.check(resourceTO10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.to.ResourceTO.getConnector()\" because \"resourceTO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.lang.reflect.Method method6 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic8 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic8.list();
        java.lang.Class<?> wildcardClass14 = resourceLogic8.getClass();
        org.apache.syncope.core.logic.RandoopHelper randoopHelper16 = new org.apache.syncope.core.logic.RandoopHelper();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", resourceLogic8, (byte) -1, randoopHelper16, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO19 = resourceLogic0.resolveBeanReference(method6, objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceLogic8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
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
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter6 = null;
        java.util.Set<java.lang.String> strSet7 = null;
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter6, strSet7, "hi!", "", (int) (byte) 1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
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
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.springframework.data.domain.Sort.Order[] orderArray13 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList14 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList14, orderArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair16 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet7, "hi!", "hi!", (int) (byte) 10, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList14);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertArrayEquals(orderArray13, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { false };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = resourceLogic0.resolveBeanReference(method1, objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[false]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.lang.reflect.Method method7 = null;
        org.apache.syncope.core.logic.RandoopHelper randoopHelper8 = new org.apache.syncope.core.logic.RandoopHelper();
        java.lang.Class<?> wildcardClass9 = randoopHelper8.getClass();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic12 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic12.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic12.list();
        java.lang.Object[] objArray15 = new java.lang.Object[] { wildcardClass9, 1.0f, resourceTO11, resourceTOList14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO16 = resourceLogic0.resolveBeanReference(method7, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(resourceTO11);
        org.junit.Assert.assertNotNull(resourceLogic12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.springframework.data.domain.Sort.Order[] orderArray13 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList14 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList14, orderArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair16 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet7, "hi!", "", 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList14);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertArrayEquals(orderArray13, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO2 = resourceLogic0.create(resourceTO1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.to.ResourceTO.getKey()\" because \"resourceTO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = resourceLogic0.getConnObjectKeyValue("", "", "");
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
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = resourceLogic0.getConnObjectKeyValue("hi!", "", "");
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
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
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
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.lang.reflect.Method method5 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic7 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic7.list();
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", resourceLogic7, (short) -1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO18 = resourceLogic0.resolveBeanReference(method5, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceLogic7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        org.apache.syncope.core.logic.RandoopHelper randoopHelper3 = new org.apache.syncope.core.logic.RandoopHelper();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic4 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic4.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic4.list();
        java.lang.Class<?> wildcardClass7 = resourceLogic4.getClass();
        java.lang.Object[] objArray8 = new java.lang.Object[] { randoopHelper3, resourceLogic4 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.resolveBeanReference(method2, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceLogic4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet5, "hi!", "", (int) (short) 1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.lang.reflect.Method method5 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic6 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic6.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic6.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic6.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic6.list();
        java.lang.Class<?> wildcardClass11 = resourceLogic6.getClass();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic13 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic13.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList15 = resourceLogic13.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic13.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList17 = resourceLogic13.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic19 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList20 = resourceLogic19.list();
        java.lang.Object[] objArray22 = new java.lang.Object[] { resourceLogic6, ' ', resourceLogic13, '#', resourceLogic19, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO23 = resourceLogic0.resolveBeanReference(method5, objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceLogic6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(resourceLogic13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTOList15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(resourceTOList17);
        org.junit.Assert.assertNotNull(resourceLogic19);
        org.junit.Assert.assertNotNull(resourceTOList20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.lang.reflect.Method method7 = null;
        org.apache.syncope.core.logic.RandoopHelper randoopHelper8 = new org.apache.syncope.core.logic.RandoopHelper();
        java.lang.Class<?> wildcardClass9 = randoopHelper8.getClass();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic10 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList15 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic10.list();
        java.lang.Object[] objArray20 = new java.lang.Object[] { randoopHelper8, resourceTOList16, (byte) 100, 0.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO21 = resourceLogic0.resolveBeanReference(method7, objArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(resourceLogic10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTOList15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO5 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO6 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO7 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder8 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder9 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher10 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager11 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager12 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory13 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic14 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO5, anyTypeDAO6, connInstanceDAO7, resourceDataBinder8, connInstanceDataBinder9, outboundMatcher10, mappingManager11, connectorManager12, anyUtilsFactory13);
        java.lang.Class<?> wildcardClass15 = resourceLogic14.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) -1, (-1), resourceTO4, wildcardClass15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO17 = resourceLogic0.resolveBeanReference(method1, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTO4);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO8);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
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
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.identityconnectors.framework.common.objects.filter.Filter filter10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.springframework.data.domain.Sort.Order[] orderArray19 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList20 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList20, orderArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "hi!", "hi!", (int) (byte) -1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(orderArray19);
        org.junit.Assert.assertArrayEquals(orderArray19, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter4, (java.util.Set<java.lang.String>) strSet8, "hi!", "hi!", (int) (short) 100, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.lang.reflect.Method method3 = null;
        java.lang.Object[] objArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.resolveBeanReference(method3, objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.lang.reflect.Method method8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic9.list();
        java.lang.Object[] objArray12 = new java.lang.Object[] { resourceLogic9, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO13 = resourceLogic0.resolveBeanReference(method8, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(resourceLogic9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.springframework.data.domain.Sort.Order[] orderArray13 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList14 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList14, orderArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair16 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet7, "", "hi!", (int) (byte) -1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList14);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertArrayEquals(orderArray13, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.List<org.springframework.data.domain.Sort.Order> orderList17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair18 = resourceLogic0.searchConnObjects(filter8, (java.util.Set<java.lang.String>) strSet11, "", "hi!", 100, "", orderList17);
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
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "hi!");
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
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.lang.reflect.Method method5 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic6 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic6.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic8 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList15 = resourceLogic8.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic8.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic18 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList19 = resourceLogic18.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList20 = resourceLogic18.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList21 = resourceLogic18.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList22 = resourceLogic18.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList23 = resourceLogic18.list();
        java.lang.Class<?> wildcardClass24 = resourceLogic18.getClass();
        java.lang.Object[] objArray26 = new java.lang.Object[] { resourceTOList7, resourceTOList16, false, resourceLogic18, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO27 = resourceLogic0.resolveBeanReference(method5, objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceLogic6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceLogic8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTOList15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(resourceLogic18);
        org.junit.Assert.assertNotNull(resourceTOList19);
        org.junit.Assert.assertNotNull(resourceTOList20);
        org.junit.Assert.assertNotNull(resourceTOList21);
        org.junit.Assert.assertNotNull(resourceTOList22);
        org.junit.Assert.assertNotNull(resourceTOList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.lang.reflect.Method method8 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = resourceLogic0.resolveBeanReference(method8, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter4, (java.util.Set<java.lang.String>) strSet8, "hi!", "", (int) (short) 1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.springframework.data.domain.Sort.Order[] orderArray15 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList16 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList16, orderArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair18 = resourceLogic0.searchConnObjects(filter6, (java.util.Set<java.lang.String>) strSet9, "hi!", "hi!", (int) (byte) 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList16);
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
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertArrayEquals(orderArray15, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO3 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO3);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTO3);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet6, "hi!", "hi!", (int) (byte) 100, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
            java.lang.String str12 = resourceLogic0.getConnObjectKeyValue("hi!", "hi!", "");
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
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO9);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
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
        org.junit.Assert.assertNotNull(resourceTO9);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO7 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.update(resourceTO7);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'RandoopKey'");
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
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "hi!");
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
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.springframework.data.domain.Sort.Order[] orderArray15 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList16 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList16, orderArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair18 = resourceLogic0.searchConnObjects(filter5, (java.util.Set<java.lang.String>) strSet9, "hi!", "hi!", 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList16);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertArrayEquals(orderArray15, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic0.update(resourceTO10);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Resource 'RandoopKey'");
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
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceTO10);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
            org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = resourceLogic0.delete("");
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
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter4, (java.util.Set<java.lang.String>) strSet8, "", "", (int) (short) 100, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.springframework.data.domain.Sort.Order[] orderArray18 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList19 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList19, orderArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair21 = resourceLogic0.searchConnObjects(filter8, (java.util.Set<java.lang.String>) strSet12, "hi!", "hi!", (int) '#', "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList19);
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
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(orderArray18);
        org.junit.Assert.assertArrayEquals(orderArray18, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
            org.apache.syncope.common.lib.to.ConnObject connObject12 = resourceLogic0.readConnObjectByAnyKey("", "", "hi!");
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
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByAnyKey("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
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
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.springframework.data.domain.Sort.Order[] orderArray15 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList16 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList16, orderArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair18 = resourceLogic0.searchConnObjects(filter6, (java.util.Set<java.lang.String>) strSet9, "", "hi!", 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList16);
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
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertArrayEquals(orderArray15, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        // The following exception was thrown during execution in test generation
        try {
            resourceLogic0.check(resourceTO10);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: Connector Conn123");
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
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceTO10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
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
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        java.lang.reflect.Method method10 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic11 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic11.list();
        java.lang.Class<?> wildcardClass13 = resourceLogic11.getClass();
        java.lang.Object[] objArray17 = new java.lang.Object[] { resourceLogic11, '4', 100, "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO18 = resourceLogic0.resolveBeanReference(method10, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceLogic11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet6, "", "hi!", (-1), "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        org.identityconnectors.framework.common.objects.filter.Filter filter10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "", "", (int) (byte) -1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.springframework.data.domain.Sort.Order[] orderArray11 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList12 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList12, orderArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair14 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet5, "", "hi!", (int) (short) -1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList12);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertArrayEquals(orderArray11, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter5 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter5, (java.util.Set<java.lang.String>) strSet8, "", "", 1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic0.delete("hi!");
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
        org.junit.Assert.assertNotNull(resourceTOList9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic3 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic3.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic3.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic3.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic3.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic3.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic3.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic10 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic10.list();
        java.lang.Object[] objArray15 = new java.lang.Object[] { obj2, resourceTOList9, resourceTOList14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO16 = resourceLogic0.resolveBeanReference(method1, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceLogic3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceLogic10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
            org.apache.syncope.common.lib.to.ConnObject connObject12 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "hi!");
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
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "hi!");
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
        org.junit.Assert.assertNotNull(resourceTOList9);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
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
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.List<org.springframework.data.domain.Sort.Order> orderList18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair19 = resourceLogic0.searchConnObjects(filter9, (java.util.Set<java.lang.String>) strSet12, "hi!", "hi!", (int) (byte) 10, "hi!", orderList18);
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
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.springframework.data.domain.Sort.Order[] orderArray15 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList16 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList16, orderArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair18 = resourceLogic0.searchConnObjects(filter6, (java.util.Set<java.lang.String>) strSet9, "", "", (int) (byte) 1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList16);
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
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertArrayEquals(orderArray15, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = resourceLogic0.getConnObjectKeyValue("hi!", "", "");
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
        org.junit.Assert.assertNotNull(resourceTOList9);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet6, "", "", (int) (byte) -1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter3, (java.util.Set<java.lang.String>) strSet6, "", "hi!", (int) (short) 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic3 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic3.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic3.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic3.list();
        java.lang.Object[] objArray7 = new java.lang.Object[] { resourceLogic3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO8 = resourceLogic0.resolveBeanReference(method2, objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceLogic3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.lang.reflect.Method method4 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic7 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic7.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO15 = org.apache.syncope.core.logic.RandoopHelper.getValidResourceTO();
        java.lang.Class<?> wildcardClass16 = resourceTO15.getClass();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 0, false, resourceTOList14, wildcardClass16, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO19 = resourceLogic0.resolveBeanReference(method4, objArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceLogic7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTO15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0, false, [], class org.apache.syncope.common.lib.to.ResourceTO, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0, false, [], class org.apache.syncope.common.lib.to.ResourceTO, 1.0]");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject6 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.springframework.data.domain.Sort.Order[] orderArray16 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList17 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList17, orderArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair19 = resourceLogic0.searchConnObjects(filter7, (java.util.Set<java.lang.String>) strSet10, "", "", (int) (byte) 1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList17);
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
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(orderArray16);
        org.junit.Assert.assertArrayEquals(orderArray16, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = resourceLogic0.create(resourceTO4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.to.ResourceTO.getKey()\" because \"resourceTO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = resourceLogic0.getConnObjectKeyValue("", "", "hi!");
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
        org.junit.Assert.assertNotNull(resourceTOList9);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject7 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "hi!");
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
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
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
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO11 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO12 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO13 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder14 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder15 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher16 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager17 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager18 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory19 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic20 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO11, anyTypeDAO12, connInstanceDAO13, resourceDataBinder14, connInstanceDataBinder15, outboundMatcher16, mappingManager17, connectorManager18, anyUtilsFactory19);
        java.lang.Class<?> wildcardClass21 = resourceLogic20.getClass();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic22 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList23 = resourceLogic22.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList24 = resourceLogic22.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList25 = resourceLogic22.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList26 = resourceLogic22.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList27 = resourceLogic22.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList28 = resourceLogic22.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList29 = resourceLogic22.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic30 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList31 = resourceLogic30.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList32 = resourceLogic30.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList33 = resourceLogic30.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList34 = resourceLogic30.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList35 = resourceLogic30.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList36 = resourceLogic30.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList37 = resourceLogic30.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList38 = resourceLogic30.list();
        java.lang.Object[] objArray40 = new java.lang.Object[] { wildcardClass21, resourceTOList29, resourceTOList38, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO41 = resourceLogic9.resolveBeanReference(method10, objArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(resourceLogic22);
        org.junit.Assert.assertNotNull(resourceTOList23);
        org.junit.Assert.assertNotNull(resourceTOList24);
        org.junit.Assert.assertNotNull(resourceTOList25);
        org.junit.Assert.assertNotNull(resourceTOList26);
        org.junit.Assert.assertNotNull(resourceTOList27);
        org.junit.Assert.assertNotNull(resourceTOList28);
        org.junit.Assert.assertNotNull(resourceTOList29);
        org.junit.Assert.assertNotNull(resourceLogic30);
        org.junit.Assert.assertNotNull(resourceTOList31);
        org.junit.Assert.assertNotNull(resourceTOList32);
        org.junit.Assert.assertNotNull(resourceTOList33);
        org.junit.Assert.assertNotNull(resourceTOList34);
        org.junit.Assert.assertNotNull(resourceTOList35);
        org.junit.Assert.assertNotNull(resourceTOList36);
        org.junit.Assert.assertNotNull(resourceTOList37);
        org.junit.Assert.assertNotNull(resourceTOList38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[class org.apache.syncope.core.logic.ResourceLogic, [], [], 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[class org.apache.syncope.core.logic.ResourceLogic, [], [], 10.0]");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.springframework.data.domain.Sort.Order[] orderArray13 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList14 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList14, orderArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair16 = resourceLogic0.searchConnObjects(filter4, (java.util.Set<java.lang.String>) strSet7, "hi!", "", (int) (short) 10, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList14);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType ");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertArrayEquals(orderArray13, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = resourceLogic0.getConnObjectKeyValue("hi!", "", "hi!");
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
        org.junit.Assert.assertNotNull(resourceTOList9);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.springframework.data.domain.Sort.Order[] orderArray12 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList13 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList13, orderArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair15 = resourceLogic0.searchConnObjects(filter2, (java.util.Set<java.lang.String>) strSet6, "hi!", "hi!", (int) (byte) 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList13);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertArrayEquals(orderArray12, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.lang.reflect.Method method5 = null;
        org.apache.syncope.core.logic.RandoopHelper randoopHelper7 = new org.apache.syncope.core.logic.RandoopHelper();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) -1, randoopHelper7, 100L, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic0.resolveBeanReference(method5, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        org.identityconnectors.framework.common.objects.filter.Filter filter1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        org.springframework.data.domain.Sort.Order[] orderArray10 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList11 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList11, orderArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair13 = resourceLogic0.searchConnObjects(filter1, (java.util.Set<java.lang.String>) strSet4, "hi!", "hi!", 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList11);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertArrayEquals(orderArray10, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO11 = resourceLogic0.read("");
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
        org.junit.Assert.assertNotNull(resourceTOList9);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
            org.apache.syncope.common.lib.to.ResourceTO resourceTO10 = resourceLogic0.delete("hi!");
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
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic0.readConnObjectByAnyKey("", "hi!", "hi!");
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
        org.junit.Assert.assertNotNull(resourceTOList9);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.lang.reflect.Method method4 = null;
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO5 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO6 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO7 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder8 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder9 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher10 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager11 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager12 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory13 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic14 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO5, anyTypeDAO6, connInstanceDAO7, resourceDataBinder8, connInstanceDataBinder9, outboundMatcher10, mappingManager11, connectorManager12, anyUtilsFactory13);
        java.lang.Class<?> wildcardClass15 = resourceLogic14.getClass();
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO16 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO17 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO18 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder19 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder20 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher21 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager22 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager23 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory24 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic25 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO16, anyTypeDAO17, connInstanceDAO18, resourceDataBinder19, connInstanceDataBinder20, outboundMatcher21, mappingManager22, connectorManager23, anyUtilsFactory24);
        org.apache.syncope.core.logic.ResourceLogic resourceLogic27 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList28 = resourceLogic27.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList29 = resourceLogic27.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList30 = resourceLogic27.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList31 = resourceLogic27.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList32 = resourceLogic27.list();
        java.lang.Object[] objArray33 = new java.lang.Object[] { wildcardClass15, resourceDataBinder19, (-1), resourceTOList32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO34 = resourceLogic0.resolveBeanReference(method4, objArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(resourceLogic27);
        org.junit.Assert.assertNotNull(resourceTOList28);
        org.junit.Assert.assertNotNull(resourceTOList29);
        org.junit.Assert.assertNotNull(resourceTOList30);
        org.junit.Assert.assertNotNull(resourceTOList31);
        org.junit.Assert.assertNotNull(resourceTOList32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class org.apache.syncope.core.logic.ResourceLogic, null, -1, []]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class org.apache.syncope.core.logic.ResourceLogic, null, -1, []]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        java.lang.reflect.Method method10 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic11 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList15 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList17 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList18 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList19 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList20 = resourceLogic11.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic23 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList24 = resourceLogic23.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList25 = resourceLogic23.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList26 = resourceLogic23.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList27 = resourceLogic23.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList28 = resourceLogic23.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList29 = resourceLogic23.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList30 = resourceLogic23.list();
        java.lang.Object[] objArray33 = new java.lang.Object[] { resourceLogic11, 1.0d, (-1), resourceTOList30, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO34 = resourceLogic9.resolveBeanReference(method10, objArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTOList15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(resourceTOList17);
        org.junit.Assert.assertNotNull(resourceTOList18);
        org.junit.Assert.assertNotNull(resourceTOList19);
        org.junit.Assert.assertNotNull(resourceTOList20);
        org.junit.Assert.assertNotNull(resourceLogic23);
        org.junit.Assert.assertNotNull(resourceTOList24);
        org.junit.Assert.assertNotNull(resourceTOList25);
        org.junit.Assert.assertNotNull(resourceTOList26);
        org.junit.Assert.assertNotNull(resourceTOList27);
        org.junit.Assert.assertNotNull(resourceTOList28);
        org.junit.Assert.assertNotNull(resourceTOList29);
        org.junit.Assert.assertNotNull(resourceTOList30);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.lang.reflect.Method method2 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic3 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic3.list();
        java.lang.Class<?> wildcardClass5 = resourceTOList4.getClass();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic7 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.lang.Class<?> wildcardClass8 = resourceLogic7.getClass();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic9.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic9.list();
        java.lang.Object[] objArray14 = new java.lang.Object[] { resourceTOList4, (-1L), resourceLogic7, resourceLogic9, 10L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO15 = resourceLogic0.resolveBeanReference(method2, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceLogic3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(resourceLogic7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(resourceLogic9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.lang.reflect.Method method7 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO9 = resourceLogic0.resolveBeanReference(method7, objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject10 = resourceLogic0.readConnObjectByConnObjectKeyValue("", "hi!", "hi!");
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
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.lang.reflect.Method method4 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic7 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic7.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic7.list();
        java.lang.Class<?> wildcardClass13 = resourceLogic7.getClass();
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, 0.0d, wildcardClass13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO15 = resourceLogic0.resolveBeanReference(method4, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceLogic7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[true, 0.0, class org.apache.syncope.core.logic.ResourceLogic]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[true, 0.0, class org.apache.syncope.core.logic.ResourceLogic]");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.apache.syncope.common.lib.to.ResourceTO resourceTO5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO6 = resourceLogic0.update(resourceTO5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.common.lib.to.ResourceTO.getKey()\" because \"resourceTO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        java.lang.reflect.Method method10 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic11 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList15 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList17 = resourceLogic11.list();
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO18 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO19 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO20 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder21 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder22 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher23 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager24 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager25 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory26 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic27 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO18, anyTypeDAO19, connInstanceDAO20, resourceDataBinder21, connInstanceDataBinder22, outboundMatcher23, mappingManager24, connectorManager25, anyUtilsFactory26);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Object[] objArray29 = new java.lang.Object[] { resourceLogic11, connInstanceDataBinder22, obj28 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO30 = resourceLogic0.resolveBeanReference(method10, objArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceLogic11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTOList15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(resourceTOList17);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter7 = null;
        java.util.Set<java.lang.String> strSet8 = null;
        org.springframework.data.domain.Sort.Order[] orderArray13 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList14 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList14, orderArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair16 = resourceLogic0.searchConnObjects(filter7, strSet8, "hi!", "", (int) '4', "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList14);
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
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertArrayEquals(orderArray13, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO2 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder3 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder4 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher5 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager6 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager7 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory8 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO0, anyTypeDAO1, connInstanceDAO2, resourceDataBinder3, connInstanceDataBinder4, outboundMatcher5, mappingManager6, connectorManager7, anyUtilsFactory8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByConnObjectKeyValue("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        java.lang.reflect.Method method10 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic11 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList15 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList17 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList18 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList19 = resourceLogic11.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList20 = resourceLogic11.list();
        java.lang.Object[] objArray22 = new java.lang.Object[] { resourceLogic11, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO23 = resourceLogic0.resolveBeanReference(method10, objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(resourceLogic11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTOList15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(resourceTOList17);
        org.junit.Assert.assertNotNull(resourceTOList18);
        org.junit.Assert.assertNotNull(resourceTOList19);
        org.junit.Assert.assertNotNull(resourceTOList20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter5 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.springframework.data.domain.Sort.Order[] orderArray14 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList15 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList15, orderArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair17 = resourceLogic0.searchConnObjects(filter5, (java.util.Set<java.lang.String>) strSet8, "", "hi!", (int) (byte) 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList15);
            org.junit.Assert.fail("Expected exception of type org.apache.syncope.core.persistence.api.dao.NotFoundException; message: AnyType hi!");
        } catch (org.apache.syncope.core.persistence.api.dao.NotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertArrayEquals(orderArray14, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = resourceLogic0.getConnObjectKeyValue("", "hi!", "");
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
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList9 = resourceLogic0.list();
        java.lang.Class<?> wildcardClass10 = resourceTOList9.getClass();
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceTOList6);
        org.junit.Assert.assertNotNull(resourceTOList7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceTOList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.springframework.data.domain.Sort.Order[] orderArray18 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList19 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList19, orderArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair21 = resourceLogic0.searchConnObjects(filter8, (java.util.Set<java.lang.String>) strSet12, "", "", 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList19);
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
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(orderArray18);
        org.junit.Assert.assertArrayEquals(orderArray18, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.lang.reflect.Method method6 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic7 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic7.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic9 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList10 = resourceLogic9.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic9.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic9.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic9.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic9.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList15 = resourceLogic9.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic9.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList17 = resourceLogic9.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList18 = resourceLogic9.list();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic20 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList21 = resourceLogic20.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList22 = resourceLogic20.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList23 = resourceLogic20.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList24 = resourceLogic20.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList25 = resourceLogic20.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList26 = resourceLogic20.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList27 = resourceLogic20.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList28 = resourceLogic20.list();
        java.lang.Class<?> wildcardClass29 = resourceTOList28.getClass();
        java.lang.Object[] objArray30 = new java.lang.Object[] { resourceLogic7, resourceTOList18, 0, wildcardClass29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO31 = resourceLogic0.resolveBeanReference(method6, objArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceLogic0);
        org.junit.Assert.assertNotNull(resourceTOList1);
        org.junit.Assert.assertNotNull(resourceTOList2);
        org.junit.Assert.assertNotNull(resourceTOList3);
        org.junit.Assert.assertNotNull(resourceTOList4);
        org.junit.Assert.assertNotNull(resourceTOList5);
        org.junit.Assert.assertNotNull(resourceLogic7);
        org.junit.Assert.assertNotNull(resourceTOList8);
        org.junit.Assert.assertNotNull(resourceLogic9);
        org.junit.Assert.assertNotNull(resourceTOList10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTOList15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(resourceTOList17);
        org.junit.Assert.assertNotNull(resourceTOList18);
        org.junit.Assert.assertNotNull(resourceLogic20);
        org.junit.Assert.assertNotNull(resourceTOList21);
        org.junit.Assert.assertNotNull(resourceTOList22);
        org.junit.Assert.assertNotNull(resourceTOList23);
        org.junit.Assert.assertNotNull(resourceTOList24);
        org.junit.Assert.assertNotNull(resourceTOList25);
        org.junit.Assert.assertNotNull(resourceTOList26);
        org.junit.Assert.assertNotNull(resourceTOList27);
        org.junit.Assert.assertNotNull(resourceTOList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList8 = resourceLogic0.list();
        java.lang.reflect.Method method9 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic13 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList14 = resourceLogic13.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList15 = resourceLogic13.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList16 = resourceLogic13.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList17 = resourceLogic13.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList18 = resourceLogic13.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList19 = resourceLogic13.list();
        java.lang.Class<?> wildcardClass20 = resourceLogic13.getClass();
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 10, 100.0d, 1L, resourceLogic13, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO23 = resourceLogic0.resolveBeanReference(method9, objArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(resourceLogic13);
        org.junit.Assert.assertNotNull(resourceTOList14);
        org.junit.Assert.assertNotNull(resourceTOList15);
        org.junit.Assert.assertNotNull(resourceTOList16);
        org.junit.Assert.assertNotNull(resourceTOList17);
        org.junit.Assert.assertNotNull(resourceTOList18);
        org.junit.Assert.assertNotNull(resourceTOList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        org.identityconnectors.framework.common.objects.filter.Filter filter7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.springframework.data.domain.Sort.Order[] orderArray16 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList17 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList17, orderArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair19 = resourceLogic0.searchConnObjects(filter7, (java.util.Set<java.lang.String>) strSet10, "hi!", "", (int) (byte) 10, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList17);
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
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(orderArray16);
        org.junit.Assert.assertArrayEquals(orderArray16, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList1 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList2 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList3 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList4 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList5 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList6 = resourceLogic0.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList7 = resourceLogic0.list();
        java.lang.reflect.Method method8 = null;
        org.apache.syncope.core.logic.RandoopHelper randoopHelper9 = new org.apache.syncope.core.logic.RandoopHelper();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic10 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList11 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList12 = resourceLogic10.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList13 = resourceLogic10.list();
        java.lang.Class<?> wildcardClass14 = resourceTOList13.getClass();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.syncope.core.logic.ResourceLogic resourceLogic16 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList17 = resourceLogic16.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList18 = resourceLogic16.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList19 = resourceLogic16.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList20 = resourceLogic16.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList21 = resourceLogic16.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList22 = resourceLogic16.list();
        java.util.List<org.apache.syncope.common.lib.to.ResourceTO> resourceTOList23 = resourceLogic16.list();
        java.lang.Object[] objArray24 = new java.lang.Object[] { randoopHelper9, wildcardClass14, obj15, resourceTOList23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO25 = resourceLogic0.resolveBeanReference(method8, objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(resourceLogic10);
        org.junit.Assert.assertNotNull(resourceTOList11);
        org.junit.Assert.assertNotNull(resourceTOList12);
        org.junit.Assert.assertNotNull(resourceTOList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(resourceLogic16);
        org.junit.Assert.assertNotNull(resourceTOList17);
        org.junit.Assert.assertNotNull(resourceTOList18);
        org.junit.Assert.assertNotNull(resourceTOList19);
        org.junit.Assert.assertNotNull(resourceTOList20);
        org.junit.Assert.assertNotNull(resourceTOList21);
        org.junit.Assert.assertNotNull(resourceTOList22);
        org.junit.Assert.assertNotNull(resourceTOList23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
            org.apache.syncope.common.lib.to.ConnObject connObject12 = resourceLogic0.readConnObjectByAnyKey("hi!", "", "hi!");
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
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.syncope.core.logic.ResourceLogic resourceLogic0 = org.apache.syncope.core.logic.RandoopHelper.getConfiguredResourceLogic();
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
}

