public class inventory {
		int amount = 50000;
		public void withdraw(int amount) {
			if (this.amount < amount) {
				System.out.println("YOU HAVE INSUFFICENT BALANCE");

			}
			else {
				this.amount = this.amount - amount;
				System.out.println("THE AMOUNT IS WITHDRAW SUCCESSFULLY");
			}
		}
		public static void main(String[] args) {
			inventory t  = new inventory();
			t.withdraw(50000);
		}
	}


