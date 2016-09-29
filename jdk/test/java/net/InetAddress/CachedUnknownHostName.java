/*
 * Copyright 1999 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

/*
 * @test
 * @author Gary Ellison
 * @bug 4208282
 * @summary java.net.InetAddress.getByName caching unknown host lookups
 */

import java.net.InetAddress;

public class CachedUnknownHostName {
  public static void main(String argv[]) throws Exception {
    String hostname = new String("bogusHostName");

    try {
      InetAddress.getByName(hostname);
      System.err.println("Missing java.net.UnknownHostException for host " +
                         hostname);
      throw new Exception("Missing java.net.UnknownHostException");
    } catch(java.net.UnknownHostException e) {
      // this one is anticipated
      System.out.println("Caught expected exception:" + e);
    }

    try {
      InetAddress.getByName(hostname);
      System.err.println("Missing java.net.UnknownHostException for host " +
                         hostname);
      throw new Exception("Missing java.net.UnknownHostException");
    } catch(java.net.UnknownHostException e) {
      // this is the one that was not firing off.
      System.out.println("Caught expected exception:" + e);
    }

    System.out.println("Passed. OKAY");
  }
}
