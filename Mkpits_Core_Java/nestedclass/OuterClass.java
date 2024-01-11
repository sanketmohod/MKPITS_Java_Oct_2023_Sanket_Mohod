package com.mkpits.nestedclass;

public class OuterClass {
	int x = 56;

	public class InnerClass {
		int y = 15;
		int z = x - y;

		public class MulClass {
			int product = x * y;

			public class DivClass {
				float division = x / y;

				public class ModClass {
					int modulus = x % y;
				}
			}
		}

	}
}