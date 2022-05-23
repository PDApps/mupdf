// Copyright (C) 2022 Artifex Software, Inc.
//
// This file is part of MuPDF.
//
// MuPDF is free software: you can redistribute it and/or modify it under the
// terms of the GNU Affero General Public License as published by the Free
// Software Foundation, either version 3 of the License, or (at your option)
// any later version.
//
// MuPDF is distributed in the hope that it will be useful, but WITHOUT ANY
// WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
// FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
// details.
//
// You should have received a copy of the GNU Affero General Public License
// along with MuPDF. If not, see <https://www.gnu.org/licenses/agpl-3.0.en.html>
//
// Alternative licensing terms are available from the licensor.
// For commercial licensing, see <https://www.artifex.com/> or contact
// Artifex Software, Inc., 1305 Grant Avenue - Suite 200, Novato,
// CA 94945, U.S.A., +1(415)492-9861, for further information.

package com.artifex.mupdf.fitz;

public class DOM
{
	static {
		Context.init();
	}

	protected long pointer;

	protected native void finalize();

	public void destroy() {
		finalize();
	}

	protected DOM(long p) {
		pointer = p;
	}

	public native DOM body();
	public native DOM document();
	public native DOM createTextNode(String text);
	public native DOM createElement(String tag);

	public native void insertBefore(DOM toinsert);
	public native void insertAfter(DOM toinsert);
	public native void appendChild(DOM toinsert);
	public native void remove();
	public native DOM clone();
	public native DOM parent();
	public native DOM firstChild();
	public native DOM next();
	public native DOM previous();
	public native DOM addAttribute(String att, String val);
	public native DOM removeAttribute(String att);
	public native String attribute(String att);
	public native DOM find(String tag, String att, String val);
	public native DOM findNext(String tag, String att, String val);
}
