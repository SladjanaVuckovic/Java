package usporavanjeNiti;

public class A extends Thread {

	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println("i: " + i);
			try {
				Thread.sleep(500); // sleep(Vrednost_u_milisekundama)
				// ova nit se usporava tako sto joj se suspenduju resursi na zadato vreme
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*
			 * Dok traje to suspendovanje resursa, neka druga nit moze da pokusa da pristupi
			 * tim resursima i u tom slucaju dolazi do tzv interruptedExceptiona, zbog toga
			 * sam java ponudi try/catch opciju.
			 */
			i++;
		}
	}

}
