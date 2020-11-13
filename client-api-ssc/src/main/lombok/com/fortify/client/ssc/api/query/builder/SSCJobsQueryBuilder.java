/*******************************************************************************
 * (c) Copyright 2020 Micro Focus or one of its affiliates, a Micro Focus company
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the 
 * "Software"), to deal in the Software without restriction, including without 
 * limitation the rights to use, copy, modify, merge, publish, distribute, 
 * sublicense, and/or sell copies of the Software, and to permit persons to 
 * whom the Software is furnished to do so, subject to the following 
 * conditions:
 * 
 * The above copyright notice and this permission notice shall be included 
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY 
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR 
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN 
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS 
 * IN THE SOFTWARE.
 ******************************************************************************/
package com.fortify.client.ssc.api.query.builder;

import com.fortify.client.ssc.annotation.SSCRequiredActionsPermitted;
import com.fortify.client.ssc.api.query.SSCEntityQuery;
import com.fortify.client.ssc.api.query.builder.AbstractSSCEntityQueryBuilder.ISSCEntityQueryBuilderParamFields;
import com.fortify.client.ssc.api.query.builder.AbstractSSCEntityQueryBuilder.ISSCEntityQueryBuilderParamOrderBy;
import com.fortify.client.ssc.api.query.builder.AbstractSSCEntityQueryBuilder.ISSCEntityQueryBuilderParamQ;
import com.fortify.client.ssc.connection.SSCAuthenticatingRestConnection;

/**
 * This class allows for building an {@link SSCEntityQuery} instance that allows for
 * querying SSC jobs.
 * 
 * @author Ruud Senden
 * 
 */
public final class SSCJobsQueryBuilder extends AbstractSSCEntityQueryBuilder<SSCJobsQueryBuilder> 
	implements ISSCEntityQueryBuilderParamFields<SSCJobsQueryBuilder>,
		ISSCEntityQueryBuilderParamOrderBy<SSCJobsQueryBuilder>,
		ISSCEntityQueryBuilderParamQ<SSCJobsQueryBuilder>
{
	@SSCRequiredActionsPermitted({"GET=/api/v\\d+/jobs"})
	public SSCJobsQueryBuilder(SSCAuthenticatingRestConnection conn) {
		super(conn, true);
		appendPath("/api/v1/jobs");
	}

	public final SSCJobsQueryBuilder paramFields(String... fields) {
		return super.paramFields(fields);
	}

	public final SSCJobsQueryBuilder paramOrderBy(boolean ignoreIfBlank, SSCOrderBy orderBy) {
		return super.paramOrderBy(ignoreIfBlank, orderBy);
	}
	
	public final SSCJobsQueryBuilder paramQ(boolean ignoreIfBlank, String q) {
		return super.paramQ(ignoreIfBlank, q);
	}

	public final SSCJobsQueryBuilder paramQAnd(boolean ignoreIfBlank, String field, Object value) {
		return super.paramQAnd(ignoreIfBlank, field, value);
	}
	
	public final SSCJobsQueryBuilder id(boolean ignoreIfBlank, String id) {
		return super.paramQAnd(ignoreIfBlank, "id", id);
	}

	public final SSCJobsQueryBuilder jobClassName(boolean ignoreIfBlank, String jobClassName) {
		return super.paramQAnd(ignoreIfBlank, "jobClassName", jobClassName);
	}

	public final SSCJobsQueryBuilder priority(boolean ignoreIfBlank, int priority) {
		return super.paramQAnd(ignoreIfBlank, "priority", "" + priority);
	}

	public final SSCJobsQueryBuilder state(boolean ignoreIfBlank, String state) {
		return super.paramQAnd(ignoreIfBlank, "state", state);
	}
}