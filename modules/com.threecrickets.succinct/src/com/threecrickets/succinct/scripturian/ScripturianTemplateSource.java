/**
 * Copyright 2009-2010 Three Crickets LLC.
 * <p>
 * The contents of this file are subject to the terms of the LGPL version 3.0:
 * http://www.opensource.org/licenses/lgpl-3.0.html
 * <p>
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly from Three Crickets
 * at http://threecrickets.com
 */

package com.threecrickets.succinct.scripturian;

import java.io.IOException;

import com.threecrickets.scripturian.DocumentSource;
import com.threecrickets.succinct.TemplateSource;
import com.threecrickets.succinct.TemplateSourceException;

public class ScripturianTemplateSource<D> implements TemplateSource
{
	//
	// Construction
	//

	public ScripturianTemplateSource( DocumentSource<D> documentSource )
	{
		this.documentSource = documentSource;
	}

	//
	// TemplateSource
	//

	public String getTemplate( String name ) throws TemplateSourceException
	{
		try
		{
			return documentSource.getDocumentDescriptor( name ).getText();
		}
		catch( IOException x )
		{
			throw new TemplateSourceException( x );
		}
	}

	// //////////////////////////////////////////////////////////////////////////
	// Private

	private final DocumentSource<D> documentSource;
}
