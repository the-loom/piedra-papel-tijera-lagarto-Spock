package edu.tallerweb.pptls;

import java.security.Permission;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTests {

    @BeforeClass
    public static void setUp() {
        System.setSecurityManager(new NothingSecurityManager());
    }

    @AfterClass
    public static void tearDown() {
        System.setSecurityManager(null);
    }
	
	private static class NothingSecurityManager extends SecurityManager {
		@Override
		public void checkPermission(Permission perm) {
//			System.out.println(perm);
		}

		@Override
		public void checkPermission(Permission perm, Object context) {
//			System.out.println(perm);
		}

		@Override
		public void checkWrite(String file) {
			throw new NoTenesPermisosException();
		}

		@Override
		public void checkDelete(String file) {
			throw new NoTenesPermisosException();
		}

		@Override
		public void checkAccept(String host, int port) {
			throw new NoTenesPermisosException();
		}

		@Override
		public void checkConnect(String host, int port) {
			throw new NoTenesPermisosException();
		}

		@Override
		public void checkListen(int port) {
			throw new NoTenesPermisosException();
		}

	}

	protected static class NoTenesPermisosException extends SecurityException {

		private static final long serialVersionUID = 4378986161743865833L;

	}
	
}
