/**
 * Copyright 2009-2015 Three Crickets LLC.
 * <p>
 * The contents of this file are subject to the terms of the LGPL version 3.0:
 * http://www.gnu.org/copyleft/lesser.html
 * <p>
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly from Three Crickets
 * at http://threecrickets.com
 */

package com.threecrickets.succinct.chunk.block;

import com.threecrickets.succinct.Syntax;
import com.threecrickets.succinct.chunk.Block;

public class Define extends Block
{
	//
	// Constants
	//

	public static final String MARK = Syntax.get( "Define" );

	public static final int MARK_LENGTH = MARK.length();

	//
	// Construction
	//

	public Define( String string )
	{
		super( string, null );
	}

	//
	// Chunk
	//

	@Override
	public String[] getRequiredTags()
	{
		return new String[0];
	}

	//
	// Block
	//

	@Override
	public String asTag()
	{
		return MARK;
	}

	// //////////////////////////////////////////////////////////////////////////
	// Private

	private static final long serialVersionUID = 1L;
}