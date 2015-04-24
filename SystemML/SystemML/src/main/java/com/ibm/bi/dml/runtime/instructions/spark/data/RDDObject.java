/**
 * IBM Confidential
 * OCO Source Materials
 * (C) Copyright IBM Corp. 2010, 2015
 * The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the U.S. Copyright Office.
 */

package com.ibm.bi.dml.runtime.instructions.spark.data;

import org.apache.spark.api.java.JavaPairRDD;

import com.ibm.bi.dml.runtime.matrix.data.MatrixBlock;
import com.ibm.bi.dml.runtime.matrix.data.MatrixIndexes;

public class RDDObject extends LineageObject
{
	@SuppressWarnings("unused")
	private static final String _COPYRIGHT = "Licensed Materials - Property of IBM\n(C) Copyright IBM Corp. 2010, 2015\n" +
                                             "US Government Users Restricted Rights - Use, duplication  disclosure restricted by GSA ADP Schedule Contract with IBM Corp.";

	private JavaPairRDD<MatrixIndexes,MatrixBlock> _rddHandle = null;
	
	public RDDObject( JavaPairRDD<MatrixIndexes,MatrixBlock> rddvar )
	{
		_rddHandle = rddvar;
	}
	
	/**
	 * 
	 * @return
	 */
	public JavaPairRDD<MatrixIndexes,MatrixBlock> getRDD()
	{
		return _rddHandle;
	}
}