package com.brq.camel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

import com.brq.camel.files.FileRouter;

class FileRouterTests extends CamelTestSupport {

	private FileRouter fileRouter = null;
	
	protected FileRouter createRouteBuilder() throws Exception {
		
		if(fileRouter == null) {
			this.fileRouter = new FileRouter();
		}
		
		return this.fileRouter;
	}
	
	@Test
	void checkIfFileExistsInOutputDirectory() throws Exception  {
		
		FileRouter fileRouter = this.createRouteBuilder();

		
		File file = new File("files/output");
		assertTrue( file.isDirectory() );
		assertTrue( file.listFiles().length > 0  );
	}

}