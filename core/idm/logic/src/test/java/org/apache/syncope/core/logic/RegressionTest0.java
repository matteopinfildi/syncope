package org.apache.syncope.core.logic;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "hi!", "", 1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "", "hi!", (int) (byte) 1, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "", "", (int) (short) 10, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), (-1.0d), (byte) 100, 0L, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO17 = resourceLogic9.resolveBeanReference(method10, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0, -1.0, 100, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0, -1.0, 100, 0, 1]");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
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
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByConnObjectKeyValue("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "", "", (int) '4', "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "hi!", "", 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "", "", 100, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100.0d, 10L, 1, 0L, (-1.0d), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO18 = resourceLogic9.resolveBeanReference(method10, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100.0, 10, 1, 0, -1.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100.0, 10, 1, 0, -1.0, 0]");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByAnyKey("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1L), "hi!", (short) 0, 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO17 = resourceLogic9.resolveBeanReference(method10, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, hi!, 0, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1, hi!, 0, 1, -1]");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
            java.lang.String str13 = resourceLogic9.getConnObjectKeyValue("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "", "hi!", (int) (short) 10, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (byte) -1, 0, (byte) 1, obj14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO16 = resourceLogic9.resolveBeanReference(method10, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "", "", (int) (byte) 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
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
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
        java.lang.Object[] objArray12 = new java.lang.Object[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO13 = resourceLogic9.resolveBeanReference(method10, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0]");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
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
        java.lang.Object[] objArray12 = new java.lang.Object[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO13 = resourceLogic9.resolveBeanReference(method10, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10]");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
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
        java.lang.Object[] objArray23 = new java.lang.Object[] { wildcardClass21, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO24 = resourceLogic9.resolveBeanReference(method10, objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[class org.apache.syncope.core.logic.ResourceLogic, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[class org.apache.syncope.core.logic.ResourceLogic, -1]");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
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
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "", "hi!", (int) (byte) 0, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
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
            org.apache.syncope.common.lib.to.ConnObject connObject13 = resourceLogic9.readConnObjectByConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
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
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO13 = resourceLogic9.resolveBeanReference(method10, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1]");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "hi!", "", (-1), "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
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
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO12 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO13 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO14 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder15 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder16 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher17 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager18 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager19 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory20 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic21 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO12, anyTypeDAO13, connInstanceDAO14, resourceDataBinder15, connInstanceDataBinder16, outboundMatcher17, mappingManager18, connectorManager19, anyUtilsFactory20);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 'a', connectorManager19, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO24 = resourceLogic9.resolveBeanReference(method10, objArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[a, null, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[a, null, 0.0]");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
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
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0f), 1.0f, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO16 = resourceLogic9.resolveBeanReference(method10, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1.0, 1.0, 10, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1.0, 1.0, 10, #]");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        java.util.List<org.springframework.data.domain.Sort.Order> orderList20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair21 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "", "hi!", (int) '#', "hi!", orderList20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
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
            java.lang.String str13 = resourceLogic9.getConnObjectKeyValue("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "hi!", "hi!", (int) (byte) -1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
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
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair19 = resourceLogic9.searchConnObjects(filter10, strSet11, "hi!", "hi!", (int) (short) 100, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray16);
        org.junit.Assert.assertArrayEquals(orderArray16, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
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
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
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
        java.lang.Object[] objArray12 = new java.lang.Object[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO13 = resourceLogic9.resolveBeanReference(method10, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "", "hi!", (-1), "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "", "", 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
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
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "hi!", "", (int) (byte) 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "", "", (int) (short) 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
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
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f), 0.0d, 0.0d, obj14, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO17 = resourceLogic9.resolveBeanReference(method10, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
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
        java.lang.Object[] objArray24 = new java.lang.Object[] { resourceLogic20, 0.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO25 = resourceLogic9.resolveBeanReference(method10, objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
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
        java.lang.Object[] objArray13 = new java.lang.Object[] { 1L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO14 = resourceLogic9.resolveBeanReference(method10, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1, 0]");
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
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
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 1, wildcardClass13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO15 = resourceLogic9.resolveBeanReference(method10, objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1, class java.lang.Object]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1, class java.lang.Object]");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
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
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "", "", 10, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
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
        java.lang.Object[] objArray12 = new java.lang.Object[] { obj11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO13 = resourceLogic9.resolveBeanReference(method10, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
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
        java.lang.Object[] objArray13 = new java.lang.Object[] { 0.0d, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO14 = resourceLogic9.resolveBeanReference(method10, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0, 1]");
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
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
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
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
        java.lang.Object[] objArray15 = new java.lang.Object[] { 1L, 100L, 10L, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO16 = resourceLogic9.resolveBeanReference(method10, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1, 100, 10, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1, 100, 10, 10.0]");
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "hi!", "", 100, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
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
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO13 = resourceLogic9.resolveBeanReference(method10, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1]");
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "", "", (int) (byte) 100, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
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
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100.0d, (short) 10, 100.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO16 = resourceLogic9.resolveBeanReference(method10, objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100.0, 10, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100.0, 10, 100.0, 0]");
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
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
        java.lang.Object[] objArray24 = new java.lang.Object[] { anyUtilsFactory19, (short) 100, 10.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO25 = resourceLogic9.resolveBeanReference(method10, objArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null, 100, 10.0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null, 100, 10.0, 10]");
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "hi!", "", (int) (short) 10, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "", "hi!", 10, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
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
        java.lang.Object[] objArray16 = new java.lang.Object[] { (byte) -1, (short) 100, (byte) 1, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO17 = resourceLogic9.resolveBeanReference(method10, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, 100, 1, a, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1, 100, 1, a, 10]");
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair19 = resourceLogic9.searchConnObjects(filter10, strSet11, "", "", 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray16);
        org.junit.Assert.assertArrayEquals(orderArray16, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
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
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100L, 'a', 0.0f, 100.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO17 = resourceLogic9.resolveBeanReference(method10, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100, a, 0.0, 100.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100, a, 0.0, 100.0, 0]");
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
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
        org.apache.syncope.core.persistence.api.dao.ExternalResourceDAO externalResourceDAO14 = null;
        org.apache.syncope.core.persistence.api.dao.AnyTypeDAO anyTypeDAO15 = null;
        org.apache.syncope.core.persistence.api.dao.ConnInstanceDAO connInstanceDAO16 = null;
        org.apache.syncope.core.provisioning.api.data.ResourceDataBinder resourceDataBinder17 = null;
        org.apache.syncope.core.provisioning.api.data.ConnInstanceDataBinder connInstanceDataBinder18 = null;
        org.apache.syncope.core.provisioning.java.pushpull.OutboundMatcher outboundMatcher19 = null;
        org.apache.syncope.core.provisioning.api.MappingManager mappingManager20 = null;
        org.apache.syncope.core.provisioning.api.ConnectorManager connectorManager21 = null;
        org.apache.syncope.core.persistence.api.entity.AnyUtilsFactory anyUtilsFactory22 = null;
        org.apache.syncope.core.logic.ResourceLogic resourceLogic23 = new org.apache.syncope.core.logic.ResourceLogic(externalResourceDAO14, anyTypeDAO15, connInstanceDAO16, resourceDataBinder17, connInstanceDataBinder18, outboundMatcher19, mappingManager20, connectorManager21, anyUtilsFactory22);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0f), false, (byte) 10, resourceDataBinder17, (-1.0f), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO27 = resourceLogic9.resolveBeanReference(method10, objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0, false, 10, null, -1.0, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0, false, 10, null, -1.0, -1]");
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
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
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) -1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO14 = resourceLogic9.resolveBeanReference(method10, objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10.0]");
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "", "", (int) (byte) 1, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.springframework.data.domain.Sort.Order[] orderArray20 = new org.springframework.data.domain.Sort.Order[] {};
        java.util.ArrayList<org.springframework.data.domain.Sort.Order> orderList21 = new java.util.ArrayList<org.springframework.data.domain.Sort.Order>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.springframework.data.domain.Sort.Order>) orderList21, orderArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "hi!", "hi!", (int) (short) 10, "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.persistence.api.dao.AnyTypeDAO.findById(String)\" because \"this.anyTypeDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertArrayEquals(orderArray20, new org.springframework.data.domain.Sort.Order[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
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
        java.lang.Object[] objArray16 = new java.lang.Object[] { 1.0f, 1.0f, 0.0d, (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO17 = resourceLogic9.resolveBeanReference(method10, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1.0, 1.0, 0.0, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1.0, 1.0, 0.0, 100, -1]");
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair23 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet14, "hi!", "hi!", 0, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList21);
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
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
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
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "hi!", "", (int) (short) 10, "hi!", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
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
            org.apache.commons.lang3.tuple.Pair<org.identityconnectors.framework.common.objects.SearchResult, java.util.List<org.apache.syncope.common.lib.to.ConnObject>> searchResultPair22 = resourceLogic9.searchConnObjects(filter10, (java.util.Set<java.lang.String>) strSet13, "", "", (-1), "", (java.util.List<org.springframework.data.domain.Sort.Order>) orderList20);
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
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
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
        java.lang.Object[] objArray16 = new java.lang.Object[] { wildcardClass12, 1, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.syncope.common.lib.to.ResourceTO resourceTO17 = resourceLogic9.resolveBeanReference(method10, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.reflect.Method.getAnnotation(java.lang.Class)\" because \"method\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[class java.lang.Object, 1, -1, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[class java.lang.Object, 1, -1, 100]");
    }
}

