/*
 * Copyright 1999 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
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
package com.sun.org.omg.SendingContext;


/**
* com/sun/org/omg/SendingContext/CodeBaseHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from rt.idl
* Thursday, May 6, 1999 1:52:08 AM PDT
*/

public final class CodeBaseHelper
{
    private static String  _id = "IDL:omg.org/SendingContext/CodeBase:1.0";

    public CodeBaseHelper()
    {
    }

    public static void insert (org.omg.CORBA.Any a, com.sun.org.omg.SendingContext.CodeBase that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static com.sun.org.omg.SendingContext.CodeBase extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
            {
                __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (com.sun.org.omg.SendingContext.CodeBaseHelper.id (), "CodeBase");
            }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static com.sun.org.omg.SendingContext.CodeBase read (org.omg.CORBA.portable.InputStream istream)
    {
        return narrow (istream.read_Object (_CodeBaseStub.class));
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.org.omg.SendingContext.CodeBase value)
    {
        ostream.write_Object ((org.omg.CORBA.Object) value);
    }

    public static com.sun.org.omg.SendingContext.CodeBase narrow (org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        else if (obj instanceof com.sun.org.omg.SendingContext.CodeBase)
            return (com.sun.org.omg.SendingContext.CodeBase)obj;
        else if (!obj._is_a (id ()))
            throw new org.omg.CORBA.BAD_PARAM ();
        else
            {
                org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
                return new com.sun.org.omg.SendingContext._CodeBaseStub (delegate);
            }
    }

}
