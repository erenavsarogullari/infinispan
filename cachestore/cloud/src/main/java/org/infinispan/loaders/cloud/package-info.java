/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009 Red Hat Inc. and/or its affiliates and other
 * contributors as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a full listing of
 * individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/**
 * This package contains a {@link org.infinispan.loaders.CacheStore} implementation based on
 * <a href="http://code.google.com/p/jclouds/">JClouds</a>, which in turn is an abstraction layer to store data on cloud infrastructure providers
 * such as <a href="http://aws.amazon.com/s3/">Amazon's S3</a>,
 * <a href="http://www.rackspacecloud.com/cloud_hosting_products/files">RackspaceCloud's CloudFiles</a>,
 * <a href="http://www.microsoft.com/windowsazure/windowsazure/">Microsoft's Windows Azure</a> <a href="http://msdn.microsoft.com/en-us/library/dd135733.aspx">Blob Storage API</a>, and others.
 */
package org.infinispan.loaders.cloud;